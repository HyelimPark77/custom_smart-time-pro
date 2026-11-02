.class public final Lcom/sma/smartv3/ui/device/AlarmEditActivity;
.super Lcom/bestmafen/androidbase/base/BaseActivity;
.source "SourceFile"


# instance fields
.field private isEdited:Z

.field private final itemLabel$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final itemRepeat$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private mAlarm:Lcom/szabh/smable3/entity/BleAlarm;

.field private mDeletePopup:Lcom/android/mltcode/paycertificationapi/go0;
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation
.end field

.field private mRepeatPopup:Lcom/android/mltcode/paycertificationapi/jv0;
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation
.end field

.field private mSaveTipPopup:Lcom/android/mltcode/paycertificationapi/go0;
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation
.end field

.field private final rootView$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lcom/bestmafen/androidbase/base/BaseActivity;-><init>()V

    new-instance v0, Lcom/android/mltcode/paycertificationapi/O1Xi;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/O1Xi;-><init>(Lcom/sma/smartv3/ui/device/AlarmEditActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/AlarmEditActivity;->rootView$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/IO0iX;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/IO0iX;-><init>(Lcom/sma/smartv3/ui/device/AlarmEditActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/AlarmEditActivity;->itemRepeat$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/IO0i0OXIX;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/IO0i0OXIX;-><init>(Lcom/sma/smartv3/ui/device/AlarmEditActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/AlarmEditActivity;->itemLabel$delegate:Lkotlin/Lazy;

    return-void
.end method

.method public static synthetic I0iXXO(Lcom/sma/smartv3/ui/device/AlarmEditActivity;)Z
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/device/AlarmEditActivity;->onBottomClick$lambda$0$0(Lcom/sma/smartv3/ui/device/AlarmEditActivity;)Z

    move-result p0

    return p0
.end method

.method public static synthetic I1XOi1(Lcom/sma/smartv3/ui/device/AlarmEditActivity;)Z
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/device/AlarmEditActivity;->onTitleLeftClick$lambda$0$0(Lcom/sma/smartv3/ui/device/AlarmEditActivity;)Z

    move-result p0

    return p0
.end method

.method public static synthetic IIX1OXO(Lcom/sma/smartv3/ui/device/AlarmEditActivity;)Lcom/sma/smartv3/view/AbhSettingsItem;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/device/AlarmEditActivity;->itemRepeat_delegate$lambda$0(Lcom/sma/smartv3/ui/device/AlarmEditActivity;)Lcom/sma/smartv3/view/AbhSettingsItem;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic O10IXXX0X(Lcom/sma/smartv3/ui/device/AlarmEditActivity;)Z
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/device/AlarmEditActivity;->onTitleLeftClick$lambda$0$1(Lcom/sma/smartv3/ui/device/AlarmEditActivity;)Z

    move-result p0

    return p0
.end method

.method public static synthetic OIX0iXi(Lcom/sma/smartv3/ui/device/AlarmEditActivity;II)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/sma/smartv3/ui/device/AlarmEditActivity;->initView$lambda$1$0(Lcom/sma/smartv3/ui/device/AlarmEditActivity;II)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic X0O(Lcom/sma/smartv3/ui/device/AlarmEditActivity;)Landroid/view/View;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/device/AlarmEditActivity;->rootView_delegate$lambda$0(Lcom/sma/smartv3/ui/device/AlarmEditActivity;)Landroid/view/View;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic X1ii(Lcom/sma/smartv3/ui/device/AlarmEditActivity;)Lcom/sma/smartv3/view/AbhSettingsItem;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/device/AlarmEditActivity;->itemLabel_delegate$lambda$0(Lcom/sma/smartv3/ui/device/AlarmEditActivity;)Lcom/sma/smartv3/view/AbhSettingsItem;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic XXI(Lcom/sma/smartv3/ui/device/AlarmEditActivity;Lcom/szabh/smable3/component/BleConnector;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Lcom/sma/smartv3/ui/device/AlarmEditActivity;->handleComplete$lambda$0(Lcom/sma/smartv3/ui/device/AlarmEditActivity;Lcom/szabh/smable3/component/BleConnector;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic XiOIO(Lcom/sma/smartv3/ui/device/AlarmEditActivity;Ljava/util/Set;)Z
    .locals 0

    invoke-static {p0, p1}, Lcom/sma/smartv3/ui/device/AlarmEditActivity;->onSetRepeat$lambda$0$0(Lcom/sma/smartv3/ui/device/AlarmEditActivity;Ljava/util/Set;)Z

    move-result p0

    return p0
.end method

.method private final getItemLabel()Lcom/sma/smartv3/view/AbhSettingsItem;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/AlarmEditActivity;->itemLabel$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/sma/smartv3/view/AbhSettingsItem;

    return-object v0
.end method

.method private final getItemRepeat()Lcom/sma/smartv3/view/AbhSettingsItem;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/AlarmEditActivity;->itemRepeat$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/sma/smartv3/view/AbhSettingsItem;

    return-object v0
.end method

.method private final getRootView()Landroid/view/View;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/AlarmEditActivity;->rootView$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    return-object v0
.end method

.method private final handleComplete()Z
    .locals 2

    new-instance v0, Lcom/android/mltcode/paycertificationapi/O0XiO10;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/O0XiO10;-><init>(Lcom/sma/smartv3/ui/device/AlarmEditActivity;)V

    const/4 v1, 0x0

    invoke-static {v1, v0}, Lcom/android/mltcode/paycertificationapi/X0IOiX1O;->OXO1(ZLkotlin/jvm/functions/Function1;)Z

    move-result v0

    return v0
.end method

.method private static final handleComplete$lambda$0(Lcom/sma/smartv3/ui/device/AlarmEditActivity;Lcom/szabh/smable3/component/BleConnector;)Lkotlin/Unit;
    .locals 10

    const-string v1, "it"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v1, p0, Lcom/sma/smartv3/ui/device/AlarmEditActivity;->mAlarm:Lcom/szabh/smable3/entity/BleAlarm;

    const/4 v3, 0x0

    const-string v4, "mAlarm"

    if-nez v1, :cond_0

    invoke-static {v4}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v1, v3

    :cond_0
    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/AlarmEditActivity;->getItemLabel()Lcom/sma/smartv3/view/AbhSettingsItem;

    move-result-object v5

    invoke-virtual {v5}, Lcom/sma/smartv3/view/AbhSettingsItem;->getRightText()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v1, v5}, Lcom/szabh/smable3/entity/BleAlarm;->setMTag(Ljava/lang/String;)V

    iget-object v1, p0, Lcom/sma/smartv3/ui/device/AlarmEditActivity;->mAlarm:Lcom/szabh/smable3/entity/BleAlarm;

    if-nez v1, :cond_1

    invoke-static {v4}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v1, v3

    :cond_1
    invoke-virtual {v1}, Lcom/szabh/smable3/entity/BleAlarm;->getMRepeat()I

    move-result v1

    if-nez v1, :cond_6

    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v1

    iget-object v5, p0, Lcom/sma/smartv3/ui/device/AlarmEditActivity;->mAlarm:Lcom/szabh/smable3/entity/BleAlarm;

    if-nez v5, :cond_2

    invoke-static {v4}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v5, v3

    :cond_2
    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    invoke-static {v1}, Lcom/android/mltcode/paycertificationapi/OIi1iX;->O10IXXX0X(Ljava/util/Calendar;)I

    move-result v6

    invoke-virtual {v5, v6}, Lcom/szabh/smable3/entity/BleAlarm;->setMYear(I)V

    iget-object v5, p0, Lcom/sma/smartv3/ui/device/AlarmEditActivity;->mAlarm:Lcom/szabh/smable3/entity/BleAlarm;

    if-nez v5, :cond_3

    invoke-static {v4}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v5, v3

    :cond_3
    invoke-static {v1}, Lcom/android/mltcode/paycertificationapi/OIi1iX;->OIX0iXi(Ljava/util/Calendar;)I

    move-result v6

    invoke-virtual {v5, v6}, Lcom/szabh/smable3/entity/BleAlarm;->setMMonth(I)V

    iget-object v5, p0, Lcom/sma/smartv3/ui/device/AlarmEditActivity;->mAlarm:Lcom/szabh/smable3/entity/BleAlarm;

    if-nez v5, :cond_4

    invoke-static {v4}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v5, v3

    :cond_4
    invoke-static {v1}, Lcom/android/mltcode/paycertificationapi/OIi1iX;->XIi00iiXO(Ljava/util/Calendar;)I

    move-result v1

    invoke-virtual {v5, v1}, Lcom/szabh/smable3/entity/BleAlarm;->setMDay(I)V

    sget-object v1, Lcom/sma/smartv3/ui/device/AlarmsActivity;->Companion:Lcom/sma/smartv3/ui/device/AlarmsActivity$OXO1;

    iget-object v5, p0, Lcom/sma/smartv3/ui/device/AlarmEditActivity;->mAlarm:Lcom/szabh/smable3/entity/BleAlarm;

    if-nez v5, :cond_5

    invoke-static {v4}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v5, v3

    :cond_5
    invoke-virtual {v1, v5}, Lcom/sma/smartv3/ui/device/AlarmsActivity$OXO1;->OXO1(Lcom/szabh/smable3/entity/BleAlarm;)Z

    :cond_6
    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseActivity;->getMArg1()I

    move-result v1

    if-gez v1, :cond_8

    move-object v1, v3

    sget-object v3, Lcom/szabh/smable3/BleKey;->ALARM:Lcom/szabh/smable3/BleKey;

    move-object v5, v4

    sget-object v4, Lcom/szabh/smable3/BleKeyFlag;->CREATE:Lcom/szabh/smable3/BleKeyFlag;

    iget-object v6, p0, Lcom/sma/smartv3/ui/device/AlarmEditActivity;->mAlarm:Lcom/szabh/smable3/entity/BleAlarm;

    if-nez v6, :cond_7

    invoke-static {v5}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v5, v1

    goto :goto_0

    :cond_7
    move-object v5, v6

    :goto_0
    const/16 v8, 0x18

    const/4 v9, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    move-object v2, p1

    invoke-static/range {v2 .. v9}, Lcom/szabh/smable3/component/BaseBleConnector;->sendObject$default(Lcom/szabh/smable3/component/BaseBleConnector;Lcom/szabh/smable3/BleKey;Lcom/szabh/smable3/BleKeyFlag;Lcom/bestmafen/baseble/data/BleBuffer;ZZILjava/lang/Object;)Z

    goto :goto_2

    :cond_8
    move-object v1, v3

    move-object v5, v4

    iget-object v2, p0, Lcom/sma/smartv3/ui/device/AlarmEditActivity;->mAlarm:Lcom/szabh/smable3/entity/BleAlarm;

    if-nez v2, :cond_9

    invoke-static {v5}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v2, v1

    :cond_9
    const/4 v3, 0x1

    invoke-virtual {v2, v3}, Lcom/szabh/smable3/entity/BleAlarm;->setMEnabled(I)V

    sget-object v3, Lcom/szabh/smable3/BleKey;->ALARM:Lcom/szabh/smable3/BleKey;

    sget-object v4, Lcom/szabh/smable3/BleKeyFlag;->UPDATE:Lcom/szabh/smable3/BleKeyFlag;

    iget-object v2, p0, Lcom/sma/smartv3/ui/device/AlarmEditActivity;->mAlarm:Lcom/szabh/smable3/entity/BleAlarm;

    if-nez v2, :cond_a

    invoke-static {v5}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v5, v1

    goto :goto_1

    :cond_a
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

.method public static synthetic iIiiO(Lcom/sma/smartv3/ui/device/AlarmEditActivity;Lcom/szabh/smable3/component/BleConnector;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Lcom/sma/smartv3/ui/device/AlarmEditActivity;->onBottomClick$lambda$0$0$0(Lcom/sma/smartv3/ui/device/AlarmEditActivity;Lcom/szabh/smable3/component/BleConnector;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method private static final initView$lambda$1$0(Lcom/sma/smartv3/ui/device/AlarmEditActivity;II)Lkotlin/Unit;
    .locals 3

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/sma/smartv3/ui/device/AlarmEditActivity;->isEdited:Z

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/AlarmEditActivity;->mAlarm:Lcom/szabh/smable3/entity/BleAlarm;

    const/4 v1, 0x0

    const-string v2, "mAlarm"

    if-nez v0, :cond_0

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v0, v1

    :cond_0
    invoke-virtual {v0, p1}, Lcom/szabh/smable3/entity/BleAlarm;->setMHour(I)V

    iget-object p0, p0, Lcom/sma/smartv3/ui/device/AlarmEditActivity;->mAlarm:Lcom/szabh/smable3/entity/BleAlarm;

    if-nez p0, :cond_1

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    goto :goto_0

    :cond_1
    move-object v1, p0

    :goto_0
    invoke-virtual {v1, p2}, Lcom/szabh/smable3/entity/BleAlarm;->setMMinute(I)V

    sget-object p0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p0
.end method

.method private static final itemLabel_delegate$lambda$0(Lcom/sma/smartv3/ui/device/AlarmEditActivity;)Lcom/sma/smartv3/view/AbhSettingsItem;
    .locals 1

    const v0, 0x7f0a05ae

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Lcom/sma/smartv3/view/AbhSettingsItem;

    return-object p0
.end method

.method private static final itemRepeat_delegate$lambda$0(Lcom/sma/smartv3/ui/device/AlarmEditActivity;)Lcom/sma/smartv3/view/AbhSettingsItem;
    .locals 1

    const v0, 0x7f0a05d5

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Lcom/sma/smartv3/view/AbhSettingsItem;

    return-object p0
.end method

.method private static final onBottomClick$lambda$0$0(Lcom/sma/smartv3/ui/device/AlarmEditActivity;)Z
    .locals 1

    new-instance v0, Lcom/android/mltcode/paycertificationapi/X0OOi;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/X0OOi;-><init>(Lcom/sma/smartv3/ui/device/AlarmEditActivity;)V

    const/4 p0, 0x0

    invoke-static {p0, v0}, Lcom/android/mltcode/paycertificationapi/X0IOiX1O;->OXO1(ZLkotlin/jvm/functions/Function1;)Z

    move-result p0

    return p0
.end method

.method private static final onBottomClick$lambda$0$0$0(Lcom/sma/smartv3/ui/device/AlarmEditActivity;Lcom/szabh/smable3/component/BleConnector;)Lkotlin/Unit;
    .locals 9

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v2, Lcom/szabh/smable3/BleKey;->ALARM:Lcom/szabh/smable3/BleKey;

    sget-object v3, Lcom/szabh/smable3/BleKeyFlag;->DELETE:Lcom/szabh/smable3/BleKeyFlag;

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/AlarmEditActivity;->mAlarm:Lcom/szabh/smable3/entity/BleAlarm;

    if-nez v0, :cond_0

    const-string v0, "mAlarm"

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

.method private static final onSetRepeat$lambda$0$0(Lcom/sma/smartv3/ui/device/AlarmEditActivity;Ljava/util/Set;)Z
    .locals 6

    const-string v0, "picked"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/sma/smartv3/ui/device/AlarmEditActivity;->isEdited:Z

    iget-object v1, p0, Lcom/sma/smartv3/ui/device/AlarmEditActivity;->mAlarm:Lcom/szabh/smable3/entity/BleAlarm;

    const-string v2, "mAlarm"

    const/4 v3, 0x0

    if-nez v1, :cond_0

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v1, v3

    :cond_0
    sget-object v4, Lcom/szabh/smable3/entity/BleRepeat;->INSTANCE:Lcom/szabh/smable3/entity/BleRepeat;

    const/4 v5, 0x2

    invoke-static {v4, p1, v3, v5, v3}, Lcom/szabh/smable3/entity/BleRepeat;->indicesToRepeat$default(Lcom/szabh/smable3/entity/BleRepeat;Ljava/util/Set;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)I

    move-result p1

    invoke-virtual {v1, p1}, Lcom/szabh/smable3/entity/BleAlarm;->setMRepeat(I)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/AlarmEditActivity;->getItemRepeat()Lcom/sma/smartv3/view/AbhSettingsItem;

    move-result-object p1

    iget-object p0, p0, Lcom/sma/smartv3/ui/device/AlarmEditActivity;->mAlarm:Lcom/szabh/smable3/entity/BleAlarm;

    if-nez p0, :cond_1

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    goto :goto_0

    :cond_1
    move-object v3, p0

    :goto_0
    invoke-virtual {v3}, Lcom/szabh/smable3/entity/BleAlarm;->getMRepeat()I

    move-result p0

    invoke-static {p0}, Lcom/android/mltcode/paycertificationapi/cp5;->X11I(I)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p1, p0}, Lcom/sma/smartv3/view/AbhSettingsItem;->setMRightText(Ljava/lang/String;)V

    return v0
.end method

.method private static final onTitleLeftClick$lambda$0$0(Lcom/sma/smartv3/ui/device/AlarmEditActivity;)Z
    .locals 0

    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    const/4 p0, 0x1

    return p0
.end method

.method private static final onTitleLeftClick$lambda$0$1(Lcom/sma/smartv3/ui/device/AlarmEditActivity;)Z
    .locals 0

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/AlarmEditActivity;->handleComplete()Z

    move-result p0

    return p0
.end method

.method private static final rootView_delegate$lambda$0(Lcom/sma/smartv3/ui/device/AlarmEditActivity;)Landroid/view/View;
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

    new-instance v0, Lcom/szabh/smable3/entity/BleAlarm;

    const/16 v9, 0xff

    const/4 v10, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    invoke-direct/range {v0 .. v10}, Lcom/szabh/smable3/entity/BleAlarm;-><init>(IIIIIIILjava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    goto :goto_0

    :cond_0
    sget-object v1, Lcom/szabh/smable3/component/BleCache;->INSTANCE:Lcom/szabh/smable3/component/BleCache;

    sget-object v2, Lcom/szabh/smable3/BleKey;->ALARM:Lcom/szabh/smable3/BleKey;

    const/4 v5, 0x4

    const/4 v6, 0x0

    const-class v3, Lcom/szabh/smable3/entity/BleAlarm;

    const/4 v4, 0x0

    invoke-static/range {v1 .. v6}, Lcom/szabh/smable3/component/BaseBleCache;->getList$default(Lcom/szabh/smable3/component/BaseBleCache;Lcom/szabh/smable3/BleKey;Ljava/lang/Class;Lcom/szabh/smable3/BleKeyFlag;ILjava/lang/Object;)Ljava/util/List;

    move-result-object p1

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseActivity;->getMArg1()I

    move-result v0

    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    move-object v0, p1

    check-cast v0, Lcom/szabh/smable3/entity/BleAlarm;

    :goto_0
    iput-object v0, p0, Lcom/sma/smartv3/ui/device/AlarmEditActivity;->mAlarm:Lcom/szabh/smable3/entity/BleAlarm;

    return-void
.end method

.method public initView()V
    .locals 7

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseActivity;->getMArg1()I

    move-result v0

    const/16 v1, 0x8

    const v2, 0x7f0a01b9

    const v3, 0x7f0a0023

    const/4 v4, 0x0

    if-gez v0, :cond_0

    invoke-virtual {p0, v3}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    const v3, 0x7f140080

    invoke-virtual {v0, v3}, Landroid/widget/TextView;->setText(I)V

    invoke-virtual {p0, v2}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    goto :goto_0

    :cond_0
    invoke-virtual {p0, v3}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    const v3, 0x7f1404b9

    invoke-virtual {v0, v3}, Landroid/widget/TextView;->setText(I)V

    invoke-virtual {p0, v2}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, v4}, Landroid/view/View;->setVisibility(I)V

    :goto_0
    const v0, 0x7f0a0026

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    const v2, 0x7f080ffc

    invoke-virtual {v0, v2}, Landroid/widget/ImageView;->setImageResource(I)V

    invoke-virtual {v0, v4}, Landroid/widget/ImageView;->setVisibility(I)V

    const v0, 0x7f0a0bb4

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/sma/smartv3/view/picker/TimePicker;

    iget-object v2, p0, Lcom/sma/smartv3/ui/device/AlarmEditActivity;->mAlarm:Lcom/szabh/smable3/entity/BleAlarm;

    const/4 v3, 0x0

    const-string v5, "mAlarm"

    if-nez v2, :cond_1

    invoke-static {v5}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v2, v3

    :cond_1
    invoke-virtual {v2}, Lcom/szabh/smable3/entity/BleAlarm;->getMHour()I

    move-result v2

    iget-object v6, p0, Lcom/sma/smartv3/ui/device/AlarmEditActivity;->mAlarm:Lcom/szabh/smable3/entity/BleAlarm;

    if-nez v6, :cond_2

    invoke-static {v5}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v6, v3

    :cond_2
    invoke-virtual {v6}, Lcom/szabh/smable3/entity/BleAlarm;->getMMinute()I

    move-result v6

    invoke-virtual {v0, v2, v6}, Lcom/sma/smartv3/view/picker/TimePicker;->IO(II)V

    new-instance v2, Lcom/android/mltcode/paycertificationapi/OO1;

    invoke-direct {v2, p0}, Lcom/android/mltcode/paycertificationapi/OO1;-><init>(Lcom/sma/smartv3/ui/device/AlarmEditActivity;)V

    invoke-virtual {v0, v2}, Lcom/sma/smartv3/view/picker/TimePicker;->setMListener(Lkotlin/jvm/functions/Function2;)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/AlarmEditActivity;->getItemRepeat()Lcom/sma/smartv3/view/AbhSettingsItem;

    move-result-object v0

    iget-object v2, p0, Lcom/sma/smartv3/ui/device/AlarmEditActivity;->mAlarm:Lcom/szabh/smable3/entity/BleAlarm;

    if-nez v2, :cond_3

    invoke-static {v5}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v2, v3

    :cond_3
    invoke-virtual {v2}, Lcom/szabh/smable3/entity/BleAlarm;->getMRepeat()I

    move-result v2

    invoke-static {v2}, Lcom/android/mltcode/paycertificationapi/cp5;->X11I(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Lcom/sma/smartv3/view/AbhSettingsItem;->setMRightText(Ljava/lang/String;)V

    sget-object v0, Lcom/android/mltcode/paycertificationapi/q62;->OXO1:Lcom/android/mltcode/paycertificationapi/q62;

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/q62;->X1()Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/AlarmEditActivity;->getItemLabel()Lcom/sma/smartv3/view/AbhSettingsItem;

    move-result-object v0

    invoke-virtual {v0, v4}, Landroid/view/View;->setVisibility(I)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/AlarmEditActivity;->getItemLabel()Lcom/sma/smartv3/view/AbhSettingsItem;

    move-result-object v0

    invoke-virtual {v0}, Lcom/sma/smartv3/view/AbhSettingsItem;->getEdtValue()Landroid/widget/EditText;

    move-result-object v0

    new-instance v1, Lcom/android/mltcode/paycertificationapi/OIXXOiii;

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/AlarmEditActivity;->getItemLabel()Lcom/sma/smartv3/view/AbhSettingsItem;

    move-result-object v2

    invoke-virtual {v2}, Lcom/sma/smartv3/view/AbhSettingsItem;->getEdtValue()Landroid/widget/EditText;

    move-result-object v2

    const/16 v4, 0x15

    invoke-direct {v1, v2, v4}, Lcom/android/mltcode/paycertificationapi/OIXXOiii;-><init>(Landroid/widget/EditText;I)V

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->addTextChangedListener(Landroid/text/TextWatcher;)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/AlarmEditActivity;->getItemLabel()Lcom/sma/smartv3/view/AbhSettingsItem;

    move-result-object v0

    iget-object v1, p0, Lcom/sma/smartv3/ui/device/AlarmEditActivity;->mAlarm:Lcom/szabh/smable3/entity/BleAlarm;

    if-nez v1, :cond_4

    invoke-static {v5}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    goto :goto_1

    :cond_4
    move-object v3, v1

    :goto_1
    invoke-virtual {v3}, Lcom/szabh/smable3/entity/BleAlarm;->getMTag()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/sma/smartv3/view/AbhSettingsItem;->setMRightText(Ljava/lang/String;)V

    return-void

    :cond_5
    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/AlarmEditActivity;->getItemLabel()Lcom/sma/smartv3/view/AbhSettingsItem;

    move-result-object v0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    return-void
.end method

.method public layoutId()I
    .locals 1

    const v0, 0x7f0d002c

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

    iget-object p1, p0, Lcom/sma/smartv3/ui/device/AlarmEditActivity;->mDeletePopup:Lcom/android/mltcode/paycertificationapi/go0;

    if-nez p1, :cond_0

    new-instance p1, Lcom/android/mltcode/paycertificationapi/go0;

    const/4 v0, 0x0

    const/4 v1, 0x2

    const/4 v2, 0x0

    invoke-direct {p1, p0, v0, v1, v2}, Lcom/android/mltcode/paycertificationapi/go0;-><init>(Landroid/app/Activity;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const v0, 0x7f1403dd

    invoke-virtual {p1, v0}, Lcom/android/mltcode/paycertificationapi/go0;->O1O(I)V

    const v0, 0x7f14027f

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {p1, v0, v2, v1, v2}, Lcom/android/mltcode/paycertificationapi/go0;->X11iII1O1(Lcom/android/mltcode/paycertificationapi/go0;Ljava/lang/Integer;Lkotlin/jvm/functions/Function0;ILjava/lang/Object;)V

    new-instance v0, Lcom/android/mltcode/paycertificationapi/I1i11;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/I1i11;-><init>(Lcom/sma/smartv3/ui/device/AlarmEditActivity;)V

    const v1, 0x7f1403db

    invoke-virtual {p1, v1, v0}, Lcom/android/mltcode/paycertificationapi/go0;->X1IX(ILkotlin/jvm/functions/Function0;)V

    iput-object p1, p0, Lcom/sma/smartv3/ui/device/AlarmEditActivity;->mDeletePopup:Lcom/android/mltcode/paycertificationapi/go0;

    :cond_0
    iget-object p1, p0, Lcom/sma/smartv3/ui/device/AlarmEditActivity;->mDeletePopup:Lcom/android/mltcode/paycertificationapi/go0;

    if-eqz p1, :cond_1

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/AlarmEditActivity;->getRootView()Landroid/view/View;

    move-result-object v0

    const-string v1, "<get-rootView>(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1, v0}, Lcom/android/mltcode/paycertificationapi/I0OIO1i;->I1XOi1(Landroid/view/View;)V

    :cond_1
    return-void
.end method

.method public final onSetRepeat(Landroid/view/View;)V
    .locals 4
    .param p1    # Landroid/view/View;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "view"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, Lcom/sma/smartv3/ui/device/AlarmEditActivity;->mRepeatPopup:Lcom/android/mltcode/paycertificationapi/jv0;

    if-nez p1, :cond_0

    new-instance p1, Lcom/android/mltcode/paycertificationapi/jv0;

    const v0, 0x7f030055

    invoke-direct {p1, p0, v0}, Lcom/android/mltcode/paycertificationapi/jv0;-><init>(Landroid/app/Activity;I)V

    const v0, 0x7f14118f

    invoke-virtual {p1, v0}, Lcom/android/mltcode/paycertificationapi/jv0;->O1O(I)V

    new-instance v0, Lcom/android/mltcode/paycertificationapi/OOOO;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/OOOO;-><init>(Lcom/sma/smartv3/ui/device/AlarmEditActivity;)V

    invoke-virtual {p1, v0}, Lcom/android/mltcode/paycertificationapi/jv0;->iOO1ii1(Lkotlin/jvm/functions/Function1;)V

    iput-object p1, p0, Lcom/sma/smartv3/ui/device/AlarmEditActivity;->mRepeatPopup:Lcom/android/mltcode/paycertificationapi/jv0;

    :cond_0
    iget-object p1, p0, Lcom/sma/smartv3/ui/device/AlarmEditActivity;->mRepeatPopup:Lcom/android/mltcode/paycertificationapi/jv0;

    if-eqz p1, :cond_2

    sget-object v0, Lcom/szabh/smable3/entity/BleRepeat;->INSTANCE:Lcom/szabh/smable3/entity/BleRepeat;

    iget-object v1, p0, Lcom/sma/smartv3/ui/device/AlarmEditActivity;->mAlarm:Lcom/szabh/smable3/entity/BleAlarm;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    const-string v1, "mAlarm"

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v1, v2

    :cond_1
    invoke-virtual {v1}, Lcom/szabh/smable3/entity/BleAlarm;->getMRepeat()I

    move-result v1

    const/4 v3, 0x2

    invoke-static {v0, v1, v2, v3, v2}, Lcom/szabh/smable3/entity/BleRepeat;->toIndices$default(Lcom/szabh/smable3/entity/BleRepeat;ILkotlin/jvm/functions/Function1;ILjava/lang/Object;)Ljava/util/Set;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/android/mltcode/paycertificationapi/jv0;->IXXOO(Ljava/util/Set;)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/AlarmEditActivity;->getRootView()Landroid/view/View;

    move-result-object v0

    const-string v1, "<get-rootView>(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1, v0}, Lcom/android/mltcode/paycertificationapi/I0OIO1i;->I1XOi1(Landroid/view/View;)V

    :cond_2
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

    iget-boolean p1, p0, Lcom/sma/smartv3/ui/device/AlarmEditActivity;->isEdited:Z

    if-eqz p1, :cond_2

    iget-object p1, p0, Lcom/sma/smartv3/ui/device/AlarmEditActivity;->mSaveTipPopup:Lcom/android/mltcode/paycertificationapi/go0;

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

    new-instance v1, Lcom/android/mltcode/paycertificationapi/IiXOIOOIX;

    invoke-direct {v1, p0}, Lcom/android/mltcode/paycertificationapi/IiXOIOOIX;-><init>(Lcom/sma/smartv3/ui/device/AlarmEditActivity;)V

    invoke-virtual {p1, v0, v1}, Lcom/android/mltcode/paycertificationapi/go0;->iX1O1(Ljava/lang/Integer;Lkotlin/jvm/functions/Function0;)V

    new-instance v0, Lcom/android/mltcode/paycertificationapi/OIX0;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/OIX0;-><init>(Lcom/sma/smartv3/ui/device/AlarmEditActivity;)V

    const v1, 0x7f1411c4

    invoke-virtual {p1, v1, v0}, Lcom/android/mltcode/paycertificationapi/go0;->X1IX(ILkotlin/jvm/functions/Function0;)V

    iput-object p1, p0, Lcom/sma/smartv3/ui/device/AlarmEditActivity;->mSaveTipPopup:Lcom/android/mltcode/paycertificationapi/go0;

    :cond_0
    iget-object p1, p0, Lcom/sma/smartv3/ui/device/AlarmEditActivity;->mSaveTipPopup:Lcom/android/mltcode/paycertificationapi/go0;

    if-eqz p1, :cond_1

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/AlarmEditActivity;->getRootView()Landroid/view/View;

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

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/AlarmEditActivity;->handleComplete()Z

    return-void
.end method
