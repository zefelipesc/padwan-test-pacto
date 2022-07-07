package com.padwan.test.domain;

public enum Status {

    PADAWAN("Jedi Júnior"),
    JEDI("Jedi Pleno"),
    MESTRE_JEDI("Jedi Sênior");

    private final String statusJedi;

    Status(String statusJedi) {
        this.statusJedi = statusJedi;
    }

    public String getStatusJedi() {
        return statusJedi;
    }
}
