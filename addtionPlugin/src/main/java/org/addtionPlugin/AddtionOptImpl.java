package org.addtionPlugin;

import org.facade.TwoNumOpt;

public class AddtionOptImpl implements TwoNumOpt {
    @Override
    public Double opt(Double aVar, Double bVar) {
        return aVar + bVar;
    }
}
