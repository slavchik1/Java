class Manager extends Employee {
    int subordinatesCount;
    public Manager(String name, int subordinatesCount) {
        super(name);
        this.subordinatesCount = subordinatesCount;
    }

    @Override
    public void showDetails() {
        // ▼▼▼ ДОПИШІТЬ КОД ТУТ ▼▼▼
        super.showDetails();
        // ▲▲▲ ДОПИШІТЬ КОД ТУТ ▲▲▲
        System.out.println("Number of subordinates: " + subordinatesCount);
    }
}
