

public class Six {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder();
        builder.append("W");
        builder.append(" pomieszczeniu");
        builder.append(" stała");
        builder.append(" paproć");
        builder.delete(0,builder.capacity()) ;
        System.out.println(builder.capacity()); //oszukuje
        String completed = builder.toString();
        System.out.println(completed);





    }
}
