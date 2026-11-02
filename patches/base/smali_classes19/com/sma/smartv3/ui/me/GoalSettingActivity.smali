.class public final Lcom/sma/smartv3/ui/me/GoalSettingActivity;
.super Lcom/bestmafen/androidbase/base/BaseActivity;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nGoalSettingActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GoalSettingActivity.kt\ncom/sma/smartv3/ui/me/GoalSettingActivity\n+ 2 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n*L\n1#1,111:1\n19#2:112\n15#2:113\n*S KotlinDebug\n*F\n+ 1 GoalSettingActivity.kt\ncom/sma/smartv3/ui/me/GoalSettingActivity\n*L\n35#1:112\n35#1:113\n*E\n"
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nGoalSettingActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GoalSettingActivity.kt\ncom/sma/smartv3/ui/me/GoalSettingActivity\n+ 2 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n*L\n1#1,111:1\n19#2:112\n15#2:113\n*S KotlinDebug\n*F\n+ 1 GoalSettingActivity.kt\ncom/sma/smartv3/ui/me/GoalSettingActivity\n*L\n35#1:112\n35#1:113\n*E\n"
    }
.end annotation


# instance fields
.field private final approximatelyEqualTo$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final btGoalDone$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final caloriesGoal$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private caloriesGoalValue:I

.field private final distanceGoal$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private distanceGoalValue:I

.field private final distanceUnit$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private mAppUser:Lcom/sma/smartv3/model/AppUser;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private stepGoalValue:I

