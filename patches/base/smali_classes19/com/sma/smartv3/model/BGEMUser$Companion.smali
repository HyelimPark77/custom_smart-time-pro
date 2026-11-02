.class public final Lcom/sma/smartv3/model/BGEMUser$Companion;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/sma/smartv3/model/BGEMUser;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Companion"
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/sma/smartv3/model/BGEMUser$Companion;-><init>()V

    return-void
.end method


# virtual methods
.method public final of(Lcom/sma/smartv3/model/AppUser;)Lcom/sma/smartv3/model/BGEMUser;
    .locals 13
    .param p1    # Lcom/sma/smartv3/model/AppUser;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    const-string v0, "appUser"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/sma/smartv3/model/BGEMUser;

    invoke-virtual {p1}, Lcom/sma/smartv3/model/AppUser;->getBirthday()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/sma/smartv3/model/WeightMeasureDataKt;->getAgeByBirth(Ljava/lang/String;)I

    move-result v4

    invoke-virtual {p1}, Lcom/sma/smartv3/model/AppUser;->getGender()I

    move-result v0

    const/4 v2, 0x1

    if-ne v0, v2, :cond_0

    sget-object v0, Lcom/sma/smartv3/model/BGEMGender;->M:Lcom/sma/smartv3/model/BGEMGender;

    :goto_0
    move-object v5, v0

    goto :goto_1

    :cond_0
    sget-object v0, Lcom/sma/smartv3/model/BGEMGender;->F:Lcom/sma/smartv3/model/BGEMGender;

    goto :goto_0

    :goto_1
    invoke-virtual {p1}, Lcom/sma/smartv3/model/AppUser;->getWeight()F

    move-result v0

    float-to-int v6, v0

    invoke-virtual {p1}, Lcom/sma/smartv3/model/AppUser;->getHeight()F

    move-result p1

    float-to-int v7, p1

    sget-object p1, Lcom/android/mltcode/paycertificationapi/a01;->OXO1:Lcom/android/mltcode/paycertificationapi/a01;

    invoke-virtual {p1}, Lcom/android/mltcode/paycertificationapi/a01;->IiI10X()Lcom/blankj/utilcode/util/SPUtils;

    move-result-object p1

    const-string v0, "IS_FAMILY_HISTORY"

    const/4 v2, 0x0

    invoke-virtual {p1, v0, v2}, Lcom/blankj/utilcode/util/SPUtils;->getBoolean(Ljava/lang/String;Z)Z

    move-result v9

    const/16 v11, 0x43

    const/4 v12, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v8, 0x0

    const/4 v10, 0x0

    invoke-direct/range {v1 .. v12}, Lcom/sma/smartv3/model/BGEMUser;-><init>(Ljava/lang/String;Ljava/lang/String;ILcom/sma/smartv3/model/BGEMGender;IILjava/lang/String;ZZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v1
.end method
