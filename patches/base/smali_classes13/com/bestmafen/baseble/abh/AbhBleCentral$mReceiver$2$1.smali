.class public final Lcom/bestmafen/baseble/abh/AbhBleCentral$mReceiver$2$1;
.super Landroid/content/BroadcastReceiver;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/bestmafen/baseble/abh/AbhBleCentral;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nAbhBleCentral.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AbhBleCentral.kt\ncom/bestmafen/baseble/abh/AbhBleCentral$mReceiver$2$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,302:1\n774#2:303\n865#2,2:304\n1869#2,2:306\n*S KotlinDebug\n*F\n+ 1 AbhBleCentral.kt\ncom/bestmafen/baseble/abh/AbhBleCentral$mReceiver$2$1\n*L\n160#1:303\n160#1:304,2\n160#1:306,2\n*E\n"
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nAbhBleCentral.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AbhBleCentral.kt\ncom/bestmafen/baseble/abh/AbhBleCentral$mReceiver$2$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,302:1\n774#2:303\n865#2,2:304\n1869#2,2:306\n*S KotlinDebug\n*F\n+ 1 AbhBleCentral.kt\ncom/bestmafen/baseble/abh/AbhBleCentral$mReceiver$2$1\n*L\n160#1:303\n160#1:304,2\n160#1:306,2\n*E\n"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    return-void
.end method


# virtual methods
.method public onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 2

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "intent"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object p1

    const-string v0, "android.bluetooth.adapter.action.STATE_CHANGED"

    invoke-static {p1, v0}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result p1

    if-eqz p1, :cond_5

    const-string p1, "android.bluetooth.adapter.extra.STATE"

    const/4 v0, -0x1

    invoke-virtual {p2, p1, v0}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result p1

    sget-object p2, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {}, Lcom/bestmafen/baseble/abh/AbhBleCentral;->I1XOi1()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " BluetoothAdapter.ACTION_STATE_CHANGED -> "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget-object v1, Lcom/bestmafen/baseble/connector/AbsBleConnector;->Companion:Lcom/bestmafen/baseble/connector/AbsBleConnector$OXO1;

    invoke-virtual {v1, p1}, Lcom/bestmafen/baseble/connector/AbsBleConnector$OXO1;->OXO1(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->XO0O10(Ljava/lang/String;)V

    const/16 p2, 0xa

    if-eq p1, p2, :cond_1

    const/16 p2, 0xc

    if-eq p1, p2, :cond_0

    goto :goto_2

    :cond_0
    sget-object p1, Lcom/bestmafen/baseble/abh/AbhBleCentral;->OXO1:Lcom/bestmafen/baseble/abh/AbhBleCentral;

    invoke-static {p1}, Lcom/bestmafen/baseble/abh/AbhBleCentral;->IIX1OXO(Lcom/bestmafen/baseble/abh/AbhBleCentral;)V

    return-void

    :cond_1
    sget-object p1, Lcom/bestmafen/baseble/abh/AbhBleCentral;->OXO1:Lcom/bestmafen/baseble/abh/AbhBleCentral;

    invoke-static {p1}, Lcom/bestmafen/baseble/abh/AbhBleCentral;->OIX0iXi(Lcom/bestmafen/baseble/abh/AbhBleCentral;)Ljava/util/concurrent/ConcurrentHashMap;

    move-result-object p1

    invoke-virtual {p1}, Ljava/util/concurrent/ConcurrentHashMap;->values()Ljava/util/Collection;

    move-result-object p1

    const-string p2, "<get-values>(...)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Ljava/lang/Iterable;

    new-instance p2, Ljava/util/ArrayList;

    invoke-direct {p2}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_2
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Lcom/android/mltcode/paycertificationapi/IIII0iI;

    invoke-virtual {v1}, Lcom/android/mltcode/paycertificationapi/IIII0iI;->I1XOi1()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {p2, v0}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_3
    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-eqz p2, :cond_4

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/android/mltcode/paycertificationapi/IIII0iI;

    invoke-virtual {p2}, Lcom/android/mltcode/paycertificationapi/IIII0iI;->XXI()V

    const/4 v0, 0x0

    invoke-virtual {p2, v0}, Lcom/android/mltcode/paycertificationapi/IIII0iI;->X0i1O(I)Z

    goto :goto_1

    :cond_4
    sget-object p1, Lcom/bestmafen/baseble/abh/AbhBleCentral;->OXO1:Lcom/bestmafen/baseble/abh/AbhBleCentral;

    invoke-static {p1}, Lcom/bestmafen/baseble/abh/AbhBleCentral;->IIX1OXO(Lcom/bestmafen/baseble/abh/AbhBleCentral;)V

    :cond_5
    :goto_2
    return-void
.end method
