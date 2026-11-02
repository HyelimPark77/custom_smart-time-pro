.class public final Lcom/sma/smartv3/ui/sport/SportGoalDistanceFragment;
.super Lcom/sma/smartv3/ui/sport/BaseSportGoalSetFragment;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nSportGoalDistanceFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SportGoalDistanceFragment.kt\ncom/sma/smartv3/ui/sport/SportGoalDistanceFragment\n+ 2 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n+ 3 Activity.kt\ncom/bestmafen/androidbase/extension/ActivityKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,222:1\n19#2:223\n15#2:224\n151#3,5:225\n156#3,5:231\n99#3,7:236\n106#3,3:244\n79#3,7:247\n109#3:254\n1#4:230\n1#4:243\n*S KotlinDebug\n*F\n+ 1 SportGoalDistanceFragment.kt\ncom/sma/smartv3/ui/sport/SportGoalDistanceFragment\n*L\n28#1:223\n28#1:224\n184#1:225,5\n184#1:231,5\n200#1:236,7\n200#1:244,3\n200#1:247,7\n200#1:254\n184#1:230\n200#1:243\n*E\n"
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nSportGoalDistanceFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SportGoalDistanceFragment.kt\ncom/sma/smartv3/ui/sport/SportGoalDistanceFragment\n+ 2 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n+ 3 Activity.kt\ncom/bestmafen/androidbase/extension/ActivityKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,222:1\n19#2:223\n15#2:224\n151#3,5:225\n156#3,5:231\n99#3,7:236\n106#3,3:244\n79#3,7:247\n109#3:254\n1#4:230\n1#4:243\n*S KotlinDebug\n*F\n+ 1 SportGoalDistanceFragment.kt\ncom/sma/smartv3/ui/sport/SportGoalDistanceFragment\n*L\n28#1:223\n28#1:224\n184#1:225,5\n184#1:231,5\n200#1:236,7\n200#1:244,3\n200#1:247,7\n200#1:254\n184#1:230\n200#1:243\n*E\n"
    }
.end annotation


