package jan.datamodel;

import java.time.LocalDate;

public class TodoItem
{
    private String shortDescription;
    private String detalis;
    private LocalDate deadline;

    public TodoItem(String shortDescription, String detalis, LocalDate deadline) {
        this.shortDescription = shortDescription;
        this.detalis = detalis;
        this.deadline = deadline;
    }

    public String getShortDescription() {
        return shortDescription;
    }

    public void setShortDescription(String shortDescription) {
        this.shortDescription = shortDescription;
    }

    public String getDetalis() {
        return detalis;
    }

    public void setDetalis(String detalis) {
        this.detalis = detalis;
    }

    public LocalDate getDeadline() {
        return deadline;
    }

    public void setDeadline(LocalDate deadline) {
        this.deadline = deadline;
    }

//    @Override
//    public String toString() {
//        return  shortDescription;
//    }
}
