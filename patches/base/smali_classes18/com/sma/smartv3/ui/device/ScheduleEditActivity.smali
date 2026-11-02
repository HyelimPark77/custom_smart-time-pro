.class public final Lcom/sma/smartv3/ui/device/ScheduleEditActivity;
.super Lcom/bestmafen/androidbase/base/BaseActivity;
.source "SourceFile"


# instance fields
.field private final edtContent$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final edtTip$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private isEdited:Z

.field private final itemAdvance$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final itemTime$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final itemTitle$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private mAdvancePopup:Lcom/android/mltcode/paycertificationapi/pv1;
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation
.end field

.field private final mDateFormat:Ljava/text/SimpleDateFormat;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private mDateTimePopup:Lcom/android/mltcode/paycertificationapi/OXIOI1;
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation
.end field

.field private mDeletePopup:Lcom/android/mltcode/paycertificationapi/go0;
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation
.end field

.field private mSaveTipPopup:Lcom/android/mltcode/paycertificationapi/go0;
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation
.end field

.field private mSchedule:Lcom/szabh/smable3/entity/BleSchedule;

.field private final rootView$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 4

    invoke-direct {p0}, Lcom/bestmafen/androidbase/base/BaseActivity;-><init>()V

    new-instance v0, Lcom/android/mltcode/paycertificationapi/iv3;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/iv3;-><init>(Lcom/sma/smartv3/ui/device/ScheduleEditActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/ScheduleEditActivity;->rootView$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/jv3;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/jv3;-><init>(Lcom/sma/smartv3/ui/device/ScheduleEditActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/ScheduleEditActivity;->itemTitle$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/kv3;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/kv3;-><init>(Lcom/sma/smartv3/ui/device/ScheduleEditActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/ScheduleEditActivity;->itemTime$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/lv3;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/lv3;-><init>(Lcom/sma/smartv3/ui/device/ScheduleEditActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/ScheduleEditActivity;->itemAdvance$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/mv3;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/mv3;-><init>(Lcom/sma/smartv3/ui/device/ScheduleEditActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/ScheduleEditActivity;->edtContent$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/bv3;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/bv3;-><init>(Lcom/sma/smartv3/ui/device/ScheduleEditActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/ScheduleEditActivity;->edtTip$delegate:Lkotlin/Lazy;

    sget-object v0, Lcom/android/mltcode/paycertificationapi/i72;->OXO1:Lcom/android/mltcode/paycertificationapi/i72;

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/i72;->i0X000X0O()Z

    move-result v0

    const/4 v1, 0x2

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lcom/android/mltcode/paycertificationapi/O0X11OiO;->i0X000X0O(ZZILjava/lang/Object;)Ljava/text/SimpleDateFormat;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/ScheduleEditActivity;->mDateFormat:Ljava/text/SimpleDateFormat;

    return-void
.end method

.method public static synthetic I0iXXO(Lcom/sma/smartv3/ui/device/ScheduleEditActivity;)Z
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/device/ScheduleEditActivity;->onTitleLeftClick$lambda$0$1(Lcom/sma/smartv3/ui/device/ScheduleEditActivity;)Z

    move-result p0

    return p0
.end method

.method public static synthetic I1XOi1(Lcom/sma/smartv3/ui/device/ScheduleEditActivity;)Z
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/device/ScheduleEditActivity;->onBottomClick$lambda$0$0(Lcom/sma/smartv3/ui/device/ScheduleEditActivity;)Z

    move-result p0

    return p0
.end method

.method public static synthetic IIX1OXO(Lcom/sma/smartv3/ui/device/ScheduleEditActivity;)Lcom/sma/smartv3/view/AbhSettingsItem;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/device/ScheduleEditActivity;->itemTime_delegate$lambda$0(Lcom/sma/smartv3/ui/device/ScheduleEditActivity;)Lcom/sma/smartv3/view/AbhSettingsItem;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic O10IXXX0X(Lcom/sma/smartv3/ui/device/ScheduleEditActivity;Lcom/szabh/smable3/component/BleConnector;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Lcom/sma/smartv3/ui/device/ScheduleEditActivity;->onBottomClick$lambda$0$0$0(Lcom/sma/smartv3/ui/device/ScheduleEditActivity;Lcom/szabh/smable3/component/BleConnector;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic OIX0iXi(Lcom/sma/smartv3/ui/device/ScheduleEditActivity;)Landroid/widget/TextView;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/device/ScheduleEditActivity;->edtTip_delegate$lambda$0(Lcom/sma/smartv3/ui/device/ScheduleEditActivity;)Landroid/widget/TextView;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic OiIIX101O(Lcom/sma/smartv3/ui/device/ScheduleEditActivity;)Landroid/widget/EditText;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/device/ScheduleEditActivity;->edtContent_delegate$lambda$0(Lcom/sma/smartv3/ui/device/ScheduleEditActivity;)Landroid/widget/EditText;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic X0O(Lcom/sma/smartv3/ui/device/ScheduleEditActivity;IIIII)Z
    .locals 0

    invoke-static/range {p0 .. p5}, Lcom/sma/smartv3/ui/device/ScheduleEditActivity;->onSetDateTime$lambda$0$0(Lcom/sma/smartv3/ui/device/ScheduleEditActivity;IIIII)Z

    move-result p0

    return p0
.end method

.method public static synthetic X1ii(Lcom/sma/smartv3/ui/device/ScheduleEditActivity;)Landroid/view/View;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/device/ScheduleEditActivity;->rootView_delegate$lambda$0(Lcom/sma/smartv3/ui/device/ScheduleEditActivity;)Landroid/view/View;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic XX0(Lcom/sma/smartv3/ui/device/ScheduleEditActivity;)Z
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/device/ScheduleEditActivity;->onTitleLeftClick$lambda$0$0(Lcom/sma/smartv3/ui/device/ScheduleEditActivity;)Z

    move-result p0

    return p0
.end method

.method public static synthetic XXI(Lcom/sma/smartv3/ui/device/ScheduleEditActivity;I)Z
    .locals 0

    invoke-static {p0, p1}, Lcom/sma/smartv3/ui/device/ScheduleEditActivity;->onSetAdvance$lambda$0$0(Lcom/sma/smartv3/ui/device/ScheduleEditActivity;I)Z

    move-result p0

    return p0
.end method

.method public static synthetic XiOIO(Lcom/sma/smartv3/ui/device/ScheduleEditActivity;)Lcom/sma/smartv3/view/AbhSettingsItem;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/device/ScheduleEditActivity;->itemTitle_delegate$lambda$0(Lcom/sma/smartv3/ui/device/ScheduleEditActivity;)Lcom/sma/smartv3/view/AbhSettingsItem;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic XiOIii1(Lcom/sma/smartv3/ui/device/ScheduleEditActivity;)Lcom/sma/smartv3/view/AbhSettingsItem;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/device/ScheduleEditActivity;->itemAdvance_delegate$lambda$0(Lcom/sma/smartv3/ui/device/ScheduleEditActivity;)Lcom/sma/smartv3/view/AbhSettingsItem;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$getEdtTip(Lcom/sma/smartv3/ui/device/ScheduleEditActivity;)Landroid/widget/TextView;
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/ScheduleEditActivity;->getEdtTip()Landroid/widget/TextView;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$getEdtTip(Lcom/sma/smartv3/ui/device/ScheduleEditActivity;)Ljava/lang/String;
    .locals 0

    .line 2
    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/ScheduleEditActivity;->getEdtTip()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$getMSchedule$p(Lcom/sma/smartv3/ui/device/ScheduleEditActivity;)Lcom/szabh/smable3/entity/BleSchedule;
    .locals 0

    iget-object p0, p0, Lcom/sma/smartv3/ui/device/ScheduleEditActivity;->mSchedule:Lcom/szabh/smable3/entity/BleSchedule;

    return-object p0
.end method

.method public static final synthetic access$setEdited$p(Lcom/sma/smartv3/ui/device/ScheduleEditActivity;Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/sma/smartv3/ui/device/ScheduleEditActivity;->isEdited:Z

    return-void
.end method

.method private static final edtContent_delegate$lambda$0(Lcom/sma/smartv3/ui/device/ScheduleEditActivity;)Landroid/widget/EditText;
    .locals 1

    const v0, 0x7f0a0345

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/EditText;

    return-object p0
.end method

.method private static final edtTip_delegate$lambda$0(Lcom/sma/smartv3/ui/device/ScheduleEditActivity;)Landroid/widget/TextView;
    .locals 1

    const v0, 0x7f0a034b

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/TextView;

    return-object p0
.end method

.method private final getEdtContent()Landroid/widget/EditText;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/ScheduleEditActivity;->edtContent$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/EditText;

    return-object v0
.end method

.method private final getEdtTip()Landroid/widget/TextView;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/sma/smartv3/ui/device/ScheduleEditActivity;->edtTip$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    return-object v0
.end method

.method private final getEdtTip()Ljava/lang/String;
    .locals 3

    .line 2
    iget-object v0, p0, Lcom/sma/smartv3/ui/device/ScheduleEditActivity;->mSchedule:Lcom/szabh/smable3/entity/BleSchedule;

    if-nez v0, :cond_0

    const-string v0, "mSchedule"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    const/4 v0, 0x0

    :cond_0
    invoke-virtual {v0}, Lcom/szabh/smable3/entity/BleSchedule;->getMContent()Ljava/lang/String;

    move-result-object v0

    sget-object v1, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    const-string v2, "UTF_8"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object v0

    const-string v1, "getBytes(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    array-length v0, v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, "/250"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private final getItemAdvance()Lcom/sma/smartv3/view/AbhSettingsItem;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/ScheduleEditActivity;->itemAdvance$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/sma/smartv3/view/AbhSettingsItem;

    return-object v0
.end method

.method private final getItemTime()Lcom/sma/smartv3/view/AbhSettingsItem;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/ScheduleEditActivity;->itemTime$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/sma/smartv3/view/AbhSettingsItem;

    return-object v0
.end method

.method private final getItemTitle()Lcom/sma/smartv3/view/AbhSettingsItem;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/ScheduleEditActivity;->itemTitle$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/sma/smartv3/view/AbhSettingsItem;

    return-object v0
.end method

.method private final getRootView()Landroid/view/View;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/ScheduleEditActivity;->rootView$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    return-object v0
.end method

.method private final handleComplete()Z
    .locals 4

    new-instance v0, Lcom/android/mltcode/paycertificationapi/hv3;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/hv3;-><init>(Lcom/sma/smartv3/ui/device/ScheduleEditActivity;)V

    const/4 v1, 0x1

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static {v3, v0, v1, v2}, Lcom/android/mltcode/paycertificationapi/X0IOiX1O;->XIi00iiXO(ZLkotlin/jvm/functions/Function1;ILjava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method private static final handleComplete$lambda$0(Lcom/sma/smartv3/ui/device/ScheduleEditActivity;Lcom/szabh/smable3/component/BleConnector;)Lkotlin/Unit;
    .locals 10

    const-string v1, "it"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseActivity;->getMArg1()I

    move-result v1

    const/4 v3, 0x0

    const-string v4, "mSchedule"

    if-gez v1, :cond_1

    move-object v1, v3

    sget-object v3, Lcom/szabh/smable3/BleKey;->SCHEDULE:Lcom/szabh/smable3/BleKey;

    move-object v5, v4

    sget-object v4, Lcom/szabh/smable3/BleKeyFlag;->CREATE:Lcom/szabh/smable3/BleKeyFlag;

    iget-object v6, p0, Lcom/sma/smartv3/ui/device/ScheduleEditActivity;->mSchedule:Lcom/szabh/smable3/entity/BleSchedule;

    if-nez v6, :cond_0

    invoke-static {v5}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v5, v1

    goto :goto_0

    :cond_0
    move-object v5, v6

    :goto_0
    const/16 v8, 0x18

    const/4 v9, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    move-object v2, p1

    invoke-static/range {v2 .. v9}, Lcom/szabh/smable3/component/BaseBleConnector;->sendObject$default(Lcom/szabh/smable3/component/BaseBleConnector;Lcom/szabh/smable3/BleKey;Lcom/szabh/smable3/BleKeyFlag;Lcom/bestmafen/baseble/data/BleBuffer;ZZILjava/lang/Object;)Z

    goto :goto_2

    :cond_1
    move-object v1, v3

    move-object v5, v4

    sget-object v3, Lcom/szabh/smable3/BleKey;->SCHEDULE:Lcom/szabh/smable3/BleKey;

    sget-object v4, Lcom/szabh/smable3/BleKeyFlag;->UPDATE:Lcom/szabh/smable3/BleKeyFlag;

    iget-object v2, p0, Lcom/sma/smartv3/ui/device/ScheduleEditActivity;->mSchedule:Lcom/szabh/smable3/entity/BleSchedule;

    if-nez v2, :cond_2

    invoke-static {v5}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v5, v1

    goto :goto_1

    :cond_2
    move-object v5, v2

    :goto_1
    const/16 v8, 0x18

    const/4 v9, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    move-object v2, p1

    invoke-static/range {v2 .. v9}, Lcom/szabh/smable3/component/BaseBleConnector;->sendObject$default(Lcom/szabh/smable3/component/BaseBleConnector;Lcom/szabh/smable3/BleKey;Lcom/szabh/smable3/BleKeyFlag;Lcom/bestmafen/baseble/data/BleBuffer;ZZILjava/lang/Object;)Z

    :goto_2
    const/4 v1, -0x1

    invoke-virtual {p0, v1}, Landroid/app/Activity;->setResult(I)V

    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    sget-object v0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object v0
.end method

.method public static synthetic iIiiO(Lcom/sma/smartv3/ui/device/ScheduleEditActivity;Lcom/szabh/smable3/component/BleConnector;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Lcom/sma/smartv3/ui/device/ScheduleEditActivity;->handleComplete$lambda$0(Lcom/sma/smartv3/ui/device/ScheduleEditActivity;Lcom/szabh/smable3/component/BleConnector;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method private static final itemAdvance_delegate$lambda$0(Lcom/sma/smartv3/ui/device/ScheduleEditActivity;)Lcom/sma/smartv3/view/AbhSettingsItem;
    .locals 1

    const v0, 0x7f0a055f

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Lcom/sma/smartv3/view/AbhSettingsItem;

    return-object p0
.end method

.method private static final itemTime_delegate$lambda$0(Lcom/sma/smartv3/ui/device/ScheduleEditActivity;)Lcom/sma/smartv3/view/AbhSettingsItem;
    .locals 1

    const v0, 0x7f0a05ec

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Lcom/sma/smartv3/view/AbhSettingsItem;

    return-object p0
.end method

.method private static final itemTitle_delegate$lambda$0(Lcom/sma/smartv3/ui/device/ScheduleEditActivity;)Lcom/sma/smartv3/view/AbhSettingsItem;
    .locals 1

    const v0, 0x7f0a05f2

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Lcom/sma/smartv3/view/AbhSettingsItem;

    return-object p0
.end method

.method private static final onBottomClick$lambda$0$0(Lcom/sma/smartv3/ui/device/ScheduleEditActivity;)Z
    .locals 3

    new-instance v0, Lcom/android/mltcode/paycertificationapi/ev3;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/ev3;-><init>(Lcom/sma/smartv3/ui/device/ScheduleEditActivity;)V

    const/4 p0, 0x1

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-static {v2, v0, p0, v1}, Lcom/android/mltcode/paycertificationapi/X0IOiX1O;->XIi00iiXO(ZLkotlin/jvm/functions/Function1;ILjava/lang/Object;)Z

    move-result p0

    return p0
.end method

.method private static final onBottomClick$lambda$0$0$0(Lcom/sma/smartv3/ui/device/ScheduleEditActivity;Lcom/szabh/smable3/component/BleConnector;)Lkotlin/Unit;
    .locals 9

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v2, Lcom/szabh/smable3/BleKey;->SCHEDULE:Lcom/szabh/smable3/BleKey;

    sget-object v3, Lcom/szabh/smable3/BleKeyFlag;->DELETE:Lcom/szabh/smable3/BleKeyFlag;

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/ScheduleEditActivity;->mSchedule:Lcom/szabh/smable3/entity/BleSchedule;

    if-nez v0, :cond_0

    const-string v0, "mSchedule"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    const/4 v0, 0x0

    :cond_0
    invoke-virtual {v0}, Lcom/szabh/smable3/entity/BleIdObject;->getMId()I

    move-result v4

    const/16 v7, 0x18

    const/4 v8, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    move-object v1, p1

    invoke-static/range {v1 .. v8}, Lcom/szabh/smable3/component/BaseBleConnector;->sendInt8$default(Lcom/szabh/smable3/component/BaseBleConnector;Lcom/szabh/smable3/BleKey;Lcom/szabh/smable3/BleKeyFlag;IZZILjava/lang/Object;)Z

    const/4 p1, -0x1

    invoke-virtual {p0, p1}, Landroid/app/Activity;->setResult(I)V

    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    sget-object p0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p0
.end method

.method private static final onSetAdvance$lambda$0$0(Lcom/sma/smartv3/ui/device/ScheduleEditActivity;I)Z
    .locals 4

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/sma/smartv3/ui/device/ScheduleEditActivity;->isEdited:Z

    iget-object v1, p0, Lcom/sma/smartv3/ui/device/ScheduleEditActivity;->mSchedule:Lcom/szabh/smable3/entity/BleSchedule;

    const/4 v2, 0x0

    const-string v3, "mSchedule"

    if-nez v1, :cond_0

    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v1, v2

    :cond_0
    invoke-static {p1}, Lcom/android/mltcode/paycertificationapi/cp5;->XO0O10(I)I

    move-result p1

    invoke-virtual {v1, p1}, Lcom/szabh/smable3/entity/BleSchedule;->setMAdvance(I)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/ScheduleEditActivity;->getItemAdvance()Lcom/sma/smartv3/view/AbhSettingsItem;

    move-result-object p1

    iget-object p0, p0, Lcom/sma/smartv3/ui/device/ScheduleEditActivity;->mSchedule:Lcom/szabh/smable3/entity/BleSchedule;

    if-nez p0, :cond_1

    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    goto :goto_0

    :cond_1
    move-object v2, p0

    :goto_0
    invoke-virtual {v2}, Lcom/szabh/smable3/entity/BleSchedule;->getMAdvance()I

    move-result p0

    invoke-static {p0}, Lcom/android/mltcode/paycertificationapi/cp5;->IiI10X(I)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p1, p0}, Lcom/sma/smartv3/view/AbhSettingsItem;->setMRightText(Ljava/lang/String;)V

    return v0
.end method

.method private static final onSetDateTime$lambda$0$0(Lcom/sma/smartv3/ui/device/ScheduleEditActivity;IIIII)Z
    .locals 4

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/sma/smartv3/ui/device/ScheduleEditActivity;->isEdited:Z

    iget-object v1, p0, Lcom/sma/smartv3/ui/device/ScheduleEditActivity;->mSchedule:Lcom/szabh/smable3/entity/BleSchedule;

    const/4 v2, 0x0

    const-string v3, "mSchedule"

    if-nez v1, :cond_0

    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v1, v2

    :cond_0
    invoke-virtual {v1, p1}, Lcom/szabh/smable3/entity/BleSchedule;->setMYear(I)V

    iget-object p1, p0, Lcom/sma/smartv3/ui/device/ScheduleEditActivity;->mSchedule:Lcom/szabh/smable3/entity/BleSchedule;

    if-nez p1, :cond_1

    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object p1, v2

    :cond_1
    invoke-virtual {p1, p2}, Lcom/szabh/smable3/entity/BleSchedule;->setMMonth(I)V

    iget-object p1, p0, Lcom/sma/smartv3/ui/device/ScheduleEditActivity;->mSchedule:Lcom/szabh/smable3/entity/BleSchedule;

    if-nez p1, :cond_2

    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object p1, v2

    :cond_2
    invoke-virtual {p1, p3}, Lcom/szabh/smable3/entity/BleSchedule;->setMDay(I)V

    iget-object p1, p0, Lcom/sma/smartv3/ui/device/ScheduleEditActivity;->mSchedule:Lcom/szabh/smable3/entity/BleSchedule;

    if-nez p1, :cond_3

    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object p1, v2

    :cond_3
    invoke-virtual {p1, p4}, Lcom/szabh/smable3/entity/BleSchedule;->setMHour(I)V

    iget-object p1, p0, Lcom/sma/smartv3/ui/device/ScheduleEditActivity;->mSchedule:Lcom/szabh/smable3/entity/BleSchedule;

    if-nez p1, :cond_4

    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object p1, v2

    :cond_4
    invoke-virtual {p1, p5}, Lcom/szabh/smable3/entity/BleSchedule;->setMMinute(I)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/ScheduleEditActivity;->getItemTime()Lcom/sma/smartv3/view/AbhSettingsItem;

    move-result-object p1

    iget-object p2, p0, Lcom/sma/smartv3/ui/device/ScheduleEditActivity;->mDateFormat:Ljava/text/SimpleDateFormat;

    iget-object p0, p0, Lcom/sma/smartv3/ui/device/ScheduleEditActivity;->mSchedule:Lcom/szabh/smable3/entity/BleSchedule;

    if-nez p0, :cond_5

    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    goto :goto_0

    :cond_5
    move-object v2, p0

    :goto_0
    invoke-static {v2}, Lcom/android/mltcode/paycertificationapi/cw3;->OXO1(Lcom/szabh/smable3/entity/BleSchedule;)Ljava/util/Date;

    move-result-object p0

    invoke-virtual {p2, p0}, Ljava/text/DateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object p0

    const-string p2, "format(...)"

    invoke-static {p0, p2}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1, p0}, Lcom/sma/smartv3/view/AbhSettingsItem;->setMRightText(Ljava/lang/String;)V

    return v0
.end method

.method private static final onTitleLeftClick$lambda$0$0(Lcom/sma/smartv3/ui/device/ScheduleEditActivity;)Z
    .locals 0

    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    const/4 p0, 0x1

    return p0
.end method

.method private static final onTitleLeftClick$lambda$0$1(Lcom/sma/smartv3/ui/device/ScheduleEditActivity;)Z
    .locals 0

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/ScheduleEditActivity;->handleComplete()Z

    move-result p0

    return p0
.end method

.method private static final rootView_delegate$lambda$0(Lcom/sma/smartv3/ui/device/ScheduleEditActivity;)Landroid/view/View;
    .locals 1

    const v0, 0x7f0a09af

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public init(Landroid/os/Bundle;)V
    .locals 11
    .param p1    # Landroid/os/Bundle;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseActivity;->getMArg1()I

    move-result p1

    if-gez p1, :cond_0

    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object p1

    new-instance v0, Lcom/szabh/smable3/entity/BleSchedule;

    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    invoke-static {p1}, Lcom/android/mltcode/paycertificationapi/OIi1iX;->O10IXXX0X(Ljava/util/Calendar;)I

    move-result v1

    invoke-static {p1}, Lcom/android/mltcode/paycertificationapi/OIi1iX;->OIX0iXi(Ljava/util/Calendar;)I

    move-result v2

    invoke-static {p1}, Lcom/android/mltcode/paycertificationapi/OIi1iX;->XIi00iiXO(Ljava/util/Calendar;)I

    move-result v3

    invoke-static {p1}, Lcom/android/mltcode/paycertificationapi/OIi1iX;->XOO0ii0(Ljava/util/Calendar;)I

    move-result v4

    invoke-static {p1}, Lcom/android/mltcode/paycertificationapi/OIi1iX;->OIi0(Ljava/util/Calendar;)I

    move-result v5

    const/16 v9, 0xe0

    const/4 v10, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    invoke-direct/range {v0 .. v10}, Lcom/szabh/smable3/entity/BleSchedule;-><init>(IIIIIILjava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    goto :goto_0

    :cond_0
    sget-object v1, Lcom/szabh/smable3/component/BleCache;->INSTANCE:Lcom/szabh/smable3/component/BleCache;

    sget-object v2, Lcom/szabh/smable3/BleKey;->SCHEDULE:Lcom/szabh/smable3/BleKey;

    const/4 v5, 0x4

    const/4 v6, 0x0

    const-class v3, Lcom/szabh/smable3/entity/BleSchedule;

    const/4 v4, 0x0

    invoke-static/range {v1 .. v6}, Lcom/szabh/smable3/component/BaseBleCache;->getList$default(Lcom/szabh/smable3/component/BaseBleCache;Lcom/szabh/smable3/BleKey;Ljava/lang/Class;Lcom/szabh/smable3/BleKeyFlag;ILjava/lang/Object;)Ljava/util/List;

    move-result-object p1

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseActivity;->getMArg1()I

    move-result v0

    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    move-object v0, p1

    check-cast v0, Lcom/szabh/smable3/entity/BleSchedule;

    :goto_0
    iput-object v0, p0, Lcom/sma/smartv3/ui/device/ScheduleEditActivity;->mSchedule:Lcom/szabh/smable3/entity/BleSchedule;

    return-void
.end method

.method public initView()V
    .locals 5

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseActivity;->getMArg1()I

    move-result v0

    const/4 v1, 0x0

    const v2, 0x7f0a01b9

    const v3, 0x7f0a0023

    if-gez v0, :cond_0

    invoke-virtual {p0, v3}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    const v3, 0x7f140087

    invoke-virtual {v0, v3}, Landroid/widget/TextView;->setText(I)V

    invoke-virtual {p0, v2}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    const/16 v2, 0x8

    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    goto :goto_0

    :cond_0
    invoke-virtual {p0, v3}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    const v3, 0x7f1404c0

    invoke-virtual {v0, v3}, Landroid/widget/TextView;->setText(I)V

    invoke-virtual {p0, v2}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    :goto_0
    const v0, 0x7f0a0026

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    const v2, 0x7f080ffc

    invoke-virtual {v0, v2}, Landroid/widget/ImageView;->setImageResource(I)V

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/ScheduleEditActivity;->getItemTitle()Lcom/sma/smartv3/view/AbhSettingsItem;

    move-result-object v0

    iget-object v1, p0, Lcom/sma/smartv3/ui/device/ScheduleEditActivity;->mSchedule:Lcom/szabh/smable3/entity/BleSchedule;

    const/4 v2, 0x0

    const-string v3, "mSchedule"

    if-nez v1, :cond_1

    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v1, v2

    :cond_1
    invoke-virtual {v1}, Lcom/szabh/smable3/entity/BleSchedule;->getMTitle()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/sma/smartv3/view/AbhSettingsItem;->setMRightText(Ljava/lang/String;)V

    invoke-virtual {v0}, Lcom/sma/smartv3/view/AbhSettingsItem;->getEdtValue()Landroid/widget/EditText;

    move-result-object v0

    new-instance v1, Lcom/sma/smartv3/ui/device/ScheduleEditActivity$OXO1;

    invoke-direct {v1, p0}, Lcom/sma/smartv3/ui/device/ScheduleEditActivity$OXO1;-><init>(Lcom/sma/smartv3/ui/device/ScheduleEditActivity;)V

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->addTextChangedListener(Landroid/text/TextWatcher;)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/ScheduleEditActivity;->getItemTime()Lcom/sma/smartv3/view/AbhSettingsItem;

    move-result-object v0

    iget-object v1, p0, Lcom/sma/smartv3/ui/device/ScheduleEditActivity;->mDateFormat:Ljava/text/SimpleDateFormat;

    iget-object v4, p0, Lcom/sma/smartv3/ui/device/ScheduleEditActivity;->mSchedule:Lcom/szabh/smable3/entity/BleSchedule;

    if-nez v4, :cond_2

    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v4, v2

    :cond_2
    invoke-static {v4}, Lcom/android/mltcode/paycertificationapi/cw3;->OXO1(Lcom/szabh/smable3/entity/BleSchedule;)Ljava/util/Date;

    move-result-object v4

    invoke-virtual {v1, v4}, Ljava/text/DateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v1

    const-string v4, "format(...)"

    invoke-static {v1, v4}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Lcom/sma/smartv3/view/AbhSettingsItem;->setMRightText(Ljava/lang/String;)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/ScheduleEditActivity;->getItemAdvance()Lcom/sma/smartv3/view/AbhSettingsItem;

    move-result-object v0

    iget-object v1, p0, Lcom/sma/smartv3/ui/device/ScheduleEditActivity;->mSchedule:Lcom/szabh/smable3/entity/BleSchedule;

    if-nez v1, :cond_3

    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v1, v2

    :cond_3
    invoke-virtual {v1}, Lcom/szabh/smable3/entity/BleSchedule;->getMAdvance()I

    move-result v1

    invoke-static {v1}, Lcom/android/mltcode/paycertificationapi/cp5;->IiI10X(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/sma/smartv3/view/AbhSettingsItem;->setMRightText(Ljava/lang/String;)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/ScheduleEditActivity;->getEdtContent()Landroid/widget/EditText;

    move-result-object v0

    iget-object v1, p0, Lcom/sma/smartv3/ui/device/ScheduleEditActivity;->mSchedule:Lcom/szabh/smable3/entity/BleSchedule;

    if-nez v1, :cond_4

    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    goto :goto_1

    :cond_4
    move-object v2, v1

    :goto_1
    invoke-virtual {v2}, Lcom/szabh/smable3/entity/BleSchedule;->getMContent()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/ScheduleEditActivity;->getEdtTip()Landroid/widget/TextView;

    move-result-object v1

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/ScheduleEditActivity;->getEdtTip()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    new-instance v1, Lcom/sma/smartv3/ui/device/ScheduleEditActivity$XIi00iiXO;

    invoke-direct {v1, p0}, Lcom/sma/smartv3/ui/device/ScheduleEditActivity$XIi00iiXO;-><init>(Lcom/sma/smartv3/ui/device/ScheduleEditActivity;)V

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->addTextChangedListener(Landroid/text/TextWatcher;)V

    return-void
.end method

.method public layoutId()I
    .locals 1

    const v0, 0x7f0d00f3

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

    iget-object p1, p0, Lcom/sma/smartv3/ui/device/ScheduleEditActivity;->mDeletePopup:Lcom/android/mltcode/paycertificationapi/go0;

    if-nez p1, :cond_0

    new-instance p1, Lcom/android/mltcode/paycertificationapi/go0;

    const/4 v0, 0x0

    const/4 v1, 0x2

    const/4 v2, 0x0

    invoke-direct {p1, p0, v0, v1, v2}, Lcom/android/mltcode/paycertificationapi/go0;-><init>(Landroid/app/Activity;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const v0, 0x7f1403e7

    invoke-virtual {p1, v0}, Lcom/android/mltcode/paycertificationapi/go0;->O1O(I)V

    const v0, 0x7f14027f

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {p1, v0, v2, v1, v2}, Lcom/android/mltcode/paycertificationapi/go0;->X11iII1O1(Lcom/android/mltcode/paycertificationapi/go0;Ljava/lang/Integer;Lkotlin/jvm/functions/Function0;ILjava/lang/Object;)V

    new-instance v0, Lcom/android/mltcode/paycertificationapi/av3;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/av3;-><init>(Lcom/sma/smartv3/ui/device/ScheduleEditActivity;)V

    const v1, 0x7f1403db

    invoke-virtual {p1, v1, v0}, Lcom/android/mltcode/paycertificationapi/go0;->X1IX(ILkotlin/jvm/functions/Function0;)V

    iput-object p1, p0, Lcom/sma/smartv3/ui/device/ScheduleEditActivity;->mDeletePopup:Lcom/android/mltcode/paycertificationapi/go0;

    :cond_0
    iget-object p1, p0, Lcom/sma/smartv3/ui/device/ScheduleEditActivity;->mDeletePopup:Lcom/android/mltcode/paycertificationapi/go0;

    if-eqz p1, :cond_1

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/ScheduleEditActivity;->getRootView()Landroid/view/View;

    move-result-object v0

    const-string v1, "<get-rootView>(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1, v0}, Lcom/android/mltcode/paycertificationapi/I0OIO1i;->I1XOi1(Landroid/view/View;)V

    :cond_1
    return-void
.end method

.method public final onSetAdvance(Landroid/view/View;)V
    .locals 2
    .param p1    # Landroid/view/View;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "view"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, Lcom/sma/smartv3/ui/device/ScheduleEditActivity;->mAdvancePopup:Lcom/android/mltcode/paycertificationapi/pv1;

    if-nez p1, :cond_0

    new-instance p1, Lcom/android/mltcode/paycertificationapi/pv1;

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseActivity;->getMContext()Landroid/app/Activity;

    move-result-object v0

    const v1, 0x7f030041

    invoke-direct {p1, v0, v1}, Lcom/android/mltcode/paycertificationapi/pv1;-><init>(Landroid/app/Activity;I)V

    const v0, 0x7f141188

    invoke-virtual {p1, v0}, Lcom/android/mltcode/paycertificationapi/pv1;->iX(I)V

    new-instance v0, Lcom/android/mltcode/paycertificationapi/gv3;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/gv3;-><init>(Lcom/sma/smartv3/ui/device/ScheduleEditActivity;)V

    invoke-virtual {p1, v0}, Lcom/android/mltcode/paycertificationapi/pv1;->i010I(Lkotlin/jvm/functions/Function1;)V

    iput-object p1, p0, Lcom/sma/smartv3/ui/device/ScheduleEditActivity;->mAdvancePopup:Lcom/android/mltcode/paycertificationapi/pv1;

    :cond_0
    iget-object p1, p0, Lcom/sma/smartv3/ui/device/ScheduleEditActivity;->mAdvancePopup:Lcom/android/mltcode/paycertificationapi/pv1;

    if-eqz p1, :cond_2

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/ScheduleEditActivity;->mSchedule:Lcom/szabh/smable3/entity/BleSchedule;

    if-nez v0, :cond_1

    const-string v0, "mSchedule"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    const/4 v0, 0x0

    :cond_1
    invoke-virtual {v0}, Lcom/szabh/smable3/entity/BleSchedule;->getMAdvance()I

    move-result v0

    invoke-static {v0}, Lcom/android/mltcode/paycertificationapi/cp5;->O00(I)I

    move-result v0

    invoke-virtual {p1, v0}, Lcom/android/mltcode/paycertificationapi/pv1;->iOO1ii1(I)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/ScheduleEditActivity;->getRootView()Landroid/view/View;

    move-result-object v0

    const-string v1, "<get-rootView>(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1, v0}, Lcom/android/mltcode/paycertificationapi/I0OIO1i;->I1XOi1(Landroid/view/View;)V

    :cond_2
    return-void
.end method

.method public final onSetDateTime(Landroid/view/View;)V
    .locals 7
    .param p1    # Landroid/view/View;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "view"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, Lcom/sma/smartv3/ui/device/ScheduleEditActivity;->mDateTimePopup:Lcom/android/mltcode/paycertificationapi/OXIOI1;

    if-nez p1, :cond_0

    new-instance p1, Lcom/android/mltcode/paycertificationapi/OXIOI1;

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseActivity;->getMContext()Landroid/app/Activity;

    move-result-object v0

    sget-object v1, Lcom/android/mltcode/paycertificationapi/i72;->OXO1:Lcom/android/mltcode/paycertificationapi/i72;

    invoke-virtual {v1}, Lcom/android/mltcode/paycertificationapi/i72;->i0X000X0O()Z

    move-result v1

    invoke-direct {p1, v0, v1}, Lcom/android/mltcode/paycertificationapi/OXIOI1;-><init>(Landroid/app/Activity;Z)V

    new-instance v0, Lcom/android/mltcode/paycertificationapi/fv3;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/fv3;-><init>(Lcom/sma/smartv3/ui/device/ScheduleEditActivity;)V

    invoke-virtual {p1, v0}, Lcom/android/mltcode/paycertificationapi/OXIOI1;->i010I(Lkotlin/jvm/functions/Function5;)V

    iput-object p1, p0, Lcom/sma/smartv3/ui/device/ScheduleEditActivity;->mDateTimePopup:Lcom/android/mltcode/paycertificationapi/OXIOI1;

    :cond_0
    iget-object v1, p0, Lcom/sma/smartv3/ui/device/ScheduleEditActivity;->mDateTimePopup:Lcom/android/mltcode/paycertificationapi/OXIOI1;

    if-eqz v1, :cond_6

    iget-object p1, p0, Lcom/sma/smartv3/ui/device/ScheduleEditActivity;->mSchedule:Lcom/szabh/smable3/entity/BleSchedule;

    const/4 v0, 0x0

    const-string v2, "mSchedule"

    if-nez p1, :cond_1

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object p1, v0

    :cond_1
    invoke-virtual {p1}, Lcom/szabh/smable3/entity/BleSchedule;->getMYear()I

    move-result p1

    iget-object v3, p0, Lcom/sma/smartv3/ui/device/ScheduleEditActivity;->mSchedule:Lcom/szabh/smable3/entity/BleSchedule;

    if-nez v3, :cond_2

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v3, v0

    :cond_2
    invoke-virtual {v3}, Lcom/szabh/smable3/entity/BleSchedule;->getMMonth()I

    move-result v3

    iget-object v4, p0, Lcom/sma/smartv3/ui/device/ScheduleEditActivity;->mSchedule:Lcom/szabh/smable3/entity/BleSchedule;

    if-nez v4, :cond_3

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v4, v0

    :cond_3
    invoke-virtual {v4}, Lcom/szabh/smable3/entity/BleSchedule;->getMDay()I

    move-result v4

    iget-object v5, p0, Lcom/sma/smartv3/ui/device/ScheduleEditActivity;->mSchedule:Lcom/szabh/smable3/entity/BleSchedule;

    if-nez v5, :cond_4

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v5, v0

    :cond_4
    invoke-virtual {v5}, Lcom/szabh/smable3/entity/BleSchedule;->getMHour()I

    move-result v5

    iget-object v6, p0, Lcom/sma/smartv3/ui/device/ScheduleEditActivity;->mSchedule:Lcom/szabh/smable3/entity/BleSchedule;

    if-nez v6, :cond_5

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    goto :goto_0

    :cond_5
    move-object v0, v6

    :goto_0
    invoke-virtual {v0}, Lcom/szabh/smable3/entity/BleSchedule;->getMMinute()I

    move-result v6

    move v2, p1

    invoke-virtual/range {v1 .. v6}, Lcom/android/mltcode/paycertificationapi/OXIOI1;->II1Xi0(IIIII)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/ScheduleEditActivity;->getRootView()Landroid/view/View;

    move-result-object p1

    const-string v0, "<get-rootView>(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Lcom/android/mltcode/paycertificationapi/I0OIO1i;->I1XOi1(Landroid/view/View;)V

    :cond_6
    return-void
.end method

.method public final onTitleLeftClick(Landroid/view/View;)V
    .locals 3
    .param p1    # Landroid/view/View;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "view"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iget-boolean p1, p0, Lcom/sma/smartv3/ui/device/ScheduleEditActivity;->isEdited:Z

    if-eqz p1, :cond_2

    iget-object p1, p0, Lcom/sma/smartv3/ui/device/ScheduleEditActivity;->mSaveTipPopup:Lcom/android/mltcode/paycertificationapi/go0;

    if-nez p1, :cond_0

    new-instance p1, Lcom/android/mltcode/paycertificationapi/go0;

    const/4 v0, 0x2

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-direct {p1, p0, v2, v0, v1}, Lcom/android/mltcode/paycertificationapi/go0;-><init>(Landroid/app/Activity;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const v0, 0x7f14150f

    invoke-virtual {p1, v0}, Lcom/android/mltcode/paycertificationapi/go0;->O1O(I)V

    const v0, 0x7f140c53

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, Lcom/android/mltcode/paycertificationapi/cv3;

    invoke-direct {v1, p0}, Lcom/android/mltcode/paycertificationapi/cv3;-><init>(Lcom/sma/smartv3/ui/device/ScheduleEditActivity;)V

    invoke-virtual {p1, v0, v1}, Lcom/android/mltcode/paycertificationapi/go0;->iX1O1(Ljava/lang/Integer;Lkotlin/jvm/functions/Function0;)V

    new-instance v0, Lcom/android/mltcode/paycertificationapi/dv3;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/dv3;-><init>(Lcom/sma/smartv3/ui/device/ScheduleEditActivity;)V

    const v1, 0x7f1411c4

    invoke-virtual {p1, v1, v0}, Lcom/android/mltcode/paycertificationapi/go0;->X1IX(ILkotlin/jvm/functions/Function0;)V

    iput-object p1, p0, Lcom/sma/smartv3/ui/device/ScheduleEditActivity;->mSaveTipPopup:Lcom/android/mltcode/paycertificationapi/go0;

    :cond_0
    iget-object p1, p0, Lcom/sma/smartv3/ui/device/ScheduleEditActivity;->mSaveTipPopup:Lcom/android/mltcode/paycertificationapi/go0;

    if-eqz p1, :cond_1

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/ScheduleEditActivity;->getRootView()Landroid/view/View;

    move-result-object v0

    const-string v1, "<get-rootView>(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1, v0}, Lcom/android/mltcode/paycertificationapi/I0OIO1i;->I1XOi1(Landroid/view/View;)V

    :cond_1
    return-void

    :cond_2
    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    return-void
.end method

.method public final onTitleRightClick(Landroid/view/View;)V
    .locals 1
    .param p1    # Landroid/view/View;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "view"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/ScheduleEditActivity;->handleComplete()Z

    return-void
.end method
