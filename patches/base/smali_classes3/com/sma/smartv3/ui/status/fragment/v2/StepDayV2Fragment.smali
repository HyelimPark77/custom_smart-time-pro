.class public final Lcom/sma/smartv3/ui/status/fragment/v2/StepDayV2Fragment;
.super Lcom/sma/smartv3/ui/status/base/ActivityBaseDayFragment;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nStepDayV2Fragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StepDayV2Fragment.kt\ncom/sma/smartv3/ui/status/fragment/v2/StepDayV2Fragment\n+ 2 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n*L\n1#1,203:1\n19#2:204\n15#2:205\n*S KotlinDebug\n*F\n+ 1 StepDayV2Fragment.kt\ncom/sma/smartv3/ui/status/fragment/v2/StepDayV2Fragment\n*L\n49#1:204\n49#1:205\n*E\n"
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nStepDayV2Fragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StepDayV2Fragment.kt\ncom/sma/smartv3/ui/status/fragment/v2/StepDayV2Fragment\n+ 2 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n*L\n1#1,203:1\n19#2:204\n15#2:205\n*S KotlinDebug\n*F\n+ 1 StepDayV2Fragment.kt\ncom/sma/smartv3/ui/status/fragment/v2/StepDayV2Fragment\n*L\n49#1:204\n49#1:205\n*E\n"
    }
.end annotation


# instance fields
.field private final caloriesDeviceValue$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final caloriesValue$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private countCR_Step:I

.field private final distanceDeviceValue$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final distanceValue$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final formatDecimal:Ljava/lang/String;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final goalTip$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final goalValue$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final progressBar$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final userProfile:Lcom/sma/smartv3/model/AppUser;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 32

    move-object/from16 v0, p0

    invoke-direct {v0}, Lcom/sma/smartv3/ui/status/base/ActivityBaseDayFragment;-><init>()V

    new-instance v1, Lcom/android/mltcode/paycertificationapi/aa5;

    invoke-direct {v1, v0}, Lcom/android/mltcode/paycertificationapi/aa5;-><init>(Lcom/sma/smartv3/ui/status/fragment/v2/StepDayV2Fragment;)V

    invoke-static {v1}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v1

    iput-object v1, v0, Lcom/sma/smartv3/ui/status/fragment/v2/StepDayV2Fragment;->goalValue$delegate:Lkotlin/Lazy;

    new-instance v1, Lcom/android/mltcode/paycertificationapi/ba5;

    invoke-direct {v1, v0}, Lcom/android/mltcode/paycertificationapi/ba5;-><init>(Lcom/sma/smartv3/ui/status/fragment/v2/StepDayV2Fragment;)V

    invoke-static {v1}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v1

    iput-object v1, v0, Lcom/sma/smartv3/ui/status/fragment/v2/StepDayV2Fragment;->progressBar$delegate:Lkotlin/Lazy;

    new-instance v1, Lcom/android/mltcode/paycertificationapi/ca5;

    invoke-direct {v1, v0}, Lcom/android/mltcode/paycertificationapi/ca5;-><init>(Lcom/sma/smartv3/ui/status/fragment/v2/StepDayV2Fragment;)V

    invoke-static {v1}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v1

    iput-object v1, v0, Lcom/sma/smartv3/ui/status/fragment/v2/StepDayV2Fragment;->goalTip$delegate:Lkotlin/Lazy;

    new-instance v1, Lcom/android/mltcode/paycertificationapi/da5;

    invoke-direct {v1, v0}, Lcom/android/mltcode/paycertificationapi/da5;-><init>(Lcom/sma/smartv3/ui/status/fragment/v2/StepDayV2Fragment;)V

    invoke-static {v1}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v1

    iput-object v1, v0, Lcom/sma/smartv3/ui/status/fragment/v2/StepDayV2Fragment;->caloriesValue$delegate:Lkotlin/Lazy;

    new-instance v1, Lcom/android/mltcode/paycertificationapi/ea5;

    invoke-direct {v1, v0}, Lcom/android/mltcode/paycertificationapi/ea5;-><init>(Lcom/sma/smartv3/ui/status/fragment/v2/StepDayV2Fragment;)V

    invoke-static {v1}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v1

    iput-object v1, v0, Lcom/sma/smartv3/ui/status/fragment/v2/StepDayV2Fragment;->distanceValue$delegate:Lkotlin/Lazy;

    new-instance v1, Lcom/android/mltcode/paycertificationapi/fa5;

    invoke-direct {v1, v0}, Lcom/android/mltcode/paycertificationapi/fa5;-><init>(Lcom/sma/smartv3/ui/status/fragment/v2/StepDayV2Fragment;)V

    invoke-static {v1}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v1

    iput-object v1, v0, Lcom/sma/smartv3/ui/status/fragment/v2/StepDayV2Fragment;->caloriesDeviceValue$delegate:Lkotlin/Lazy;

    new-instance v1, Lcom/android/mltcode/paycertificationapi/ga5;

    invoke-direct {v1, v0}, Lcom/android/mltcode/paycertificationapi/ga5;-><init>(Lcom/sma/smartv3/ui/status/fragment/v2/StepDayV2Fragment;)V

    invoke-static {v1}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v1

    iput-object v1, v0, Lcom/sma/smartv3/ui/status/fragment/v2/StepDayV2Fragment;->distanceDeviceValue$delegate:Lkotlin/Lazy;

    sget-object v1, Lcom/android/mltcode/paycertificationapi/q62;->OXO1:Lcom/android/mltcode/paycertificationapi/q62;

    invoke-virtual {v1}, Lcom/android/mltcode/paycertificationapi/q62;->iIX0i()Z

    move-result v1

    if-eqz v1, :cond_0

    const-string v1, "%.2f"

    goto :goto_0

    :cond_0
    const-string v1, "%.1f"

    :goto_0
    iput-object v1, v0, Lcom/sma/smartv3/ui/status/fragment/v2/StepDayV2Fragment;->formatDecimal:Ljava/lang/String;

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

    if-nez v1, :cond_1

    goto :goto_1

    :cond_1
    move-object v2, v1

    :goto_1
    check-cast v2, Lcom/sma/smartv3/model/AppUser;

    iput-object v2, v0, Lcom/sma/smartv3/ui/status/fragment/v2/StepDayV2Fragment;->userProfile:Lcom/sma/smartv3/model/AppUser;

    return-void
