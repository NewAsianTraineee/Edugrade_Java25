public class Variable_Datatypes {
    public static void main(String[] args) {
        {
            int age = 22;
            double height = 1.75;
            char initial = 'K';
            String name = "Kewin";
            boolean isStudent = true;

            System.out.println("I am " + age + ", I am " + height + " and my initial is " +
                    initial + " and it's " + isStudent + " that I am a student at HIG.");
            /* Jag förstår inte hur man gör en space emllan då i c# var det typ /n men har lite svårare att förstå
            i Java då nu blir det direkt nedan för vilka datavärden det har.
            */
            System.out.println(((Object) age).getClass().getName());
            System.out.println(((Object) height).getClass().getName());
            System.out.println(((Object) initial).getClass().getName());
            System.out.println(((Object) name).getClass().getName());
            System.out.println(((Object) isStudent).getClass().getName());

        }
    }
}