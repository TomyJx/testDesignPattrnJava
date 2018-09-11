package com.test.testDesignPattern.assemble;

import java.util.ArrayList;
import java.util.List;

/**
 * ${DESCRIPTION}
 *
 * @author jiyx
 * @create 2017-04-17-12:58
 */
public class ConcreteCompany extends Company {

    private List<Company> children = new ArrayList<Company>();

    public ConcreteCompany(String name) {
        super(name);
    }

    void add(Company company) {
        children.add(company);
    }

    boolean remove(Company company) {
        return children.remove(company);
    }

    void Display(int depth) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < depth; i++) {
            sb.append("-");
        }
        sb.append(name);
    }

    void lineOfDuty() {
        for (int i = 0; i < children.size(); i++) {
            children.get(i).lineOfDuty();
        }
    }

    public List<Company> getChildren() {
        return children;
    }

}
