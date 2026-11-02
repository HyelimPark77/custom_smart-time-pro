.class public final Lcom/sma/smartv3/ui/status/bg/BloodGlucoseRecordSetActivity;
.super Lcom/bestmafen/androidbase/base/BaseActivity;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nBloodGlucoseRecordSetActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BloodGlucoseRecordSetActivity.kt\ncom/sma/smartv3/ui/status/bg/BloodGlucoseRecordSetActivity\n+ 2 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n*L\n1#1,125:1\n18#2,2:126\n15#2:128\n11#2,2:129\n11#2,2:131\n*S KotlinDebug\n*F\n+ 1 BloodGlucoseRecordSetActivity.kt\ncom/sma/smartv3/ui/status/bg/BloodGlucoseRecordSetActivity\n*L\n33#1:126,2\n33#1:128\n111#1:129,2\n117#1:131,2\n*E\n"
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nBloodGlucoseRecordSetActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BloodGlucoseRecordSetActivity.kt\ncom/sma/smartv3/ui/status/bg/BloodGlucoseRecordSetActivity\n+ 2 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n*L\n1#1,125:1\n18#2,2:126\n15#2:128\n11#2,2:129\n11#2,2:131\n*S KotlinDebug\n*F\n+ 1 BloodGlucoseRecordSetActivity.kt\ncom/sma/smartv3/ui/status/bg/BloodGlucoseRecordSetActivity\n*L\n33#1:126,2\n33#1:128\n111#1:129,2\n117#1:131,2\n*E\n"
    }
.end annotation


