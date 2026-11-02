.class public final Lcom/sma/smartv3/ui/device/HealthCareSettingsActivity;
.super Lcom/bestmafen/androidbase/base/BaseActivity;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/sma/smartv3/ui/device/HealthCareSettingsActivity$OXO1;
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nHealthCareSettingsActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HealthCareSettingsActivity.kt\ncom/sma/smartv3/ui/device/HealthCareSettingsActivity\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,300:1\n1#2:301\n*E\n"
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nHealthCareSettingsActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HealthCareSettingsActivity.kt\ncom/sma/smartv3/ui/device/HealthCareSettingsActivity\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,300:1\n1#2:301\n*E\n"
    }
.end annotation


# static fields
.field public static final Companion:Lcom/sma/smartv3/ui/device/HealthCareSettingsActivity$OXO1;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public static final DURATION_DEFAULT:I = 0x5

.field public static final DURATION_MAX:I = 0x8

.field public static final DURATION_MIN:I = 0x2

.field public static final MENSTRUATION_REMINDER_DEFAULT:I = 0x2

.field public static final MENSTRUATION_REMINDER_MAX:I = 0x3

.field public static final MENSTRUATION_REMINDER_MIN:I = 0x1

.field public static final OVULATION_REMINDER_DEFAULT:I = 0x3

.field public static final OVULATION_REMINDER_MAX:I = 0x3

.field public static final OVULATION_REMINDER_MIN:I = 0x1

.field public static final PERIOD_DEFAULT:I = 0x1c

.field private static final PERIOD_MAX:I

.field private static final PERIOD_MIN:I


# instance fields
.field private final itemDuration$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final itemHeader$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final itemLast$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final itemOvulationReminder$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final itemPeriod$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final itemPeriodReminder$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final itemReminderTime$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private mDurationPopup:Lcom/android/mltcode/paycertificationapi/qv1;
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation
.end field

.field private final mGirlCareSettings:Lcom/szabh/smable3/entity/BleGirlCareSettings;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private mLastPopup:Lcom/android/mltcode/paycertificationapi/O1100iXOX;
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation
.end field

.field private mOvulationReminderPopup:Lcom/android/mltcode/paycertificationapi/qv1;
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation
.end field

.field private mPeriodPopup:Lcom/android/mltcode/paycertificationapi/qv1;
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation
.end field

.field private mPeriodReminderPopup:Lcom/android/mltcode/paycertificationapi/qv1;
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation
.end field

.field private mReminderPopup:Lcom/android/mltcode/paycertificationapi/it5;
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation
.end field

.field private final rootView$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/sma/smartv3/ui/device/HealthCareSettingsActivity$OXO1;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/sma/smartv3/ui/device/HealthCareSettingsActivity$OXO1;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/sma/smartv3/ui/device/HealthCareSettingsActivity;->Companion:Lcom/sma/smartv3/ui/device/HealthCareSettingsActivity$OXO1;

    const/16 v0, 0x19

    sput v0, Lcom/sma/smartv3/ui/device/HealthCareSettingsActivity;->PERIOD_MIN:I

    const/16 v0, 0x23

    sput v0, Lcom/sma/smartv3/ui/device/HealthCareSettingsActivity;->PERIOD_MAX:I

    return-void
.end method

