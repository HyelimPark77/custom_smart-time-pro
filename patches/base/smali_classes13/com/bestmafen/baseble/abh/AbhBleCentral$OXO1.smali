.class public final Lcom/bestmafen/baseble/abh/AbhBleCentral$OXO1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/bestmafen/baseble/abh/AbhBleCentral;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nAbhBleCentral.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AbhBleCentral.kt\ncom/bestmafen/baseble/abh/AbhBleCentral$mConnectionRunnable$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,302:1\n774#2:303\n865#2,2:304\n1869#2,2:306\n1869#2,2:308\n*S KotlinDebug\n*F\n+ 1 AbhBleCentral.kt\ncom/bestmafen/baseble/abh/AbhBleCentral$mConnectionRunnable$1\n*L\n71#1:303\n71#1:304,2\n74#1:306,2\n106#1:308,2\n*E\n"
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nAbhBleCentral.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AbhBleCentral.kt\ncom/bestmafen/baseble/abh/AbhBleCentral$mConnectionRunnable$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,302:1\n774#2:303\n865#2,2:304\n1869#2,2:306\n1869#2,2:308\n*S KotlinDebug\n*F\n+ 1 AbhBleCentral.kt\ncom/bestmafen/baseble/abh/AbhBleCentral$mConnectionRunnable$1\n*L\n71#1:303\n71#1:304,2\n74#1:306,2\n106#1:308,2\n*E\n"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 9

    sget-object v0, Lcom/bestmafen/baseble/abh/AbhBleCentral;->OXO1:Lcom/bestmafen/baseble/abh/AbhBleCentral;

    monitor-enter v0

    :try_start_0
    invoke-static {v0}, Lcom/bestmafen/baseble/abh/AbhBleCentral;->OIX0iXi(Lcom/bestmafen/baseble/abh/AbhBleCentral;)Ljava/util/concurrent/ConcurrentHashMap;

    move-result-object v1

    invoke-virtual {v1}, Ljava/util/concurrent/ConcurrentHashMap;->values()Ljava/util/Collection;

    move-result-object v1

    const-string v2, "<get-values>(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v1, Ljava/lang/Iterable;

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    const/4 v4, 0x4

    if-eqz v3, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    move-object v5, v3

    check-cast v5, Lcom/android/mltcode/paycertificationapi/IIII0iI;

    invoke-virtual {v5}, Lcom/android/mltcode/paycertificationapi/IIII0iI;->I1XOi1()Z

    move-result v6

    if-eqz v6, :cond_0

    invoke-virtual {v5}, Lcom/android/mltcode/paycertificationapi/IIII0iI;->OII()I

    move-result v5

    if-eq v5, v4, :cond_0

    invoke-interface {v2, v3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :catchall_0
    move-exception v1

    goto/16 :goto_4

    :cond_1
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/android/mltcode/paycertificationapi/IIII0iI;

    invoke-virtual {v3}, Lcom/android/mltcode/paycertificationapi/IIII0iI;->XXI()V

    goto :goto_1

    :cond_2
    sget-object v1, Lcom/bestmafen/baseble/abh/AbhBleCentral;->OXO1:Lcom/bestmafen/baseble/abh/AbhBleCentral;

    invoke-static {v1}, Lcom/bestmafen/baseble/abh/AbhBleCentral;->IiI10X(Lcom/bestmafen/baseble/abh/AbhBleCentral;)Z

    move-result v3

    if-nez v3, :cond_3

    goto/16 :goto_3

    :cond_3
    invoke-static {}, Lcom/bestmafen/baseble/abh/AbhBleCentral;->X1ii()I

    move-result v3

    const/4 v5, 0x1

    add-int/2addr v3, v5

    invoke-static {v3}, Lcom/bestmafen/baseble/abh/AbhBleCentral;->iIiiO(I)V

    invoke-static {}, Lcom/bestmafen/baseble/abh/AbhBleCentral;->X1ii()I

    move-result v3

    if-ge v3, v5, :cond_4

    invoke-static {v5}, Lcom/bestmafen/baseble/abh/AbhBleCentral;->iIiiO(I)V

    :cond_4
    invoke-static {}, Lcom/bestmafen/baseble/abh/AbhBleCentral;->X1ii()I

    move-result v3

    invoke-static {}, Lcom/bestmafen/baseble/abh/AbhBleCentral;->I0iXXO()I

    move-result v6

    mul-int/2addr v3, v6

    invoke-static {}, Lcom/bestmafen/baseble/abh/AbhBleCentral;->XXI()I

    move-result v6

    if-le v3, v6, :cond_5

    invoke-static {v5}, Lcom/bestmafen/baseble/abh/AbhBleCentral;->iIiiO(I)V

    invoke-static {}, Lcom/bestmafen/baseble/abh/AbhBleCentral;->X1ii()I

    move-result v3

    invoke-static {}, Lcom/bestmafen/baseble/abh/AbhBleCentral;->I0iXXO()I

    move-result v6

    mul-int/2addr v3, v6

    :cond_5
    invoke-static {}, Lcom/bestmafen/baseble/abh/AbhBleCentral;->I0IIOi()I

    move-result v6

    const/4 v7, 0x2

    const/16 v8, 0x20

    if-ne v6, v7, :cond_7

    mul-int/lit8 v2, v3, 0x3

    div-int/2addr v2, v4

    invoke-static {}, Lcom/bestmafen/baseble/abh/AbhBleCentral;->O10IXXX0X()I

    move-result v4

    if-le v2, v4, :cond_6

    invoke-static {}, Lcom/bestmafen/baseble/abh/AbhBleCentral;->O10IXXX0X()I

    move-result v2

    :cond_6
    sget-object v4, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {}, Lcom/bestmafen/baseble/abh/AbhBleCentral;->I1XOi1()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v7, " connect scan "

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {}, Lcom/bestmafen/baseble/abh/AbhBleCentral;->O10IXXX0X()I

    move-result v7

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v8}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-static {}, Lcom/bestmafen/baseble/abh/AbhBleCentral;->XXI()I

    move-result v7

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v8}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-static {}, Lcom/bestmafen/baseble/abh/AbhBleCentral;->X1ii()I

    move-result v7

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v8}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v8}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v4, v6}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    invoke-static {v1}, Lcom/bestmafen/baseble/abh/AbhBleCentral;->X0O(Lcom/bestmafen/baseble/abh/AbhBleCentral;)Lcom/android/mltcode/paycertificationapi/OXOI0XII;

    move-result-object v1

    invoke-virtual {v1, v2}, Lcom/android/mltcode/paycertificationapi/OXOI0XII;->IIX1OXO(I)Lcom/android/mltcode/paycertificationapi/OXOI0XII;

    invoke-virtual {v1, v5}, Lcom/android/mltcode/paycertificationapi/OXOI0XII;->XXI(Z)V

    invoke-static {}, Lcom/bestmafen/baseble/abh/AbhBleCentral;->IO()Landroid/os/Handler;

    move-result-object v1

    mul-int/lit16 v3, v3, 0x3e8

    int-to-long v2, v3

    invoke-virtual {v1, p0, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    invoke-static {v5}, Lcom/bestmafen/baseble/abh/AbhBleCentral;->XiOIO(I)V

    goto :goto_3

    :cond_7
    sget-object v1, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {}, Lcom/bestmafen/baseble/abh/AbhBleCentral;->I1XOi1()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v4, " connect directly "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {}, Lcom/bestmafen/baseble/abh/AbhBleCentral;->X1ii()I

    move-result v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v8}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_2
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_9

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/android/mltcode/paycertificationapi/IIII0iI;

    invoke-static {}, Lcom/bestmafen/baseble/abh/AbhBleCentral;->OIi0()Landroid/content/Context;

    move-result-object v3

    if-nez v3, :cond_8

    const-string v3, "mContext"

    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    const/4 v3, 0x0

    :cond_8
    invoke-static {}, Lcom/bestmafen/baseble/abh/AbhBleCentral;->XOO0ii0()Landroid/bluetooth/BluetoothAdapter;

    move-result-object v4

    invoke-virtual {v2}, Lcom/android/mltcode/paycertificationapi/IIII0iI;->IIX1OXO()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Landroid/bluetooth/BluetoothAdapter;->getRemoteDevice(Ljava/lang/String;)Landroid/bluetooth/BluetoothDevice;

    move-result-object v4

    const-string v5, "getRemoteDevice(...)"

    invoke-static {v4, v5}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v2, v3, v4}, Lcom/android/mltcode/paycertificationapi/IIII0iI;->X1ii(Landroid/content/Context;Landroid/bluetooth/BluetoothDevice;)V

    goto :goto_2

    :cond_9
    invoke-static {}, Lcom/bestmafen/baseble/abh/AbhBleCentral;->IO()Landroid/os/Handler;

    move-result-object v1

    const-wide/16 v2, 0x3e80

    invoke-virtual {v1, p0, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    sget-object v1, Lcom/bestmafen/baseble/abh/AbhBleCentral;->OXO1:Lcom/bestmafen/baseble/abh/AbhBleCentral;

    invoke-static {v7}, Lcom/bestmafen/baseble/abh/AbhBleCentral;->XiOIO(I)V

    :goto_3
    sget-object v1, Lkotlin/Unit;->OXO1:Lkotlin/Unit;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return-void

    :goto_4
    monitor-exit v0

    throw v1
.end method