.field private final wv$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 32

    move-object/from16 v0, p0

    invoke-direct {v0}, Lcom/bestmafen/androidbase/base/BaseActivity;-><init>()V

    new-instance v1, Lcom/android/mltcode/paycertificationapi/iO1iOOX1;

    invoke-direct {v1, v0}, Lcom/android/mltcode/paycertificationapi/iO1iOOX1;-><init>(Lcom/sma/smartv3/ui/me/GoalSettingActivity;)V

    invoke-static {v1}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v1

    iput-object v1, v0, Lcom/sma/smartv3/ui/me/GoalSettingActivity;->wv$delegate:Lkotlin/Lazy;

    new-instance v1, Lcom/android/mltcode/paycertificationapi/I1OiIOI1X;

    invoke-direct {v1, v0}, Lcom/android/mltcode/paycertificationapi/I1OiIOI1X;-><init>(Lcom/sma/smartv3/ui/me/GoalSettingActivity;)V

    invoke-static {v1}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v1

    iput-object v1, v0, Lcom/sma/smartv3/ui/me/GoalSettingActivity;->distanceGoal$delegate:Lkotlin/Lazy;

    new-instance v1, Lcom/android/mltcode/paycertificationapi/i0IiXi;

    invoke-direct {v1, v0}, Lcom/android/mltcode/paycertificationapi/i0IiXi;-><init>(Lcom/sma/smartv3/ui/me/GoalSettingActivity;)V

    invoke-static {v1}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v1

    iput-object v1, v0, Lcom/sma/smartv3/ui/me/GoalSettingActivity;->caloriesGoal$delegate:Lkotlin/Lazy;

    new-instance v1, Lcom/android/mltcode/paycertificationapi/Xi11Xi;

    invoke-direct {v1, v0}, Lcom/android/mltcode/paycertificationapi/Xi11Xi;-><init>(Lcom/sma/smartv3/ui/me/GoalSettingActivity;)V

    invoke-static {v1}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v1

    iput-object v1, v0, Lcom/sma/smartv3/ui/me/GoalSettingActivity;->distanceUnit$delegate:Lkotlin/Lazy;

    new-instance v1, Lcom/android/mltcode/paycertificationapi/OXXXIi10X;

    invoke-direct {v1, v0}, Lcom/android/mltcode/paycertificationapi/OXXXIi10X;-><init>(Lcom/sma/smartv3/ui/me/GoalSettingActivity;)V

    invoke-static {v1}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v1

    iput-object v1, v0, Lcom/sma/smartv3/ui/me/GoalSettingActivity;->btGoalDone$delegate:Lkotlin/Lazy;

    new-instance v1, Lcom/android/mltcode/paycertificationapi/O10IO0i;

    invoke-direct {v1, v0}, Lcom/android/mltcode/paycertificationapi/O10IO0i;-><init>(Lcom/sma/smartv3/ui/me/GoalSettingActivity;)V

    invoke-static {v1}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v1

    iput-object v1, v0, Lcom/sma/smartv3/ui/me/GoalSettingActivity;->approximatelyEqualTo$delegate:Lkotlin/Lazy;

    sget-object v1, Lcom/android/mltcode/paycertificationapi/a01;->OXO1:Lcom/android/mltcode/paycertificationapi/a01;

    invoke-virtual {v1}, Lcom/android/mltcode/paycertificationapi/a01;->IiI10X()Lcom/blankj/utilcode/util/SPUtils;

    move-result-object v1

    new-instance v2, Lcom/sma/smartv3/model/AppUser;

    const v30, 0x7ffffff

    const/16 v31, 0x0

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

    const/16 v29, 0x0

    invoke-direct/range {v2 .. v31}, Lcom/sma/smartv3/model/AppUser;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IIFFLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;FFIILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/sma/smartv3/model/ThirdPlatform;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v3, Lcom/google/gson/Gson;

    invoke-direct {v3}, Lcom/google/gson/Gson;-><init>()V

    const-class v4, Lcom/sma/smartv3/model/AppUser;

    invoke-virtual {v4}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v1, v5}, Lcom/blankj/utilcode/util/SPUtils;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3, v1, v4}, Lcom/google/gson/Gson;->fromJson(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    if-nez v1, :cond_0

    goto :goto_0

    :cond_0
    move-object v2, v1

    :goto_0
    check-cast v2, Lcom/sma/smartv3/model/AppUser;

    iput-object v2, v0, Lcom/sma/smartv3/ui/me/GoalSettingActivity;->mAppUser:Lcom/sma/smartv3/model/AppUser;

    return-void
.end method

.method public static synthetic I0iXXO(Lcom/sma/smartv3/ui/me/GoalSettingActivity;Lcom/szabh/smable3/component/BleConnector;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Lcom/sma/smartv3/ui/me/GoalSettingActivity;->doneClick$lambda$0(Lcom/sma/smartv3/ui/me/GoalSettingActivity;Lcom/szabh/smable3/component/BleConnector;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic I1XOi1(Lcom/sma/smartv3/ui/me/GoalSettingActivity;)Lcom/sma/smartv3/view/text/PFMedium;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/me/GoalSettingActivity;->approximatelyEqualTo_delegate$lambda$0(Lcom/sma/smartv3/ui/me/GoalSettingActivity;)Lcom/sma/smartv3/view/text/PFMedium;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic IIX1OXO(Lcom/sma/smartv3/ui/me/GoalSettingActivity;)Lcom/sma/smartv3/view/text/DINCondBold;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/me/GoalSettingActivity;->caloriesGoal_delegate$lambda$0(Lcom/sma/smartv3/ui/me/GoalSettingActivity;)Lcom/sma/smartv3/view/text/DINCondBold;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic O10IXXX0X(Lcom/sma/smartv3/ui/me/GoalSettingActivity;)Lcom/sma/smartv3/view/WheelView/WheelView;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/me/GoalSettingActivity;->wv_delegate$lambda$0(Lcom/sma/smartv3/ui/me/GoalSettingActivity;)Lcom/sma/smartv3/view/WheelView/WheelView;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic OIX0iXi(Lcom/sma/smartv3/ui/me/GoalSettingActivity;)Landroid/widget/Button;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/me/GoalSettingActivity;->btGoalDone_delegate$lambda$0(Lcom/sma/smartv3/ui/me/GoalSettingActivity;)Landroid/widget/Button;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic X0O(Lcom/sma/smartv3/ui/me/GoalSettingActivity;)Lcom/sma/smartv3/view/text/DINCondBold;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/me/GoalSettingActivity;->distanceGoal_delegate$lambda$0(Lcom/sma/smartv3/ui/me/GoalSettingActivity;)Lcom/sma/smartv3/view/text/DINCondBold;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic X1ii(Lcom/sma/smartv3/ui/me/GoalSettingActivity;)Lcom/sma/smartv3/view/text/PFMedium;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/me/GoalSettingActivity;->distanceUnit_delegate$lambda$0(Lcom/sma/smartv3/ui/me/GoalSettingActivity;)Lcom/sma/smartv3/view/text/PFMedium;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic XXI(Lcom/sma/smartv3/ui/me/GoalSettingActivity;I)V
    .locals 0

    invoke-static {p0, p1}, Lcom/sma/smartv3/ui/me/GoalSettingActivity;->initView$lambda$0$0(Lcom/sma/smartv3/ui/me/GoalSettingActivity;I)V

    return-void
.end method

.method private static final approximatelyEqualTo_delegate$lambda$0(Lcom/sma/smartv3/ui/me/GoalSettingActivity;)Lcom/sma/smartv3/view/text/PFMedium;
    .locals 1

    const v0, 0x7f0a00de

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Lcom/sma/smartv3/view/text/PFMedium;

    return-object p0
.end method

.method private static final btGoalDone_delegate$lambda$0(Lcom/sma/smartv3/ui/me/GoalSettingActivity;)Landroid/widget/Button;
    .locals 1

    const v0, 0x7f0a0181

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/Button;

    return-object p0
.end method

.method private static final caloriesGoal_delegate$lambda$0(Lcom/sma/smartv3/ui/me/GoalSettingActivity;)Lcom/sma/smartv3/view/text/DINCondBold;
    .locals 1

    const v0, 0x7f0a0200

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Lcom/sma/smartv3/view/text/DINCondBold;

    return-object p0
.end method

.method private final countGoal(Ljava/lang/String;)V
    .locals 3

    :try_start_0
    invoke-static {p1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result p1

    iput p1, p0, Lcom/sma/smartv3/ui/me/GoalSettingActivity;->stepGoalValue:I

    iget-object p1, p0, Lcom/sma/smartv3/ui/me/GoalSettingActivity;->mAppUser:Lcom/sma/smartv3/model/AppUser;

    invoke-virtual {p1}, Lcom/sma/smartv3/model/AppUser;->getHeight()F

    move-result p1

    iget v0, p0, Lcom/sma/smartv3/ui/me/GoalSettingActivity;->stepGoalValue:I

    iget-object v1, p0, Lcom/sma/smartv3/ui/me/GoalSettingActivity;->mAppUser:Lcom/sma/smartv3/model/AppUser;

    invoke-virtual {v1}, Lcom/sma/smartv3/model/AppUser;->getUnit()I

    move-result v1

    invoke-static {p1, v0, v1}, Lcom/android/mltcode/paycertificationapi/cp5;->IO0II0i(FII)Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0}, Lcom/sma/smartv3/ui/me/GoalSettingActivity;->getDistanceGoal()Lcom/sma/smartv3/view/text/DINCondBold;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object p1, p0, Lcom/sma/smartv3/ui/me/GoalSettingActivity;->mAppUser:Lcom/sma/smartv3/model/AppUser;

    invoke-virtual {p1}, Lcom/sma/smartv3/model/AppUser;->getHeight()F

    move-result p1

    iget v0, p0, Lcom/sma/smartv3/ui/me/GoalSettingActivity;->stepGoalValue:I

    const/4 v1, 0x0

    invoke-static {p1, v0, v1}, Lcom/android/mltcode/paycertificationapi/cp5;->IO0II0i(FII)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    move-result p1

    const/16 v0, 0x3e8

    int-to-float v0, v0

    mul-float/2addr p1, v0

    float-to-int p1, p1

    iput p1, p0, Lcom/sma/smartv3/ui/me/GoalSettingActivity;->distanceGoalValue:I

    iget-object p1, p0, Lcom/sma/smartv3/ui/me/GoalSettingActivity;->mAppUser:Lcom/sma/smartv3/model/AppUser;

    invoke-virtual {p1}, Lcom/sma/smartv3/model/AppUser;->getGender()I

    move-result p1

    iget-object v1, p0, Lcom/sma/smartv3/ui/me/GoalSettingActivity;->mAppUser:Lcom/sma/smartv3/model/AppUser;

    invoke-virtual {v1}, Lcom/sma/smartv3/model/AppUser;->getWeight()F

    move-result v1

    iget v2, p0, Lcom/sma/smartv3/ui/me/GoalSettingActivity;->stepGoalValue:I

    invoke-static {p1, v1, v2}, Lcom/android/mltcode/paycertificationapi/cp5;->IXOIIIO(IFI)Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0}, Lcom/sma/smartv3/ui/me/GoalSettingActivity;->getCaloriesGoal()Lcom/sma/smartv3/view/text/DINCondBold;

    move-result-object v1

    invoke-virtual {v1, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    invoke-static {p1}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    move-result p1

    mul-float/2addr p1, v0

    float-to-int p1, p1

    iput p1, p0, Lcom/sma/smartv3/ui/me/GoalSettingActivity;->caloriesGoalValue:I
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    return-void
.end method

.method private static final distanceGoal_delegate$lambda$0(Lcom/sma/smartv3/ui/me/GoalSettingActivity;)Lcom/sma/smartv3/view/text/DINCondBold;
    .locals 1

    const v0, 0x7f0a031c

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Lcom/sma/smartv3/view/text/DINCondBold;

    return-object p0
.end method

.method private static final distanceUnit_delegate$lambda$0(Lcom/sma/smartv3/ui/me/GoalSettingActivity;)Lcom/sma/smartv3/view/text/PFMedium;
    .locals 1

    const v0, 0x7f0a08a2

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Lcom/sma/smartv3/view/text/PFMedium;

    return-object p0
.end method

.method private static final doneClick$lambda$0(Lcom/sma/smartv3/ui/me/GoalSettingActivity;Lcom/szabh/smable3/component/BleConnector;)Lkotlin/Unit;
    .locals 10

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v1, Lcom/szabh/smable3/component/BleConnector;->INSTANCE:Lcom/szabh/smable3/component/BleConnector;

    sget-object v2, Lcom/szabh/smable3/BleKey;->STEP_GOAL:Lcom/szabh/smable3/BleKey;

    sget-object v3, Lcom/szabh/smable3/BleKeyFlag;->UPDATE:Lcom/szabh/smable3/BleKeyFlag;

    iget v4, p0, Lcom/sma/smartv3/ui/me/GoalSettingActivity;->stepGoalValue:I

    const/16 v8, 0x38

    const/4 v9, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-static/range {v1 .. v9}, Lcom/szabh/smable3/component/BaseBleConnector;->sendInt32$default(Lcom/szabh/smable3/component/BaseBleConnector;Lcom/szabh/smable3/BleKey;Lcom/szabh/smable3/BleKeyFlag;ILjava/nio/ByteOrder;ZZILjava/lang/Object;)Z

    sget-object p1, Lcom/android/mltcode/paycertificationapi/q62;->OXO1:Lcom/android/mltcode/paycertificationapi/q62;

    invoke-virtual {p1}, Lcom/android/mltcode/paycertificationapi/q62;->i0XI0()Z

    move-result p1

    if-eqz p1, :cond_0

    sget-object v2, Lcom/szabh/smable3/BleKey;->CALORIES_GOAL:Lcom/szabh/smable3/BleKey;

    iget v4, p0, Lcom/sma/smartv3/ui/me/GoalSettingActivity;->caloriesGoalValue:I

    const/16 v8, 0x38

    const/4 v9, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-static/range {v1 .. v9}, Lcom/szabh/smable3/component/BaseBleConnector;->sendInt32$default(Lcom/szabh/smable3/component/BaseBleConnector;Lcom/szabh/smable3/BleKey;Lcom/szabh/smable3/BleKeyFlag;ILjava/nio/ByteOrder;ZZILjava/lang/Object;)Z

    sget-object v2, Lcom/szabh/smable3/BleKey;->DISTANCE_GOAL:Lcom/szabh/smable3/BleKey;

    iget v4, p0, Lcom/sma/smartv3/ui/me/GoalSettingActivity;->distanceGoalValue:I

    invoke-static/range {v1 .. v9}, Lcom/szabh/smable3/component/BaseBleConnector;->sendInt32$default(Lcom/szabh/smable3/component/BaseBleConnector;Lcom/szabh/smable3/BleKey;Lcom/szabh/smable3/BleKeyFlag;ILjava/nio/ByteOrder;ZZILjava/lang/Object;)Z

    :cond_0
    const-string p0, "goal_change"

    const/4 p1, 0x2

    const/4 v0, 0x0

    invoke-static {p0, v0, p1, v0}, Lcom/android/mltcode/paycertificationapi/I01XX0;->XIi00iiXO(Ljava/lang/String;Ljava/lang/Object;ILjava/lang/Object;)V

    sget-object p0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p0
.end method

.method private final getApproximatelyEqualTo()Lcom/sma/smartv3/view/text/PFMedium;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/me/GoalSettingActivity;->approximatelyEqualTo$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/sma/smartv3/view/text/PFMedium;

    return-object v0
.end method

.method private final getBtGoalDone()Landroid/widget/Button;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/me/GoalSettingActivity;->btGoalDone$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/Button;

    return-object v0
.end method

.method private final getCaloriesGoal()Lcom/sma/smartv3/view/text/DINCondBold;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/me/GoalSettingActivity;->caloriesGoal$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/sma/smartv3/view/text/DINCondBold;

    return-object v0
.end method

.method private final getDistanceGoal()Lcom/sma/smartv3/view/text/DINCondBold;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/me/GoalSettingActivity;->distanceGoal$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/sma/smartv3/view/text/DINCondBold;

    return-object v0
.end method

.method private final getDistanceUnit()Lcom/sma/smartv3/view/text/PFMedium;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/me/GoalSettingActivity;->distanceUnit$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/sma/smartv3/view/text/PFMedium;

    return-object v0
.end method

.method private final getWv()Lcom/sma/smartv3/view/WheelView/WheelView;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/me/GoalSettingActivity;->wv$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/sma/smartv3/view/WheelView/WheelView;

    return-object v0
.end method

.method private static final initView$lambda$0$0(Lcom/sma/smartv3/ui/me/GoalSettingActivity;I)V
    .locals 1

    invoke-static {}, Lcom/android/mltcode/paycertificationapi/XO1I00i;->OXO1()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    invoke-direct {p0, p1}, Lcom/sma/smartv3/ui/me/GoalSettingActivity;->countGoal(Ljava/lang/String;)V

    return-void
.end method

.method private static final wv_delegate$lambda$0(Lcom/sma/smartv3/ui/me/GoalSettingActivity;)Lcom/sma/smartv3/view/WheelView/WheelView;
    .locals 1

    const v0, 0x7f0a1951

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Lcom/sma/smartv3/view/WheelView/WheelView;

    return-object p0
.end method


# virtual methods
.method public final doneClick(Landroid/view/View;)V
    .locals 3
    .param p1    # Landroid/view/View;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "view"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p1, Lcom/android/mltcode/paycertificationapi/OI0iOXO;

    invoke-direct {p1, p0}, Lcom/android/mltcode/paycertificationapi/OI0iOXO;-><init>(Lcom/sma/smartv3/ui/me/GoalSettingActivity;)V

    const/4 v0, 0x1

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-static {v2, p1, v0, v1}, Lcom/android/mltcode/paycertificationapi/X0IOiX1O;->XIi00iiXO(ZLkotlin/jvm/functions/Function1;ILjava/lang/Object;)Z

    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    return-void
.end method

.method public init(Landroid/os/Bundle;)V
    .locals 0
    .param p1    # Landroid/os/Bundle;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param

    return-void
.end method

.method public initView()V
    .locals 8

    const v0, 0x7f0a0023

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    const v1, 0x7f140c60

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/me/GoalSettingActivity;->getApproximatelyEqualTo()Lcom/sma/smartv3/view/text/PFMedium;

    move-result-object v0

    sget-object v1, Lcom/android/mltcode/paycertificationapi/i72;->OXO1:Lcom/android/mltcode/paycertificationapi/i72;

    invoke-virtual {v1}, Lcom/android/mltcode/paycertificationapi/i72;->XOIX()Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, 0x0

    goto :goto_0

    :cond_0
    const/4 v1, 0x4

    :goto_0
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    sget-object v2, Lcom/szabh/smable3/component/BleCache;->INSTANCE:Lcom/szabh/smable3/component/BleCache;

    sget-object v3, Lcom/szabh/smable3/BleKey;->STEP_GOAL:Lcom/szabh/smable3/BleKey;

    const/4 v6, 0x4

    const/4 v7, 0x0

    const/16 v4, 0x1770

    const/4 v5, 0x0

    invoke-static/range {v2 .. v7}, Lcom/szabh/smable3/component/BaseBleCache;->getInt$default(Lcom/szabh/smable3/component/BaseBleCache;Lcom/szabh/smable3/BleKey;ILcom/szabh/smable3/BleKeyFlag;ILjava/lang/Object;)I

    move-result v0

    div-int/lit16 v0, v0, 0x3e8

    add-int/lit8 v0, v0, -0x1

    if-gez v0, :cond_1

    const/16 v0, 0x9

    :cond_1
    invoke-direct {p0}, Lcom/sma/smartv3/ui/me/GoalSettingActivity;->getWv()Lcom/sma/smartv3/view/WheelView/WheelView;

    move-result-object v1

    const-string v2, "<get-wv>(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v1, v0}, Lcom/android/mltcode/paycertificationapi/XO1I00i;->XIi00iiXO(Lcom/sma/smartv3/view/WheelView/WheelView;I)V

    invoke-static {}, Lcom/android/mltcode/paycertificationapi/XO1I00i;->OXO1()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-direct {p0, v0}, Lcom/sma/smartv3/ui/me/GoalSettingActivity;->countGoal(Ljava/lang/String;)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/me/GoalSettingActivity;->getBtGoalDone()Landroid/widget/Button;

    move-result-object v0

    const v1, 0x7f14034b

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/me/GoalSettingActivity;->getWv()Lcom/sma/smartv3/view/WheelView/WheelView;

    move-result-object v0

    invoke-virtual {v0}, Lcom/sma/smartv3/view/WheelView/WheelView;->OIi0()V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/me/GoalSettingActivity;->getWv()Lcom/sma/smartv3/view/WheelView/WheelView;

    move-result-object v0

    new-instance v1, Lcom/android/mltcode/paycertificationapi/OIO0X1iXI;

    invoke-direct {v1, p0}, Lcom/android/mltcode/paycertificationapi/OIO0X1iXI;-><init>(Lcom/sma/smartv3/ui/me/GoalSettingActivity;)V

    invoke-virtual {v0, v1}, Lcom/sma/smartv3/view/WheelView/WheelView;->setListener(Lcom/android/mltcode/paycertificationapi/dg1;)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/me/GoalSettingActivity;->getDistanceUnit()Lcom/sma/smartv3/view/text/PFMedium;

    move-result-object v0

    iget-object v1, p0, Lcom/sma/smartv3/ui/me/GoalSettingActivity;->mAppUser:Lcom/sma/smartv3/model/AppUser;

    invoke-virtual {v1}, Lcom/sma/smartv3/model/AppUser;->getUnit()I

    move-result v1

    invoke-static {v1}, Lcom/android/mltcode/paycertificationapi/cp5;->XX0(I)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    return-void
.end method

.method public layoutId()I
    .locals 1

    const v0, 0x7f0d00ab

    return v0
.end method

.method public final onTitleLeftClick(Landroid/view/View;)V
    .locals 1
    .param p1    # Landroid/view/View;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "view"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    return-void
.end method
