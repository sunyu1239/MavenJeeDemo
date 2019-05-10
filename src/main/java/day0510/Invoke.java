package day0510;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Parameter;

public class Invoke {
    public static void main(String[] args) {
        try {
            Class<?> stuClass = Class.forName("day0510.Student");
            Constructor<?>[] stuC = stuClass.getDeclaredConstructors();
            for (Constructor<?> c : stuC) {
                // System.out.println(c.getParameters().length);
                // System.out.println(c.getParameters());
                Parameter[] params = c.getParameters();
                for (Parameter p : params) {
                    System.out.println(p);
                }
                // Type[] type = c.getGenericParameterTypes();
                // for (Type t : type) {
                // System.out.println(t);
                // }

                if (c.getParameters().length == 2) {
                    try {
                        Student s = (Student) c.newInstance(1, "ss");
                        System.out.println(s.getName());
                    } catch (InstantiationException e) {
                        // TODO Auto-generated catch block
                        e.printStackTrace();
                    } catch (IllegalAccessException e) {
                        // TODO Auto-generated catch block
                        e.printStackTrace();
                    } catch (IllegalArgumentException e) {
                        // TODO Auto-generated catch block
                        e.printStackTrace();
                    } catch (InvocationTargetException e) {
                        // TODO Auto-generated catch block
                        e.printStackTrace();
                    }
                }
            }
            try {
                System.out.println(stuClass.getDeclaredField("name").getDeclaringClass());
                System.out.println(stuClass.getDeclaredField("lesson").getDeclaringClass());
            } catch (NoSuchFieldException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            } catch (SecurityException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }

            Annotation[] anno = stuClass.getAnnotations();
            for (Annotation a : anno) {
                // System.out.println(a.annotationType());
                // System.out.println(a.getClass());
                System.out.println(a.toString());
            }
        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        try {
            Class<?> clesson = Class.forName("day0510.Lesson");
            System.out.println(clesson.getDeclaringClass());
        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }
}

@Res(value = 13, name = "xiaom")
class Student {
    @Sss(name = "name")
    private String name;
    @Sss(name = "id")
    private int id;
    @Sss(name = "lesson")
    private Lesson lesson;

    public Student() {
    }

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

}

class Lesson {
    private int id;
    private String className;
}