# instance fields
.field private final itemCalendar$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final itemEndDate$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final itemStartDate$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private mSetting:Lcom/sma/smartv3/model/BGEMRecordSet;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 4

    invoke-direct {p0}, Lcom/bestmafen/androidbase/base/BaseActivity;-><init>()V

    new-instance v0, Lcom/android/mltcode/paycertificationapi/iXI11XXX;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/iXI11XXX;-><init>(Lcom/sma/smartv3/ui/status/bg/BloodGlucoseRecordSetActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/status/bg/BloodGlucoseRecordSetActivity;->itemCalendar$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/i1iIX0;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/i1iIX0;-><init>(Lcom/sma/smartv3/ui/status/bg/BloodGlucoseRecordSetActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/status/bg/BloodGlucoseRecordSetActivity;->itemStartDate$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/XOOOXI;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/XOOOXI;-><init>(Lcom/sma/smartv3/ui/status/bg/BloodGlucoseRecordSetActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/status/bg/BloodGlucoseRecordSetActivity;->itemEndDate$delegate:Lkotlin/Lazy;

    sget-object v0, Lcom/android/mltcode/paycertificationapi/a01;->OXO1:Lcom/android/mltcode/paycertificationapi/a01;

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/a01;->IiI10X()Lcom/blankj/utilcode/util/SPUtils;

    move-result-object v0

    new-instance v1, Lcom/google/gson/Gson;

    invoke-direct {v1}, Lcom/google/gson/Gson;-><init>()V

    const-class v2, Lcom/sma/smartv3/model/BGEMRecordSet;

    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Lcom/blankj/utilcode/util/SPUtils;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0, v2}, Lcom/google/gson/Gson;->fromJson(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_0

    invoke-virtual {v2}, Ljava/lang/Class;->newInstance()Ljava/lang/Object;

    move-result-object v0

    :cond_0
    check-cast v0, Lcom/sma/smartv3/model/BGEMRecordSet;

    iput-object v0, p0, Lcom/sma/smartv3/ui/status/bg/BloodGlucoseRecordSetActivity;->mSetting:Lcom/sma/smartv3/model/BGEMRecordSet;

    return-void
.end method

.method public static synthetic I0iXXO(Lcom/sma/smartv3/ui/status/bg/BloodGlucoseRecordSetActivity;)Lcom/sma/smartv3/view/AbhSettingsItem;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/status/bg/BloodGlucoseRecordSetActivity;->itemCalendar_delegate$lambda$0(Lcom/sma/smartv3/ui/status/bg/BloodGlucoseRecordSetActivity;)Lcom/sma/smartv3/view/AbhSettingsItem;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic O10IXXX0X(Lcom/sma/smartv3/ui/status/bg/BloodGlucoseRecordSetActivity;I)Z
    .locals 0

    invoke-static {p0, p1}, Lcom/sma/smartv3/ui/status/bg/BloodGlucoseRecordSetActivity;->onCalendar$lambda$0$0(Lcom/sma/smartv3/ui/status/bg/BloodGlucoseRecordSetActivity;I)Z

    move-result p0

    return p0
.end method

.method public static synthetic OIX0iXi(Lcom/sma/smartv3/ui/status/bg/BloodGlucoseRecordSetActivity;III)Z
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lcom/sma/smartv3/ui/status/bg/BloodGlucoseRecordSetActivity;->onStartDate$lambda$0$0(Lcom/sma/smartv3/ui/status/bg/BloodGlucoseRecordSetActivity;III)Z

    move-result p0

    return p0
.end method

.method public static synthetic X0O(Lcom/sma/smartv3/ui/status/bg/BloodGlucoseRecordSetActivity;III)Z
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lcom/sma/smartv3/ui/status/bg/BloodGlucoseRecordSetActivity;->onEndDate$lambda$0$0(Lcom/sma/smartv3/ui/status/bg/BloodGlucoseRecordSetActivity;III)Z

    move-result p0

    return p0
.end method

.method public static synthetic X1ii(Lcom/sma/smartv3/ui/status/bg/BloodGlucoseRecordSetActivity;)Lcom/sma/smartv3/view/AbhSettingsItem;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/status/bg/BloodGlucoseRecordSetActivity;->itemEndDate_delegate$lambda$0(Lcom/sma/smartv3/ui/status/bg/BloodGlucoseRecordSetActivity;)Lcom/sma/smartv3/view/AbhSettingsItem;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic XXI(Lcom/sma/smartv3/ui/status/bg/BloodGlucoseRecordSetActivity;)Lcom/sma/smartv3/view/AbhSettingsItem;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/status/bg/BloodGlucoseRecordSetActivity;->itemStartDate_delegate$lambda$0(Lcom/sma/smartv3/ui/status/bg/BloodGlucoseRecordSetActivity;)Lcom/sma/smartv3/view/AbhSettingsItem;

    move-result-object p0

    return-object p0
.end method

.method private final getItemCalendar()Lcom/sma/smartv3/view/AbhSettingsItem;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/status/bg/BloodGlucoseRecordSetActivity;->itemCalendar$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/sma/smartv3/view/AbhSettingsItem;

    return-object v0
.end method

.method private final getItemEndDate()Lcom/sma/smartv3/view/AbhSettingsItem;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/status/bg/BloodGlucoseRecordSetActivity;->itemEndDate$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/sma/smartv3/view/AbhSettingsItem;

    return-object v0
.end method

.method private final getItemStartDate()Lcom/sma/smartv3/view/AbhSettingsItem;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/status/bg/BloodGlucoseRecordSetActivity;->itemStartDate$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/sma/smartv3/view/AbhSettingsItem;

    return-object v0
.end method

.method private static final itemCalendar_delegate$lambda$0(Lcom/sma/smartv3/ui/status/bg/BloodGlucoseRecordSetActivity;)Lcom/sma/smartv3/view/AbhSettingsItem;
    .locals 1

    const v0, 0x7f0a056e

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Lcom/sma/smartv3/view/AbhSettingsItem;

    return-object p0
.end method

.method private static final itemEndDate_delegate$lambda$0(Lcom/sma/smartv3/ui/status/bg/BloodGlucoseRecordSetActivity;)Lcom/sma/smartv3/view/AbhSettingsItem;
    .locals 1

    const v0, 0x7f0a058d

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Lcom/sma/smartv3/view/AbhSettingsItem;

    return-object p0
.end method

.method private static final itemStartDate_delegate$lambda$0(Lcom/sma/smartv3/ui/status/bg/BloodGlucoseRecordSetActivity;)Lcom/sma/smartv3/view/AbhSettingsItem;
    .locals 1

    const v0, 0x7f0a05e8

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Lcom/sma/smartv3/view/AbhSettingsItem;

    return-object p0
.end method

.method private static final onCalendar$lambda$0$0(Lcom/sma/smartv3/ui/status/bg/BloodGlucoseRecordSetActivity;I)Z
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/status/bg/BloodGlucoseRecordSetActivity;->mSetting:Lcom/sma/smartv3/model/BGEMRecordSet;

    invoke-virtual {v0, p1}, Lcom/sma/smartv3/model/BGEMRecordSet;->setCalendar(I)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/status/bg/BloodGlucoseRecordSetActivity;->updateUI()V

    const/4 p0, 0x1

    return p0
.end method

.method private static final onEndDate$lambda$0$0(Lcom/sma/smartv3/ui/status/bg/BloodGlucoseRecordSetActivity;III)Z
    .locals 1

    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v0

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    invoke-static {v0, p1}, Lcom/android/mltcode/paycertificationapi/OIi1iX;->X01IiOiIi(Ljava/util/Calendar;I)V

    invoke-static {v0, p2}, Lcom/android/mltcode/paycertificationapi/OIi1iX;->OII(Ljava/util/Calendar;I)V

    invoke-static {v0, p3}, Lcom/android/mltcode/paycertificationapi/OIi1iX;->IIX1OXO(Ljava/util/Calendar;I)V

    const/4 p1, 0x0

    invoke-static {v0, p1}, Lcom/android/mltcode/paycertificationapi/OIi1iX;->iIiiO(Ljava/util/Calendar;I)V

    invoke-static {v0, p1}, Lcom/android/mltcode/paycertificationapi/OIi1iX;->OiIIX101O(Ljava/util/Calendar;I)V

    invoke-static {v0, p1}, Lcom/android/mltcode/paycertificationapi/OIi1iX;->I1(Ljava/util/Calendar;I)V

    invoke-static {v0, p1}, Lcom/android/mltcode/paycertificationapi/OIi1iX;->XX0(Ljava/util/Calendar;I)V

    iget-object p1, p0, Lcom/sma/smartv3/ui/status/bg/BloodGlucoseRecordSetActivity;->mSetting:Lcom/sma/smartv3/model/BGEMRecordSet;

    invoke-virtual {v0}, Ljava/util/Calendar;->getTimeInMillis()J

    move-result-wide p2

    invoke-virtual {p1, p2, p3}, Lcom/sma/smartv3/model/BGEMRecordSet;->setEndDate(J)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/status/bg/BloodGlucoseRecordSetActivity;->updateUI()V

    const/4 p0, 0x1

    return p0
.end method

.method private static final onStartDate$lambda$0$0(Lcom/sma/smartv3/ui/status/bg/BloodGlucoseRecordSetActivity;III)Z
    .locals 1

    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v0

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    invoke-static {v0, p1}, Lcom/android/mltcode/paycertificationapi/OIi1iX;->X01IiOiIi(Ljava/util/Calendar;I)V

    invoke-static {v0, p2}, Lcom/android/mltcode/paycertificationapi/OIi1iX;->OII(Ljava/util/Calendar;I)V

    invoke-static {v0, p3}, Lcom/android/mltcode/paycertificationapi/OIi1iX;->IIX1OXO(Ljava/util/Calendar;I)V

    const/4 p1, 0x0

    invoke-static {v0, p1}, Lcom/android/mltcode/paycertificationapi/OIi1iX;->iIiiO(Ljava/util/Calendar;I)V

    invoke-static {v0, p1}, Lcom/android/mltcode/paycertificationapi/OIi1iX;->OiIIX101O(Ljava/util/Calendar;I)V

    invoke-static {v0, p1}, Lcom/android/mltcode/paycertificationapi/OIi1iX;->I1(Ljava/util/Calendar;I)V

    invoke-static {v0, p1}, Lcom/android/mltcode/paycertificationapi/OIi1iX;->XX0(Ljava/util/Calendar;I)V

    iget-object p1, p0, Lcom/sma/smartv3/ui/status/bg/BloodGlucoseRecordSetActivity;->mSetting:Lcom/sma/smartv3/model/BGEMRecordSet;

    invoke-virtual {v0}, Ljava/util/Calendar;->getTimeInMillis()J

    move-result-wide p2

    invoke-virtual {p1, p2, p3}, Lcom/sma/smartv3/model/BGEMRecordSet;->setStartDate(J)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/status/bg/BloodGlucoseRecordSetActivity;->updateUI()V

    const/4 p0, 0x1

    return p0
.end method

.method private final updateUI()V
    .locals 10

    invoke-direct {p0}, Lcom/sma/smartv3/ui/status/bg/BloodGlucoseRecordSetActivity;->getItemCalendar()Lcom/sma/smartv3/view/AbhSettingsItem;

    move-result-object v0

    invoke-virtual {p0}, Landroidx/appcompat/app/AppCompatActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v2, 0x7f030013

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getStringArray(I)[Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lcom/sma/smartv3/ui/status/bg/BloodGlucoseRecordSetActivity;->mSetting:Lcom/sma/smartv3/model/BGEMRecordSet;

    invoke-virtual {v2}, Lcom/sma/smartv3/model/BGEMRecordSet;->getCalendar()I

    move-result v2

    aget-object v1, v1, v2

    const-string v2, "get(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Lcom/sma/smartv3/view/AbhSettingsItem;->setMRightText(Ljava/lang/String;)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/status/bg/BloodGlucoseRecordSetActivity;->getItemStartDate()Lcom/sma/smartv3/view/AbhSettingsItem;

    move-result-object v0

    iget-object v1, p0, Lcom/sma/smartv3/ui/status/bg/BloodGlucoseRecordSetActivity;->mSetting:Lcom/sma/smartv3/model/BGEMRecordSet;

    invoke-virtual {v1}, Lcom/sma/smartv3/model/BGEMRecordSet;->getStartDate()J

    move-result-wide v1

    const-wide/16 v3, 0x0

    cmp-long v1, v1, v3

    const-string v2, ""

    const-string v5, "format(...)"

    const/4 v6, 0x1

    const/4 v7, 0x0

    if-eqz v1, :cond_0

    invoke-static {v7, v6, v7}, Lcom/android/mltcode/paycertificationapi/O0X11OiO;->X0i1O(Lcom/sma/smartv3/util/DateTimeFormat;ILjava/lang/Object;)Ljava/text/SimpleDateFormat;

    move-result-object v1

    iget-object v8, p0, Lcom/sma/smartv3/ui/status/bg/BloodGlucoseRecordSetActivity;->mSetting:Lcom/sma/smartv3/model/BGEMRecordSet;

    invoke-virtual {v8}, Lcom/sma/smartv3/model/BGEMRecordSet;->getStartDate()J

    move-result-wide v8

    invoke-static {v8, v9}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v8

    invoke-virtual {v1, v8}, Ljava/text/Format;->format(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1, v5}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    move-object v1, v2

    :goto_0
    invoke-virtual {v0, v1}, Lcom/sma/smartv3/view/AbhSettingsItem;->setMRightText(Ljava/lang/String;)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/status/bg/BloodGlucoseRecordSetActivity;->getItemEndDate()Lcom/sma/smartv3/view/AbhSettingsItem;

    move-result-object v0

    iget-object v1, p0, Lcom/sma/smartv3/ui/status/bg/BloodGlucoseRecordSetActivity;->mSetting:Lcom/sma/smartv3/model/BGEMRecordSet;

    invoke-virtual {v1}, Lcom/sma/smartv3/model/BGEMRecordSet;->getEndDate()J

    move-result-wide v8

    cmp-long v1, v8, v3

    if-eqz v1, :cond_1

    invoke-static {v7, v6, v7}, Lcom/android/mltcode/paycertificationapi/O0X11OiO;->X0i1O(Lcom/sma/smartv3/util/DateTimeFormat;ILjava/lang/Object;)Ljava/text/SimpleDateFormat;

    move-result-object v1

    iget-object v2, p0, Lcom/sma/smartv3/ui/status/bg/BloodGlucoseRecordSetActivity;->mSetting:Lcom/sma/smartv3/model/BGEMRecordSet;

    invoke-virtual {v2}, Lcom/sma/smartv3/model/BGEMRecordSet;->getEndDate()J

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/text/Format;->format(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2, v5}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    :cond_1
    invoke-virtual {v0, v2}, Lcom/sma/smartv3/view/AbhSettingsItem;->setMRightText(Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public init(Landroid/os/Bundle;)V
    .locals 0
    .param p1    # Landroid/os/Bundle;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param

    return-void
.end method

.method public initView()V
    .locals 2

    const v0, 0x7f0a0023

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    const v1, 0x7f140f26

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/status/bg/BloodGlucoseRecordSetActivity;->updateUI()V

    return-void
.end method

.method public layoutId()I
    .locals 1

    const v0, 0x7f0d003c

    return v0
.end method

.method public final onBottomClick(Landroid/view/View;)V
    .locals 3
    .param p1    # Landroid/view/View;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "view"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p1, Lcom/android/mltcode/paycertificationapi/a01;->OXO1:Lcom/android/mltcode/paycertificationapi/a01;

    invoke-virtual {p1}, Lcom/android/mltcode/paycertificationapi/a01;->IiI10X()Lcom/blankj/utilcode/util/SPUtils;

    move-result-object p1

    iget-object v0, p0, Lcom/sma/smartv3/ui/status/bg/BloodGlucoseRecordSetActivity;->mSetting:Lcom/sma/smartv3/model/BGEMRecordSet;

    const-class v1, Lcom/sma/smartv3/model/BGEMRecordSet;

    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lcom/google/gson/Gson;

    invoke-direct {v2}, Lcom/google/gson/Gson;-><init>()V

    invoke-virtual {v2, v0}, Lcom/google/gson/Gson;->toJson(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v1, v0}, Lcom/blankj/utilcode/util/SPUtils;->put(Ljava/lang/String;Ljava/lang/String;)V

    const/4 p1, 0x0

    const/4 v0, 0x2

    const-string v1, "BLOODGLUCOSE_RECORD_SET"

    invoke-static {v1, p1, v0, p1}, Lcom/android/mltcode/paycertificationapi/I01XX0;->XIi00iiXO(Ljava/lang/String;Ljava/lang/Object;ILjava/lang/Object;)V

    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    return-void
.end method

.method public final onCalendar(Landroid/view/View;)V
    .locals 7
    .param p1    # Landroid/view/View;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "view"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/android/mltcode/paycertificationapi/dj4;

    const/4 v5, 0x4

    const/4 v6, 0x0

    const v3, 0x7f030013

    const/4 v4, 0x0

    move-object v2, p0

    invoke-direct/range {v1 .. v6}, Lcom/android/mltcode/paycertificationapi/dj4;-><init>(Landroid/app/Activity;IIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const p1, 0x7f140260

    invoke-virtual {v1, p1}, Lcom/android/mltcode/paycertificationapi/dj4;->iX(I)V

    new-instance p1, Lcom/android/mltcode/paycertificationapi/Oi1IOII11;

    invoke-direct {p1, p0}, Lcom/android/mltcode/paycertificationapi/Oi1IOII11;-><init>(Lcom/sma/smartv3/ui/status/bg/BloodGlucoseRecordSetActivity;)V

    invoke-virtual {v1, p1}, Lcom/android/mltcode/paycertificationapi/dj4;->i010I(Lkotlin/jvm/functions/Function1;)V

    iget-object p1, v2, Lcom/sma/smartv3/ui/status/bg/BloodGlucoseRecordSetActivity;->mSetting:Lcom/sma/smartv3/model/BGEMRecordSet;

    invoke-virtual {p1}, Lcom/sma/smartv3/model/BGEMRecordSet;->getCalendar()I

    move-result p1

    invoke-virtual {v1, p1}, Lcom/android/mltcode/paycertificationapi/dj4;->II1Xi0(I)V

    invoke-virtual {v1}, Lcom/android/mltcode/paycertificationapi/OIXIOIO;->IIX1OXO()V

    return-void
.end method

.method public final onEndDate(Landroid/view/View;)V
    .locals 2
    .param p1    # Landroid/view/View;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "view"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p1, Lcom/android/mltcode/paycertificationapi/O1100iXOX;

    invoke-direct {p1, p0}, Lcom/android/mltcode/paycertificationapi/O1100iXOX;-><init>(Landroid/app/Activity;)V

    const v0, 0x7f1404d8

    invoke-virtual {p1, v0}, Lcom/android/mltcode/paycertificationapi/O1100iXOX;->iX(I)V

    new-instance v0, Lcom/android/mltcode/paycertificationapi/iOXiIIiX;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/iOXiIIiX;-><init>(Lcom/sma/smartv3/ui/status/bg/BloodGlucoseRecordSetActivity;)V

    invoke-virtual {p1, v0}, Lcom/android/mltcode/paycertificationapi/O1100iXOX;->i010I(Lkotlin/jvm/functions/Function3;)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/status/bg/BloodGlucoseRecordSetActivity;->mSetting:Lcom/sma/smartv3/model/BGEMRecordSet;

    invoke-virtual {v0}, Lcom/sma/smartv3/model/BGEMRecordSet;->getEndDate()J

    move-result-wide v0

    invoke-virtual {p1, v0, v1}, Lcom/android/mltcode/paycertificationapi/O1100iXOX;->iOO1ii1(J)V

    invoke-virtual {p1}, Lcom/android/mltcode/paycertificationapi/OIXIOIO;->IIX1OXO()V

    return-void
.end method

.method public final onReset(Landroid/view/View;)V
    .locals 9
    .param p1    # Landroid/view/View;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "view"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/sma/smartv3/model/BGEMRecordSet;

    const/4 v7, 0x7

    const/4 v8, 0x0

    const/4 v2, 0x0

    const-wide/16 v3, 0x0

    const-wide/16 v5, 0x0

    invoke-direct/range {v1 .. v8}, Lcom/sma/smartv3/model/BGEMRecordSet;-><init>(IJJILkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object v1, p0, Lcom/sma/smartv3/ui/status/bg/BloodGlucoseRecordSetActivity;->mSetting:Lcom/sma/smartv3/model/BGEMRecordSet;

    sget-object p1, Lcom/android/mltcode/paycertificationapi/a01;->OXO1:Lcom/android/mltcode/paycertificationapi/a01;

    invoke-virtual {p1}, Lcom/android/mltcode/paycertificationapi/a01;->IiI10X()Lcom/blankj/utilcode/util/SPUtils;

    move-result-object p1

    iget-object v0, p0, Lcom/sma/smartv3/ui/status/bg/BloodGlucoseRecordSetActivity;->mSetting:Lcom/sma/smartv3/model/BGEMRecordSet;

    const-class v1, Lcom/sma/smartv3/model/BGEMRecordSet;

    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lcom/google/gson/Gson;

    invoke-direct {v2}, Lcom/google/gson/Gson;-><init>()V

    invoke-virtual {v2, v0}, Lcom/google/gson/Gson;->toJson(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v1, v0}, Lcom/blankj/utilcode/util/SPUtils;->put(Ljava/lang/String;Ljava/lang/String;)V

    const/4 p1, 0x0

    const/4 v0, 0x2

    const-string v1, "BLOODGLUCOSE_RECORD_SET"

    invoke-static {v1, p1, v0, p1}, Lcom/android/mltcode/paycertificationapi/I01XX0;->XIi00iiXO(Ljava/lang/String;Ljava/lang/Object;ILjava/lang/Object;)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/status/bg/BloodGlucoseRecordSetActivity;->updateUI()V

    return-void
.end method

.method public final onStartDate(Landroid/view/View;)V
    .locals 2
    .param p1    # Landroid/view/View;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "view"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p1, Lcom/android/mltcode/paycertificationapi/O1100iXOX;

    invoke-direct {p1, p0}, Lcom/android/mltcode/paycertificationapi/O1100iXOX;-><init>(Landroid/app/Activity;)V

    const v0, 0x7f1412b4

    invoke-virtual {p1, v0}, Lcom/android/mltcode/paycertificationapi/O1100iXOX;->iX(I)V

    new-instance v0, Lcom/android/mltcode/paycertificationapi/OIOOXii;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/OIOOXii;-><init>(Lcom/sma/smartv3/ui/status/bg/BloodGlucoseRecordSetActivity;)V

    invoke-virtual {p1, v0}, Lcom/android/mltcode/paycertificationapi/O1100iXOX;->i010I(Lkotlin/jvm/functions/Function3;)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/status/bg/BloodGlucoseRecordSetActivity;->mSetting:Lcom/sma/smartv3/model/BGEMRecordSet;

    invoke-virtual {v0}, Lcom/sma/smartv3/model/BGEMRecordSet;->getStartDate()J

    move-result-wide v0

    invoke-virtual {p1, v0, v1}, Lcom/android/mltcode/paycertificationapi/O1100iXOX;->iOO1ii1(J)V

    invoke-virtual {p1}, Lcom/android/mltcode/paycertificationapi/OIXIOIO;->IIX1OXO()V

    return-void
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
