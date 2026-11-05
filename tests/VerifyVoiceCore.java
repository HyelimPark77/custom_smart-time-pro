import java.io.*;
import java.nio.file.*;
import java.util.*;
import com.android.tools.smali.dexlib2.dexbacked.DexBackedDexFile;
import com.android.tools.smali.dexlib2.iface.ClassDef;
import com.android.tools.smali.baksmali.BaksmaliOptions;
import com.android.tools.smali.baksmali.Adaptors.ClassDefinition;
import com.android.tools.smali.baksmali.formatter.BaksmaliWriter;
class VerifyVoiceCore {
 static String text(ClassDef c)throws Exception{StringWriter s=new StringWriter();BaksmaliOptions o=new BaksmaliOptions();o.debugInfo=true;new ClassDefinition(o,c).writeTo(new BaksmaliWriter(s));return s.toString();}
 public static void main(String[] a)throws Exception{
  DexBackedDexFile old=new DexBackedDexFile(Files.readAllBytes(Paths.get(a[0])),0),next=new DexBackedDexFile(Files.readAllBytes(Paths.get(a[1])),0);
  Map<String,ClassDef> before=new HashMap<>();for(int i=0;i<old.classCount;i++){ClassDef c=(ClassDef)old.classSection.get(i);before.put(c.getType(),c);}
  if(old.classCount!=next.classCount)throw new AssertionError("Class count changed");
  int changed=0;
  for(int i=0;i<next.classCount;i++){
   ClassDef c=(ClassDef)next.classSection.get(i);ClassDef prior=before.remove(c.getType());if(prior==null)throw new AssertionError("New core class: "+c.getType());
   String x=text(prior),y=text(c);
   if(!x.equals(y)){
    if(!c.getType().equals("Lcom/sma/smartv3/ui/main/BaseMainActivity;"))throw new AssertionError("Unexpected changed class: "+c.getType());
    String method="(?ms)^\\.method private final checkAppVersion\\(\\)V.*?^\\.end method";
    if(!x.replaceAll(method,"").equals(y.replaceAll(method,"")))throw new AssertionError("Change outside app version guard");
    if(!y.contains("com.diz.sw01.watch.integration"))throw new AssertionError("Missing extension identity");changed++;
   }
  }
  if(changed!=1||!before.isEmpty())throw new AssertionError("Unexpected change inventory");
  System.out.println("Core DEX semantic comparison passed: "+next.classCount+" classes; only checkAppVersion changed.");
 }
}