.end method

.method public static synthetic I1(Lcom/sma/smartv3/ui/status/fragment/v2/StepDayV2Fragment;)Lcom/sma/smartv3/view/text/DINCondBold;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/status/fragment/v2/StepDayV2Fragment;->caloriesDeviceValue_delegate$lambda$0(Lcom/sma/smartv3/ui/status/fragment/v2/StepDayV2Fragment;)Lcom/sma/smartv3/view/text/DINCondBold;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic OII(Lcom/sma/smartv3/ui/status/fragment/v2/StepDayV2Fragment;)Lcom/sma/smartv3/view/text/PFMedium;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/status/fragment/v2/StepDayV2Fragment;->goalTip_delegate$lambda$0(Lcom/sma/smartv3/ui/status/fragment/v2/StepDayV2Fragment;)Lcom/sma/smartv3/view/text/PFMedium;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic OX(Lcom/sma/smartv3/ui/status/fragment/v2/StepDayV2Fragment;Landroid/view/View;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/sma/smartv3/ui/status/fragment/v2/StepDayV2Fragment;->initView$lambda$0(Lcom/sma/smartv3/ui/status/fragment/v2/StepDayV2Fragment;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic OiIIX101O(Lcom/sma/smartv3/ui/status/fragment/v2/StepDayV2Fragment;)Lcom/sma/smartv3/view/text/DINCondBold;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/status/fragment/v2/StepDayV2Fragment;->caloriesValue_delegate$lambda$0(Lcom/sma/smartv3/ui/status/fragment/v2/StepDayV2Fragment;)Lcom/sma/smartv3/view/text/DINCondBold;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic XX0(Lcom/sma/smartv3/ui/status/fragment/v2/StepDayV2Fragment;)Lcom/sma/smartv3/view/text/PFMedium;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/status/fragment/v2/StepDayV2Fragment;->goalValue_delegate$lambda$0(Lcom/sma/smartv3/ui/status/fragment/v2/StepDayV2Fragment;)Lcom/sma/smartv3/view/text/PFMedium;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic XiOIii1(Lcom/sma/smartv3/ui/status/fragment/v2/StepDayV2Fragment;)Lcom/sma/smartv3/view/text/DINCondBold;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/status/fragment/v2/StepDayV2Fragment;->distanceDeviceValue_delegate$lambda$0(Lcom/sma/smartv3/ui/status/fragment/v2/StepDayV2Fragment;)Lcom/sma/smartv3/view/text/DINCondBold;

    move-result-object p0

    return-object p0
.end method

.method private static final caloriesDeviceValue_delegate$lambda$0(Lcom/sma/smartv3/ui/status/fragment/v2/StepDayV2Fragment;)Lcom/sma/smartv3/view/text/DINCondBold;
    .locals 1

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseFragment;->getMView()Landroid/view/View;

    move-result-object p0

    const v0, 0x7f0a0b39

    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Lcom/sma/smartv3/view/text/DINCondBold;

    return-object p0
.end method

.method private static final caloriesValue_delegate$lambda$0(Lcom/sma/smartv3/ui/status/fragment/v2/StepDayV2Fragment;)Lcom/sma/smartv3/view/text/DINCondBold;
    .locals 1

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseFragment;->getMView()Landroid/view/View;

    move-result-object p0

    const v0, 0x7f0a0b38

    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Lcom/sma/smartv3/view/text/DINCondBold;

    return-object p0
.end method

.method private static final distanceDeviceValue_delegate$lambda$0(Lcom/sma/smartv3/ui/status/fragment/v2/StepDayV2Fragment;)Lcom/sma/smartv3/view/text/DINCondBold;
    .locals 1

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseFragment;->getMView()Landroid/view/View;

    move-result-object p0

    const v0, 0x7f0a0b3b

    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Lcom/sma/smartv3/view/text/DINCondBold;

    return-object p0
.end method

.method private static final distanceValue_delegate$lambda$0(Lcom/sma/smartv3/ui/status/fragment/v2/StepDayV2Fragment;)Lcom/sma/smartv3/view/text/DINCondBold;
    .locals 1

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseFragment;->getMView()Landroid/view/View;

    move-result-object p0

    const v0, 0x7f0a0b3a

    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Lcom/sma/smartv3/view/text/DINCondBold;

    return-object p0
.end method

.method private final getCaloriesDeviceValue()Lcom/sma/smartv3/view/text/DINCondBold;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/status/fragment/v2/StepDayV2Fragment;->caloriesDeviceValue$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/sma/smartv3/view/text/DINCondBold;

    return-object v0
.end method

.method private final getCaloriesValue()Lcom/sma/smartv3/view/text/DINCondBold;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/status/fragment/v2/StepDayV2Fragment;->caloriesValue$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/sma/smartv3/view/text/DINCondBold;

    return-object v0
.end method

.method private final getDistanceDeviceValue()Lcom/sma/smartv3/view/text/DINCondBold;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/status/fragment/v2/StepDayV2Fragment;->distanceDeviceValue$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/sma/smartv3/view/text/DINCondBold;

    return-object v0
.end method

.method private final getDistanceValue()Lcom/sma/smartv3/view/text/DINCondBold;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/status/fragment/v2/StepDayV2Fragment;->distanceValue$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/sma/smartv3/view/text/DINCondBold;

    return-object v0
.end method

.method private final getGoalTip()Lcom/sma/smartv3/view/text/PFMedium;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/status/fragment/v2/StepDayV2Fragment;->goalTip$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/sma/smartv3/view/text/PFMedium;

    return-object v0
.end method

.method private final getGoalValue()Lcom/sma/smartv3/view/text/PFMedium;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/status/fragment/v2/StepDayV2Fragment;->goalValue$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/sma/smartv3/view/text/PFMedium;

    return-object v0
.end method

.method private final getProgressBar()Landroid/widget/ProgressBar;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/status/fragment/v2/StepDayV2Fragment;->progressBar$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/ProgressBar;

    return-object v0
.end method

.method private static final goalTip_delegate$lambda$0(Lcom/sma/smartv3/ui/status/fragment/v2/StepDayV2Fragment;)Lcom/sma/smartv3/view/text/PFMedium;
    .locals 1

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseFragment;->getMView()Landroid/view/View;

    move-result-object p0

    const v0, 0x7f0a0b3d

    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Lcom/sma/smartv3/view/text/PFMedium;

    return-object p0
.end method

.method private static final goalValue_delegate$lambda$0(Lcom/sma/smartv3/ui/status/fragment/v2/StepDayV2Fragment;)Lcom/sma/smartv3/view/text/PFMedium;
    .locals 1

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseFragment;->getMView()Landroid/view/View;

    move-result-object p0

    const v0, 0x7f0a0b3e

    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Lcom/sma/smartv3/view/text/PFMedium;

    return-object p0
.end method

.method public static synthetic iIiiO(Lcom/sma/smartv3/ui/status/fragment/v2/StepDayV2Fragment;)Lcom/sma/smartv3/view/text/DINCondBold;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/status/fragment/v2/StepDayV2Fragment;->distanceValue_delegate$lambda$0(Lcom/sma/smartv3/ui/status/fragment/v2/StepDayV2Fragment;)Lcom/sma/smartv3/view/text/DINCondBold;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic iOOX010X(Lcom/sma/smartv3/ui/status/fragment/v2/StepDayV2Fragment;)Landroid/widget/ProgressBar;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/status/fragment/v2/StepDayV2Fragment;->progressBar_delegate$lambda$0(Lcom/sma/smartv3/ui/status/fragment/v2/StepDayV2Fragment;)Landroid/widget/ProgressBar;

    move-result-object p0

    return-object p0
.end method

.method private static final initView$lambda$0(Lcom/sma/smartv3/ui/status/fragment/v2/StepDayV2Fragment;Landroid/view/View;)V
    .locals 2

    new-instance p1, Landroid/content/Intent;

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getActivity()Landroidx/fragment/app/FragmentActivity;

    move-result-object v0

    const-class v1, Lcom/sma/smartv3/ui/me/GoalSettingActivity;

    invoke-direct {p1, v0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    invoke-virtual {p0, p1}, Landroidx/fragment/app/Fragment;->startActivity(Landroid/content/Intent;)V

    return-void
.end method

.method private static final progressBar_delegate$lambda$0(Lcom/sma/smartv3/ui/status/fragment/v2/StepDayV2Fragment;)Landroid/widget/ProgressBar;
    .locals 1

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseFragment;->getMView()Landroid/view/View;

    move-result-object p0

    const v0, 0x7f0a0b3c

    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/ProgressBar;

    return-object p0
.end method


# virtual methods
.method public filterData(Ljava/util/List;)V
    .locals 12
    .param p1    # Ljava/util/List;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/sma/smartv3/db/entity/Activity;",
            ">;)V"
        }
    .end annotation

    const-string v0, "data"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-super {p0, p1}, Lcom/sma/smartv3/ui/status/base/ActivityBaseDayFragment;->filterData(Ljava/util/List;)V

    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result v0

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/status/base/ActivityBaseDayFragment;->getTwoValue()Lcom/sma/smartv3/view/text/DINCondBold;

    move-result-object v0

    const-string v2, "0"

    invoke-static {v2}, Lcom/sma/smartv3/util/UtilsKt;->Ii1iii0(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_0

    :cond_0
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    sub-int/2addr v0, v1

    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/sma/smartv3/db/entity/Activity;

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/status/base/ActivityBaseDayFragment;->getTwoValue()Lcom/sma/smartv3/view/text/DINCondBold;

    move-result-object v2

    invoke-virtual {v0}, Lcom/sma/smartv3/db/entity/Activity;->getMStep()I

    move-result v0

    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :goto_0
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_1
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/sma/smartv3/db/entity/Activity;

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/status/base/ActivityBaseDayFragment;->getFilterData()Ljava/util/LinkedHashMap;

    move-result-object v3

    invoke-interface {v3}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v3

    invoke-interface {v3}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_2
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_1

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/Map$Entry;

    invoke-interface {v4}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/Number;

    invoke-virtual {v5}, Ljava/lang/Number;->longValue()J

    move-result-wide v5

    invoke-interface {v4}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/ArrayList;

    invoke-virtual {v2}, Lcom/sma/smartv3/db/entity/Activity;->getMTime()J

    move-result-wide v7

    cmp-long v5, v7, v5

    if-gtz v5, :cond_2

    invoke-virtual {v4, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_3
    invoke-virtual {p0}, Lcom/sma/smartv3/ui/status/base/ActivityBaseDayFragment;->getFilterData()Ljava/util/LinkedHashMap;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    const/4 v2, 0x0

    move v3, v2

    move v4, v3

    :goto_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_8

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/util/Map$Entry;

    invoke-interface {v5}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/util/ArrayList;

    invoke-virtual {v5}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v6

    if-eqz v6, :cond_4

    move v7, v2

    goto :goto_5

    :cond_4
    invoke-virtual {v5}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v6

    const-string v7, "iterator(...)"

    invoke-static {v6, v7}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    move v7, v2

    move v8, v7

    :goto_3
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v9

    if-eqz v9, :cond_7

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v9

    const-string v10, "next(...)"

    invoke-static {v9, v10}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v9, Lcom/sma/smartv3/db/entity/Activity;

    invoke-virtual {v9}, Lcom/sma/smartv3/db/entity/Activity;->getMStep()I

    move-result v9

    if-gt v8, v9, :cond_6

    if-nez v8, :cond_5

    if-eqz v4, :cond_5

    if-lt v9, v4, :cond_5

    sub-int v8, v9, v4

    goto :goto_4

    :cond_5
    sub-int v8, v9, v8

    :goto_4
    add-int/2addr v7, v8

    :cond_6
    move v8, v9

    goto :goto_3

    :cond_7
    invoke-static {v5}, Lkotlin/collections/CollectionsKt___CollectionsKt;->Xi1XO00(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/sma/smartv3/db/entity/Activity;

    invoke-virtual {v4}, Lcom/sma/smartv3/db/entity/Activity;->getMStep()I

    move-result v4

    :goto_5
    invoke-virtual {p0}, Lcom/sma/smartv3/ui/status/base/ActivityBaseDayFragment;->getValues()Ljava/util/List;

    move-result-object v5

    new-instance v6, Lcom/github/mikephil/charting/data/BarEntry;

    int-to-float v8, v3

    int-to-float v7, v7

    invoke-direct {v6, v8, v7}, Lcom/github/mikephil/charting/data/BarEntry;-><init>(FF)V

    invoke-interface {v5, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/2addr v3, v1

    goto :goto_2

    :cond_8
    iput v2, p0, Lcom/sma/smartv3/ui/status/fragment/v2/StepDayV2Fragment;->countCR_Step:I

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    const/4 v0, 0x0

    move v3, v2

    move v4, v3

    move v5, v4

    move v6, v5

    :goto_6
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_c

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lcom/sma/smartv3/db/entity/Activity;

    invoke-virtual {v7}, Lcom/sma/smartv3/db/entity/Activity;->getMStep()I

    move-result v8

    if-gt v4, v8, :cond_9

    iget v9, p0, Lcom/sma/smartv3/ui/status/fragment/v2/StepDayV2Fragment;->countCR_Step:I

    sub-int v4, v8, v4

    add-int/2addr v9, v4

    iput v9, p0, Lcom/sma/smartv3/ui/status/fragment/v2/StepDayV2Fragment;->countCR_Step:I

    :cond_9
    invoke-virtual {v7}, Lcom/sma/smartv3/db/entity/Activity;->getMDistance()I

    move-result v4

    if-gt v5, v4, :cond_a

    sub-int v5, v4, v5

    iget-object v9, p0, Lcom/sma/smartv3/ui/status/fragment/v2/StepDayV2Fragment;->userProfile:Lcom/sma/smartv3/model/AppUser;

    invoke-virtual {v9}, Lcom/sma/smartv3/model/AppUser;->getUnit()I

    move-result v9

    const/4 v10, 0x4

    const/4 v11, 0x0

    invoke-static {v5, v9, v2, v10, v11}, Lcom/android/mltcode/paycertificationapi/cp5;->X1ii(IIZILjava/lang/Object;)F

    move-result v5

    add-float/2addr v0, v5

    :cond_a
    invoke-virtual {v7}, Lcom/sma/smartv3/db/entity/Activity;->getMCalorie()I

    move-result v5

    div-int/lit16 v5, v5, 0x2710

    if-gt v6, v5, :cond_b

    sub-int v6, v5, v6

    add-int/2addr v3, v6

    :cond_b
    move v6, v5

    move v5, v4

    move v4, v8

    goto :goto_6

    :cond_c
    invoke-virtual {p0}, Lcom/sma/smartv3/ui/status/base/ActivityBaseDayFragment;->getOneValue()Lcom/sma/smartv3/view/text/DINCondBold;

    move-result-object p1

    iget v2, p0, Lcom/sma/smartv3/ui/status/fragment/v2/StepDayV2Fragment;->countCR_Step:I

    invoke-static {v2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lcom/sma/smartv3/util/UtilsKt;->Ii1iii0(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/status/fragment/v2/StepDayV2Fragment;->setGoalChange()V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/status/fragment/v2/StepDayV2Fragment;->getCaloriesValue()Lcom/sma/smartv3/view/text/DINCondBold;

    move-result-object p1

    invoke-static {v3}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lcom/sma/smartv3/util/UtilsKt;->Ii1iii0(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/status/fragment/v2/StepDayV2Fragment;->getDistanceValue()Lcom/sma/smartv3/view/text/DINCondBold;

    move-result-object p1

    sget-object v2, Lkotlin/jvm/internal/StringCompanionObject;->OXO1:Lkotlin/jvm/internal/StringCompanionObject;

    iget-object v2, p0, Lcom/sma/smartv3/ui/status/fragment/v2/StepDayV2Fragment;->formatDecimal:Ljava/lang/String;

    const v4, 0x461c4000    # 10000.0f

    div-float/2addr v0, v4

    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v4

    filled-new-array {v4}, [Ljava/lang/Object;

    move-result-object v4

    invoke-static {v4, v1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v4

    invoke-static {v2, v4}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    const-string v4, "format(...)"

    invoke-static {v2, v4}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v2}, Lcom/sma/smartv3/util/UtilsKt;->Ii1iii0(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/status/fragment/v2/StepDayV2Fragment;->getCaloriesDeviceValue()Lcom/sma/smartv3/view/text/DINCondBold;

    move-result-object p1

    invoke-static {v3}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lcom/sma/smartv3/util/UtilsKt;->Ii1iii0(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/status/fragment/v2/StepDayV2Fragment;->getDistanceDeviceValue()Lcom/sma/smartv3/view/text/DINCondBold;

    move-result-object p1

    iget-object v2, p0, Lcom/sma/smartv3/ui/status/fragment/v2/StepDayV2Fragment;->formatDecimal:Ljava/lang/String;

    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0, v1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v0

    invoke-static {v2, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v4}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0}, Lcom/sma/smartv3/util/UtilsKt;->Ii1iii0(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public final getCountCR_Step()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/ui/status/fragment/v2/StepDayV2Fragment;->countCR_Step:I

    return v0
.end method

.method public final getFormatDecimal()Ljava/lang/String;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/ui/status/fragment/v2/StepDayV2Fragment;->formatDecimal:Ljava/lang/String;

    return-object v0
.end method

.method public initEvent()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public initView()V
    .locals 2

    invoke-super {p0}, Lcom/sma/smartv3/ui/status/base/ActivityBaseDayFragment;->initView()V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/status/base/BaseStatusFragment;->getImage()Landroid/widget/ImageView;

    move-result-object v0

    const v1, 0x7f08138f

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseFragment;->getMView()Landroid/view/View;

    move-result-object v0

    const v1, 0x7f0a0b3f

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    if-eqz v0, :cond_0

    new-instance v1, Lcom/android/mltcode/paycertificationapi/ha5;

    invoke-direct {v1, p0}, Lcom/android/mltcode/paycertificationapi/ha5;-><init>(Lcom/sma/smartv3/ui/status/fragment/v2/StepDayV2Fragment;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    :cond_0
    return-void
.end method

.method public layoutId()I
    .locals 1

    const v0, 0x7f0d0e97

    return v0
.end method

.method public final onGoalChange(Ljava/lang/Object;)V
    .locals 1
    .param p1    # Ljava/lang/Object;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation runtime Lcom/android/mltcode/paycertificationapi/sf5;
        tag = "goal_change"
    .end annotation

    const-string v0, "data"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/status/fragment/v2/StepDayV2Fragment;->setGoalChange()V

    return-void
.end method

.method public setColor(Lcom/android/mltcode/paycertificationapi/XXX1X11;)V
    .locals 3
    .param p1    # Lcom/android/mltcode/paycertificationapi/XXX1X11;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "value"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseFragment;->getMActivity()Landroid/app/Activity;

    move-result-object v0

    const v1, 0x7f06072a

    invoke-static {v0, v1}, Landroidx/core/content/ContextCompat;->getColor(Landroid/content/Context;I)I

    move-result v0

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseFragment;->getMActivity()Landroid/app/Activity;

    move-result-object v1

    const v2, 0x7f06072c

    invoke-static {v1, v2}, Landroidx/core/content/ContextCompat;->getColor(Landroid/content/Context;I)I

    move-result v1

    invoke-virtual {p1, v0, v1}, Lcom/android/mltcode/paycertificationapi/iO101O0XI;->OI1IiOO1i(II)V

    return-void
.end method

.method public final setCountCR_Step(I)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/ui/status/fragment/v2/StepDayV2Fragment;->countCR_Step:I

    return-void
.end method

.method public setDataLabel()Ljava/lang/String;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    const-string v0, "Step day Data"

    return-object v0
.end method

.method public final setGoalChange()V
    .locals 8
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "SetTextI18n"
        }
    .end annotation

    invoke-direct {p0}, Lcom/sma/smartv3/ui/status/fragment/v2/StepDayV2Fragment;->getGoalValue()Lcom/sma/smartv3/view/text/PFMedium;

    move-result-object v0

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/status/base/ActivityBaseDayFragment;->getOneValue()Lcom/sma/smartv3/view/text/DINCondBold;

    move-result-object v1

    invoke-virtual {v1}, Landroidx/appcompat/widget/AppCompatTextView;->getText()Ljava/lang/CharSequence;

    move-result-object v1

    const-string v2, "--"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    const-string v1, "0"

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Lcom/sma/smartv3/ui/status/base/ActivityBaseDayFragment;->getOneValue()Lcom/sma/smartv3/view/text/DINCondBold;

    move-result-object v1

    invoke-virtual {v1}, Landroidx/appcompat/widget/AppCompatTextView;->getText()Ljava/lang/CharSequence;

    move-result-object v1

    :goto_0
    sget-object v2, Lcom/szabh/smable3/component/BleCache;->INSTANCE:Lcom/szabh/smable3/component/BleCache;

    sget-object v3, Lcom/szabh/smable3/BleKey;->STEP_GOAL:Lcom/szabh/smable3/BleKey;

    const/4 v6, 0x6

    const/4 v7, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-static/range {v2 .. v7}, Lcom/szabh/smable3/component/BaseBleCache;->getInt$default(Lcom/szabh/smable3/component/BaseBleCache;Lcom/szabh/smable3/BleKey;ILcom/szabh/smable3/BleKeyFlag;ILjava/lang/Object;)I

    move-result v4

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, "/"

    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/status/fragment/v2/StepDayV2Fragment;->getProgressBar()Landroid/widget/ProgressBar;

    move-result-object v0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-static/range {v2 .. v7}, Lcom/szabh/smable3/component/BaseBleCache;->getInt$default(Lcom/szabh/smable3/component/BaseBleCache;Lcom/szabh/smable3/BleKey;ILcom/szabh/smable3/BleKeyFlag;ILjava/lang/Object;)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/ProgressBar;->setMax(I)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/status/fragment/v2/StepDayV2Fragment;->getProgressBar()Landroid/widget/ProgressBar;

    move-result-object v0

    iget v1, p0, Lcom/sma/smartv3/ui/status/fragment/v2/StepDayV2Fragment;->countCR_Step:I

    invoke-virtual {v0, v1}, Landroid/widget/ProgressBar;->setProgress(I)V

    invoke-static/range {v2 .. v7}, Lcom/szabh/smable3/component/BaseBleCache;->getInt$default(Lcom/szabh/smable3/component/BaseBleCache;Lcom/szabh/smable3/BleKey;ILcom/szabh/smable3/BleKeyFlag;ILjava/lang/Object;)I

    move-result v0

    iget v1, p0, Lcom/sma/smartv3/ui/status/fragment/v2/StepDayV2Fragment;->countCR_Step:I

    sub-int/2addr v0, v1

    invoke-direct {p0}, Lcom/sma/smartv3/ui/status/fragment/v2/StepDayV2Fragment;->getGoalTip()Lcom/sma/smartv3/view/text/PFMedium;

    move-result-object v1

    if-lez v0, :cond_1

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    const v2, 0x7f140d0a

    invoke-virtual {p0, v2, v0}, Landroidx/fragment/app/Fragment;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    goto :goto_1

    :cond_1
    const v0, 0x7f141204

    invoke-virtual {p0, v0}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object v0

    :goto_1
    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public updateItemData(Lcom/github/mikephil/charting/data/Entry;)V
    .locals 1
    .param p1    # Lcom/github/mikephil/charting/data/Entry;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "e"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/status/base/BaseStatusFragment;->getNowValue()Lcom/sma/smartv3/view/text/DINCondBold;

    move-result-object v0

    invoke-virtual {p1}, Lcom/android/mltcode/paycertificationapi/iII0X010;->O00()F

    move-result p1

    float-to-int p1, p1

    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lcom/sma/smartv3/util/UtilsKt;->Ii1iii0(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method
