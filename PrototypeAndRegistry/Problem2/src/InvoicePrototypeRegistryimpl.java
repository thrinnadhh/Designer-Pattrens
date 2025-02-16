import java.util.HashMap;
import java.util.Map;

public class InvoicePrototypeRegistryimpl implements InvoicePrototypeRegistry{
    private Map<InvoiceType,Invoice> invoiceMap = new HashMap<>();

    public void addPrototype(Invoice user){
        invoiceMap.put(user.getType(),user);
    }

    public Invoice getPrototype(InvoiceType type){
        return invoiceMap.get(type);
    }

    public Invoice clone(InvoiceType type) throws CloneNotSupportedException {
        return invoiceMap.get(type).cloneObject();
    }
}
