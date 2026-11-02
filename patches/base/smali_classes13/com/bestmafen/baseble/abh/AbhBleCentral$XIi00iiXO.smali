.class public final Lcom/bestmafen/baseble/abh/AbhBleCentral$XIi00iiXO;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/android/mltcode/paycertificationapi/i1OIOOIiX;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/bestmafen/baseble/abh/AbhBleCentral;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nAbhBleCentral.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AbhBleCentral.kt\ncom/bestmafen/baseble/abh/AbhBleCentral$mScanner$2$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,302:1\n1740#2,3:303\n*S KotlinDebug\n*F\n+ 1 AbhBleCentral.kt\ncom/bestmafen/baseble/abh/AbhBleCentral$mScanner$2$1\n*L\n136#1:303,3\n*E\n"
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nAbhBleCentral.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AbhBleCentral.kt\ncom/bestmafen/baseble/abh/AbhBleCentral$mScanner$2$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,302:1\n1740#2,3:303\n*S KotlinDebug\n*F\n+ 1 AbhBleCentral.kt\ncom/bestmafen/baseble/abh/AbhBleCentral$mScanner$2$1\n*L\n136#1:303,3\n*E\n"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public OXO1(Z)V
    .locals 3

    sget-object v0, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {}, Lcom/bestmafen/baseble/abh/AbhBleCentral;->I1XOi1()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, " onScan -> "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    return-void
.end method

.method public XIi00iiXO(Lcom/bestmafen/baseble/scanner/BleDevice;)V
    .locals 3

    const-string v0, "device"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {}, Lcom/bestmafen/baseble/abh/AbhBleCentral;->I1XOi1()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, " onDeviceFound -> "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    sget-object v0, Lcom/bestmafen/baseble/abh/AbhBleCentral;->OXO1:Lcom/bestmafen/baseble/abh/AbhBleCentral;

    invoke-static {v0}, Lcom/bestmafen/baseble/abh/AbhBleCentral;->OIX0iXi(Lcom/bestmafen/baseble/abh/AbhBleCentral;)Ljava/util/concurrent/ConcurrentHashMap;

    move-result-object v1

    invoke-virtual {p1}, Lcom/bestmafen/baseble/scanner/BleDevice;->getMAddress()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/android/mltcode/paycertificationapi/IIII0iI;

    if-eqz v1, :cond_1

    invoke-static {}, Lcom/bestmafen/baseble/abh/AbhBleCentral;->OIi0()Landroid/content/Context;

    move-result-object v2

    if-nez v2, :cond_0

    const-string v2, "mContext"

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    const/4 v2, 0x0

    :cond_0
    invoke-virtual {p1}, Lcom/bestmafen/baseble/scanner/BleDevice;->getMBluetoothDevice()Landroid/bluetooth/BluetoothDevice;

    move-result-object p1

    invoke-virtual {v1, v2, p1}, Lcom/android/mltcode/paycertificationapi/IIII0iI;->X1ii(Landroid/content/Context;Landroid/bluetooth/BluetoothDevice;)V

    :cond_1
    invoke-static {v0}, Lcom/bestmafen/baseble/abh/AbhBleCentral;->OIX0iXi(Lcom/bestmafen/baseble/abh/AbhBleCentral;)Ljava/util/concurrent/ConcurrentHashMap;

    move-result-object p1

    invoke-virtual {p1}, Ljava/util/concurrent/ConcurrentHashMap;->values()Ljava/util/Collection;

    move-result-object p1

    const-string v0, "<get-values>(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Ljava/lang/Iterable;

    move-object v0, p1

    check-cast v0, Ljava/util/Collection;

    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_2

    goto :goto_1

    :cond_2
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_3
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/android/mltcode/paycertificationapi/IIII0iI;

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/IIII0iI;->I1XOi1()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/IIII0iI;->XiOIO()Landroid/bluetooth/BluetoothGatt;

    move-result-object v0

    if-eqz v0, :cond_4

    goto :goto_0

    :cond_4
    return-void

    :cond_5
    :goto_1
    sget-object p1, Lcom/bestmafen/baseble/abh/AbhBleCentral;->OXO1:Lcom/bestmafen/baseble/abh/AbhBleCentral;

    invoke-static {p1}, Lcom/bestmafen/baseble/abh/AbhBleCentral;->X0O(Lcom/bestmafen/baseble/abh/AbhBleCentral;)Lcom/android/mltcode/paycertificationapi/OXOI0XII;

    move-result-object p1

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Lcom/android/mltcode/paycertificationapi/OXOI0XII;->XXI(Z)V

    return-void
.end method

.method public iO()V
    .locals 0

    return-void
.end method