.method public constructor <init>()V
    .locals 15

    invoke-direct {p0}, Lcom/bestmafen/androidbase/base/BaseActivity;-><init>()V

    new-instance v0, Lcom/android/mltcode/paycertificationapi/iXOXiXOiO;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/iXOXiXOiO;-><init>(Lcom/sma/smartv3/ui/device/HealthCareSettingsActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/HealthCareSettingsActivity;->rootView$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/Ii1I10;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/Ii1I10;-><init>(Lcom/sma/smartv3/ui/device/HealthCareSettingsActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/HealthCareSettingsActivity;->itemHeader$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/O1OXOI;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/O1OXOI;-><init>(Lcom/sma/smartv3/ui/device/HealthCareSettingsActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/HealthCareSettingsActivity;->itemDuration$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/XXI001I;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/XXI001I;-><init>(Lcom/sma/smartv3/ui/device/HealthCareSettingsActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/HealthCareSettingsActivity;->itemPeriod$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/O0II110OI;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/O0II110OI;-><init>(Lcom/sma/smartv3/ui/device/HealthCareSettingsActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/HealthCareSettingsActivity;->itemLast$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/OiOi01XI;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/OiOi01XI;-><init>(Lcom/sma/smartv3/ui/device/HealthCareSettingsActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/HealthCareSettingsActivity;->itemPeriodReminder$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/IOiOi1O;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/IOiOi1O;-><init>(Lcom/sma/smartv3/ui/device/HealthCareSettingsActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/HealthCareSettingsActivity;->itemOvulationReminder$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/X0IXiOI0O;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/X0IXiOI0O;-><init>(Lcom/sma/smartv3/ui/device/HealthCareSettingsActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/HealthCareSettingsActivity;->itemReminderTime$delegate:Lkotlin/Lazy;

    sget-object v1, Lcom/szabh/smable3/component/BleCache;->INSTANCE:Lcom/szabh/smable3/component/BleCache;

    sget-object v2, Lcom/szabh/smable3/BleKey;->GIRL_CARE:Lcom/szabh/smable3/BleKey;

    const/4 v5, 0x4

    const/4 v6, 0x0

    const-class v3, Lcom/szabh/smable3/entity/BleGirlCareSettings;

    const/4 v4, 0x0

    invoke-static/range {v1 .. v6}, Lcom/szabh/smable3/component/BaseBleCache;->getObject$default(Lcom/szabh/smable3/component/BaseBleCache;Lcom/szabh/smable3/BleKey;Ljava/lang/Class;Lcom/szabh/smable3/BleKeyFlag;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/szabh/smable3/entity/BleGirlCareSettings;

    if-nez v0, :cond_0

    new-instance v1, Lcom/szabh/smable3/entity/BleGirlCareSettings;

    const/16 v13, 0x7fb

    const/4 v14, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/16 v4, 0x8

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    invoke-direct/range {v1 .. v14}, Lcom/szabh/smable3/entity/BleGirlCareSettings;-><init>(IIIIIIIIIIIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object v0, v1

    :cond_0
    iput-object v0, p0, Lcom/sma/smartv3/ui/device/HealthCareSettingsActivity;->mGirlCareSettings:Lcom/szabh/smable3/entity/BleGirlCareSettings;

    return-void
.end method

.method public static synthetic I0iXXO(Lcom/sma/smartv3/ui/device/HealthCareSettingsActivity;)Lcom/sma/smartv3/view/AbhSettingsItem;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/device/HealthCareSettingsActivity;->itemLast_delegate$lambda$0(Lcom/sma/smartv3/ui/device/HealthCareSettingsActivity;)Lcom/sma/smartv3/view/AbhSettingsItem;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic I1(Lcom/sma/smartv3/ui/device/HealthCareSettingsActivity;ILcom/szabh/smable3/component/BleConnector;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/sma/smartv3/ui/device/HealthCareSettingsActivity;->onSetOvulationReminder$lambda$1$0$0(Lcom/sma/smartv3/ui/device/HealthCareSettingsActivity;ILcom/szabh/smable3/component/BleConnector;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic I1XOi1(Lcom/sma/smartv3/ui/device/HealthCareSettingsActivity;ILcom/szabh/smable3/component/BleConnector;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/sma/smartv3/ui/device/HealthCareSettingsActivity;->onSetDuration$lambda$1$0$0(Lcom/sma/smartv3/ui/device/HealthCareSettingsActivity;ILcom/szabh/smable3/component/BleConnector;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic II1Xi0(Lcom/sma/smartv3/ui/device/HealthCareSettingsActivity;ZLcom/szabh/smable3/component/BleConnector;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/sma/smartv3/ui/device/HealthCareSettingsActivity;->initView$lambda$0$0$0(Lcom/sma/smartv3/ui/device/HealthCareSettingsActivity;ZLcom/szabh/smable3/component/BleConnector;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic IIX1OXO(Lcom/sma/smartv3/ui/device/HealthCareSettingsActivity;I)Z
    .locals 0

    invoke-static {p0, p1}, Lcom/sma/smartv3/ui/device/HealthCareSettingsActivity;->onSetDuration$lambda$1$0(Lcom/sma/smartv3/ui/device/HealthCareSettingsActivity;I)Z

    move-result p0

    return p0
.end method

.method public static synthetic IXXOO(Lcom/sma/smartv3/ui/device/HealthCareSettingsActivity;II)Z
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/sma/smartv3/ui/device/HealthCareSettingsActivity;->onSetReminderTime$lambda$0$0(Lcom/sma/smartv3/ui/device/HealthCareSettingsActivity;II)Z

    move-result p0

    return p0
.end method

.method public static synthetic O10IXXX0X(Lcom/sma/smartv3/ui/device/HealthCareSettingsActivity;)Lcom/sma/smartv3/view/AbhSettingsHeader;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/device/HealthCareSettingsActivity;->itemHeader_delegate$lambda$0(Lcom/sma/smartv3/ui/device/HealthCareSettingsActivity;)Lcom/sma/smartv3/view/AbhSettingsHeader;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic OII(Lcom/sma/smartv3/ui/device/HealthCareSettingsActivity;IIILcom/szabh/smable3/component/BleConnector;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lcom/sma/smartv3/ui/device/HealthCareSettingsActivity;->onSetLast$lambda$0$0$0(Lcom/sma/smartv3/ui/device/HealthCareSettingsActivity;IIILcom/szabh/smable3/component/BleConnector;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic OIX0iXi(Lcom/sma/smartv3/ui/device/HealthCareSettingsActivity;)Lcom/sma/smartv3/view/AbhSettingsItem;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/device/HealthCareSettingsActivity;->itemReminderTime_delegate$lambda$0(Lcom/sma/smartv3/ui/device/HealthCareSettingsActivity;)Lcom/sma/smartv3/view/AbhSettingsItem;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic OX(Lcom/sma/smartv3/ui/device/HealthCareSettingsActivity;I)Z
    .locals 0

    invoke-static {p0, p1}, Lcom/sma/smartv3/ui/device/HealthCareSettingsActivity;->onSetOvulationReminder$lambda$1$0(Lcom/sma/smartv3/ui/device/HealthCareSettingsActivity;I)Z

    move-result p0

    return p0
.end method

.method public static synthetic OiIIX101O(Lcom/sma/smartv3/ui/device/HealthCareSettingsActivity;)Lcom/sma/smartv3/view/AbhSettingsItem;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/device/HealthCareSettingsActivity;->itemOvulationReminder_delegate$lambda$0(Lcom/sma/smartv3/ui/device/HealthCareSettingsActivity;)Lcom/sma/smartv3/view/AbhSettingsItem;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic X01IiOiIi(Lcom/sma/smartv3/ui/device/HealthCareSettingsActivity;ILcom/szabh/smable3/component/BleConnector;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/sma/smartv3/ui/device/HealthCareSettingsActivity;->onSetPeriod$lambda$1$0$0(Lcom/sma/smartv3/ui/device/HealthCareSettingsActivity;ILcom/szabh/smable3/component/BleConnector;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic X0O(Lcom/sma/smartv3/ui/device/HealthCareSettingsActivity;I)Z
    .locals 0

    invoke-static {p0, p1}, Lcom/sma/smartv3/ui/device/HealthCareSettingsActivity;->onSetPeriodReminder$lambda$1$0(Lcom/sma/smartv3/ui/device/HealthCareSettingsActivity;I)Z

    move-result p0

    return p0
.end method

.method public static synthetic X1ii(Lcom/sma/smartv3/ui/device/HealthCareSettingsActivity;Z)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Lcom/sma/smartv3/ui/device/HealthCareSettingsActivity;->initView$lambda$0$0(Lcom/sma/smartv3/ui/device/HealthCareSettingsActivity;Z)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic XX0(Lcom/sma/smartv3/ui/device/HealthCareSettingsActivity;ILcom/szabh/smable3/component/BleConnector;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/sma/smartv3/ui/device/HealthCareSettingsActivity;->onSetPeriodReminder$lambda$1$0$0(Lcom/sma/smartv3/ui/device/HealthCareSettingsActivity;ILcom/szabh/smable3/component/BleConnector;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic XXI(Lcom/sma/smartv3/ui/device/HealthCareSettingsActivity;III)Z
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lcom/sma/smartv3/ui/device/HealthCareSettingsActivity;->onSetLast$lambda$0$0(Lcom/sma/smartv3/ui/device/HealthCareSettingsActivity;III)Z

    move-result p0

    return p0
.end method

.method public static synthetic XiOIO(Lcom/sma/smartv3/ui/device/HealthCareSettingsActivity;)Lcom/sma/smartv3/view/AbhSettingsItem;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/device/HealthCareSettingsActivity;->itemPeriod_delegate$lambda$0(Lcom/sma/smartv3/ui/device/HealthCareSettingsActivity;)Lcom/sma/smartv3/view/AbhSettingsItem;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic XiOIii1(Lcom/sma/smartv3/ui/device/HealthCareSettingsActivity;)Lcom/sma/smartv3/view/AbhSettingsItem;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/device/HealthCareSettingsActivity;->itemDuration_delegate$lambda$0(Lcom/sma/smartv3/ui/device/HealthCareSettingsActivity;)Lcom/sma/smartv3/view/AbhSettingsItem;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$getPERIOD_MAX$cp()I
    .locals 1

    sget v0, Lcom/sma/smartv3/ui/device/HealthCareSettingsActivity;->PERIOD_MAX:I

    return v0
.end method

.method public static final synthetic access$getPERIOD_MIN$cp()I
    .locals 1

    sget v0, Lcom/sma/smartv3/ui/device/HealthCareSettingsActivity;->PERIOD_MIN:I

    return v0
.end method

.method private final getItemDuration()Lcom/sma/smartv3/view/AbhSettingsItem;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/HealthCareSettingsActivity;->itemDuration$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/sma/smartv3/view/AbhSettingsItem;

    return-object v0
.end method

.method private final getItemHeader()Lcom/sma/smartv3/view/AbhSettingsHeader;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/HealthCareSettingsActivity;->itemHeader$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/sma/smartv3/view/AbhSettingsHeader;

    return-object v0
.end method

.method private final getItemLast()Lcom/sma/smartv3/view/AbhSettingsItem;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/HealthCareSettingsActivity;->itemLast$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/sma/smartv3/view/AbhSettingsItem;

    return-object v0
.end method

.method private final getItemOvulationReminder()Lcom/sma/smartv3/view/AbhSettingsItem;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/HealthCareSettingsActivity;->itemOvulationReminder$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/sma/smartv3/view/AbhSettingsItem;

    return-object v0
.end method

.method private final getItemPeriod()Lcom/sma/smartv3/view/AbhSettingsItem;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/HealthCareSettingsActivity;->itemPeriod$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/sma/smartv3/view/AbhSettingsItem;

    return-object v0
.end method

.method private final getItemPeriodReminder()Lcom/sma/smartv3/view/AbhSettingsItem;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/HealthCareSettingsActivity;->itemPeriodReminder$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/sma/smartv3/view/AbhSettingsItem;

    return-object v0
.end method

.method private final getItemReminderTime()Lcom/sma/smartv3/view/AbhSettingsItem;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/HealthCareSettingsActivity;->itemReminderTime$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/sma/smartv3/view/AbhSettingsItem;

    return-object v0
.end method

.method private final getRootView()Landroid/view/View;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/HealthCareSettingsActivity;->rootView$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    return-object v0
.end method

.method public static synthetic i010I(Lcom/sma/smartv3/ui/device/HealthCareSettingsActivity;IILcom/szabh/smable3/component/BleConnector;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lcom/sma/smartv3/ui/device/HealthCareSettingsActivity;->onSetReminderTime$lambda$0$0$0(Lcom/sma/smartv3/ui/device/HealthCareSettingsActivity;IILcom/szabh/smable3/component/BleConnector;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic iIiiO(Lcom/sma/smartv3/ui/device/HealthCareSettingsActivity;I)Z
    .locals 0

    invoke-static {p0, p1}, Lcom/sma/smartv3/ui/device/HealthCareSettingsActivity;->onSetPeriod$lambda$1$0(Lcom/sma/smartv3/ui/device/HealthCareSettingsActivity;I)Z

    move-result p0

    return p0
.end method

.method public static synthetic iOOX010X(Lcom/sma/smartv3/ui/device/HealthCareSettingsActivity;)Landroid/view/View;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/device/HealthCareSettingsActivity;->rootView_delegate$lambda$0(Lcom/sma/smartv3/ui/device/HealthCareSettingsActivity;)Landroid/view/View;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic iX(Lcom/sma/smartv3/ui/device/HealthCareSettingsActivity;)Lcom/sma/smartv3/view/AbhSettingsItem;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/device/HealthCareSettingsActivity;->itemPeriodReminder_delegate$lambda$0(Lcom/sma/smartv3/ui/device/HealthCareSettingsActivity;)Lcom/sma/smartv3/view/AbhSettingsItem;

    move-result-object p0

    return-object p0
.end method

.method private static final initView$lambda$0$0(Lcom/sma/smartv3/ui/device/HealthCareSettingsActivity;Z)Lkotlin/Unit;
    .locals 4

    new-instance v0, Lcom/android/mltcode/paycertificationapi/OIXXIIXi;

    invoke-direct {v0, p0, p1}, Lcom/android/mltcode/paycertificationapi/OIXXIIXi;-><init>(Lcom/sma/smartv3/ui/device/HealthCareSettingsActivity;Z)V

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x1

    invoke-static {v2, v0, v3, v1}, Lcom/android/mltcode/paycertificationapi/X0IOiX1O;->XIi00iiXO(ZLkotlin/jvm/functions/Function1;ILjava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/HealthCareSettingsActivity;->getItemHeader()Lcom/sma/smartv3/view/AbhSettingsHeader;

    move-result-object p0

    xor-int/2addr p1, v3

    invoke-virtual {p0, p1}, Lcom/sma/smartv3/view/AbhSettingsHeader;->setChecked(Z)V

    :cond_0
    sget-object p0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p0
.end method

.method private static final initView$lambda$0$0$0(Lcom/sma/smartv3/ui/device/HealthCareSettingsActivity;ZLcom/szabh/smable3/component/BleConnector;)Lkotlin/Unit;
    .locals 9

    const-string v0, "it"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/HealthCareSettingsActivity;->mGirlCareSettings:Lcom/szabh/smable3/entity/BleGirlCareSettings;

    invoke-static {p1}, Lcom/android/mltcode/paycertificationapi/OiOX0i;->iO(Z)I

    move-result p1

    invoke-virtual {v0, p1}, Lcom/szabh/smable3/entity/BleGirlCareSettings;->setMEnabled(I)V

    sget-object v2, Lcom/szabh/smable3/BleKey;->GIRL_CARE:Lcom/szabh/smable3/BleKey;

    sget-object v3, Lcom/szabh/smable3/BleKeyFlag;->UPDATE:Lcom/szabh/smable3/BleKeyFlag;

    iget-object v4, p0, Lcom/sma/smartv3/ui/device/HealthCareSettingsActivity;->mGirlCareSettings:Lcom/szabh/smable3/entity/BleGirlCareSettings;

    const/16 v7, 0x18

    const/4 v8, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    move-object v1, p2

    invoke-static/range {v1 .. v8}, Lcom/szabh/smable3/component/BaseBleConnector;->sendObject$default(Lcom/szabh/smable3/component/BaseBleConnector;Lcom/szabh/smable3/BleKey;Lcom/szabh/smable3/BleKeyFlag;Lcom/bestmafen/baseble/data/BleBuffer;ZZILjava/lang/Object;)Z

    const/4 p0, 0x0

    const/4 p1, 0x2

    const-string p2, "girl_care_change"

    invoke-static {p2, p0, p1, p0}, Lcom/android/mltcode/paycertificationapi/I01XX0;->XIi00iiXO(Ljava/lang/String;Ljava/lang/Object;ILjava/lang/Object;)V

    sget-object p0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p0
.end method

.method private static final itemDuration_delegate$lambda$0(Lcom/sma/smartv3/ui/device/HealthCareSettingsActivity;)Lcom/sma/smartv3/view/AbhSettingsItem;
    .locals 1

    const v0, 0x7f0a05cb

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Lcom/sma/smartv3/view/AbhSettingsItem;

    return-object p0
.end method

.method private static final itemHeader_delegate$lambda$0(Lcom/sma/smartv3/ui/device/HealthCareSettingsActivity;)Lcom/sma/smartv3/view/AbhSettingsHeader;
    .locals 1

    const v0, 0x7f0a0594

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Lcom/sma/smartv3/view/AbhSettingsHeader;

    return-object p0
.end method

.method private static final itemLast_delegate$lambda$0(Lcom/sma/smartv3/ui/device/HealthCareSettingsActivity;)Lcom/sma/smartv3/view/AbhSettingsItem;
    .locals 1

    const v0, 0x7f0a05af

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Lcom/sma/smartv3/view/AbhSettingsItem;

    return-object p0
.end method

.method private static final itemOvulationReminder_delegate$lambda$0(Lcom/sma/smartv3/ui/device/HealthCareSettingsActivity;)Lcom/sma/smartv3/view/AbhSettingsItem;
    .locals 1

    const v0, 0x7f0a05c9

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Lcom/sma/smartv3/view/AbhSettingsItem;

    return-object p0
.end method

.method private static final itemPeriodReminder_delegate$lambda$0(Lcom/sma/smartv3/ui/device/HealthCareSettingsActivity;)Lcom/sma/smartv3/view/AbhSettingsItem;
    .locals 1

    const v0, 0x7f0a05cc

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Lcom/sma/smartv3/view/AbhSettingsItem;

    return-object p0
.end method

.method private static final itemPeriod_delegate$lambda$0(Lcom/sma/smartv3/ui/device/HealthCareSettingsActivity;)Lcom/sma/smartv3/view/AbhSettingsItem;
    .locals 1

    const v0, 0x7f0a0576

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Lcom/sma/smartv3/view/AbhSettingsItem;

    return-object p0
.end method

.method private static final itemReminderTime_delegate$lambda$0(Lcom/sma/smartv3/ui/device/HealthCareSettingsActivity;)Lcom/sma/smartv3/view/AbhSettingsItem;
    .locals 1

    const v0, 0x7f0a05d3

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Lcom/sma/smartv3/view/AbhSettingsItem;

    return-object p0
.end method

.method private static final onSetDuration$lambda$1$0(Lcom/sma/smartv3/ui/device/HealthCareSettingsActivity;I)Z
    .locals 2

    new-instance v0, Lcom/android/mltcode/paycertificationapi/i1OX1iIIO;

    invoke-direct {v0, p0, p1}, Lcom/android/mltcode/paycertificationapi/i1OX1iIIO;-><init>(Lcom/sma/smartv3/ui/device/HealthCareSettingsActivity;I)V

    const/4 p0, 0x1

    const/4 p1, 0x0

    const/4 v1, 0x0

    invoke-static {v1, v0, p0, p1}, Lcom/android/mltcode/paycertificationapi/X0IOiX1O;->XIi00iiXO(ZLkotlin/jvm/functions/Function1;ILjava/lang/Object;)Z

    move-result p0

    return p0
.end method

.method private static final onSetDuration$lambda$1$0$0(Lcom/sma/smartv3/ui/device/HealthCareSettingsActivity;ILcom/szabh/smable3/component/BleConnector;)Lkotlin/Unit;
    .locals 9

    const-string v0, "it"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/HealthCareSettingsActivity;->mGirlCareSettings:Lcom/szabh/smable3/entity/BleGirlCareSettings;

    add-int/lit8 p1, p1, 0x2

    invoke-virtual {v0, p1}, Lcom/szabh/smable3/entity/BleGirlCareSettings;->setMMenstruationDuration(I)V

    sget-object v2, Lcom/szabh/smable3/BleKey;->GIRL_CARE:Lcom/szabh/smable3/BleKey;

    sget-object v3, Lcom/szabh/smable3/BleKeyFlag;->UPDATE:Lcom/szabh/smable3/BleKeyFlag;

    iget-object v4, p0, Lcom/sma/smartv3/ui/device/HealthCareSettingsActivity;->mGirlCareSettings:Lcom/szabh/smable3/entity/BleGirlCareSettings;

    const/16 v7, 0x18

    const/4 v8, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    move-object v1, p2

    invoke-static/range {v1 .. v8}, Lcom/szabh/smable3/component/BaseBleConnector;->sendObject$default(Lcom/szabh/smable3/component/BaseBleConnector;Lcom/szabh/smable3/BleKey;Lcom/szabh/smable3/BleKeyFlag;Lcom/bestmafen/baseble/data/BleBuffer;ZZILjava/lang/Object;)Z

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/HealthCareSettingsActivity;->updateDuration()V

    sget-object p0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p0
.end method

.method private static final onSetLast$lambda$0$0(Lcom/sma/smartv3/ui/device/HealthCareSettingsActivity;III)Z
    .locals 1

    new-instance v0, Lcom/android/mltcode/paycertificationapi/iIOO0IIiI;

    invoke-direct {v0, p0, p1, p2, p3}, Lcom/android/mltcode/paycertificationapi/iIOO0IIiI;-><init>(Lcom/sma/smartv3/ui/device/HealthCareSettingsActivity;III)V

    const/4 p0, 0x1

    const/4 p1, 0x0

    const/4 p2, 0x0

    invoke-static {p2, v0, p0, p1}, Lcom/android/mltcode/paycertificationapi/X0IOiX1O;->XIi00iiXO(ZLkotlin/jvm/functions/Function1;ILjava/lang/Object;)Z

    move-result p0

    return p0
.end method

.method private static final onSetLast$lambda$0$0$0(Lcom/sma/smartv3/ui/device/HealthCareSettingsActivity;IIILcom/szabh/smable3/component/BleConnector;)Lkotlin/Unit;
    .locals 8

    const-string v0, "it"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/HealthCareSettingsActivity;->mGirlCareSettings:Lcom/szabh/smable3/entity/BleGirlCareSettings;

    invoke-virtual {v0, p1}, Lcom/szabh/smable3/entity/BleGirlCareSettings;->setMLatestYear(I)V

    iget-object p1, p0, Lcom/sma/smartv3/ui/device/HealthCareSettingsActivity;->mGirlCareSettings:Lcom/szabh/smable3/entity/BleGirlCareSettings;

    invoke-virtual {p1, p2}, Lcom/szabh/smable3/entity/BleGirlCareSettings;->setMLatestMonth(I)V

    iget-object p1, p0, Lcom/sma/smartv3/ui/device/HealthCareSettingsActivity;->mGirlCareSettings:Lcom/szabh/smable3/entity/BleGirlCareSettings;

    invoke-virtual {p1, p3}, Lcom/szabh/smable3/entity/BleGirlCareSettings;->setMLatestDay(I)V

    sget-object v1, Lcom/szabh/smable3/BleKey;->GIRL_CARE:Lcom/szabh/smable3/BleKey;

    sget-object v2, Lcom/szabh/smable3/BleKeyFlag;->UPDATE:Lcom/szabh/smable3/BleKeyFlag;

    iget-object v3, p0, Lcom/sma/smartv3/ui/device/HealthCareSettingsActivity;->mGirlCareSettings:Lcom/szabh/smable3/entity/BleGirlCareSettings;

    const/16 v6, 0x18

    const/4 v7, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object v0, p4

    invoke-static/range {v0 .. v7}, Lcom/szabh/smable3/component/BaseBleConnector;->sendObject$default(Lcom/szabh/smable3/component/BaseBleConnector;Lcom/szabh/smable3/BleKey;Lcom/szabh/smable3/BleKeyFlag;Lcom/bestmafen/baseble/data/BleBuffer;ZZILjava/lang/Object;)Z

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/HealthCareSettingsActivity;->updateLatest()V

    sget-object p0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p0
.end method

.method private static final onSetOvulationReminder$lambda$1$0(Lcom/sma/smartv3/ui/device/HealthCareSettingsActivity;I)Z
    .locals 2

    new-instance v0, Lcom/android/mltcode/paycertificationapi/i0OXX1;

    invoke-direct {v0, p0, p1}, Lcom/android/mltcode/paycertificationapi/i0OXX1;-><init>(Lcom/sma/smartv3/ui/device/HealthCareSettingsActivity;I)V

    const/4 p0, 0x1

    const/4 p1, 0x0

    const/4 v1, 0x0

    invoke-static {v1, v0, p0, p1}, Lcom/android/mltcode/paycertificationapi/X0IOiX1O;->XIi00iiXO(ZLkotlin/jvm/functions/Function1;ILjava/lang/Object;)Z

    move-result p0

    return p0
.end method

.method private static final onSetOvulationReminder$lambda$1$0$0(Lcom/sma/smartv3/ui/device/HealthCareSettingsActivity;ILcom/szabh/smable3/component/BleConnector;)Lkotlin/Unit;
    .locals 9

    const-string v0, "it"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/HealthCareSettingsActivity;->mGirlCareSettings:Lcom/szabh/smable3/entity/BleGirlCareSettings;

    add-int/lit8 p1, p1, 0x1

    invoke-virtual {v0, p1}, Lcom/szabh/smable3/entity/BleGirlCareSettings;->setMOvulationReminderAdvance(I)V

    sget-object v2, Lcom/szabh/smable3/BleKey;->GIRL_CARE:Lcom/szabh/smable3/BleKey;

    sget-object v3, Lcom/szabh/smable3/BleKeyFlag;->UPDATE:Lcom/szabh/smable3/BleKeyFlag;

    iget-object v4, p0, Lcom/sma/smartv3/ui/device/HealthCareSettingsActivity;->mGirlCareSettings:Lcom/szabh/smable3/entity/BleGirlCareSettings;

    const/16 v7, 0x18

    const/4 v8, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    move-object v1, p2

    invoke-static/range {v1 .. v8}, Lcom/szabh/smable3/component/BaseBleConnector;->sendObject$default(Lcom/szabh/smable3/component/BaseBleConnector;Lcom/szabh/smable3/BleKey;Lcom/szabh/smable3/BleKeyFlag;Lcom/bestmafen/baseble/data/BleBuffer;ZZILjava/lang/Object;)Z

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/HealthCareSettingsActivity;->updateOvulation()V

    sget-object p0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p0
.end method

.method private static final onSetPeriod$lambda$1$0(Lcom/sma/smartv3/ui/device/HealthCareSettingsActivity;I)Z
    .locals 2

    new-instance v0, Lcom/android/mltcode/paycertificationapi/XX011ii;

    invoke-direct {v0, p0, p1}, Lcom/android/mltcode/paycertificationapi/XX011ii;-><init>(Lcom/sma/smartv3/ui/device/HealthCareSettingsActivity;I)V

    const/4 p0, 0x1

    const/4 p1, 0x0

    const/4 v1, 0x0

    invoke-static {v1, v0, p0, p1}, Lcom/android/mltcode/paycertificationapi/X0IOiX1O;->XIi00iiXO(ZLkotlin/jvm/functions/Function1;ILjava/lang/Object;)Z

    move-result p0

    return p0
.end method

.method private static final onSetPeriod$lambda$1$0$0(Lcom/sma/smartv3/ui/device/HealthCareSettingsActivity;ILcom/szabh/smable3/component/BleConnector;)Lkotlin/Unit;
    .locals 9

    const-string v0, "it"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/HealthCareSettingsActivity;->mGirlCareSettings:Lcom/szabh/smable3/entity/BleGirlCareSettings;

    sget v1, Lcom/sma/smartv3/ui/device/HealthCareSettingsActivity;->PERIOD_MIN:I

    add-int/2addr p1, v1

    invoke-virtual {v0, p1}, Lcom/szabh/smable3/entity/BleGirlCareSettings;->setMMenstruationPeriod(I)V

    sget-object v2, Lcom/szabh/smable3/BleKey;->GIRL_CARE:Lcom/szabh/smable3/BleKey;

    sget-object v3, Lcom/szabh/smable3/BleKeyFlag;->UPDATE:Lcom/szabh/smable3/BleKeyFlag;

    iget-object v4, p0, Lcom/sma/smartv3/ui/device/HealthCareSettingsActivity;->mGirlCareSettings:Lcom/szabh/smable3/entity/BleGirlCareSettings;

    const/16 v7, 0x18

    const/4 v8, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    move-object v1, p2

    invoke-static/range {v1 .. v8}, Lcom/szabh/smable3/component/BaseBleConnector;->sendObject$default(Lcom/szabh/smable3/component/BaseBleConnector;Lcom/szabh/smable3/BleKey;Lcom/szabh/smable3/BleKeyFlag;Lcom/bestmafen/baseble/data/BleBuffer;ZZILjava/lang/Object;)Z

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/HealthCareSettingsActivity;->updatePeriod()V

    sget-object p0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p0
.end method

.method private static final onSetPeriodReminder$lambda$1$0(Lcom/sma/smartv3/ui/device/HealthCareSettingsActivity;I)Z
    .locals 2

    new-instance v0, Lcom/android/mltcode/paycertificationapi/O1OIiIOI;

    invoke-direct {v0, p0, p1}, Lcom/android/mltcode/paycertificationapi/O1OIiIOI;-><init>(Lcom/sma/smartv3/ui/device/HealthCareSettingsActivity;I)V

    const/4 p0, 0x1

    const/4 p1, 0x0

    const/4 v1, 0x0

    invoke-static {v1, v0, p0, p1}, Lcom/android/mltcode/paycertificationapi/X0IOiX1O;->XIi00iiXO(ZLkotlin/jvm/functions/Function1;ILjava/lang/Object;)Z

    move-result p0

    return p0
.end method

.method private static final onSetPeriodReminder$lambda$1$0$0(Lcom/sma/smartv3/ui/device/HealthCareSettingsActivity;ILcom/szabh/smable3/component/BleConnector;)Lkotlin/Unit;
    .locals 9

    const-string v0, "it"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/HealthCareSettingsActivity;->mGirlCareSettings:Lcom/szabh/smable3/entity/BleGirlCareSettings;

    add-int/lit8 p1, p1, 0x1

    invoke-virtual {v0, p1}, Lcom/szabh/smable3/entity/BleGirlCareSettings;->setMMenstruationReminderAdvance(I)V

    sget-object v2, Lcom/szabh/smable3/BleKey;->GIRL_CARE:Lcom/szabh/smable3/BleKey;

    sget-object v3, Lcom/szabh/smable3/BleKeyFlag;->UPDATE:Lcom/szabh/smable3/BleKeyFlag;

    iget-object v4, p0, Lcom/sma/smartv3/ui/device/HealthCareSettingsActivity;->mGirlCareSettings:Lcom/szabh/smable3/entity/BleGirlCareSettings;

    const/16 v7, 0x18

    const/4 v8, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    move-object v1, p2

    invoke-static/range {v1 .. v8}, Lcom/szabh/smable3/component/BaseBleConnector;->sendObject$default(Lcom/szabh/smable3/component/BaseBleConnector;Lcom/szabh/smable3/BleKey;Lcom/szabh/smable3/BleKeyFlag;Lcom/bestmafen/baseble/data/BleBuffer;ZZILjava/lang/Object;)Z

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/HealthCareSettingsActivity;->updateMenstruation()V

    sget-object p0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p0
.end method

.method private static final onSetReminderTime$lambda$0$0(Lcom/sma/smartv3/ui/device/HealthCareSettingsActivity;II)Z
    .locals 1

    new-instance v0, Lcom/android/mltcode/paycertificationapi/II00IIOO;

    invoke-direct {v0, p0, p1, p2}, Lcom/android/mltcode/paycertificationapi/II00IIOO;-><init>(Lcom/sma/smartv3/ui/device/HealthCareSettingsActivity;II)V

    const/4 p0, 0x1

    const/4 p1, 0x0

    const/4 p2, 0x0

    invoke-static {p2, v0, p0, p1}, Lcom/android/mltcode/paycertificationapi/X0IOiX1O;->XIi00iiXO(ZLkotlin/jvm/functions/Function1;ILjava/lang/Object;)Z

    move-result p0

    return p0
.end method

.method private static final onSetReminderTime$lambda$0$0$0(Lcom/sma/smartv3/ui/device/HealthCareSettingsActivity;IILcom/szabh/smable3/component/BleConnector;)Lkotlin/Unit;
    .locals 8

    const-string v0, "it"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/HealthCareSettingsActivity;->mGirlCareSettings:Lcom/szabh/smable3/entity/BleGirlCareSettings;

    invoke-virtual {v0, p1}, Lcom/szabh/smable3/entity/BleGirlCareSettings;->setMReminderHour(I)V

    iget-object p1, p0, Lcom/sma/smartv3/ui/device/HealthCareSettingsActivity;->mGirlCareSettings:Lcom/szabh/smable3/entity/BleGirlCareSettings;

    invoke-virtual {p1, p2}, Lcom/szabh/smable3/entity/BleGirlCareSettings;->setMReminderMinute(I)V

    sget-object v1, Lcom/szabh/smable3/BleKey;->GIRL_CARE:Lcom/szabh/smable3/BleKey;

    sget-object v2, Lcom/szabh/smable3/BleKeyFlag;->UPDATE:Lcom/szabh/smable3/BleKeyFlag;

    iget-object v3, p0, Lcom/sma/smartv3/ui/device/HealthCareSettingsActivity;->mGirlCareSettings:Lcom/szabh/smable3/entity/BleGirlCareSettings;

    const/16 v6, 0x18

    const/4 v7, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object v0, p3

    invoke-static/range {v0 .. v7}, Lcom/szabh/smable3/component/BaseBleConnector;->sendObject$default(Lcom/szabh/smable3/component/BaseBleConnector;Lcom/szabh/smable3/BleKey;Lcom/szabh/smable3/BleKeyFlag;Lcom/bestmafen/baseble/data/BleBuffer;ZZILjava/lang/Object;)Z

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/HealthCareSettingsActivity;->updateReminderTime()V

    sget-object p0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p0
.end method

.method private static final rootView_delegate$lambda$0(Lcom/sma/smartv3/ui/device/HealthCareSettingsActivity;)Landroid/view/View;
    .locals 1

    const v0, 0x7f0a09af

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    return-object p0
.end method

.method private final updateDuration()V
    .locals 4

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/HealthCareSettingsActivity;->getItemDuration()Lcom/sma/smartv3/view/AbhSettingsItem;

    move-result-object v0

    iget-object v1, p0, Lcom/sma/smartv3/ui/device/HealthCareSettingsActivity;->mGirlCareSettings:Lcom/szabh/smable3/entity/BleGirlCareSettings;

    invoke-virtual {v1}, Lcom/szabh/smable3/entity/BleGirlCareSettings;->getMMenstruationDuration()I

    move-result v1

    const v2, 0x7f1403ca

    invoke-virtual {p0, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v2

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, " "

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/sma/smartv3/view/AbhSettingsItem;->setMRightText(Ljava/lang/String;)V

    return-void
.end method

.method private final updateLatest()V
    .locals 6

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/HealthCareSettingsActivity;->getItemLast()Lcom/sma/smartv3/view/AbhSettingsItem;

    move-result-object v0

    sget-object v1, Lcom/android/mltcode/paycertificationapi/i72;->OXO1:Lcom/android/mltcode/paycertificationapi/i72;

    invoke-virtual {v1}, Lcom/android/mltcode/paycertificationapi/i72;->XiOIO()Lcom/sma/smartv3/util/DateTimeFormat;

    move-result-object v1

    sget-object v2, Lcom/sma/smartv3/util/DateTimeFormat;->ddMMyyyy:Lcom/sma/smartv3/util/DateTimeFormat;

    const-string v3, "/"

    if-ne v1, v2, :cond_0

    iget-object v1, p0, Lcom/sma/smartv3/ui/device/HealthCareSettingsActivity;->mGirlCareSettings:Lcom/szabh/smable3/entity/BleGirlCareSettings;

    invoke-virtual {v1}, Lcom/szabh/smable3/entity/BleGirlCareSettings;->getMLatestDay()I

    move-result v1

    iget-object v2, p0, Lcom/sma/smartv3/ui/device/HealthCareSettingsActivity;->mGirlCareSettings:Lcom/szabh/smable3/entity/BleGirlCareSettings;

    invoke-virtual {v2}, Lcom/szabh/smable3/entity/BleGirlCareSettings;->getMLatestMonth()I

    move-result v2

    iget-object v4, p0, Lcom/sma/smartv3/ui/device/HealthCareSettingsActivity;->mGirlCareSettings:Lcom/szabh/smable3/entity/BleGirlCareSettings;

    invoke-virtual {v4}, Lcom/szabh/smable3/entity/BleGirlCareSettings;->getMLatestYear()I

    move-result v4

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    goto :goto_0

    :cond_0
    iget-object v1, p0, Lcom/sma/smartv3/ui/device/HealthCareSettingsActivity;->mGirlCareSettings:Lcom/szabh/smable3/entity/BleGirlCareSettings;

    invoke-virtual {v1}, Lcom/szabh/smable3/entity/BleGirlCareSettings;->getMLatestMonth()I

    move-result v1

    iget-object v2, p0, Lcom/sma/smartv3/ui/device/HealthCareSettingsActivity;->mGirlCareSettings:Lcom/szabh/smable3/entity/BleGirlCareSettings;

    invoke-virtual {v2}, Lcom/szabh/smable3/entity/BleGirlCareSettings;->getMLatestDay()I

    move-result v2

    iget-object v4, p0, Lcom/sma/smartv3/ui/device/HealthCareSettingsActivity;->mGirlCareSettings:Lcom/szabh/smable3/entity/BleGirlCareSettings;

    invoke-virtual {v4}, Lcom/szabh/smable3/entity/BleGirlCareSettings;->getMLatestYear()I

    move-result v4

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    :goto_0
    invoke-virtual {v0, v1}, Lcom/sma/smartv3/view/AbhSettingsItem;->setMRightText(Ljava/lang/String;)V

    return-void
.end method

.method private final updateMenstruation()V
    .locals 4

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/HealthCareSettingsActivity;->getItemPeriodReminder()Lcom/sma/smartv3/view/AbhSettingsItem;

    move-result-object v0

    iget-object v1, p0, Lcom/sma/smartv3/ui/device/HealthCareSettingsActivity;->mGirlCareSettings:Lcom/szabh/smable3/entity/BleGirlCareSettings;

    invoke-virtual {v1}, Lcom/szabh/smable3/entity/BleGirlCareSettings;->getMMenstruationReminderAdvance()I

    move-result v1

    const v2, 0x7f1403cb

    invoke-virtual {p0, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v2

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, " "

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/sma/smartv3/view/AbhSettingsItem;->setMRightText(Ljava/lang/String;)V

    return-void
.end method

.method private final updateOvulation()V
    .locals 4

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/HealthCareSettingsActivity;->getItemOvulationReminder()Lcom/sma/smartv3/view/AbhSettingsItem;

    move-result-object v0

    iget-object v1, p0, Lcom/sma/smartv3/ui/device/HealthCareSettingsActivity;->mGirlCareSettings:Lcom/szabh/smable3/entity/BleGirlCareSettings;

    invoke-virtual {v1}, Lcom/szabh/smable3/entity/BleGirlCareSettings;->getMOvulationReminderAdvance()I

    move-result v1

    const v2, 0x7f1403cb

    invoke-virtual {p0, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v2

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, " "

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/sma/smartv3/view/AbhSettingsItem;->setMRightText(Ljava/lang/String;)V

    return-void
.end method

.method private final updatePeriod()V
    .locals 4

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/HealthCareSettingsActivity;->getItemPeriod()Lcom/sma/smartv3/view/AbhSettingsItem;

    move-result-object v0

    iget-object v1, p0, Lcom/sma/smartv3/ui/device/HealthCareSettingsActivity;->mGirlCareSettings:Lcom/szabh/smable3/entity/BleGirlCareSettings;

    invoke-virtual {v1}, Lcom/szabh/smable3/entity/BleGirlCareSettings;->getMMenstruationPeriod()I

    move-result v1

    const v2, 0x7f1403ca

    invoke-virtual {p0, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v2

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, " "

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/sma/smartv3/view/AbhSettingsItem;->setMRightText(Ljava/lang/String;)V

    return-void
.end method

.method private final updateReminderTime()V
    .locals 4

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/HealthCareSettingsActivity;->getItemReminderTime()Lcom/sma/smartv3/view/AbhSettingsItem;

    move-result-object v0

    iget-object v1, p0, Lcom/sma/smartv3/ui/device/HealthCareSettingsActivity;->mGirlCareSettings:Lcom/szabh/smable3/entity/BleGirlCareSettings;

    invoke-virtual {v1}, Lcom/szabh/smable3/entity/BleGirlCareSettings;->getMReminderHour()I

    move-result v1

    iget-object v2, p0, Lcom/sma/smartv3/ui/device/HealthCareSettingsActivity;->mGirlCareSettings:Lcom/szabh/smable3/entity/BleGirlCareSettings;

    invoke-virtual {v2}, Lcom/szabh/smable3/entity/BleGirlCareSettings;->getMReminderMinute()I

    move-result v2

    sget-object v3, Lcom/android/mltcode/paycertificationapi/i72;->OXO1:Lcom/android/mltcode/paycertificationapi/i72;

    invoke-virtual {v3}, Lcom/android/mltcode/paycertificationapi/i72;->i0X000X0O()Z

    move-result v3

    invoke-static {v1, v2, v3}, Lcom/android/mltcode/paycertificationapi/O0X11OiO;->X01IiOiIi(IIZ)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/sma/smartv3/view/AbhSettingsItem;->setMRightText(Ljava/lang/String;)V

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
    .locals 6

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/HealthCareSettingsActivity;->mGirlCareSettings:Lcom/szabh/smable3/entity/BleGirlCareSettings;

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lcom/blankj/utilcode/util/LogUtils;->d([Ljava/lang/Object;)V

    const v0, 0x7f0a0023

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    sget-object v1, Lcom/android/mltcode/paycertificationapi/q62;->OXO1:Lcom/android/mltcode/paycertificationapi/q62;

    invoke-virtual {v1}, Lcom/android/mltcode/paycertificationapi/q62;->XX1Oi()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/HealthCareSettingsActivity;->getItemHeader()Lcom/sma/smartv3/view/AbhSettingsHeader;

    move-result-object v0

    invoke-virtual {v0}, Lcom/sma/smartv3/view/AbhSettingsHeader;->getTvTitle()Landroid/widget/TextView;

    move-result-object v0

    invoke-virtual {v1}, Lcom/android/mltcode/paycertificationapi/q62;->XX1Oi()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/HealthCareSettingsActivity;->getItemHeader()Lcom/sma/smartv3/view/AbhSettingsHeader;

    move-result-object v0

    iget-object v1, p0, Lcom/sma/smartv3/ui/device/HealthCareSettingsActivity;->mGirlCareSettings:Lcom/szabh/smable3/entity/BleGirlCareSettings;

    invoke-virtual {v1}, Lcom/szabh/smable3/entity/BleGirlCareSettings;->getMEnabled()I

    move-result v1

    invoke-static {v1}, Lcom/android/mltcode/paycertificationapi/OiOX0i;->XIi00iiXO(I)Z

    move-result v1

    invoke-virtual {v0, v1}, Lcom/sma/smartv3/view/AbhSettingsHeader;->setChecked(Z)V

    new-instance v1, Lcom/android/mltcode/paycertificationapi/OX1O0;

    invoke-direct {v1, p0}, Lcom/android/mltcode/paycertificationapi/OX1O0;-><init>(Lcom/sma/smartv3/ui/device/HealthCareSettingsActivity;)V

    invoke-virtual {v0, v1}, Lcom/sma/smartv3/view/AbhSettingsHeader;->setMListener(Lkotlin/jvm/functions/Function1;)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/HealthCareSettingsActivity;->mGirlCareSettings:Lcom/szabh/smable3/entity/BleGirlCareSettings;

    invoke-virtual {v0}, Lcom/szabh/smable3/entity/BleGirlCareSettings;->getMMenstruationDuration()I

    move-result v0

    const/4 v1, 0x5

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/HealthCareSettingsActivity;->mGirlCareSettings:Lcom/szabh/smable3/entity/BleGirlCareSettings;

    invoke-virtual {v0, v1}, Lcom/szabh/smable3/entity/BleGirlCareSettings;->setMMenstruationDuration(I)V

    :cond_0
    iget-object v0, p0, Lcom/sma/smartv3/ui/device/HealthCareSettingsActivity;->mGirlCareSettings:Lcom/szabh/smable3/entity/BleGirlCareSettings;

    invoke-virtual {v0}, Lcom/szabh/smable3/entity/BleGirlCareSettings;->getMMenstruationPeriod()I

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/HealthCareSettingsActivity;->mGirlCareSettings:Lcom/szabh/smable3/entity/BleGirlCareSettings;

    const/16 v2, 0x1c

    invoke-virtual {v0, v2}, Lcom/szabh/smable3/entity/BleGirlCareSettings;->setMMenstruationPeriod(I)V

    :cond_1
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v0

    iget-object v2, p0, Lcom/sma/smartv3/ui/device/HealthCareSettingsActivity;->mGirlCareSettings:Lcom/szabh/smable3/entity/BleGirlCareSettings;

    invoke-virtual {v2}, Lcom/szabh/smable3/entity/BleGirlCareSettings;->getMLatestYear()I

    move-result v2

    const/4 v3, 0x1

    if-nez v2, :cond_2

    iget-object v2, p0, Lcom/sma/smartv3/ui/device/HealthCareSettingsActivity;->mGirlCareSettings:Lcom/szabh/smable3/entity/BleGirlCareSettings;

    invoke-virtual {v0, v3}, Ljava/util/Calendar;->get(I)I

    move-result v4

    invoke-virtual {v2, v4}, Lcom/szabh/smable3/entity/BleGirlCareSettings;->setMLatestYear(I)V

    :cond_2
    iget-object v2, p0, Lcom/sma/smartv3/ui/device/HealthCareSettingsActivity;->mGirlCareSettings:Lcom/szabh/smable3/entity/BleGirlCareSettings;

    invoke-virtual {v2}, Lcom/szabh/smable3/entity/BleGirlCareSettings;->getMLatestMonth()I

    move-result v2

    const/4 v4, 0x2

    if-nez v2, :cond_3

    iget-object v2, p0, Lcom/sma/smartv3/ui/device/HealthCareSettingsActivity;->mGirlCareSettings:Lcom/szabh/smable3/entity/BleGirlCareSettings;

    invoke-virtual {v0, v4}, Ljava/util/Calendar;->get(I)I

    move-result v5

    add-int/2addr v5, v3

    invoke-virtual {v2, v5}, Lcom/szabh/smable3/entity/BleGirlCareSettings;->setMLatestMonth(I)V

    :cond_3
    iget-object v2, p0, Lcom/sma/smartv3/ui/device/HealthCareSettingsActivity;->mGirlCareSettings:Lcom/szabh/smable3/entity/BleGirlCareSettings;

    invoke-virtual {v2}, Lcom/szabh/smable3/entity/BleGirlCareSettings;->getMLatestDay()I

    move-result v2

    if-nez v2, :cond_4

    iget-object v2, p0, Lcom/sma/smartv3/ui/device/HealthCareSettingsActivity;->mGirlCareSettings:Lcom/szabh/smable3/entity/BleGirlCareSettings;

    invoke-virtual {v0, v1}, Ljava/util/Calendar;->get(I)I

    move-result v0

    invoke-virtual {v2, v0}, Lcom/szabh/smable3/entity/BleGirlCareSettings;->setMLatestDay(I)V

    :cond_4
    iget-object v0, p0, Lcom/sma/smartv3/ui/device/HealthCareSettingsActivity;->mGirlCareSettings:Lcom/szabh/smable3/entity/BleGirlCareSettings;

    invoke-virtual {v0}, Lcom/szabh/smable3/entity/BleGirlCareSettings;->getMMenstruationReminderAdvance()I

    move-result v0

    if-nez v0, :cond_5

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/HealthCareSettingsActivity;->mGirlCareSettings:Lcom/szabh/smable3/entity/BleGirlCareSettings;

    invoke-virtual {v0, v4}, Lcom/szabh/smable3/entity/BleGirlCareSettings;->setMMenstruationReminderAdvance(I)V

    :cond_5
    iget-object v0, p0, Lcom/sma/smartv3/ui/device/HealthCareSettingsActivity;->mGirlCareSettings:Lcom/szabh/smable3/entity/BleGirlCareSettings;

    invoke-virtual {v0}, Lcom/szabh/smable3/entity/BleGirlCareSettings;->getMOvulationReminderAdvance()I

    move-result v0

    if-nez v0, :cond_6

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/HealthCareSettingsActivity;->mGirlCareSettings:Lcom/szabh/smable3/entity/BleGirlCareSettings;

    const/4 v1, 0x3

    invoke-virtual {v0, v1}, Lcom/szabh/smable3/entity/BleGirlCareSettings;->setMOvulationReminderAdvance(I)V

    :cond_6
    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/HealthCareSettingsActivity;->updateDuration()V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/HealthCareSettingsActivity;->updatePeriod()V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/HealthCareSettingsActivity;->updateLatest()V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/HealthCareSettingsActivity;->updateMenstruation()V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/HealthCareSettingsActivity;->updateOvulation()V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/HealthCareSettingsActivity;->updateReminderTime()V

    return-void
.end method

.method public layoutId()I
    .locals 1

    const v0, 0x7f0d00b1

    return v0
.end method

.method public final onSetDuration(Landroid/view/View;)V
    .locals 3
    .param p1    # Landroid/view/View;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "view"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, Lcom/sma/smartv3/ui/device/HealthCareSettingsActivity;->mDurationPopup:Lcom/android/mltcode/paycertificationapi/qv1;

    if-nez p1, :cond_1

    new-instance p1, Ljava/util/ArrayList;

    const/4 v0, 0x7

    invoke-direct {p1, v0}, Ljava/util/ArrayList;-><init>(I)V

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_0

    add-int/lit8 v2, v1, 0x2

    invoke-static {v2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/android/mltcode/paycertificationapi/qv1;

    invoke-direct {v0, p0, p1}, Lcom/android/mltcode/paycertificationapi/qv1;-><init>(Landroid/app/Activity;Ljava/util/List;)V

    const p1, 0x7f1410b8

    invoke-virtual {v0, p1}, Lcom/android/mltcode/paycertificationapi/qv1;->IXXOO(I)V

    const p1, 0x7f1403ca

    invoke-virtual {v0, p1}, Lcom/android/mltcode/paycertificationapi/qv1;->iOO1ii1(I)V

    new-instance p1, Lcom/android/mltcode/paycertificationapi/XIiXO1O0;

    invoke-direct {p1, p0}, Lcom/android/mltcode/paycertificationapi/XIiXO1O0;-><init>(Lcom/sma/smartv3/ui/device/HealthCareSettingsActivity;)V

    invoke-virtual {v0, p1}, Lcom/android/mltcode/paycertificationapi/qv1;->iX(Lkotlin/jvm/functions/Function1;)V

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/HealthCareSettingsActivity;->mDurationPopup:Lcom/android/mltcode/paycertificationapi/qv1;

    :cond_1
    iget-object p1, p0, Lcom/sma/smartv3/ui/device/HealthCareSettingsActivity;->mDurationPopup:Lcom/android/mltcode/paycertificationapi/qv1;

    if-eqz p1, :cond_2

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/HealthCareSettingsActivity;->mGirlCareSettings:Lcom/szabh/smable3/entity/BleGirlCareSettings;

    invoke-virtual {v0}, Lcom/szabh/smable3/entity/BleGirlCareSettings;->getMMenstruationDuration()I

    move-result v0

    add-int/lit8 v0, v0, -0x2

    invoke-virtual {p1, v0}, Lcom/android/mltcode/paycertificationapi/qv1;->O1O(I)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/HealthCareSettingsActivity;->getRootView()Landroid/view/View;

    move-result-object v0

    const-string v1, "<get-rootView>(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1, v0}, Lcom/android/mltcode/paycertificationapi/I0OIO1i;->I1XOi1(Landroid/view/View;)V

    :cond_2
    return-void
.end method

.method public final onSetLast(Landroid/view/View;)V
    .locals 3
    .param p1    # Landroid/view/View;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "view"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, Lcom/sma/smartv3/ui/device/HealthCareSettingsActivity;->mLastPopup:Lcom/android/mltcode/paycertificationapi/O1100iXOX;

    if-nez p1, :cond_0

    new-instance p1, Lcom/android/mltcode/paycertificationapi/O1100iXOX;

    invoke-direct {p1, p0}, Lcom/android/mltcode/paycertificationapi/O1100iXOX;-><init>(Landroid/app/Activity;)V

    const v0, 0x7f140dfb

    invoke-virtual {p1, v0}, Lcom/android/mltcode/paycertificationapi/O1100iXOX;->iX(I)V

    new-instance v0, Lcom/android/mltcode/paycertificationapi/O0IXiXX;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/O0IXiXX;-><init>(Lcom/sma/smartv3/ui/device/HealthCareSettingsActivity;)V

    invoke-virtual {p1, v0}, Lcom/android/mltcode/paycertificationapi/O1100iXOX;->i010I(Lkotlin/jvm/functions/Function3;)V

    iput-object p1, p0, Lcom/sma/smartv3/ui/device/HealthCareSettingsActivity;->mLastPopup:Lcom/android/mltcode/paycertificationapi/O1100iXOX;

    :cond_0
    iget-object p1, p0, Lcom/sma/smartv3/ui/device/HealthCareSettingsActivity;->mLastPopup:Lcom/android/mltcode/paycertificationapi/O1100iXOX;

    if-eqz p1, :cond_1

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/HealthCareSettingsActivity;->mGirlCareSettings:Lcom/szabh/smable3/entity/BleGirlCareSettings;

    invoke-virtual {v0}, Lcom/szabh/smable3/entity/BleGirlCareSettings;->getMLatestYear()I

    move-result v0

    iget-object v1, p0, Lcom/sma/smartv3/ui/device/HealthCareSettingsActivity;->mGirlCareSettings:Lcom/szabh/smable3/entity/BleGirlCareSettings;

    invoke-virtual {v1}, Lcom/szabh/smable3/entity/BleGirlCareSettings;->getMLatestMonth()I

    move-result v1

    iget-object v2, p0, Lcom/sma/smartv3/ui/device/HealthCareSettingsActivity;->mGirlCareSettings:Lcom/szabh/smable3/entity/BleGirlCareSettings;

    invoke-virtual {v2}, Lcom/szabh/smable3/entity/BleGirlCareSettings;->getMLatestDay()I

    move-result v2

    invoke-virtual {p1, v0, v1, v2}, Lcom/android/mltcode/paycertificationapi/O1100iXOX;->II1Xi0(III)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/HealthCareSettingsActivity;->getRootView()Landroid/view/View;

    move-result-object v0

    const-string v1, "<get-rootView>(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1, v0}, Lcom/android/mltcode/paycertificationapi/I0OIO1i;->I1XOi1(Landroid/view/View;)V

    :cond_1
    return-void
.end method

.method public final onSetOvulationReminder(Landroid/view/View;)V
    .locals 3
    .param p1    # Landroid/view/View;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "view"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, Lcom/sma/smartv3/ui/device/HealthCareSettingsActivity;->mOvulationReminderPopup:Lcom/android/mltcode/paycertificationapi/qv1;

    if-nez p1, :cond_1

    new-instance p1, Ljava/util/ArrayList;

    const/4 v0, 0x3

    invoke-direct {p1, v0}, Ljava/util/ArrayList;-><init>(I)V

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_0

    add-int/lit8 v1, v1, 0x1

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/android/mltcode/paycertificationapi/qv1;

    invoke-direct {v0, p0, p1}, Lcom/android/mltcode/paycertificationapi/qv1;-><init>(Landroid/app/Activity;Ljava/util/List;)V

    const p1, 0x7f14108a

    invoke-virtual {v0, p1}, Lcom/android/mltcode/paycertificationapi/qv1;->IXXOO(I)V

    const p1, 0x7f1403cb

    invoke-virtual {v0, p1}, Lcom/android/mltcode/paycertificationapi/qv1;->iOO1ii1(I)V

    new-instance p1, Lcom/android/mltcode/paycertificationapi/X1OiXi;

    invoke-direct {p1, p0}, Lcom/android/mltcode/paycertificationapi/X1OiXi;-><init>(Lcom/sma/smartv3/ui/device/HealthCareSettingsActivity;)V

    invoke-virtual {v0, p1}, Lcom/android/mltcode/paycertificationapi/qv1;->iX(Lkotlin/jvm/functions/Function1;)V

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/HealthCareSettingsActivity;->mOvulationReminderPopup:Lcom/android/mltcode/paycertificationapi/qv1;

    :cond_1
    iget-object p1, p0, Lcom/sma/smartv3/ui/device/HealthCareSettingsActivity;->mOvulationReminderPopup:Lcom/android/mltcode/paycertificationapi/qv1;

    if-eqz p1, :cond_2

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/HealthCareSettingsActivity;->mGirlCareSettings:Lcom/szabh/smable3/entity/BleGirlCareSettings;

    invoke-virtual {v0}, Lcom/szabh/smable3/entity/BleGirlCareSettings;->getMOvulationReminderAdvance()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    invoke-virtual {p1, v0}, Lcom/android/mltcode/paycertificationapi/qv1;->O1O(I)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/HealthCareSettingsActivity;->getRootView()Landroid/view/View;

    move-result-object v0

    const-string v1, "<get-rootView>(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1, v0}, Lcom/android/mltcode/paycertificationapi/I0OIO1i;->I1XOi1(Landroid/view/View;)V

    :cond_2
    return-void
.end method

.method public final onSetPeriod(Landroid/view/View;)V
    .locals 3
    .param p1    # Landroid/view/View;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "view"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, Lcom/sma/smartv3/ui/device/HealthCareSettingsActivity;->mPeriodPopup:Lcom/android/mltcode/paycertificationapi/qv1;

    if-nez p1, :cond_1

    sget p1, Lcom/sma/smartv3/ui/device/HealthCareSettingsActivity;->PERIOD_MAX:I

    sget v0, Lcom/sma/smartv3/ui/device/HealthCareSettingsActivity;->PERIOD_MIN:I

    sub-int/2addr p1, v0

    add-int/lit8 p1, p1, 0x1

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0, p1}, Ljava/util/ArrayList;-><init>(I)V

    const/4 v1, 0x0

    :goto_0
    if-ge v1, p1, :cond_0

    sget v2, Lcom/sma/smartv3/ui/device/HealthCareSettingsActivity;->PERIOD_MIN:I

    add-int/2addr v2, v1

    invoke-static {v2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    new-instance p1, Lcom/android/mltcode/paycertificationapi/qv1;

    invoke-direct {p1, p0, v0}, Lcom/android/mltcode/paycertificationapi/qv1;-><init>(Landroid/app/Activity;Ljava/util/List;)V

    const v0, 0x7f140397

    invoke-virtual {p1, v0}, Lcom/android/mltcode/paycertificationapi/qv1;->IXXOO(I)V

    const v0, 0x7f1403ca

    invoke-virtual {p1, v0}, Lcom/android/mltcode/paycertificationapi/qv1;->iOO1ii1(I)V

    new-instance v0, Lcom/android/mltcode/paycertificationapi/O1i10iiX;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/O1i10iiX;-><init>(Lcom/sma/smartv3/ui/device/HealthCareSettingsActivity;)V

    invoke-virtual {p1, v0}, Lcom/android/mltcode/paycertificationapi/qv1;->iX(Lkotlin/jvm/functions/Function1;)V

    iput-object p1, p0, Lcom/sma/smartv3/ui/device/HealthCareSettingsActivity;->mPeriodPopup:Lcom/android/mltcode/paycertificationapi/qv1;

    :cond_1
    iget-object p1, p0, Lcom/sma/smartv3/ui/device/HealthCareSettingsActivity;->mPeriodPopup:Lcom/android/mltcode/paycertificationapi/qv1;

    if-eqz p1, :cond_2

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/HealthCareSettingsActivity;->mGirlCareSettings:Lcom/szabh/smable3/entity/BleGirlCareSettings;

    invoke-virtual {v0}, Lcom/szabh/smable3/entity/BleGirlCareSettings;->getMMenstruationPeriod()I

    move-result v0

    sget v1, Lcom/sma/smartv3/ui/device/HealthCareSettingsActivity;->PERIOD_MIN:I

    sub-int/2addr v0, v1

    invoke-virtual {p1, v0}, Lcom/android/mltcode/paycertificationapi/qv1;->O1O(I)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/HealthCareSettingsActivity;->getRootView()Landroid/view/View;

    move-result-object v0

    const-string v1, "<get-rootView>(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1, v0}, Lcom/android/mltcode/paycertificationapi/I0OIO1i;->I1XOi1(Landroid/view/View;)V

    :cond_2
    return-void
.end method

.method public final onSetPeriodReminder(Landroid/view/View;)V
    .locals 3
    .param p1    # Landroid/view/View;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "view"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, Lcom/sma/smartv3/ui/device/HealthCareSettingsActivity;->mPeriodReminderPopup:Lcom/android/mltcode/paycertificationapi/qv1;

    if-nez p1, :cond_1

    new-instance p1, Ljava/util/ArrayList;

    const/4 v0, 0x3

    invoke-direct {p1, v0}, Ljava/util/ArrayList;-><init>(I)V

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_0

    add-int/lit8 v1, v1, 0x1

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/android/mltcode/paycertificationapi/qv1;

    invoke-direct {v0, p0, p1}, Lcom/android/mltcode/paycertificationapi/qv1;-><init>(Landroid/app/Activity;Ljava/util/List;)V

    const p1, 0x7f1410ba

    invoke-virtual {v0, p1}, Lcom/android/mltcode/paycertificationapi/qv1;->IXXOO(I)V

    const p1, 0x7f1403cb

    invoke-virtual {v0, p1}, Lcom/android/mltcode/paycertificationapi/qv1;->iOO1ii1(I)V

    new-instance p1, Lcom/android/mltcode/paycertificationapi/IIX11iIIi;

    invoke-direct {p1, p0}, Lcom/android/mltcode/paycertificationapi/IIX11iIIi;-><init>(Lcom/sma/smartv3/ui/device/HealthCareSettingsActivity;)V

    invoke-virtual {v0, p1}, Lcom/android/mltcode/paycertificationapi/qv1;->iX(Lkotlin/jvm/functions/Function1;)V

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/HealthCareSettingsActivity;->mPeriodReminderPopup:Lcom/android/mltcode/paycertificationapi/qv1;

    :cond_1
    iget-object p1, p0, Lcom/sma/smartv3/ui/device/HealthCareSettingsActivity;->mPeriodReminderPopup:Lcom/android/mltcode/paycertificationapi/qv1;

    if-eqz p1, :cond_2

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/HealthCareSettingsActivity;->mGirlCareSettings:Lcom/szabh/smable3/entity/BleGirlCareSettings;

    invoke-virtual {v0}, Lcom/szabh/smable3/entity/BleGirlCareSettings;->getMMenstruationReminderAdvance()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    invoke-virtual {p1, v0}, Lcom/android/mltcode/paycertificationapi/qv1;->O1O(I)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/HealthCareSettingsActivity;->getRootView()Landroid/view/View;

    move-result-object v0

    const-string v1, "<get-rootView>(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1, v0}, Lcom/android/mltcode/paycertificationapi/I0OIO1i;->I1XOi1(Landroid/view/View;)V

    :cond_2
    return-void
.end method

.method public final onSetReminderTime(Landroid/view/View;)V
    .locals 2
    .param p1    # Landroid/view/View;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "view"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, Lcom/sma/smartv3/ui/device/HealthCareSettingsActivity;->mReminderPopup:Lcom/android/mltcode/paycertificationapi/it5;

    if-nez p1, :cond_0

    new-instance p1, Lcom/android/mltcode/paycertificationapi/it5;

    sget-object v0, Lcom/android/mltcode/paycertificationapi/i72;->OXO1:Lcom/android/mltcode/paycertificationapi/i72;

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/i72;->i0X000X0O()Z

    move-result v0

    invoke-direct {p1, p0, v0}, Lcom/android/mltcode/paycertificationapi/it5;-><init>(Landroid/app/Activity;Z)V

    const v0, 0x7f141189

    invoke-virtual {p1, v0}, Lcom/android/mltcode/paycertificationapi/it5;->i010I(I)V

    new-instance v0, Lcom/android/mltcode/paycertificationapi/XI0I11O1i;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/XI0I11O1i;-><init>(Lcom/sma/smartv3/ui/device/HealthCareSettingsActivity;)V

    invoke-virtual {p1, v0}, Lcom/android/mltcode/paycertificationapi/it5;->II1Xi0(Lkotlin/jvm/functions/Function2;)V

    iput-object p1, p0, Lcom/sma/smartv3/ui/device/HealthCareSettingsActivity;->mReminderPopup:Lcom/android/mltcode/paycertificationapi/it5;

    :cond_0
    iget-object p1, p0, Lcom/sma/smartv3/ui/device/HealthCareSettingsActivity;->mReminderPopup:Lcom/android/mltcode/paycertificationapi/it5;

    if-eqz p1, :cond_1

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/HealthCareSettingsActivity;->mGirlCareSettings:Lcom/szabh/smable3/entity/BleGirlCareSettings;

    invoke-virtual {v0}, Lcom/szabh/smable3/entity/BleGirlCareSettings;->getMReminderHour()I

    move-result v0

    iget-object v1, p0, Lcom/sma/smartv3/ui/device/HealthCareSettingsActivity;->mGirlCareSettings:Lcom/szabh/smable3/entity/BleGirlCareSettings;

    invoke-virtual {v1}, Lcom/szabh/smable3/entity/BleGirlCareSettings;->getMReminderMinute()I

    move-result v1

    invoke-virtual {p1, v0, v1}, Lcom/android/mltcode/paycertificationapi/it5;->iX(II)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/HealthCareSettingsActivity;->getRootView()Landroid/view/View;

    move-result-object v0

    const-string v1, "<get-rootView>(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1, v0}, Lcom/android/mltcode/paycertificationapi/I0OIO1i;->I1XOi1(Landroid/view/View;)V

    :cond_1
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
