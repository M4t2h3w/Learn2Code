package com.midnightnoon.pokrocily.annotations;

public @interface ClassInformations {
    String author();
    String date();
    int currentRevision();
    String lastModified();
    String lastModifiedBy();
    String[] reviewers();
}
