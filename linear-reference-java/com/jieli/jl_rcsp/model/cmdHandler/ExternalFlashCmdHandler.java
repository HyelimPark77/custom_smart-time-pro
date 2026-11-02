package com.jieli.jl_rcsp.model.cmdHandler;

import com.jieli.jl_rcsp.interfaces.cmd.ICmdHandler;

/* JADX INFO: loaded from: classes17.dex */
public class ExternalFlashCmdHandler implements ICmdHandler {
    public ExternalFlashCmdHandler() {
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 9161. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    @Override // com.jieli.jl_rcsp.interfaces.cmd.ICmdHandler
    public com.jieli.jl_rcsp.model.base.CommandBase parseDataToCmd(android.bluetooth.BluetoothDevice r20, com.jieli.jl_rcsp.model.base.BasePacket r21) {
        /*  JADX ERROR: Simple mode code generation failed
            jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0031: CONSTRUCTOR (r0v71 ?? I:com.jieli.jl_rcsp.model.command.external_flash.GetExternalFlashMsgCmd) =  A[DECLARE_VAR, MD:():void (m)] call: com.jieli.jl_rcsp.model.command.external_flash.GetExternalFlashMsgCmd.<init>():void type: CONSTRUCTOR in method: com.jieli.jl_rcsp.model.cmdHandler.ExternalFlashCmdHandler.parseDataToCmd(android.bluetooth.BluetoothDevice, com.jieli.jl_rcsp.model.base.BasePacket):com.jieli.jl_rcsp.model.base.CommandBase, file: classes17.dex
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:310)
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:273)
            	at jadx.core.codegen.MethodGen.generateSimpleCode(MethodGen.java:348)
            	at jadx.core.codegen.MethodGen.addSimpleMethodCode(MethodGen.java:316)
            	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:279)
            	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:420)
            	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:345)
            	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:299)
            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1541)
            	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
            	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
            Caused by: java.lang.NullPointerException
            	at jadx.core.codegen.ClassGen.useType(ClassGen.java:564)
            	at jadx.core.codegen.InsnGen.useType(InsnGen.java:269)
            	at jadx.core.codegen.InsnGen.declareVar(InsnGen.java:166)
            	at jadx.core.codegen.InsnGen.declareVar(InsnGen.java:159)
            	at jadx.core.codegen.InsnGen.assignVar(InsnGen.java:152)
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:299)
            	... 11 more
            */
        /*
            Method dump skipped, instruction units count: 916
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.jieli.jl_rcsp.model.cmdHandler.ExternalFlashCmdHandler.parseDataToCmd(android.bluetooth.BluetoothDevice, com.jieli.jl_rcsp.model.base.BasePacket):com.jieli.jl_rcsp.model.base.CommandBase");
    }
}
