package de.leonhard.storage.base;

import java.io.File;

public enum FileType {
    JSON("json"),
    YAML("yml"),
    TOML("toml"),
    CSV("csv"),
    LS("ls");


    private String extension;

    FileType(String extension) {
        this.extension = extension;
    }

    public static String getExtension(String path) {
        return path.lastIndexOf(".") > 0 ? path.substring(path.lastIndexOf(".") + 1) : "";
    }

    public static String getExtension(File file) {
        return getExtension(file.getName());
    }

    public static FileType getFileType(String type) {
        if (type.equalsIgnoreCase("json")) {
            return JSON;
        } else if (type.equalsIgnoreCase("yml")) {
            return YAML;
        } else if (type.equalsIgnoreCase("toml")) {
            return TOML;
        } else if (type.equalsIgnoreCase("csv")) {
            return CSV;
        } else if (type.equalsIgnoreCase("ls")) {
            return LS;
        } else {
            return null;
        }
    }

    public static FileType getFileType(File file) {
        return getFileType(getExtension(file));
    }

    public String getExtension() {
        return extension;
    }
}