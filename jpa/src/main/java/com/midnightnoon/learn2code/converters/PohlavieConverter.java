package com.midnightnoon.learn2code.converters;

import com.midnightnoon.learn2code.model.enmus.Pohlavie;

import javax.persistence.AttributeConverter;

public class PohlavieConverter implements AttributeConverter<Pohlavie, Character> {
    @Override
    public Character convertToDatabaseColumn(Pohlavie pohlavie) {
        if(pohlavie == null) return null;
        return pohlavie.getKod();
    }

    @Override
    public Pohlavie convertToEntityAttribute(Character character) {
        if(character == null) return null;
        return Pohlavie.getEnumFromKod(character);
    }
}
