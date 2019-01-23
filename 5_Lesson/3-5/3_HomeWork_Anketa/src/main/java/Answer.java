//public class Answer extends Question {
public class Answer  {

    private String[] answer;
    private Question question;

    public Answer(String[] answer, Question question) {
        this.answer = answer;
        this.question = question;
    }

    public String[] getAnswer() {
        return answer;
    }

    public void setAnswer(String[] answer) {
        this.answer = answer;
    }

    public Question getQuestion() {
        return question;
    }

    public void setQuestion(Question question) {
        this.question = question;
    }

    //    public Answer(String person, Integer question, boolean value) {
//        this.person = person;
//        this.question = question;
//        this.value = value;
//    }



//    @Override
//    public String toString() {
//
//        String res = "";
//
////        for (Map.Entry<Integer, String> mapEntry : set) {
//        for (Map.Entry<Integer, String> mapEntry : getHashMap().entrySet()) {
//
//            if (mapEntry.getKey() == question) {
//
//               if (value) {
//                    for (Map.Entry<Integer, Integer> mapEntryResult : setResult) {
//                        if (mapEntryResult.getKey() == question) {
//                            resultMap.put(question, mapEntryResult.getValue() + 1);
//                            continue;
//                        }
//                   }
//                }
//
//                return res = person + " " + mapEntry.getValue() + " " + value;
//            }
//        }
//
//        return res;
//    }

}