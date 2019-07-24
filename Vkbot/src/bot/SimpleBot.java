/**
 * Class SimpleBot
 *
 * @author Terushkov Alexandr
 * @version 0.2.3 dated 10.06.2019
 */
package bot;
import java.util.*;
import java.util.regex.*;

public class SimpleBot {
    final String[] COMMON_PHRASES = {
            "Нет ничего ценнее слов, сказанных к месту и ко времени. Если хотите посчитать напишите 'Считать'.",
            "Порой молчание может сказать больше, нежели уйма слов. Если хотите посчитать напишите 'Считать'.",
            "Перед тем как писать/говорить всегда лучше подумать. Если хотите посчитать напишите 'Считать'.",
            "Вежливая и грамотная речь говорит о величии души. Если хотите посчитать напишите 'Считать'.",
            "Приятно когда текст без орфографических ошибок. Если хотите посчитать напишите 'Считать'.",
            "Многословие есть признак неупорядоченного ума. Если хотите посчитать напишите 'Считать'.",
            "Слова могут ранить, но могут и исцелять. Если хотите посчитать напишите 'Считать'.",
            "Записывая слова, мы удваиваем их силу. Если хотите посчитать напишите 'Считать'.",
            "Кто ясно мыслит, тот ясно излагает. Если хотите посчитать напишите 'Считать'.",
            "Боюсь Вы что-то не договариваете. Если хотите посчитать напишите 'Считать'."};
    final String[] ELUSIVE_ANSWERS = {
            "Вопрос непростой, прошу тайм-аут на раздумья. Если хотите посчитать напишите 'Считать'.",
            "Не уверен, что располагаю такой информацией. Если хотите посчитать напишите 'Считать'.",
            "Может лучше поговорим о чём-то другом? Если хотите посчитать напишите 'Считать'.",
            "Простите, но это очень личный вопрос. Если хотите посчитать напишите 'Считать'.",
            "Не уверен, что Вам понравится ответ. Если хотите посчитать напишите 'Считать'.",
            "Поверьте, я сам хотел бы это знать. Если хотите посчитать напишите 'Считать'.",
            "Вы действительно хотите это знать? Если хотите посчитать напишите 'Считать'.",
            "Уверен, Вы уже догадались сами. Если хотите посчитать напишите 'Считать'.",
            "Зачем Вам такая информация? Если хотите посчитать напишите 'Считать'.",
            "Давайте сохраним интригу? Если хотите посчитать напишите 'Считать'."};
    final Map<String, String> PATTERNS_FOR_ANALYSIS = new HashMap<String, String>() {{
        // hello
        put("хай", "hello");
        put("привет", "hello");
        put("здорово", "hello");
        put("здравствуй", "hello");
        // who
        put("кто\\s.*ты", "who");
        put("ты\\s.*кто", "who");
        // name
        put("как\\s.*зовут", "name");
        put("как\\s.*имя", "name");
        put("есть\\s.*имя", "name");
        put("какое\\s.*имя", "name");
        // howareyou
        put("как\\s.*дела", "howareyou");
        put("как\\s.*жизнь", "howareyou");
        // whatdoyoudoing
        put("зачем\\s.*тут", "whatdoyoudoing");
        put("зачем\\s.*здесь", "whatdoyoudoing");
        put("что\\s.*делаешь", "whatdoyoudoing");
        put("чем\\s.*занимаешься", "whatdoyoudoing");
        // whatdoyoulike
        put("что\\s.*нравится", "whatdoyoulike");
        put("что\\s.*любишь", "whatdoyoulike");
        // iamfeelling
        put("кажется", "iamfeelling");
        put("чувствую", "iamfeelling");
        put("испытываю", "iamfeelling");
        // yes
        put("^да", "yes");
        put("согласен", "yes");
        // whattime
        put("который\\s.*час", "whattime");
        put("сколько\\s.*время", "whattime");
        // bye
        put("прощай", "bye");
        put("увидимся", "bye");
        put("до\\s.*свидания", "bye");
        // work
        put("считать", "work");
        put("Считать", "work");
        put("^считать", "work");
    }};
    final Map<String, String> ANSWERS_BY_PATTERNS = new HashMap<String, String>() {{
        put("hello", "Здравствуйте, рад Вас видеть.");
        put("who", "Я обычный чат-бот.");
        put("name", "Зовите меня Чаттер :)");
        put("howareyou", "Спасибо, что интересуетесь. У меня всё хорошо.");
        put("whatdoyoudoing", "Я пробую общаться с людьми.");
        put("whatdoyoulike", "Мне нравиться думать что я не просто программа.");
        put("iamfeelling", "Как давно это началось? Расскажите чуть подробнее.");
        put("yes", "Согласие есть продукт при полном непротивлении сторон.");
        put("bye", "До свидания. Надеюсь, ещё увидимся.");
    }};
    Pattern pattern; // for regexp
    Random random; // for random answers
    Date date; // for date and time
    //ru.Asai_kann.calculator.Calculator calk;

    public SimpleBot() {
        random = new Random();
        date = new Date();
        //calk = new ru.Asai_kann.calculator.Calculator();
    }

    public String sayInReturn(String msg, boolean ai) {
        String say = (msg.trim().endsWith("?"))?
                ELUSIVE_ANSWERS[random.nextInt(ELUSIVE_ANSWERS.length)]:
                COMMON_PHRASES[random.nextInt(COMMON_PHRASES.length)];
        if (ai) {
            String message =
                    String.join(" ", msg.toLowerCase().split("[ {,|.}?]+"));
            for (Map.Entry<String, String> o : PATTERNS_FOR_ANALYSIS.entrySet()) {
                pattern = Pattern.compile(o.getKey());
                 if (pattern.matcher(message).find())
                      if (o.getValue().equals("whattime")) return date.toString();
                    //else if (o.getValue().equals("work")) new ru.Asai_kann.calculator.Calculator();
                    else return ANSWERS_BY_PATTERNS.get(o.getValue());
            }
        }
        return say;
    }
}