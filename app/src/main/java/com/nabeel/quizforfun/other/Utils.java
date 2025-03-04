package com.nabeel.quizforfun.other;

import android.content.Context;
import android.text.TextUtils;
import android.util.Patterns;

import com.nabeel.quizforfun.R;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Random;

public class Utils {

    public static boolean isValidEmail(CharSequence target) {
        return (!TextUtils.isEmpty(target) && Patterns.EMAIL_ADDRESS.matcher(target).matches());
    }

    public static String formatDate(long time){
        SimpleDateFormat formatter = new SimpleDateFormat(Constants.DATE_FORMAT, Locale.getDefault());

        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(time);
        return formatter.format(calendar.getTime());
    }

    public static Map<String,String> getMathQuestions(){
        HashMap<String,String> questions = new HashMap<>();
        questions.put("1+1","2");
        questions.put("2+2","4");
        questions.put("3+3","6");
        questions.put("4+4","8");
        questions.put("5+5","10");
        questions.put("6+6","12");
        questions.put("7+7","14");
        questions.put("8+8","16");
        questions.put("9+9","18");
        questions.put("10+10","20");
        questions.put("11+11","22");
        questions.put("12+12","24");
        questions.put("13+13","26");
        questions.put("14+14","28");
        questions.put("15+15","30");

        return questions;
    }

    public static Map<String,String> getRandomMathQuestions(int SIZE){
        HashMap<String,String> questionsMap = new HashMap<>();
        Map<String,String> originalQuestion = getMathQuestions();
        int originalSize =  originalQuestion.size();
        ArrayList<String> keyList = new ArrayList<String>(originalQuestion.keySet());

        while (questionsMap.size()<=SIZE){
            Random random = new Random();
            int randomNumber = random.nextInt(originalSize);
            String question = keyList.get(randomNumber);
            if (!questionsMap.containsKey(question)){
                questionsMap.put(question,originalQuestion.get(question));
            }
        }
        return questionsMap;
    }



