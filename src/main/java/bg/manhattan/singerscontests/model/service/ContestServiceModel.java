package bg.manhattan.singerscontests.model.service;

import java.util.List;

public class ContestServiceModel {
    private Long id;
    private String name;

    private List<Long> managers;

    public Long getId() {
        return id;
    }

    public ContestServiceModel setId(Long id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public ContestServiceModel setName(String name) {
        this.name = name;
        return this;
    }

    public List<Long> getManagers() {
        return managers;
    }

    public ContestServiceModel setManagers(List<Long> managers) {
        this.managers = managers;
        return this;
    }
}
