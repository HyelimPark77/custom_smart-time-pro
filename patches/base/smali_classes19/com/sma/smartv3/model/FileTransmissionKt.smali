.class public final Lcom/sma/smartv3/model/FileTransmissionKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nFileTransmission.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FileTransmission.kt\ncom/sma/smartv3/model/FileTransmissionKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,243:1\n774#2:244\n865#2,2:245\n1869#2,2:247\n*S KotlinDebug\n*F\n+ 1 FileTransmission.kt\ncom/sma/smartv3/model/FileTransmissionKt\n*L\n44#1:244\n44#1:245,2\n61#1:247,2\n*E\n"
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nFileTransmission.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FileTransmission.kt\ncom/sma/smartv3/model/FileTransmissionKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,243:1\n774#2:244\n865#2,2:245\n1869#2,2:247\n*S KotlinDebug\n*F\n+ 1 FileTransmission.kt\ncom/sma/smartv3/model/FileTransmissionKt\n*L\n44#1:244\n44#1:245,2\n61#1:247,2\n*E\n"
    }
.end annotation


# direct methods
.method public static final appStoreIsShowCurrentCategory(Ljava/lang/String;)Z
    .locals 8
    .param p0    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "appPackName"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/android/mltcode/paycertificationapi/q62;->OXO1:Lcom/android/mltcode/paycertificationapi/q62;

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/q62;->i0()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_2

    :try_start_0
    sget-object v2, Lcom/szabh/smable3/component/BleCache;->INSTANCE:Lcom/szabh/smable3/component/BleCache;

    sget-object v3, Lcom/szabh/smable3/BleKey;->APP_OP:Lcom/szabh/smable3/BleKey;

    const-class v4, Lcom/szabh/smable3/entity/BleAppInfoList;

    const/4 v6, 0x4

    const/4 v7, 0x0

    const/4 v5, 0x0

    invoke-static/range {v2 .. v7}, Lcom/szabh/smable3/component/BaseBleCache;->getObject$default(Lcom/szabh/smable3/component/BaseBleCache;Lcom/szabh/smable3/BleKey;Ljava/lang/Class;Lcom/szabh/smable3/BleKeyFlag;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/szabh/smable3/entity/BleAppInfoList;

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Lcom/szabh/smable3/entity/BleAppInfoList;->getMList()Ljava/util/List;

    move-result-object v2

    check-cast v2, Ljava/util/Collection;

    invoke-interface {v2}, Ljava/util/Collection;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_2

    invoke-virtual {v0}, Lcom/szabh/smable3/entity/BleAppInfoList;->getMList()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    move-object v4, v3

    check-cast v4, Lcom/szabh/smable3/entity/BleAppInfo;

    invoke-virtual {v4}, Lcom/szabh/smable3/entity/BleAppInfo;->getMPackage()Ljava/lang/String;

    move-result-object v4

    invoke-static {v4, p0}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_0

    invoke-interface {v2, v3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    invoke-interface {v2}, Ljava/util/Collection;->isEmpty()Z

    move-result p0

    if-nez p0, :cond_2

    invoke-static {v2}, Lkotlin/collections/CollectionsKt___CollectionsKt;->IIII0iI(Ljava/util/List;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/szabh/smable3/entity/BleAppInfo;

    invoke-virtual {p0}, Lcom/szabh/smable3/entity/BleAppInfo;->getMHide()I

    move-result p0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    if-nez p0, :cond_2

    const/4 p0, 0x1

    return p0

    :catch_0
    :cond_2
    return v1
.end method

.method public static synthetic appStoreIsShowCurrentCategory$default(Ljava/lang/String;ILjava/lang/Object;)Z
    .locals 0

    and-int/lit8 p1, p1, 0x1

    if-eqz p1, :cond_0

    const-string p0, "built-in.world_clock"

    :cond_0
    invoke-static {p0}, Lcom/sma/smartv3/model/FileTransmissionKt;->appStoreIsShowCurrentCategory(Ljava/lang/String;)Z

    move-result p0

    return p0
.end method

.method public static final changAppStoreCurrentCategory(Ljava/lang/String;)V
    .locals 7
    .param p0    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "appPackName"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/android/mltcode/paycertificationapi/q62;->OXO1:Lcom/android/mltcode/paycertificationapi/q62;

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/q62;->i0()Z

    move-result v0

    if-eqz v0, :cond_3

    :try_start_0
    sget-object v1, Lcom/szabh/smable3/component/BleCache;->INSTANCE:Lcom/szabh/smable3/component/BleCache;

    sget-object v2, Lcom/szabh/smable3/BleKey;->APP_OP:Lcom/szabh/smable3/BleKey;

    const-class v3, Lcom/szabh/smable3/entity/BleAppInfoList;

    const/4 v5, 0x4

    const/4 v6, 0x0

    const/4 v4, 0x0

    invoke-static/range {v1 .. v6}, Lcom/szabh/smable3/component/BaseBleCache;->getObject$default(Lcom/szabh/smable3/component/BaseBleCache;Lcom/szabh/smable3/BleKey;Ljava/lang/Class;Lcom/szabh/smable3/BleKeyFlag;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Lcom/szabh/smable3/entity/BleAppInfoList;

    if-eqz v3, :cond_2

    invoke-virtual {v3}, Lcom/szabh/smable3/entity/BleAppInfoList;->getMList()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/util/Collection;

    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_2

    invoke-virtual {v3}, Lcom/szabh/smable3/entity/BleAppInfoList;->getMList()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/szabh/smable3/entity/BleAppInfo;

    invoke-virtual {v1}, Lcom/szabh/smable3/entity/BleAppInfo;->getMPackage()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2, p0}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-virtual {v1}, Lcom/szabh/smable3/entity/BleAppInfo;->getMHide()I

    move-result v2

    if-nez v2, :cond_1

    const/4 v2, 0x1

    invoke-virtual {v1, v2}, Lcom/szabh/smable3/entity/BleAppInfo;->setMHide(I)V

    goto :goto_0

    :cond_1
    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Lcom/szabh/smable3/entity/BleAppInfo;->setMHide(I)V

    goto :goto_0

    :cond_2
    sget-object v1, Lcom/szabh/smable3/component/BleCache;->INSTANCE:Lcom/szabh/smable3/component/BleCache;

    sget-object v2, Lcom/szabh/smable3/BleKey;->APP_OP:Lcom/szabh/smable3/BleKey;

    const/4 v5, 0x4

    const/4 v6, 0x0

    const/4 v4, 0x0

    invoke-static/range {v1 .. v6}, Lcom/szabh/smable3/component/BaseBleCache;->putObject$default(Lcom/szabh/smable3/component/BaseBleCache;Lcom/szabh/smable3/BleKey;Ljava/lang/Object;Lcom/szabh/smable3/BleKeyFlag;ILjava/lang/Object;)V

    const-string p0, "bind_stage_change"

    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-static {p0, v0}, Lcom/android/mltcode/paycertificationapi/I01XX0;->OXO1(Ljava/lang/String;Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    :cond_3
    return-void
.end method

.method public static final getAppStoreIcon(Ljava/lang/String;)I
    .locals 1
    .param p0    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "mPackage"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Ljava/lang/String;->hashCode()I

    move-result v0

    sparse-switch v0, :sswitch_data_0

    goto/16 :goto_0

    :sswitch_0
    const-string v0, "built-in.Calculator"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_0

    goto :goto_0

    :cond_0
    const p0, 0x7f0806d8

    return p0

    :sswitch_1
    const-string v0, "built-in.Card_Wallet"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_1

    goto :goto_0

    :cond_1
    const p0, 0x7f0806d9

    return p0

    :sswitch_2
    const-string v0, "built-in.world_clock"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    goto :goto_0

    :sswitch_3
    const-string v0, "built-in.game_plan"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_2

    goto :goto_0

    :cond_2
    const p0, 0x7f0806d4

    return p0

    :sswitch_4
    const-string v0, "built-in.game_2048"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_3

    goto :goto_0

    :cond_3
    const p0, 0x7f0806d2

    return p0

    :sswitch_5
    const-string v0, "built-in.stock"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_4

    goto :goto_0

    :cond_4
    const p0, 0x7f0806d0

    return p0

    :sswitch_6
    const-string v0, "built-in.game_ttt"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_5

    goto :goto_0

    :cond_5
    const p0, 0x7f0806d3

    return p0

    :sswitch_7
    const-string v0, "built-in.alipay"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_6

    goto :goto_0

    :cond_6
    const p0, 0x7f0806d6

    return p0

    :sswitch_8
    const-string v0, "built-in.navigation"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_7

    :goto_0
    const p0, 0x7f0806d1

    return p0

    :cond_7
    const p0, 0x7f0806d7

    return p0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x714b1a92 -> :sswitch_8
        -0x448ffd5c -> :sswitch_7
        -0x30ec21ff -> :sswitch_6
        -0x223d1484 -> :sswitch_5
        0x1348dad5 -> :sswitch_4
        0x1365f0bc -> :sswitch_3
        0x237d7507 -> :sswitch_2
        0x33b967ee -> :sswitch_1
        0x52a4227c -> :sswitch_0
    .end sparse-switch
.end method
