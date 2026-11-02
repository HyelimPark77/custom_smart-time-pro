.class public final Lcom/sma/smartv3/dto/OXO1$OXO1;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/sma/smartv3/dto/OXO1;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "OXO1"
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nThirdPartyDeviceInfo.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ThirdPartyDeviceInfo.kt\ncom/sma/smartv3/dto/ThirdPartyDeviceInfo$Companion\n+ 2 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n*L\n1#1,116:1\n90#2:117\n98#2,2:118\n*S KotlinDebug\n*F\n+ 1 ThirdPartyDeviceInfo.kt\ncom/sma/smartv3/dto/ThirdPartyDeviceInfo$Companion\n*L\n93#1:117\n98#1:118,2\n*E\n"
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nThirdPartyDeviceInfo.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ThirdPartyDeviceInfo.kt\ncom/sma/smartv3/dto/ThirdPartyDeviceInfo$Companion\n+ 2 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n*L\n1#1,116:1\n90#2:117\n98#2,2:118\n*S KotlinDebug\n*F\n+ 1 ThirdPartyDeviceInfo.kt\ncom/sma/smartv3/dto/ThirdPartyDeviceInfo$Companion\n*L\n93#1:117\n98#1:118,2\n*E\n"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/sma/smartv3/dto/OXO1$OXO1;-><init>()V

    return-void
.end method

.method public static synthetic OIi0(Lcom/sma/smartv3/dto/OXO1$OXO1;ZILjava/lang/Object;)V
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    const/4 p1, 0x0

    :cond_0
    invoke-virtual {p0, p1}, Lcom/sma/smartv3/dto/OXO1$OXO1;->I0IIOi(Z)V

    return-void
.end method


# virtual methods
.method public final I0IIOi(Z)V
    .locals 3

    sget-object v0, Lcom/android/mltcode/paycertificationapi/a01;->OXO1:Lcom/android/mltcode/paycertificationapi/a01;

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/a01;->iO()Lcom/blankj/utilcode/util/SPUtils;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "THIRD_PARTY_DEVICE"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v2, 0x5f

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const-class v2, Lcom/sma/smartv3/dto/OXO1;

    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1, p1}, Lcom/blankj/utilcode/util/SPUtils;->remove(Ljava/lang/String;Z)V

    return-void
.end method

.method public final IO()V
    .locals 3

    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/sma/smartv3/dto/OXO1$OXO1;->I0IIOi(Z)V

    const/4 v0, 0x0

    const/4 v1, 0x2

    const-string v2, "refresh_main"

    invoke-static {v2, v0, v1, v0}, Lcom/android/mltcode/paycertificationapi/I01XX0;->XIi00iiXO(Ljava/lang/String;Ljava/lang/Object;ILjava/lang/Object;)V

    return-void
.end method

.method public final IiI10X()Z
    .locals 3

    invoke-virtual {p0}, Lcom/sma/smartv3/dto/OXO1$OXO1;->XIi00iiXO()Lcom/sma/smartv3/dto/OXO1;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/sma/smartv3/dto/OXO1;->II1Xi0()Z

    move-result v0

    const/4 v2, 0x1

    if-ne v0, v2, :cond_0

    return v2

    :cond_0
    return v1
.end method

.method public final O00()Ljava/lang/String;
    .locals 2
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    new-instance v0, Lcom/google/gson/Gson;

    invoke-direct {v0}, Lcom/google/gson/Gson;-><init>()V

    invoke-virtual {p0}, Lcom/sma/smartv3/dto/OXO1$OXO1;->XIi00iiXO()Lcom/sma/smartv3/dto/OXO1;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Lcom/sma/smartv3/dto/OXO1;->XiOIO()Lcom/sma/smartv3/network/BleInfo;

    move-result-object v1

    if-nez v1, :cond_1

    :cond_0
    invoke-static {}, Lcom/sma/smartv3/dto/OXO1;->XIi00iiXO()Lcom/sma/smartv3/network/BleInfo;

    move-result-object v1

    :cond_1
    invoke-virtual {v0, v1}, Lcom/google/gson/Gson;->toJson(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "toJson(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public final OXO1()Ljava/lang/String;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    invoke-static {}, Lcom/sma/smartv3/dto/OXO1;->OXO1()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final XIi00iiXO()Lcom/sma/smartv3/dto/OXO1;
    .locals 5
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation

    sget-object v0, Lcom/android/mltcode/paycertificationapi/a01;->OXO1:Lcom/android/mltcode/paycertificationapi/a01;

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/a01;->iO()Lcom/blankj/utilcode/util/SPUtils;

    move-result-object v0

    new-instance v1, Lcom/google/gson/Gson;

    invoke-direct {v1}, Lcom/google/gson/Gson;-><init>()V

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "THIRD_PARTY_DEVICE"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v3, 0x5f

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const-class v3, Lcom/sma/smartv3/dto/OXO1;

    invoke-virtual {v3}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Lcom/blankj/utilcode/util/SPUtils;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0, v3}, Lcom/google/gson/Gson;->fromJson(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/sma/smartv3/dto/OXO1;

    return-object v0
.end method

.method public final XO0O10()Ljava/lang/String;
    .locals 2
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    sget-object v0, Lcom/sma/smartv3/dto/ChatAiMode;->Companion:Lcom/sma/smartv3/dto/ChatAiMode$OXO1;

    invoke-virtual {p0}, Lcom/sma/smartv3/dto/OXO1$OXO1;->XIi00iiXO()Lcom/sma/smartv3/dto/OXO1;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Lcom/sma/smartv3/dto/OXO1;->OII()I

    move-result v1

    goto :goto_0

    :cond_0
    const/4 v1, 0x2

    :goto_0
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/sma/smartv3/dto/ChatAiMode$OXO1;->iO(Ljava/lang/Integer;)Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_1

    sget-object v0, Lcom/sma/smartv3/dto/ChatAiMode;->SPARK_CHAIN:Lcom/sma/smartv3/dto/ChatAiMode;

    invoke-virtual {v0}, Lcom/sma/smartv3/dto/ChatAiMode;->getModelName()Ljava/lang/String;

    move-result-object v0

    :cond_1
    return-object v0
.end method

.method public final XOO0ii0()Z
    .locals 1

    invoke-virtual {p0}, Lcom/sma/smartv3/dto/OXO1$OXO1;->XIi00iiXO()Lcom/sma/smartv3/dto/OXO1;

    move-result-object v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final iO()Lcom/sma/smartv3/dto/ChatAiMode;
    .locals 2
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    sget-object v0, Lcom/sma/smartv3/dto/ChatAiMode;->Companion:Lcom/sma/smartv3/dto/ChatAiMode$OXO1;

    invoke-virtual {p0}, Lcom/sma/smartv3/dto/OXO1$OXO1;->XIi00iiXO()Lcom/sma/smartv3/dto/OXO1;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Lcom/sma/smartv3/dto/OXO1;->OII()I

    move-result v1

    goto :goto_0

    :cond_0
    const/4 v1, 0x2

    :goto_0
    invoke-virtual {v0, v1}, Lcom/sma/smartv3/dto/ChatAiMode$OXO1;->OXO1(I)Lcom/sma/smartv3/dto/ChatAiMode;

    move-result-object v0

    if-nez v0, :cond_1

    sget-object v0, Lcom/sma/smartv3/dto/ChatAiMode;->SPARK_CHAIN:Lcom/sma/smartv3/dto/ChatAiMode;

    :cond_1
    return-object v0
.end method
