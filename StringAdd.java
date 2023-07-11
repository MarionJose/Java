public class StringAdd{
    public static void main(String[] args){
        StringBuffer name= new StringBuffer ("Marion ");
        // name.append("Jose");
        // name.insert(2, "Hello");
        name.replace(1, 3, "Hello");

        System.out.println(name);
    }
}