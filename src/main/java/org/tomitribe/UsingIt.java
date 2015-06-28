package org.tomitribe;

@AnAnnotation(Version.MAVEN)
public class UsingIt {
    public static void main(final String[] args) {
        System.out.println(UsingIt.class.getAnnotation(AnAnnotation.class).value());
    }
}
