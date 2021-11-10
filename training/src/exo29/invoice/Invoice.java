package exo29.invoice;

import java.util.Arrays;
import java.util.Objects;

public class Invoice {
    private static int count = 0;
    private String numInvoice;
    private String numVAT;
    private double vatRate;
    private double discount;
    private Task[] tasks;

    private int taskCount=0;

    public Invoice(String numInvoice, String numVAT, double vatRate, Task[] tasks,double discount) {
        this.numInvoice = numInvoice;
        this.numVAT = numVAT;
        this.vatRate = vatRate;
        this.discount = discount;
        this.tasks = tasks;
    }

    public void addDiscount(double addAmount) {
        discount += addAmount;
    }

    public double getTotal() {
        double total = 0;
        for (int i = 0; i < tasks.length; i++) {
            total += tasks[i].getAmount();
        }
        for (Task task : tasks) {
            total += task.getAmount();
        }
        total -= discount;
        total*=(1+vatRate);
        return total;
    }

    public  Task getTask(int index){
        if (index<0 || index>tasks.length){
            System.out.println("invalid index");
            return null;
        }
        else{
            return tasks[index];
        }
    }


    public void addTask(Task task){
        boolean isInclude=false;
        for (Task includedTask:tasks){
            if (task.getName().equals(includedTask.getName())){
                isInclude=true;
                break;
            }
        }
        if (!isInclude){
            if(tasks.length<4){
                tasks[taskCount] =task;
                taskCount++;
            }
            else{
                System.out.println("number of task max reached");
            }
        }
    }

    public int getTaskCount(){
        return taskCount;
    }

    public void  deleteTask(Task task){
        int index =  0;
        for(Task includedTask: tasks){
            if (task.equals(includedTask)){
                break;
            }
            index++;
        }
        for (int i=index;i<(tasks.length-2);i++){
            tasks[i] = tasks[i+1];
        }
    }

    public static int getCount() {
        return count;
    }

    @Override
    public String toString() {
        return "Invoice{" +
                "numInvoice='" + numInvoice + '\'' +
                ", numVAT='" + numVAT + '\'' +
                ", vatRate=" + vatRate +
                ", discount=" + discount +
                ", tasks=" + Arrays.toString(tasks) +
                ", taskCount=" + taskCount +
                '}';
    }

    public Invoice clone(){
        return  new Invoice(
                this.numInvoice,
                this.numVAT,
                this.vatRate,
                this.tasks,
                this.discount
                );
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Invoice invoice = (Invoice) o;
        return Double.compare(invoice.vatRate, vatRate) == 0 && Double.compare(invoice.discount, discount) == 0 && taskCount == invoice.taskCount && Objects.equals(numInvoice, invoice.numInvoice) && Objects.equals(numVAT, invoice.numVAT) && Arrays.equals(tasks, invoice.tasks);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(numInvoice, numVAT, vatRate, discount, taskCount);
        result = 31 * result + Arrays.hashCode(tasks);
        return result;
    }

}
