package io.github.girirajvyas.util;

public class InputDataParser {

    public static Integer getInt(String data) {
        if (data !=null && !data.isEmpty()) {
            return Integer.parseInt(data);
        }
        return 0;
    }

}