    public static Map<String,Map<String,Boolean>> getLiteratureQuestions(){
        HashMap<String,Map<String,Boolean>> questions = new HashMap<>();

        HashMap<String,Boolean> answer1 = new HashMap<>();
        answer1.put("Maya Angelou",true);
        answer1.put("Robert Hass",false);
        answer1.put("Jessica Hagdorn",false);
        answer1.put("Micheal Palmer",false);
        questions.put("Which American writer published ‘A brave and startling truth’ in 1996",answer1);

        HashMap<String,Boolean> answer2 = new HashMap<>();
        answer2.put("Acrostic ",true);
        answer2.put("Haiku",false);
        answer2.put("Epic",false);
        answer2.put("Alliterative",false);
        questions.put("What is a poem called whose first letters of each line spell out a word?",answer2);

        HashMap<String,Boolean> answer3 = new HashMap<>();
        answer3.put("Limerick",true);
        answer3.put("Quartet",false);
        answer3.put("Sextet",false);
        answer3.put("Palindrome",false);
        questions.put("What is a funny poem of five lines called?",answer3);

        HashMap<String,Boolean> answer4 = new HashMap<>();
        answer4.put("Robert Greene",true);
        answer4.put("John Milton",false);
        answer4.put("Philip Sidney",false);
        answer4.put("Christopher Marlowe",false);
        questions.put("Who succeeded Lyly?",answer4);

        HashMap<String,Boolean> answer5 = new HashMap<>();
        answer5.put("Hamlet",true);
        answer5.put("Cymbeline",false);
        answer5.put("Titus Andronicus",false);
        answer5.put("Pericles, Prince of Tyre",false);
        questions.put("Which famous Shakespeare play does the quote,”Neither a borrower nor a lender be” come from?",answer5);

        HashMap<String,Boolean> answer6 = new HashMap<>();
        answer6.put("16th",true);
        answer6.put("17th",false);
        answer6.put("14th",false);
        answer6.put("15th",false);
        questions.put("In which century was Shakespeare born?",answer6);

        HashMap<String,Boolean> answer7 = new HashMap<>();
        answer7.put("A thief",true);
        answer7.put("A clerk",false);
        answer7.put("A teacher",false);
        answer7.put("A dentist",false);
        questions.put("Who is Mr. Tench in The Power and the Glory?",answer7);

        HashMap<String,Boolean> answer8 = new HashMap<>();
        answer8.put("Coleridge",true);
        answer8.put("Wordsworth",false);
        answer8.put("Lamb",false);
        answer8.put("Shelley",false);
        questions.put("Who said ‘Keats was a Greek’?",answer8);

        HashMap<String,Boolean> answer9 = new HashMap<>();
        answer9.put("Gertrude",true);
        answer9.put("Beatrice",false);
        answer9.put("Margaret",false);
        answer9.put("Rosalind",false);
        questions.put("Which of the following is Hamlet’s mother?",answer9);

        HashMap<String,Boolean> answer10 = new HashMap<>();
        answer10.put("Stingy",true);
        answer10.put("Rude",false);
        answer10.put("Unintelligent",false);
        answer10.put("Fanatic",false);
        questions.put("Which of the following was Elizabeth known as?",answer10);

        HashMap<String,Boolean> answer11 = new HashMap<>();
        answer11.put("Keats",true);
        answer11.put("Blake",false);
        answer11.put("Tennyson",false);
        answer11.put("Shelley",false);
        questions.put("For whom it is said: “sensuousness is a paramount bias of his genius”:",answer11);

        HashMap<String,Boolean> answer12 = new HashMap<>();
        answer12.put("Maud",true);
        answer12.put("Ulysses",false);
        answer12.put("Break, Break, Break",false);
        answer12.put("Crossing the Bar",false);
        questions.put("Which of the following poems by Tennyson is a monodrama?",answer12);

        HashMap<String,Boolean> answer13 = new HashMap<>();
        answer13.put("Southey",true);
        answer13.put("Tennyson",false);
        answer13.put("Byron",false);
        answer13.put("Wordsworth",false);
        questions.put("Which one of the following poets was appointed Poet Laureate in the year 1813?",answer13);

        HashMap<String,Boolean> answer14 = new HashMap<>();
        answer14.put("Wordsworth",true);
        answer14.put("Keats",false);
        answer14.put("Byron",false);
        answer14.put("Blake",false);
        questions.put("Who believed that poetry is the spontaneous overflow of emotions?",answer14);

        HashMap<String,Boolean> answer15 = new HashMap<>();
        answer15.put("Dickens",true);
        answer15.put("George Eliot",false);
        answer15.put("Hardy",false);
        answer15.put("None of the above",false);
        questions.put("Moral choice is everything in the works of:",answer15);

        return questions;
    }

