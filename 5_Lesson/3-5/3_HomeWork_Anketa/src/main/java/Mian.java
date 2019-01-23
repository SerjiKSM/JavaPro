import java.util.ArrayList;

public class Mian {

    public static void main(String[] args) {

//        ArrayList arrayListAnswer = new ArrayList();
//
//        Question questionOne = new Question();
//
//        HashMap  hashMap = questionOne.getHashMap();
//        Set<Map.Entry<Integer, String>> set = hashMap.entrySet();
//
//        for (Map.Entry<Integer, String> mapEntry : set){
//            System.out.print(mapEntry.getKey() + ": ");
//            System.out.println(mapEntry.getValue());
//        }
//
//        arrayListAnswer.add(new Answer("Ivan", 1, true));
//        arrayListAnswer.add(new Answer("Ivan", 2, false));
//        arrayListAnswer.add(new Answer("Ivan", 3, false));
//        arrayListAnswer.add(new Answer("Ivan", 4, true));
//
//        arrayListAnswer.add(new Answer("Vova", 1, true));
//        arrayListAnswer.add(new Answer("Vova", 2, false));
//        arrayListAnswer.add(new Answer("Vova", 3, false));
//        arrayListAnswer.add(new Answer("Vova", 4, false));
//
//        arrayListAnswer.add(new Answer("Mike", 1, true));
//        arrayListAnswer.add(new Answer("Mike", 2, true));
//        arrayListAnswer.add(new Answer("Mike", 3, true));
//        arrayListAnswer.add(new Answer("Mike", 4, true));
//
//        for (Object list : arrayListAnswer){
//            System.out.println(list.toString());
//        }


        ArrayList<Answer> answerArrayList = new ArrayList<Answer>();
//        Answer answerOne = new Answer(new String[]{"Java"}, new Question("What programming language do you prefer?"));
//        Answer answerSecond = new Answer(new String[]{"C++"}, new Question("What programming language do you prefer?"));

        answerArrayList.add(new Answer(new String[]{"Java", "C++"}, new Question("What programming language do you prefer?")));
        answerArrayList.add(new Answer(new String[]{"Java", "C++"}, new Question("What programming language do you prefer?")));


        for(Answer answer : answerArrayList){

        }


    }



}