# instance fields
.field private final userProfile:Lcom/sma/smartv3/model/AppUser;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 31

    invoke-direct/range {p0 .. p0}, Lcom/sma/smartv3/ui/sport/BaseSportGoalSetFragment;-><init>()V

    sget-object v0, Lcom/android/mltcode/paycertificationapi/a01;->OXO1:Lcom/android/mltcode/paycertificationapi/a01;

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/a01;->IiI10X()Lcom/blankj/utilcode/util/SPUtils;

    move-result-object v0

    new-instance v1, Lcom/sma/smartv3/model/AppUser;

    const v29, 0x7ffffff

    const/16 v30, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    invoke-direct/range {v1 .. v30}, Lcom/sma/smartv3/model/AppUser;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IIFFLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;FFIILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/sma/smartv3/model/ThirdPlatform;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v2, Lcom/google/gson/Gson;

    invoke-direct {v2}, Lcom/google/gson/Gson;-><init>()V

    const-class v3, Lcom/sma/smartv3/model/AppUser;

    invoke-virtual {v3}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0, v4}, Lcom/blankj/utilcode/util/SPUtils;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0, v3}, Lcom/google/gson/Gson;->fromJson(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    move-object v1, v0

    :goto_0
    check-cast v1, Lcom/sma/smartv3/model/AppUser;

    move-object/from16 v0, p0

    iput-object v1, v0, Lcom/sma/smartv3/ui/sport/SportGoalDistanceFragment;->userProfile:Lcom/sma/smartv3/model/AppUser;

    return-void
.end method

.method private final getHalfGoals()I
    .locals 2

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseFragment;->getMArg1()I

    move-result v0

    const/16 v1, 0xa

    if-eq v0, v1, :cond_1

    const/16 v1, 0xd

    if-eq v0, v1, :cond_0

    const/16 v0, 0x5269

    return v0

    :cond_0
    const/16 v0, 0x3a98

    return v0

    :cond_1
    const/16 v0, 0x4e20

    return v0
.end method

.method private final getHalfHorse()Ljava/lang/String;
    .locals 3

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseFragment;->getMArg1()I

    move-result v0

    const/16 v1, 0xa

    const/4 v2, 0x0

    if-eq v0, v1, :cond_1

    const/16 v1, 0xd

    if-eq v0, v1, :cond_0

    const/high16 v0, 0x41a80000    # 21.0f

    invoke-virtual {p0, v0}, Lcom/sma/smartv3/ui/sport/SportGoalDistanceFragment;->transformHalfWhole(F)Ljava/lang/String;

    move-result-object v0

    return-object v0

    :cond_0
    const/high16 v0, 0x41700000    # 15.0f

    invoke-static {v0, v2}, Lcom/android/mltcode/paycertificationapi/cp5;->XIi00iiXO(FZ)Ljava/lang/String;

    move-result-object v0

    return-object v0

    :cond_1
    const/high16 v0, 0x41a00000    # 20.0f

    invoke-static {v0, v2}, Lcom/android/mltcode/paycertificationapi/cp5;->XIi00iiXO(FZ)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private final getMarathonTitle(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseFragment;->getMArg1()I

    move-result v0

    const/16 v1, 0xa

    if-eq v0, v1, :cond_0

    const/16 v1, 0xd

    if-eq v0, v1, :cond_0

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, " "

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1

    :cond_0
    const-string p1, ""

    return-object p1
.end method

.method private final getWholeGoals()I
    .locals 2

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseFragment;->getMArg1()I

    move-result v0

    const/16 v1, 0xa

    if-eq v0, v1, :cond_1

    const/16 v1, 0xd

    if-eq v0, v1, :cond_0

    const v0, 0xa4d3

    return v0

    :cond_0
    const/16 v0, 0x7530

    return v0

    :cond_1
    const v0, 0x9c40

    return v0
.end method

.method private final getWholeHorse()Ljava/lang/String;
    .locals 3

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseFragment;->getMArg1()I

    move-result v0

    const/16 v1, 0xa

    const/4 v2, 0x0

    if-eq v0, v1, :cond_1

    const/16 v1, 0xd

    if-eq v0, v1, :cond_0

    const v0, 0x42286666    # 42.1f

    invoke-virtual {p0, v0}, Lcom/sma/smartv3/ui/sport/SportGoalDistanceFragment;->transformHalfWhole(F)Ljava/lang/String;

    move-result-object v0

    return-object v0

    :cond_0
    const/high16 v0, 0x41f00000    # 30.0f

    invoke-static {v0, v2}, Lcom/android/mltcode/paycertificationapi/cp5;->XIi00iiXO(FZ)Ljava/lang/String;

    move-result-object v0

    return-object v0

    :cond_1
    const/high16 v0, 0x42200000    # 40.0f

    invoke-static {v0, v2}, Lcom/android/mltcode/paycertificationapi/cp5;->XIi00iiXO(FZ)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public onActivityResult(IILandroid/content/Intent;)V
    .locals 2
    .param p3    # Landroid/content/Intent;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param

    invoke-super {p0, p1, p2, p3}, Landroidx/fragment/app/Fragment;->onActivityResult(IILandroid/content/Intent;)V

    const/4 p1, -0x1

    if-ne p2, p1, :cond_1

    if-eqz p3, :cond_0

    const-string p1, "pair"

    invoke-virtual {p3, p1}, Landroid/content/Intent;->getSerializableExtra(Ljava/lang/String;)Ljava/io/Serializable;

    move-result-object p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    const-string p2, "null cannot be cast to non-null type kotlin.Pair<kotlin.String, kotlin.Int>"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->X1ii(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Lkotlin/Pair;

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/BaseSportGoalSetFragment;->getNowGoalValue()Lcom/sma/smartv3/view/text/DINCondBold;

    move-result-object p2

    invoke-virtual {p1}, Lkotlin/Pair;->getFirst()Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Ljava/lang/CharSequence;

    invoke-virtual {p2, p3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/BaseSportGoalSetFragment;->getStartExerciseBt()Landroid/widget/Button;

    move-result-object p2

    const/4 p3, 0x1

    invoke-virtual {p2, p3}, Landroid/view/View;->setEnabled(Z)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/BaseSportGoalSetFragment;->getGoals()[I

    move-result-object p2

    invoke-virtual {p1}, Lkotlin/Pair;->getSecond()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    move-result v0

    const/4 v1, 0x0

    aput v0, p2, v1

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/BaseSportGoalSetFragment;->getGoals()[I

    move-result-object p2

    aput v1, p2, p3

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/BaseSportGoalSetFragment;->getGoals()[I

    move-result-object p2

    const/4 p3, 0x2

    aput v1, p2, p3

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string p3, "pair -> "

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    filled-new-array {p1}, [Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lcom/blankj/utilcode/util/LogUtils;->d([Ljava/lang/Object;)V

    :cond_1
    return-void
.end method

.method public setGoalValueItem()V
    .locals 7

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/BaseSportGoalSetFragment;->getDistanceItemData()Ljava/util/HashMap;

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    iget-object v2, p0, Lcom/sma/smartv3/ui/sport/SportGoalDistanceFragment;->userProfile:Lcom/sma/smartv3/model/AppUser;

    invoke-virtual {v2}, Lcom/sma/smartv3/model/AppUser;->getUnit()I

    move-result v2

    invoke-static {v2}, Lcom/android/mltcode/paycertificationapi/cp5;->XX0(I)I

    move-result v2

    invoke-virtual {p0, v2}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object v2

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "3 "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/BaseSportGoalSetFragment;->getDistanceItemData()Ljava/util/HashMap;

    move-result-object v0

    const/4 v1, 0x1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    iget-object v2, p0, Lcom/sma/smartv3/ui/sport/SportGoalDistanceFragment;->userProfile:Lcom/sma/smartv3/model/AppUser;

    invoke-virtual {v2}, Lcom/sma/smartv3/model/AppUser;->getUnit()I

    move-result v2

    invoke-static {v2}, Lcom/android/mltcode/paycertificationapi/cp5;->XX0(I)I

    move-result v2

    invoke-virtual {p0, v2}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object v2

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "5 "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/BaseSportGoalSetFragment;->getDistanceItemData()Ljava/util/HashMap;

    move-result-object v0

    const/4 v1, 0x2

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    iget-object v2, p0, Lcom/sma/smartv3/ui/sport/SportGoalDistanceFragment;->userProfile:Lcom/sma/smartv3/model/AppUser;

    invoke-virtual {v2}, Lcom/sma/smartv3/model/AppUser;->getUnit()I

    move-result v2

    invoke-static {v2}, Lcom/android/mltcode/paycertificationapi/cp5;->XX0(I)I

    move-result v2

    invoke-virtual {p0, v2}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object v2

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "8 "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/BaseSportGoalSetFragment;->getDistanceItemData()Ljava/util/HashMap;

    move-result-object v0

    const/4 v1, 0x3

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    iget-object v2, p0, Lcom/sma/smartv3/ui/sport/SportGoalDistanceFragment;->userProfile:Lcom/sma/smartv3/model/AppUser;

    invoke-virtual {v2}, Lcom/sma/smartv3/model/AppUser;->getUnit()I

    move-result v2

    invoke-static {v2}, Lcom/android/mltcode/paycertificationapi/cp5;->XX0(I)I

    move-result v2

    invoke-virtual {p0, v2}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object v2

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "10 "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/BaseSportGoalSetFragment;->getDistanceItemData()Ljava/util/HashMap;

    move-result-object v0

    const/4 v1, 0x4

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const v2, 0x7f140c9b

    invoke-virtual {p0, v2}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object v2

    const-string v3, "getString(...)"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, v2}, Lcom/sma/smartv3/ui/sport/SportGoalDistanceFragment;->getMarathonTitle(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-direct {p0}, Lcom/sma/smartv3/ui/sport/SportGoalDistanceFragment;->getHalfHorse()Ljava/lang/String;

    move-result-object v4

    iget-object v5, p0, Lcom/sma/smartv3/ui/sport/SportGoalDistanceFragment;->userProfile:Lcom/sma/smartv3/model/AppUser;

    invoke-virtual {v5}, Lcom/sma/smartv3/model/AppUser;->getUnit()I

    move-result v5

    invoke-static {v5}, Lcom/android/mltcode/paycertificationapi/cp5;->XX0(I)I

    move-result v5

    invoke-virtual {p0, v5}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object v5

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v6, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, " "

    invoke-virtual {v6, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-interface {v0, v1, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/BaseSportGoalSetFragment;->getDistanceItemData()Ljava/util/HashMap;

    move-result-object v0

    const/4 v1, 0x5

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const v4, 0x7f141510

    invoke-virtual {p0, v4}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4, v3}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, v4}, Lcom/sma/smartv3/ui/sport/SportGoalDistanceFragment;->getMarathonTitle(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-direct {p0}, Lcom/sma/smartv3/ui/sport/SportGoalDistanceFragment;->getWholeHorse()Ljava/lang/String;

    move-result-object v4

    iget-object v5, p0, Lcom/sma/smartv3/ui/sport/SportGoalDistanceFragment;->userProfile:Lcom/sma/smartv3/model/AppUser;

    invoke-virtual {v5}, Lcom/sma/smartv3/model/AppUser;->getUnit()I

    move-result v5

    invoke-static {v5}, Lcom/android/mltcode/paycertificationapi/cp5;->XX0(I)I

    move-result v5

    invoke-virtual {p0, v5}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object v5

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public setInfo()V
    .locals 2

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/BaseSportGoalSetFragment;->getNowGoalUnit()Lcom/sma/smartv3/view/text/PFMedium;

    move-result-object v0

    iget-object v1, p0, Lcom/sma/smartv3/ui/sport/SportGoalDistanceFragment;->userProfile:Lcom/sma/smartv3/model/AppUser;

    invoke-virtual {v1}, Lcom/sma/smartv3/model/AppUser;->getUnit()I

    move-result v1

    invoke-static {v1}, Lcom/android/mltcode/paycertificationapi/cp5;->XX0(I)I

    move-result v1

    invoke-virtual {p0, v1}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public startExercise()V
    .locals 5

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseFragment;->getMArg1()I

    move-result v0

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/BaseSportGoalSetFragment;->getGoals()[I

    move-result-object v1

    new-instance v2, Landroid/os/Bundle;

    invoke-direct {v2}, Landroid/os/Bundle;-><init>()V

    const-string v3, "mArg0"

    const/4 v4, 0x0

    invoke-virtual {v2, v3, v4}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const-string v3, "mArg1"

    invoke-virtual {v2, v3, v0}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    const-string v0, "mArg2"

    invoke-virtual {v2, v0, v4}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    const-string v0, "mArg3"

    invoke-virtual {v2, v0, v1}, Landroid/os/Bundle;->putSerializable(Ljava/lang/String;Ljava/io/Serializable;)V

    new-instance v0, Landroid/content/Intent;

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getActivity()Landroidx/fragment/app/FragmentActivity;

    move-result-object v1

    const-class v3, Lcom/sma/smartv3/ui/sport/SportOnGoingGpsActivity;

    invoke-direct {v0, v1, v3}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    invoke-virtual {v0, v2}, Landroid/content/Intent;->putExtras(Landroid/os/Bundle;)Landroid/content/Intent;

    invoke-virtual {p0, v0}, Landroidx/fragment/app/Fragment;->startActivity(Landroid/content/Intent;)V

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getActivity()Landroidx/fragment/app/FragmentActivity;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/app/Activity;->finish()V

    :cond_0
    return-void
.end method

.method public toCustomerGoal()V
    .locals 3

    new-instance v0, Landroid/content/Intent;

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getActivity()Landroidx/fragment/app/FragmentActivity;

    move-result-object v1

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    const-class v2, Lcom/sma/smartv3/ui/sport/CustomSportDistanceGoalActivity;

    invoke-direct {v0, v1, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    const/16 v1, 0x7b

    invoke-virtual {p0, v0, v1}, Landroidx/fragment/app/Fragment;->startActivityForResult(Landroid/content/Intent;I)V

    return-void
.end method

.method public final transformHalfWhole(F)Ljava/lang/String;
    .locals 3
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/SportGoalDistanceFragment;->userProfile:Lcom/sma/smartv3/model/AppUser;

    invoke-virtual {v0}, Lcom/sma/smartv3/model/AppUser;->getUnit()I

    move-result v0

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-ne v0, v1, :cond_0

    invoke-static {p1}, Lcom/android/mltcode/paycertificationapi/l76;->XO0O10(F)F

    move-result p1

    invoke-static {p1, v2}, Lcom/android/mltcode/paycertificationapi/cp5;->XIi00iiXO(FZ)Ljava/lang/String;

    move-result-object p1

    return-object p1

    :cond_0
    invoke-static {p1, v2}, Lcom/android/mltcode/paycertificationapi/cp5;->XIi00iiXO(FZ)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public updateGoalValue(I)V
    .locals 9

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/BaseSportGoalSetFragment;->getNowGoalValue()Lcom/sma/smartv3/view/text/DINCondBold;

    move-result-object v0

    const/4 v1, 0x5

    const/4 v2, 0x4

    const/4 v3, 0x3

    const/4 v4, 0x2

    const/4 v5, 0x1

    if-eqz p1, :cond_5

    if-eq p1, v5, :cond_4

    if-eq p1, v4, :cond_3

    if-eq p1, v3, :cond_2

    if-eq p1, v2, :cond_1

    if-eq p1, v1, :cond_0

    const-string v6, "0.0"

    goto :goto_0

    :cond_0
    invoke-direct {p0}, Lcom/sma/smartv3/ui/sport/SportGoalDistanceFragment;->getWholeHorse()Ljava/lang/String;

    move-result-object v6

    goto :goto_0

    :cond_1
    invoke-direct {p0}, Lcom/sma/smartv3/ui/sport/SportGoalDistanceFragment;->getHalfHorse()Ljava/lang/String;

    move-result-object v6

    goto :goto_0

    :cond_2
    const-string v6, "10.0"

    goto :goto_0

    :cond_3
    const-string v6, "8.0"

    goto :goto_0

    :cond_4
    const-string v6, "5.0"

    goto :goto_0

    :cond_5
    const-string v6, "3.0"

    :goto_0
    invoke-virtual {v0, v6}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/BaseSportGoalSetFragment;->getStartExerciseBt()Landroid/widget/Button;

    move-result-object v0

    const/4 v6, 0x0

    if-eqz p1, :cond_6

    if-eq p1, v5, :cond_6

    if-eq p1, v4, :cond_6

    if-eq p1, v3, :cond_6

    if-eq p1, v2, :cond_6

    if-eq p1, v1, :cond_6

    move v7, v6

    goto :goto_1

    :cond_6
    move v7, v5

    :goto_1
    invoke-virtual {v0, v7}, Landroid/view/View;->setEnabled(Z)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/BaseSportGoalSetFragment;->getGoals()[I

    move-result-object v0

    sget-object v7, Lcom/sma/smartv3/ui/sport/XO0O10;->OXO1:Lcom/sma/smartv3/ui/sport/XO0O10;

    invoke-virtual {v7}, Lcom/sma/smartv3/ui/sport/XO0O10;->iX()I

    move-result v8

    if-eqz p1, :cond_c

    if-eq p1, v5, :cond_b

    if-eq p1, v4, :cond_a

    if-eq p1, v3, :cond_9

    if-eq p1, v2, :cond_8

    if-eq p1, v1, :cond_7

    move p1, v6

    goto :goto_2

    :cond_7
    invoke-direct {p0}, Lcom/sma/smartv3/ui/sport/SportGoalDistanceFragment;->getWholeGoals()I

    move-result p1

    goto :goto_2

    :cond_8
    invoke-direct {p0}, Lcom/sma/smartv3/ui/sport/SportGoalDistanceFragment;->getHalfGoals()I

    move-result p1

    goto :goto_2

    :cond_9
    const/16 p1, 0x2710

    goto :goto_2

    :cond_a
    const/16 p1, 0x1f40

    goto :goto_2

    :cond_b
    const/16 p1, 0x1388

    goto :goto_2

    :cond_c
    const/16 p1, 0xbb8

    :goto_2
    aput p1, v0, v8

    iget-object p1, p0, Lcom/sma/smartv3/ui/sport/SportGoalDistanceFragment;->userProfile:Lcom/sma/smartv3/model/AppUser;

    invoke-virtual {p1}, Lcom/sma/smartv3/model/AppUser;->getUnit()I

    move-result p1

    if-ne p1, v5, :cond_d

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/BaseSportGoalSetFragment;->getGoals()[I

    move-result-object p1

    invoke-virtual {v7}, Lcom/sma/smartv3/ui/sport/XO0O10;->iX()I

    move-result v0

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/BaseSportGoalSetFragment;->getGoals()[I

    move-result-object v1

    invoke-virtual {v7}, Lcom/sma/smartv3/ui/sport/XO0O10;->iX()I

    move-result v2

    aget v1, v1, v2

    int-to-float v1, v1

    invoke-static {v1}, Lcom/android/mltcode/paycertificationapi/l76;->IiI10X(F)F

    move-result v1

    float-to-int v1, v1

    aput v1, p1, v0

    :cond_d
    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/BaseSportGoalSetFragment;->getGoals()[I

    move-result-object p1

    invoke-virtual {v7}, Lcom/sma/smartv3/ui/sport/XO0O10;->IXXOO()I

    move-result v0

    aput v6, p1, v0

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/BaseSportGoalSetFragment;->getGoals()[I

    move-result-object p1

    invoke-virtual {v7}, Lcom/sma/smartv3/ui/sport/XO0O10;->i010I()I

    move-result v0

    aput v6, p1, v0

    return-void
.end method