    public static Map<String, Map<String, Boolean>> getGeographyQuestions() {
        HashMap<String, Map<String, Boolean>> questions = new HashMap<>();

        HashMap<String, Boolean> answer1 = new HashMap<>();
        answer1.put("Indus River", true);
        answer1.put("Jhelum River", false);
        answer1.put("Ravi River", false);
        answer1.put("Sutlej River", false);
        questions.put("Which is the longest river in Pakistan?", answer1);

        HashMap<String, Boolean> answer2 = new HashMap<>();
        answer2.put("K2", true);
        answer2.put("Nanga Parbat", false);
        answer2.put("Rakaposhi", false);
        answer2.put("Tirich Mir", false);
        questions.put("What is the highest mountain peak in Pakistan?", answer2);

        HashMap<String, Boolean> answer3 = new HashMap<>();
        answer3.put("Makran Coastal Highway", false);
        answer3.put("Shahrah-e-Resham", true);
        answer3.put("Indus Highway", false);
        answer3.put("Grand Trunk Road", false);
        questions.put("Which highway is also known as the Karakoram Highway?", answer3);

        HashMap<String, Boolean> answer4 = new HashMap<>();
        answer4.put("Khewra", true);
        answer4.put("Chaghi", false);
        answer4.put("Sui", false);
        answer4.put("Thar", false);
        questions.put("Where is the largest salt mine in Pakistan located?", answer4);

        HashMap<String, Boolean> answer5 = new HashMap<>();
        answer5.put("Rann of Kutch", false);
        answer5.put("Thar Desert", true);
        answer5.put("Cholistan Desert", false);
        answer5.put("Kharan Desert", false);
        questions.put("Which is the largest desert in Pakistan?", answer5);

        HashMap<String, Boolean> answer6 = new HashMap<>();
        answer6.put("Balochistan", false);
        answer6.put("Sindh", true);
        answer6.put("Punjab", false);
        answer6.put("Khyber Pakhtunkhwa", false);
        questions.put("Which province of Pakistan has the longest coastline?", answer6);

        HashMap<String, Boolean> answer7 = new HashMap<>();
        answer7.put("Gwadar", true);
        answer7.put("Karachi", false);
        answer7.put("Pasni", false);
        answer7.put("Ormara", false);
        questions.put("Which port city of Pakistan was developed with China's assistance?", answer7);

        HashMap<String, Boolean> answer8 = new HashMap<>();
        answer8.put("Diamer Bhasha Dam", false);
        answer8.put("Tarbela Dam", true);
        answer8.put("Mangla Dam", false);
        answer8.put("Warsak Dam", false);
        questions.put("Which is the largest dam in Pakistan?", answer8);

        HashMap<String, Boolean> answer9 = new HashMap<>();
        answer9.put("Gwadar", false);
        answer9.put("Karachi", true);
        answer9.put("Pasni", false);
        answer9.put("Keti Bandar", false);
        questions.put("Which city is the largest seaport of Pakistan?", answer9);

        HashMap<String, Boolean> answer10 = new HashMap<>();
        answer10.put("Islamabad", false);
        answer10.put("Lahore", false);
        answer10.put("Karachi", false);
        answer10.put("Quetta", true);
        questions.put("Which city is known as the fruit garden of Pakistan?", answer10);

        HashMap<String, Boolean> answer11 = new HashMap<>();
        answer11.put("Punjab", true);
        answer11.put("Sindh", false);
        answer11.put("Balochistan", false);
        answer11.put("Khyber Pakhtunkhwa", false);
        questions.put("Which province produces the most wheat in Pakistan?", answer11);

        HashMap<String, Boolean> answer12 = new HashMap<>();
        answer12.put("Indus River", false);
        answer12.put("Kabul River", true);
        answer12.put("Jhelum River", false);
        answer12.put("Chenab River", false);
        questions.put("Which river flows from Afghanistan into Pakistan?", answer12);

        HashMap<String, Boolean> answer13 = new HashMap<>();
        answer13.put("Balochistan", true);
        answer13.put("Punjab", false);
        answer13.put("Sindh", false);
        answer13.put("Khyber Pakhtunkhwa", false);
        questions.put("Where is the Reko Diq gold and copper reserve located?", answer13);

        HashMap<String, Boolean> answer14 = new HashMap<>();
        answer14.put("Margalla Hills", true);
        answer14.put("Murree Hills", false);
        answer14.put("Swat Valley", false);
        answer14.put("Kaghan Valley", false);
        questions.put("Which hill range is located near Islamabad?", answer14);

        HashMap<String, Boolean> answer15 = new HashMap<>();
        answer15.put("Sindh", false);
        answer15.put("Punjab", true);
        answer15.put("Khyber Pakhtunkhwa", false);
        answer15.put("Balochistan", false);
        questions.put("Which province of Pakistan has the highest population?", answer15);

        return questions;
    }


    public static Map<String,Map<String,Boolean>> getRandomLiteratureAndGeographyQuestions(Context context, String subject, int SIZE){
        Map<String,Map<String,Boolean>> questionsMap = new HashMap<>();
        Map<String, Map<String, Boolean>> originalQuestion;
        if (subject.equals(context.getString(R.string.geography))){
            originalQuestion = getGeographyQuestions();
        }else{
            originalQuestion = getLiteratureQuestions();
        }

        int originalSize =  originalQuestion.size();
        ArrayList<String> keyList = new ArrayList<String>(originalQuestion.keySet());

        while (questionsMap.size() < SIZE && questionsMap.size() < originalSize)
        {
            Random random = new Random();
            int randomNumber = random.nextInt(originalSize);
            String question = keyList.get(randomNumber);
            if (!questionsMap.containsKey(question)){
                questionsMap.put(question,originalQuestion.get(question));
            }
        }
        return questionsMap;
    }

}
