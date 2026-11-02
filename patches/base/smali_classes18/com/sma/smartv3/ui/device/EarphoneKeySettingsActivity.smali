.class public final Lcom/sma/smartv3/ui/device/EarphoneKeySettingsActivity;
.super Lcom/bestmafen/androidbase/base/BaseActivity;
.source "SourceFile"


# instance fields
.field private final itemHeaderLeftClick$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final itemHeaderLeftDoubleClick$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final itemHeaderLeftLongClick$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final itemHeaderLeftTripleClick$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final itemHeaderRightClick$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final itemHeaderRightDoubleClick$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final itemHeaderRightLongClick$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final itemHeaderRightTripleClick$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final itemLeftClick$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final itemLeftDoubleClick$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final itemLeftLongClick$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final itemLeftTripleClick$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final itemRightClick$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final itemRightDoubleClick$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final itemRightLongClick$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final itemRightTripleClick$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final leftPanel$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final mBleHandleCallback:Lcom/sma/smartv3/ui/device/EarphoneKeySettingsActivity$OXO1;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private mSettings:Lcom/szabh/smable3/entity/BleEarphoneKey;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final rightPanel$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 8

    invoke-direct {p0}, Lcom/bestmafen/androidbase/base/BaseActivity;-><init>()V

    new-instance v0, Lcom/android/mltcode/paycertificationapi/XIO1ii11I;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/XIO1ii11I;-><init>(Lcom/sma/smartv3/ui/device/EarphoneKeySettingsActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/EarphoneKeySettingsActivity;->leftPanel$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/iiX0OIX;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/iiX0OIX;-><init>(Lcom/sma/smartv3/ui/device/EarphoneKeySettingsActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/EarphoneKeySettingsActivity;->itemHeaderLeftClick$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/Oi01III;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/Oi01III;-><init>(Lcom/sma/smartv3/ui/device/EarphoneKeySettingsActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/EarphoneKeySettingsActivity;->itemLeftClick$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/I1I0I1;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/I1I0I1;-><init>(Lcom/sma/smartv3/ui/device/EarphoneKeySettingsActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/EarphoneKeySettingsActivity;->itemHeaderLeftDoubleClick$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/OiXO0Xi1;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/OiXO0Xi1;-><init>(Lcom/sma/smartv3/ui/device/EarphoneKeySettingsActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/EarphoneKeySettingsActivity;->itemLeftDoubleClick$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/i10I1IOX;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/i10I1IOX;-><init>(Lcom/sma/smartv3/ui/device/EarphoneKeySettingsActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/EarphoneKeySettingsActivity;->itemHeaderLeftTripleClick$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/X0OX1X;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/X0OX1X;-><init>(Lcom/sma/smartv3/ui/device/EarphoneKeySettingsActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/EarphoneKeySettingsActivity;->itemLeftTripleClick$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/X0iXXi;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/X0iXXi;-><init>(Lcom/sma/smartv3/ui/device/EarphoneKeySettingsActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/EarphoneKeySettingsActivity;->itemHeaderLeftLongClick$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/XOiiXii;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/XOiiXii;-><init>(Lcom/sma/smartv3/ui/device/EarphoneKeySettingsActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/EarphoneKeySettingsActivity;->itemLeftLongClick$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/I1OIi1101;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/I1OIi1101;-><init>(Lcom/sma/smartv3/ui/device/EarphoneKeySettingsActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/EarphoneKeySettingsActivity;->rightPanel$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/iiOi0IIi;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/iiOi0IIi;-><init>(Lcom/sma/smartv3/ui/device/EarphoneKeySettingsActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/EarphoneKeySettingsActivity;->itemHeaderRightClick$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/OOIXI1;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/OOIXI1;-><init>(Lcom/sma/smartv3/ui/device/EarphoneKeySettingsActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/EarphoneKeySettingsActivity;->itemRightClick$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/X10O1;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/X10O1;-><init>(Lcom/sma/smartv3/ui/device/EarphoneKeySettingsActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/EarphoneKeySettingsActivity;->itemHeaderRightDoubleClick$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/I110X00;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/I110X00;-><init>(Lcom/sma/smartv3/ui/device/EarphoneKeySettingsActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/EarphoneKeySettingsActivity;->itemRightDoubleClick$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/X1IO0;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/X1IO0;-><init>(Lcom/sma/smartv3/ui/device/EarphoneKeySettingsActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/EarphoneKeySettingsActivity;->itemHeaderRightTripleClick$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/iXOIiOO1;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/iXOIiOO1;-><init>(Lcom/sma/smartv3/ui/device/EarphoneKeySettingsActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/EarphoneKeySettingsActivity;->itemRightTripleClick$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/X0II0iI;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/X0II0iI;-><init>(Lcom/sma/smartv3/ui/device/EarphoneKeySettingsActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/EarphoneKeySettingsActivity;->itemHeaderRightLongClick$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/O0Xi0OX1;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/O0Xi0OX1;-><init>(Lcom/sma/smartv3/ui/device/EarphoneKeySettingsActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/EarphoneKeySettingsActivity;->itemRightLongClick$delegate:Lkotlin/Lazy;

    sget-object v1, Lcom/szabh/smable3/component/BleCache;->INSTANCE:Lcom/szabh/smable3/component/BleCache;

    sget-object v2, Lcom/szabh/smable3/BleKey;->EARPHONE_KEY:Lcom/szabh/smable3/BleKey;

    const/16 v6, 0xc

    const/4 v7, 0x0

    const-class v3, Lcom/szabh/smable3/entity/BleEarphoneKey;

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-static/range {v1 .. v7}, Lcom/szabh/smable3/component/BaseBleCache;->getObjectNotNull$default(Lcom/szabh/smable3/component/BaseBleCache;Lcom/szabh/smable3/BleKey;Ljava/lang/Class;Ljava/lang/Object;Lcom/szabh/smable3/BleKeyFlag;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/szabh/smable3/entity/BleEarphoneKey;

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/EarphoneKeySettingsActivity;->mSettings:Lcom/szabh/smable3/entity/BleEarphoneKey;

    new-instance v0, Lcom/sma/smartv3/ui/device/EarphoneKeySettingsActivity$OXO1;

    invoke-direct {v0, p0}, Lcom/sma/smartv3/ui/device/EarphoneKeySettingsActivity$OXO1;-><init>(Lcom/sma/smartv3/ui/device/EarphoneKeySettingsActivity;)V

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/EarphoneKeySettingsActivity;->mBleHandleCallback:Lcom/sma/smartv3/ui/device/EarphoneKeySettingsActivity$OXO1;

    return-void
.end method

.method public static synthetic I0iXXO(Lcom/sma/smartv3/ui/device/EarphoneKeySettingsActivity;)Lcom/sma/smartv3/view/AbhSettingsItem;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/device/EarphoneKeySettingsActivity;->itemRightTripleClick_delegate$lambda$0(Lcom/sma/smartv3/ui/device/EarphoneKeySettingsActivity;)Lcom/sma/smartv3/view/AbhSettingsItem;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic I1(Lcom/sma/smartv3/ui/device/EarphoneKeySettingsActivity;ZLcom/szabh/smable3/component/BleConnector;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/sma/smartv3/ui/device/EarphoneKeySettingsActivity;->updateUI$lambda$4$0$0(Lcom/sma/smartv3/ui/device/EarphoneKeySettingsActivity;ZLcom/szabh/smable3/component/BleConnector;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic I1XOi1(Lcom/sma/smartv3/ui/device/EarphoneKeySettingsActivity;ZLcom/szabh/smable3/component/BleConnector;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/sma/smartv3/ui/device/EarphoneKeySettingsActivity;->updateUI$lambda$3$0$0(Lcom/sma/smartv3/ui/device/EarphoneKeySettingsActivity;ZLcom/szabh/smable3/component/BleConnector;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic II1Xi0(Lcom/sma/smartv3/ui/device/EarphoneKeySettingsActivity;)Lcom/sma/smartv3/view/AbhSettingsHeader;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/device/EarphoneKeySettingsActivity;->itemHeaderLeftTripleClick_delegate$lambda$0(Lcom/sma/smartv3/ui/device/EarphoneKeySettingsActivity;)Lcom/sma/smartv3/view/AbhSettingsHeader;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic IIX1OXO(Lcom/sma/smartv3/ui/device/EarphoneKeySettingsActivity;)Lcom/sma/smartv3/view/AbhSettingsItem;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/device/EarphoneKeySettingsActivity;->itemLeftClick_delegate$lambda$0(Lcom/sma/smartv3/ui/device/EarphoneKeySettingsActivity;)Lcom/sma/smartv3/view/AbhSettingsItem;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic IXXOO(Lcom/sma/smartv3/ui/device/EarphoneKeySettingsActivity;Z)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Lcom/sma/smartv3/ui/device/EarphoneKeySettingsActivity;->updateUI$lambda$2$0(Lcom/sma/smartv3/ui/device/EarphoneKeySettingsActivity;Z)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic O001I(Lcom/sma/smartv3/ui/device/EarphoneKeySettingsActivity;ZLcom/szabh/smable3/component/BleConnector;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/sma/smartv3/ui/device/EarphoneKeySettingsActivity;->updateUI$lambda$6$0$0(Lcom/sma/smartv3/ui/device/EarphoneKeySettingsActivity;ZLcom/szabh/smable3/component/BleConnector;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic O10IXXX0X(Lcom/sma/smartv3/ui/device/EarphoneKeySettingsActivity;)Lcom/sma/smartv3/view/AbhSettingsItem;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/device/EarphoneKeySettingsActivity;->itemLeftLongClick_delegate$lambda$0(Lcom/sma/smartv3/ui/device/EarphoneKeySettingsActivity;)Lcom/sma/smartv3/view/AbhSettingsItem;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic O1O(Landroid/view/View;Lcom/sma/smartv3/ui/device/EarphoneKeySettingsActivity;I)Z
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/sma/smartv3/ui/device/EarphoneKeySettingsActivity;->onShowKeysPopup$lambda$0$0(Landroid/view/View;Lcom/sma/smartv3/ui/device/EarphoneKeySettingsActivity;I)Z

    move-result p0

    return p0
.end method

.method public static synthetic OII(Lcom/sma/smartv3/ui/device/EarphoneKeySettingsActivity;Z)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Lcom/sma/smartv3/ui/device/EarphoneKeySettingsActivity;->updateUI$lambda$1$0(Lcom/sma/smartv3/ui/device/EarphoneKeySettingsActivity;Z)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic OIX0iXi(Landroid/view/View;Lcom/sma/smartv3/ui/device/EarphoneKeySettingsActivity;ILcom/szabh/smable3/component/BleConnector;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lcom/sma/smartv3/ui/device/EarphoneKeySettingsActivity;->onShowKeysPopup$lambda$0$0$0(Landroid/view/View;Lcom/sma/smartv3/ui/device/EarphoneKeySettingsActivity;ILcom/szabh/smable3/component/BleConnector;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic OX(Lcom/sma/smartv3/ui/device/EarphoneKeySettingsActivity;)Lcom/sma/smartv3/view/AbhSettingsHeader;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/device/EarphoneKeySettingsActivity;->itemHeaderLeftLongClick_delegate$lambda$0(Lcom/sma/smartv3/ui/device/EarphoneKeySettingsActivity;)Lcom/sma/smartv3/view/AbhSettingsHeader;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic OiIIX101O(Lcom/sma/smartv3/ui/device/EarphoneKeySettingsActivity;Z)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Lcom/sma/smartv3/ui/device/EarphoneKeySettingsActivity;->updateUI$lambda$6$0(Lcom/sma/smartv3/ui/device/EarphoneKeySettingsActivity;Z)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic X01IiOiIi(Lcom/sma/smartv3/ui/device/EarphoneKeySettingsActivity;ZLcom/szabh/smable3/component/BleConnector;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/sma/smartv3/ui/device/EarphoneKeySettingsActivity;->updateUI$lambda$2$0$0(Lcom/sma/smartv3/ui/device/EarphoneKeySettingsActivity;ZLcom/szabh/smable3/component/BleConnector;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic X0O(Lcom/sma/smartv3/ui/device/EarphoneKeySettingsActivity;Z)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Lcom/sma/smartv3/ui/device/EarphoneKeySettingsActivity;->updateUI$lambda$0$0(Lcom/sma/smartv3/ui/device/EarphoneKeySettingsActivity;Z)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic X0i1O(Lcom/sma/smartv3/ui/device/EarphoneKeySettingsActivity;)Lcom/sma/smartv3/view/AbhSettingsItem;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/device/EarphoneKeySettingsActivity;->itemRightClick_delegate$lambda$0(Lcom/sma/smartv3/ui/device/EarphoneKeySettingsActivity;)Lcom/sma/smartv3/view/AbhSettingsItem;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic X11iII1O1(Lcom/sma/smartv3/ui/device/EarphoneKeySettingsActivity;)Lcom/sma/smartv3/view/AbhSettingsItem;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/device/EarphoneKeySettingsActivity;->itemLeftTripleClick_delegate$lambda$0(Lcom/sma/smartv3/ui/device/EarphoneKeySettingsActivity;)Lcom/sma/smartv3/view/AbhSettingsItem;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic X1IX(Lcom/sma/smartv3/ui/device/EarphoneKeySettingsActivity;)Lcom/sma/smartv3/view/AbhSettingsItem;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/device/EarphoneKeySettingsActivity;->itemRightDoubleClick_delegate$lambda$0(Lcom/sma/smartv3/ui/device/EarphoneKeySettingsActivity;)Lcom/sma/smartv3/view/AbhSettingsItem;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic X1ii(Lcom/sma/smartv3/ui/device/EarphoneKeySettingsActivity;Z)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Lcom/sma/smartv3/ui/device/EarphoneKeySettingsActivity;->updateUI$lambda$3$0(Lcom/sma/smartv3/ui/device/EarphoneKeySettingsActivity;Z)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic XX0(Lcom/sma/smartv3/ui/device/EarphoneKeySettingsActivity;)Landroid/view/View;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/device/EarphoneKeySettingsActivity;->leftPanel_delegate$lambda$0(Lcom/sma/smartv3/ui/device/EarphoneKeySettingsActivity;)Landroid/view/View;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic XXI(Lcom/sma/smartv3/ui/device/EarphoneKeySettingsActivity;Z)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Lcom/sma/smartv3/ui/device/EarphoneKeySettingsActivity;->updateUI$lambda$4$0(Lcom/sma/smartv3/ui/device/EarphoneKeySettingsActivity;Z)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic XXIIO1i11(Lcom/sma/smartv3/ui/device/EarphoneKeySettingsActivity;)Lcom/sma/smartv3/view/AbhSettingsHeader;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/device/EarphoneKeySettingsActivity;->itemHeaderLeftClick_delegate$lambda$0(Lcom/sma/smartv3/ui/device/EarphoneKeySettingsActivity;)Lcom/sma/smartv3/view/AbhSettingsHeader;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic XXO(Lcom/sma/smartv3/ui/device/EarphoneKeySettingsActivity;)Lcom/sma/smartv3/view/AbhSettingsHeader;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/device/EarphoneKeySettingsActivity;->itemHeaderLeftDoubleClick_delegate$lambda$0(Lcom/sma/smartv3/ui/device/EarphoneKeySettingsActivity;)Lcom/sma/smartv3/view/AbhSettingsHeader;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic XXX11i(Lcom/sma/smartv3/ui/device/EarphoneKeySettingsActivity;)Lcom/sma/smartv3/view/AbhSettingsHeader;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/device/EarphoneKeySettingsActivity;->itemHeaderRightClick_delegate$lambda$0(Lcom/sma/smartv3/ui/device/EarphoneKeySettingsActivity;)Lcom/sma/smartv3/view/AbhSettingsHeader;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic XiOIO(Lcom/sma/smartv3/ui/device/EarphoneKeySettingsActivity;)Lcom/sma/smartv3/view/AbhSettingsHeader;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/device/EarphoneKeySettingsActivity;->itemHeaderRightTripleClick_delegate$lambda$0(Lcom/sma/smartv3/ui/device/EarphoneKeySettingsActivity;)Lcom/sma/smartv3/view/AbhSettingsHeader;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic XiOIii1(Lcom/sma/smartv3/ui/device/EarphoneKeySettingsActivity;)Landroid/view/View;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/device/EarphoneKeySettingsActivity;->rightPanel_delegate$lambda$0(Lcom/sma/smartv3/ui/device/EarphoneKeySettingsActivity;)Landroid/view/View;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$setMSettings$p(Lcom/sma/smartv3/ui/device/EarphoneKeySettingsActivity;Lcom/szabh/smable3/entity/BleEarphoneKey;)V
    .locals 0

    iput-object p1, p0, Lcom/sma/smartv3/ui/device/EarphoneKeySettingsActivity;->mSettings:Lcom/szabh/smable3/entity/BleEarphoneKey;

    return-void
.end method

.method public static final synthetic access$updateUI(Lcom/sma/smartv3/ui/device/EarphoneKeySettingsActivity;)V
    .locals 0

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/EarphoneKeySettingsActivity;->updateUI()V

    return-void
.end method

.method private final getItemHeaderLeftClick()Lcom/sma/smartv3/view/AbhSettingsHeader;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/EarphoneKeySettingsActivity;->itemHeaderLeftClick$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/sma/smartv3/view/AbhSettingsHeader;

    return-object v0
.end method

.method private final getItemHeaderLeftDoubleClick()Lcom/sma/smartv3/view/AbhSettingsHeader;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/EarphoneKeySettingsActivity;->itemHeaderLeftDoubleClick$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/sma/smartv3/view/AbhSettingsHeader;

    return-object v0
.end method

.method private final getItemHeaderLeftLongClick()Lcom/sma/smartv3/view/AbhSettingsHeader;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/EarphoneKeySettingsActivity;->itemHeaderLeftLongClick$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/sma/smartv3/view/AbhSettingsHeader;

    return-object v0
.end method

.method private final getItemHeaderLeftTripleClick()Lcom/sma/smartv3/view/AbhSettingsHeader;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/EarphoneKeySettingsActivity;->itemHeaderLeftTripleClick$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/sma/smartv3/view/AbhSettingsHeader;

    return-object v0
.end method

.method private final getItemHeaderRightClick()Lcom/sma/smartv3/view/AbhSettingsHeader;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/EarphoneKeySettingsActivity;->itemHeaderRightClick$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/sma/smartv3/view/AbhSettingsHeader;

    return-object v0
.end method

.method private final getItemHeaderRightDoubleClick()Lcom/sma/smartv3/view/AbhSettingsHeader;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/EarphoneKeySettingsActivity;->itemHeaderRightDoubleClick$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/sma/smartv3/view/AbhSettingsHeader;

    return-object v0
.end method

.method private final getItemHeaderRightLongClick()Lcom/sma/smartv3/view/AbhSettingsHeader;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/EarphoneKeySettingsActivity;->itemHeaderRightLongClick$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/sma/smartv3/view/AbhSettingsHeader;

    return-object v0
.end method

.method private final getItemHeaderRightTripleClick()Lcom/sma/smartv3/view/AbhSettingsHeader;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/EarphoneKeySettingsActivity;->itemHeaderRightTripleClick$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/sma/smartv3/view/AbhSettingsHeader;

    return-object v0
.end method

.method private final getItemLeftClick()Lcom/sma/smartv3/view/AbhSettingsItem;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/EarphoneKeySettingsActivity;->itemLeftClick$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/sma/smartv3/view/AbhSettingsItem;

    return-object v0
.end method

.method private final getItemLeftDoubleClick()Lcom/sma/smartv3/view/AbhSettingsItem;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/EarphoneKeySettingsActivity;->itemLeftDoubleClick$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/sma/smartv3/view/AbhSettingsItem;

    return-object v0
.end method

.method private final getItemLeftLongClick()Lcom/sma/smartv3/view/AbhSettingsItem;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/EarphoneKeySettingsActivity;->itemLeftLongClick$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/sma/smartv3/view/AbhSettingsItem;

    return-object v0
.end method

.method private final getItemLeftTripleClick()Lcom/sma/smartv3/view/AbhSettingsItem;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/EarphoneKeySettingsActivity;->itemLeftTripleClick$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/sma/smartv3/view/AbhSettingsItem;

    return-object v0
.end method

.method private final getItemRightClick()Lcom/sma/smartv3/view/AbhSettingsItem;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/EarphoneKeySettingsActivity;->itemRightClick$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/sma/smartv3/view/AbhSettingsItem;

    return-object v0
.end method

.method private final getItemRightDoubleClick()Lcom/sma/smartv3/view/AbhSettingsItem;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/EarphoneKeySettingsActivity;->itemRightDoubleClick$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/sma/smartv3/view/AbhSettingsItem;

    return-object v0
.end method

.method private final getItemRightLongClick()Lcom/sma/smartv3/view/AbhSettingsItem;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/EarphoneKeySettingsActivity;->itemRightLongClick$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/sma/smartv3/view/AbhSettingsItem;

    return-object v0
.end method

.method private final getItemRightTripleClick()Lcom/sma/smartv3/view/AbhSettingsItem;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/EarphoneKeySettingsActivity;->itemRightTripleClick$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/sma/smartv3/view/AbhSettingsItem;

    return-object v0
.end method

.method private final getKeyName(I)Ljava/lang/String;
    .locals 1

    const-string v0, "getString(...)"

    packed-switch p1, :pswitch_data_0

    const p1, 0x7f14049e

    invoke-virtual {p0, p1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1

    :pswitch_0
    const p1, 0x7f1404a3

    invoke-virtual {p0, p1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1

    :pswitch_1
    const p1, 0x7f1404a5

    invoke-virtual {p0, p1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1

    :pswitch_2
    const p1, 0x7f1404a2

    invoke-virtual {p0, p1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1

    :pswitch_3
    const p1, 0x7f1404a4

    invoke-virtual {p0, p1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1

    :pswitch_4
    const p1, 0x7f1404a6

    invoke-virtual {p0, p1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1

    :pswitch_5
    const p1, 0x7f1404a7

    invoke-virtual {p0, p1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1

    :pswitch_6
    const p1, 0x7f1404a8

    invoke-virtual {p0, p1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1

    :pswitch_7
    const p1, 0x7f1404a1

    invoke-virtual {p0, p1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1

    :pswitch_8
    const p1, 0x7f14049f

    invoke-virtual {p0, p1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1

    :pswitch_9
    const p1, 0x7f14049d

    invoke-virtual {p0, p1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1

    :pswitch_a
    const p1, 0x7f1404a0

    invoke-virtual {p0, p1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method private final getLeftPanel()Landroid/view/View;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/EarphoneKeySettingsActivity;->leftPanel$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    return-object v0
.end method

.method private final getRightPanel()Landroid/view/View;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/EarphoneKeySettingsActivity;->rightPanel$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    return-object v0
.end method

.method public static synthetic i010I(Lcom/sma/smartv3/ui/device/EarphoneKeySettingsActivity;Z)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Lcom/sma/smartv3/ui/device/EarphoneKeySettingsActivity;->updateUI$lambda$7$0(Lcom/sma/smartv3/ui/device/EarphoneKeySettingsActivity;Z)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic iI(Lcom/sma/smartv3/ui/device/EarphoneKeySettingsActivity;)Lcom/sma/smartv3/view/AbhSettingsItem;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/device/EarphoneKeySettingsActivity;->itemRightLongClick_delegate$lambda$0(Lcom/sma/smartv3/ui/device/EarphoneKeySettingsActivity;)Lcom/sma/smartv3/view/AbhSettingsItem;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic iIXi1iiXI(Lcom/sma/smartv3/ui/device/EarphoneKeySettingsActivity;ZLcom/szabh/smable3/component/BleConnector;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/sma/smartv3/ui/device/EarphoneKeySettingsActivity;->updateUI$lambda$0$0$0(Lcom/sma/smartv3/ui/device/EarphoneKeySettingsActivity;ZLcom/szabh/smable3/component/BleConnector;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic iIiiO(Lcom/sma/smartv3/ui/device/EarphoneKeySettingsActivity;)Lcom/sma/smartv3/view/AbhSettingsHeader;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/device/EarphoneKeySettingsActivity;->itemHeaderRightLongClick_delegate$lambda$0(Lcom/sma/smartv3/ui/device/EarphoneKeySettingsActivity;)Lcom/sma/smartv3/view/AbhSettingsHeader;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic iOO1ii1(Lcom/sma/smartv3/ui/device/EarphoneKeySettingsActivity;ZLcom/szabh/smable3/component/BleConnector;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/sma/smartv3/ui/device/EarphoneKeySettingsActivity;->updateUI$lambda$5$0$0(Lcom/sma/smartv3/ui/device/EarphoneKeySettingsActivity;ZLcom/szabh/smable3/component/BleConnector;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic iOOX010X(Lcom/sma/smartv3/ui/device/EarphoneKeySettingsActivity;ZLcom/szabh/smable3/component/BleConnector;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/sma/smartv3/ui/device/EarphoneKeySettingsActivity;->updateUI$lambda$7$0$0(Lcom/sma/smartv3/ui/device/EarphoneKeySettingsActivity;ZLcom/szabh/smable3/component/BleConnector;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic iX(Lcom/sma/smartv3/ui/device/EarphoneKeySettingsActivity;ZLcom/szabh/smable3/component/BleConnector;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/sma/smartv3/ui/device/EarphoneKeySettingsActivity;->updateUI$lambda$1$0$0(Lcom/sma/smartv3/ui/device/EarphoneKeySettingsActivity;ZLcom/szabh/smable3/component/BleConnector;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic iX1O1(Lcom/sma/smartv3/ui/device/EarphoneKeySettingsActivity;)Lcom/sma/smartv3/view/AbhSettingsHeader;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/device/EarphoneKeySettingsActivity;->itemHeaderRightDoubleClick_delegate$lambda$0(Lcom/sma/smartv3/ui/device/EarphoneKeySettingsActivity;)Lcom/sma/smartv3/view/AbhSettingsHeader;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic iXiX011(Lcom/sma/smartv3/ui/device/EarphoneKeySettingsActivity;)Lcom/sma/smartv3/view/AbhSettingsItem;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/device/EarphoneKeySettingsActivity;->itemLeftDoubleClick_delegate$lambda$0(Lcom/sma/smartv3/ui/device/EarphoneKeySettingsActivity;)Lcom/sma/smartv3/view/AbhSettingsItem;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic iXiiiO(Lcom/sma/smartv3/ui/device/EarphoneKeySettingsActivity;Z)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Lcom/sma/smartv3/ui/device/EarphoneKeySettingsActivity;->updateUI$lambda$5$0(Lcom/sma/smartv3/ui/device/EarphoneKeySettingsActivity;Z)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method private final indexToKey(I)I
    .locals 12

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/EarphoneKeySettingsActivity;->mSettings:Lcom/szabh/smable3/entity/BleEarphoneKey;

    invoke-virtual {v0}, Lcom/szabh/smable3/entity/BleEarphoneKey;->getMType()I

    move-result v0

    const/4 v1, 0x5

    const/4 v2, 0x6

    const/4 v3, 0x7

    const/4 v4, 0x0

    const/4 v5, 0x2

    const/4 v6, 0x3

    const/4 v7, 0x1

    if-ne v0, v7, :cond_0

    packed-switch p1, :pswitch_data_0

    return v4

    :pswitch_0
    return v3

    :pswitch_1
    return v2

    :pswitch_2
    return v1

    :pswitch_3
    return v6

    :pswitch_4
    return v5

    :pswitch_5
    return v7

    :cond_0
    iget-object v0, p0, Lcom/sma/smartv3/ui/device/EarphoneKeySettingsActivity;->mSettings:Lcom/szabh/smable3/entity/BleEarphoneKey;

    invoke-virtual {v0}, Lcom/szabh/smable3/entity/BleEarphoneKey;->getMType()I

    move-result v0

    const/16 v8, 0x8

    const/16 v9, 0x9

    const/16 v10, 0xa

    const/16 v11, 0xb

    if-ne v0, v5, :cond_1

    packed-switch p1, :pswitch_data_1

    return v4

    :pswitch_6
    return v11

    :pswitch_7
    return v10

    :pswitch_8
    return v9

    :pswitch_9
    return v8

    :pswitch_a
    return v3

    :pswitch_b
    return v2

    :pswitch_c
    return v1

    :pswitch_d
    return v6

    :pswitch_e
    return v5

    :pswitch_f
    return v7

    :cond_1
    iget-object v0, p0, Lcom/sma/smartv3/ui/device/EarphoneKeySettingsActivity;->mSettings:Lcom/szabh/smable3/entity/BleEarphoneKey;

    invoke-virtual {v0}, Lcom/szabh/smable3/entity/BleEarphoneKey;->getMType()I

    move-result v0

    if-ne v0, v6, :cond_2

    packed-switch p1, :pswitch_data_2

    return v4

    :pswitch_10
    return v11

    :pswitch_11
    return v10

    :pswitch_12
    return v9

    :pswitch_13
    return v8

    :pswitch_14
    return v3

    :pswitch_15
    return v2

    :pswitch_16
    return v1

    :pswitch_17
    const/4 p1, 0x4

    return p1

    :pswitch_18
    return v6

    :pswitch_19
    return v5

    :pswitch_1a
    return v7

    :cond_2
    return p1

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch

    :pswitch_data_1
    .packed-switch 0x1
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
    .end packed-switch

    :pswitch_data_2
    .packed-switch 0x1
        :pswitch_1a
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
    .end packed-switch
.end method

.method private static final itemHeaderLeftClick_delegate$lambda$0(Lcom/sma/smartv3/ui/device/EarphoneKeySettingsActivity;)Lcom/sma/smartv3/view/AbhSettingsHeader;
    .locals 1

    const v0, 0x7f0a0597

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Lcom/sma/smartv3/view/AbhSettingsHeader;

    return-object p0
.end method

.method private static final itemHeaderLeftDoubleClick_delegate$lambda$0(Lcom/sma/smartv3/ui/device/EarphoneKeySettingsActivity;)Lcom/sma/smartv3/view/AbhSettingsHeader;
    .locals 1

    const v0, 0x7f0a0598

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Lcom/sma/smartv3/view/AbhSettingsHeader;

    return-object p0
.end method

.method private static final itemHeaderLeftLongClick_delegate$lambda$0(Lcom/sma/smartv3/ui/device/EarphoneKeySettingsActivity;)Lcom/sma/smartv3/view/AbhSettingsHeader;
    .locals 1

    const v0, 0x7f0a0599

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Lcom/sma/smartv3/view/AbhSettingsHeader;

    return-object p0
.end method

.method private static final itemHeaderLeftTripleClick_delegate$lambda$0(Lcom/sma/smartv3/ui/device/EarphoneKeySettingsActivity;)Lcom/sma/smartv3/view/AbhSettingsHeader;
    .locals 1

    const v0, 0x7f0a059a

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Lcom/sma/smartv3/view/AbhSettingsHeader;

    return-object p0
.end method

.method private static final itemHeaderRightClick_delegate$lambda$0(Lcom/sma/smartv3/ui/device/EarphoneKeySettingsActivity;)Lcom/sma/smartv3/view/AbhSettingsHeader;
    .locals 1

    const v0, 0x7f0a059f

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Lcom/sma/smartv3/view/AbhSettingsHeader;

    return-object p0
.end method

.method private static final itemHeaderRightDoubleClick_delegate$lambda$0(Lcom/sma/smartv3/ui/device/EarphoneKeySettingsActivity;)Lcom/sma/smartv3/view/AbhSettingsHeader;
    .locals 1

    const v0, 0x7f0a05a0

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Lcom/sma/smartv3/view/AbhSettingsHeader;

    return-object p0
.end method

.method private static final itemHeaderRightLongClick_delegate$lambda$0(Lcom/sma/smartv3/ui/device/EarphoneKeySettingsActivity;)Lcom/sma/smartv3/view/AbhSettingsHeader;
    .locals 1

    const v0, 0x7f0a05a1

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Lcom/sma/smartv3/view/AbhSettingsHeader;

    return-object p0
.end method

.method private static final itemHeaderRightTripleClick_delegate$lambda$0(Lcom/sma/smartv3/ui/device/EarphoneKeySettingsActivity;)Lcom/sma/smartv3/view/AbhSettingsHeader;
    .locals 1

    const v0, 0x7f0a05a2

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Lcom/sma/smartv3/view/AbhSettingsHeader;

    return-object p0
.end method

.method private static final itemLeftClick_delegate$lambda$0(Lcom/sma/smartv3/ui/device/EarphoneKeySettingsActivity;)Lcom/sma/smartv3/view/AbhSettingsItem;
    .locals 1

    const v0, 0x7f0a05b4

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Lcom/sma/smartv3/view/AbhSettingsItem;

    return-object p0
.end method

.method private static final itemLeftDoubleClick_delegate$lambda$0(Lcom/sma/smartv3/ui/device/EarphoneKeySettingsActivity;)Lcom/sma/smartv3/view/AbhSettingsItem;
    .locals 1

    const v0, 0x7f0a05b5

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Lcom/sma/smartv3/view/AbhSettingsItem;

    return-object p0
.end method

.method private static final itemLeftLongClick_delegate$lambda$0(Lcom/sma/smartv3/ui/device/EarphoneKeySettingsActivity;)Lcom/sma/smartv3/view/AbhSettingsItem;
    .locals 1

    const v0, 0x7f0a05b6

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Lcom/sma/smartv3/view/AbhSettingsItem;

    return-object p0
.end method

.method private static final itemLeftTripleClick_delegate$lambda$0(Lcom/sma/smartv3/ui/device/EarphoneKeySettingsActivity;)Lcom/sma/smartv3/view/AbhSettingsItem;
    .locals 1

    const v0, 0x7f0a05b7

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Lcom/sma/smartv3/view/AbhSettingsItem;

    return-object p0
.end method

.method private static final itemRightClick_delegate$lambda$0(Lcom/sma/smartv3/ui/device/EarphoneKeySettingsActivity;)Lcom/sma/smartv3/view/AbhSettingsItem;
    .locals 1

    const v0, 0x7f0a05d7

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Lcom/sma/smartv3/view/AbhSettingsItem;

    return-object p0
.end method

.method private static final itemRightDoubleClick_delegate$lambda$0(Lcom/sma/smartv3/ui/device/EarphoneKeySettingsActivity;)Lcom/sma/smartv3/view/AbhSettingsItem;
    .locals 1

    const v0, 0x7f0a05d8

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Lcom/sma/smartv3/view/AbhSettingsItem;

    return-object p0
.end method

.method private static final itemRightLongClick_delegate$lambda$0(Lcom/sma/smartv3/ui/device/EarphoneKeySettingsActivity;)Lcom/sma/smartv3/view/AbhSettingsItem;
    .locals 1

    const v0, 0x7f0a05d9

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Lcom/sma/smartv3/view/AbhSettingsItem;

    return-object p0
.end method

.method private static final itemRightTripleClick_delegate$lambda$0(Lcom/sma/smartv3/ui/device/EarphoneKeySettingsActivity;)Lcom/sma/smartv3/view/AbhSettingsItem;
    .locals 1

    const v0, 0x7f0a05da

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Lcom/sma/smartv3/view/AbhSettingsItem;

    return-object p0
.end method

.method private final keyToIndex(I)I
    .locals 12

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/EarphoneKeySettingsActivity;->mSettings:Lcom/szabh/smable3/entity/BleEarphoneKey;

    invoke-virtual {v0}, Lcom/szabh/smable3/entity/BleEarphoneKey;->getMType()I

    move-result v0

    const/4 v1, 0x4

    const/4 v2, 0x0

    const/4 v3, 0x7

    const/4 v4, 0x6

    const/4 v5, 0x5

    const/4 v6, 0x3

    const/4 v7, 0x2

    const/4 v8, 0x1

    if-ne v0, v8, :cond_6

    if-eq p1, v8, :cond_5

    if-eq p1, v7, :cond_4

    if-eq p1, v6, :cond_3

    if-eq p1, v5, :cond_2

    if-eq p1, v4, :cond_1

    if-eq p1, v3, :cond_0

    return v2

    :cond_0
    return v4

    :cond_1
    return v5

    :cond_2
    return v1

    :cond_3
    return v6

    :cond_4
    return v7

    :cond_5
    return v8

    :cond_6
    iget-object v0, p0, Lcom/sma/smartv3/ui/device/EarphoneKeySettingsActivity;->mSettings:Lcom/szabh/smable3/entity/BleEarphoneKey;

    invoke-virtual {v0}, Lcom/szabh/smable3/entity/BleEarphoneKey;->getMType()I

    move-result v0

    const/16 v9, 0x8

    const/16 v10, 0x9

    const/16 v11, 0xa

    if-ne v0, v7, :cond_7

    packed-switch p1, :pswitch_data_0

    :pswitch_0
    return v2

    :pswitch_1
    return v11

    :pswitch_2
    return v10

    :pswitch_3
    return v9

    :pswitch_4
    return v3

    :pswitch_5
    return v4

    :pswitch_6
    return v5

    :pswitch_7
    return v1

    :pswitch_8
    return v6

    :pswitch_9
    return v7

    :pswitch_a
    return v8

    :cond_7
    iget-object v0, p0, Lcom/sma/smartv3/ui/device/EarphoneKeySettingsActivity;->mSettings:Lcom/szabh/smable3/entity/BleEarphoneKey;

    invoke-virtual {v0}, Lcom/szabh/smable3/entity/BleEarphoneKey;->getMType()I

    move-result v0

    if-ne v0, v6, :cond_8

    packed-switch p1, :pswitch_data_1

    return v2

    :pswitch_b
    const/16 p1, 0xb

    return p1

    :pswitch_c
    return v11

    :pswitch_d
    return v10

    :pswitch_e
    return v9

    :pswitch_f
    return v3

    :pswitch_10
    return v4

    :pswitch_11
    return v5

    :pswitch_12
    return v1

    :pswitch_13
    return v6

    :pswitch_14
    return v7

    :pswitch_15
    return v8

    :cond_8
    return p1

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_0
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
    .end packed-switch

    :pswitch_data_1
    .packed-switch 0x1
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
    .end packed-switch
.end method

.method private static final leftPanel_delegate$lambda$0(Lcom/sma/smartv3/ui/device/EarphoneKeySettingsActivity;)Landroid/view/View;
    .locals 1

    const v0, 0x7f0a0700

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    return-object p0
.end method

.method private static final onShowKeysPopup$lambda$0$0(Landroid/view/View;Lcom/sma/smartv3/ui/device/EarphoneKeySettingsActivity;I)Z
    .locals 1

    new-instance v0, Lcom/android/mltcode/paycertificationapi/i0XiX0;

    invoke-direct {v0, p0, p1, p2}, Lcom/android/mltcode/paycertificationapi/i0XiX0;-><init>(Landroid/view/View;Lcom/sma/smartv3/ui/device/EarphoneKeySettingsActivity;I)V

    const/4 p0, 0x1

    const/4 p1, 0x0

    const/4 p2, 0x0

    invoke-static {p2, v0, p0, p1}, Lcom/android/mltcode/paycertificationapi/X0IOiX1O;->XIi00iiXO(ZLkotlin/jvm/functions/Function1;ILjava/lang/Object;)Z

    move-result p0

    return p0
.end method

.method private static final onShowKeysPopup$lambda$0$0$0(Landroid/view/View;Lcom/sma/smartv3/ui/device/EarphoneKeySettingsActivity;ILcom/szabh/smable3/component/BleConnector;)Lkotlin/Unit;
    .locals 8

    const-string v0, "it"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Landroid/view/View;->getId()I

    move-result p0

    packed-switch p0, :pswitch_data_0

    packed-switch p0, :pswitch_data_1

    goto :goto_0

    :pswitch_0
    iget-object p0, p1, Lcom/sma/smartv3/ui/device/EarphoneKeySettingsActivity;->mSettings:Lcom/szabh/smable3/entity/BleEarphoneKey;

    invoke-direct {p1, p2}, Lcom/sma/smartv3/ui/device/EarphoneKeySettingsActivity;->indexToKey(I)I

    move-result p2

    invoke-virtual {p0, p2}, Lcom/szabh/smable3/entity/BleEarphoneKey;->setMRightTripleClick(I)V

    goto :goto_0

    :pswitch_1
    iget-object p0, p1, Lcom/sma/smartv3/ui/device/EarphoneKeySettingsActivity;->mSettings:Lcom/szabh/smable3/entity/BleEarphoneKey;

    invoke-direct {p1, p2}, Lcom/sma/smartv3/ui/device/EarphoneKeySettingsActivity;->indexToKey(I)I

    move-result p2

    invoke-virtual {p0, p2}, Lcom/szabh/smable3/entity/BleEarphoneKey;->setMRightLongClick(I)V

    goto :goto_0

    :pswitch_2
    iget-object p0, p1, Lcom/sma/smartv3/ui/device/EarphoneKeySettingsActivity;->mSettings:Lcom/szabh/smable3/entity/BleEarphoneKey;

    invoke-direct {p1, p2}, Lcom/sma/smartv3/ui/device/EarphoneKeySettingsActivity;->indexToKey(I)I

    move-result p2

    invoke-virtual {p0, p2}, Lcom/szabh/smable3/entity/BleEarphoneKey;->setMRightDoubleClick(I)V

    goto :goto_0

    :pswitch_3
    iget-object p0, p1, Lcom/sma/smartv3/ui/device/EarphoneKeySettingsActivity;->mSettings:Lcom/szabh/smable3/entity/BleEarphoneKey;

    invoke-direct {p1, p2}, Lcom/sma/smartv3/ui/device/EarphoneKeySettingsActivity;->indexToKey(I)I

    move-result p2

    invoke-virtual {p0, p2}, Lcom/szabh/smable3/entity/BleEarphoneKey;->setMRightClick(I)V

    goto :goto_0

    :pswitch_4
    iget-object p0, p1, Lcom/sma/smartv3/ui/device/EarphoneKeySettingsActivity;->mSettings:Lcom/szabh/smable3/entity/BleEarphoneKey;

    invoke-direct {p1, p2}, Lcom/sma/smartv3/ui/device/EarphoneKeySettingsActivity;->indexToKey(I)I

    move-result p2

    invoke-virtual {p0, p2}, Lcom/szabh/smable3/entity/BleEarphoneKey;->setMLeftTripleClick(I)V

    goto :goto_0

    :pswitch_5
    iget-object p0, p1, Lcom/sma/smartv3/ui/device/EarphoneKeySettingsActivity;->mSettings:Lcom/szabh/smable3/entity/BleEarphoneKey;

    invoke-direct {p1, p2}, Lcom/sma/smartv3/ui/device/EarphoneKeySettingsActivity;->indexToKey(I)I

    move-result p2

    invoke-virtual {p0, p2}, Lcom/szabh/smable3/entity/BleEarphoneKey;->setMLeftLongClick(I)V

    goto :goto_0

    :pswitch_6
    iget-object p0, p1, Lcom/sma/smartv3/ui/device/EarphoneKeySettingsActivity;->mSettings:Lcom/szabh/smable3/entity/BleEarphoneKey;

    invoke-direct {p1, p2}, Lcom/sma/smartv3/ui/device/EarphoneKeySettingsActivity;->indexToKey(I)I

    move-result p2

    invoke-virtual {p0, p2}, Lcom/szabh/smable3/entity/BleEarphoneKey;->setMLeftDoubleClick(I)V

    goto :goto_0

    :pswitch_7
    iget-object p0, p1, Lcom/sma/smartv3/ui/device/EarphoneKeySettingsActivity;->mSettings:Lcom/szabh/smable3/entity/BleEarphoneKey;

    invoke-direct {p1, p2}, Lcom/sma/smartv3/ui/device/EarphoneKeySettingsActivity;->indexToKey(I)I

    move-result p2

    invoke-virtual {p0, p2}, Lcom/szabh/smable3/entity/BleEarphoneKey;->setMLeftClick(I)V

    :goto_0
    sget-object v1, Lcom/szabh/smable3/BleKey;->EARPHONE_KEY:Lcom/szabh/smable3/BleKey;

    sget-object v2, Lcom/szabh/smable3/BleKeyFlag;->UPDATE:Lcom/szabh/smable3/BleKeyFlag;

    iget-object v3, p1, Lcom/sma/smartv3/ui/device/EarphoneKeySettingsActivity;->mSettings:Lcom/szabh/smable3/entity/BleEarphoneKey;

    const/16 v6, 0x18

    const/4 v7, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object v0, p3

    invoke-static/range {v0 .. v7}, Lcom/szabh/smable3/component/BaseBleConnector;->sendObject$default(Lcom/szabh/smable3/component/BaseBleConnector;Lcom/szabh/smable3/BleKey;Lcom/szabh/smable3/BleKeyFlag;Lcom/bestmafen/baseble/data/BleBuffer;ZZILjava/lang/Object;)Z

    invoke-virtual {p1}, Lcom/sma/smartv3/ui/device/EarphoneKeySettingsActivity;->initView()V

    sget-object p0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p0

    :pswitch_data_0
    .packed-switch 0x7f0a05b4
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
    .end packed-switch

    :pswitch_data_1
    .packed-switch 0x7f0a05d7
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method private static final rightPanel_delegate$lambda$0(Lcom/sma/smartv3/ui/device/EarphoneKeySettingsActivity;)Landroid/view/View;
    .locals 1

    const v0, 0x7f0a071a

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    return-object p0
.end method

.method private final updateUI()V
    .locals 5

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/EarphoneKeySettingsActivity;->getItemHeaderLeftClick()Lcom/sma/smartv3/view/AbhSettingsHeader;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/sma/smartv3/view/AbhSettingsHeader;->setMListener(Lkotlin/jvm/functions/Function1;)V

    iget-object v2, p0, Lcom/sma/smartv3/ui/device/EarphoneKeySettingsActivity;->mSettings:Lcom/szabh/smable3/entity/BleEarphoneKey;

    invoke-virtual {v2}, Lcom/szabh/smable3/entity/BleEarphoneKey;->getMLeftClick()I

    move-result v2

    const/4 v3, 0x0

    const/4 v4, 0x1

    if-lez v2, :cond_0

    move v2, v4

    goto :goto_0

    :cond_0
    move v2, v3

    :goto_0
    invoke-virtual {v0, v2}, Lcom/sma/smartv3/view/AbhSettingsHeader;->setChecked(Z)V

    new-instance v2, Lcom/android/mltcode/paycertificationapi/I1iOOXi;

    invoke-direct {v2, p0}, Lcom/android/mltcode/paycertificationapi/I1iOOXi;-><init>(Lcom/sma/smartv3/ui/device/EarphoneKeySettingsActivity;)V

    invoke-virtual {v0, v2}, Lcom/sma/smartv3/view/AbhSettingsHeader;->setMListener(Lkotlin/jvm/functions/Function1;)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/EarphoneKeySettingsActivity;->getItemLeftClick()Lcom/sma/smartv3/view/AbhSettingsItem;

    move-result-object v0

    iget-object v2, p0, Lcom/sma/smartv3/ui/device/EarphoneKeySettingsActivity;->mSettings:Lcom/szabh/smable3/entity/BleEarphoneKey;

    invoke-virtual {v2}, Lcom/szabh/smable3/entity/BleEarphoneKey;->getMLeftClick()I

    move-result v2

    invoke-direct {p0, v2}, Lcom/sma/smartv3/ui/device/EarphoneKeySettingsActivity;->getKeyName(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Lcom/sma/smartv3/view/AbhSettingsItem;->setMLeftText(Ljava/lang/String;)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/EarphoneKeySettingsActivity;->getItemHeaderLeftDoubleClick()Lcom/sma/smartv3/view/AbhSettingsHeader;

    move-result-object v0

    invoke-virtual {v0, v1}, Lcom/sma/smartv3/view/AbhSettingsHeader;->setMListener(Lkotlin/jvm/functions/Function1;)V

    iget-object v2, p0, Lcom/sma/smartv3/ui/device/EarphoneKeySettingsActivity;->mSettings:Lcom/szabh/smable3/entity/BleEarphoneKey;

    invoke-virtual {v2}, Lcom/szabh/smable3/entity/BleEarphoneKey;->getMLeftDoubleClick()I

    move-result v2

    if-lez v2, :cond_1

    move v2, v4

    goto :goto_1

    :cond_1
    move v2, v3

    :goto_1
    invoke-virtual {v0, v2}, Lcom/sma/smartv3/view/AbhSettingsHeader;->setChecked(Z)V

    new-instance v2, Lcom/android/mltcode/paycertificationapi/O1IO0IOIO;

    invoke-direct {v2, p0}, Lcom/android/mltcode/paycertificationapi/O1IO0IOIO;-><init>(Lcom/sma/smartv3/ui/device/EarphoneKeySettingsActivity;)V

    invoke-virtual {v0, v2}, Lcom/sma/smartv3/view/AbhSettingsHeader;->setMListener(Lkotlin/jvm/functions/Function1;)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/EarphoneKeySettingsActivity;->getItemLeftDoubleClick()Lcom/sma/smartv3/view/AbhSettingsItem;

    move-result-object v0

    iget-object v2, p0, Lcom/sma/smartv3/ui/device/EarphoneKeySettingsActivity;->mSettings:Lcom/szabh/smable3/entity/BleEarphoneKey;

    invoke-virtual {v2}, Lcom/szabh/smable3/entity/BleEarphoneKey;->getMLeftDoubleClick()I

    move-result v2

    invoke-direct {p0, v2}, Lcom/sma/smartv3/ui/device/EarphoneKeySettingsActivity;->getKeyName(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Lcom/sma/smartv3/view/AbhSettingsItem;->setMLeftText(Ljava/lang/String;)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/EarphoneKeySettingsActivity;->getItemHeaderLeftTripleClick()Lcom/sma/smartv3/view/AbhSettingsHeader;

    move-result-object v0

    invoke-virtual {v0, v1}, Lcom/sma/smartv3/view/AbhSettingsHeader;->setMListener(Lkotlin/jvm/functions/Function1;)V

    iget-object v2, p0, Lcom/sma/smartv3/ui/device/EarphoneKeySettingsActivity;->mSettings:Lcom/szabh/smable3/entity/BleEarphoneKey;

    invoke-virtual {v2}, Lcom/szabh/smable3/entity/BleEarphoneKey;->getMLeftTripleClick()I

    move-result v2

    if-lez v2, :cond_2

    move v2, v4

    goto :goto_2

    :cond_2
    move v2, v3

    :goto_2
    invoke-virtual {v0, v2}, Lcom/sma/smartv3/view/AbhSettingsHeader;->setChecked(Z)V

    new-instance v2, Lcom/android/mltcode/paycertificationapi/i0XI111;

    invoke-direct {v2, p0}, Lcom/android/mltcode/paycertificationapi/i0XI111;-><init>(Lcom/sma/smartv3/ui/device/EarphoneKeySettingsActivity;)V

    invoke-virtual {v0, v2}, Lcom/sma/smartv3/view/AbhSettingsHeader;->setMListener(Lkotlin/jvm/functions/Function1;)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/EarphoneKeySettingsActivity;->getItemLeftTripleClick()Lcom/sma/smartv3/view/AbhSettingsItem;

    move-result-object v0

    iget-object v2, p0, Lcom/sma/smartv3/ui/device/EarphoneKeySettingsActivity;->mSettings:Lcom/szabh/smable3/entity/BleEarphoneKey;

    invoke-virtual {v2}, Lcom/szabh/smable3/entity/BleEarphoneKey;->getMLeftTripleClick()I

    move-result v2

    invoke-direct {p0, v2}, Lcom/sma/smartv3/ui/device/EarphoneKeySettingsActivity;->getKeyName(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Lcom/sma/smartv3/view/AbhSettingsItem;->setMLeftText(Ljava/lang/String;)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/EarphoneKeySettingsActivity;->getItemHeaderLeftLongClick()Lcom/sma/smartv3/view/AbhSettingsHeader;

    move-result-object v0

    invoke-virtual {v0, v1}, Lcom/sma/smartv3/view/AbhSettingsHeader;->setMListener(Lkotlin/jvm/functions/Function1;)V

    iget-object v2, p0, Lcom/sma/smartv3/ui/device/EarphoneKeySettingsActivity;->mSettings:Lcom/szabh/smable3/entity/BleEarphoneKey;

    invoke-virtual {v2}, Lcom/szabh/smable3/entity/BleEarphoneKey;->getMLeftLongClick()I

    move-result v2

    if-lez v2, :cond_3

    move v2, v4

    goto :goto_3

    :cond_3
    move v2, v3

    :goto_3
    invoke-virtual {v0, v2}, Lcom/sma/smartv3/view/AbhSettingsHeader;->setChecked(Z)V

    new-instance v2, Lcom/android/mltcode/paycertificationapi/XO0i0I0;

    invoke-direct {v2, p0}, Lcom/android/mltcode/paycertificationapi/XO0i0I0;-><init>(Lcom/sma/smartv3/ui/device/EarphoneKeySettingsActivity;)V

    invoke-virtual {v0, v2}, Lcom/sma/smartv3/view/AbhSettingsHeader;->setMListener(Lkotlin/jvm/functions/Function1;)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/EarphoneKeySettingsActivity;->getItemLeftLongClick()Lcom/sma/smartv3/view/AbhSettingsItem;

    move-result-object v0

    iget-object v2, p0, Lcom/sma/smartv3/ui/device/EarphoneKeySettingsActivity;->mSettings:Lcom/szabh/smable3/entity/BleEarphoneKey;

    invoke-virtual {v2}, Lcom/szabh/smable3/entity/BleEarphoneKey;->getMLeftLongClick()I

    move-result v2

    invoke-direct {p0, v2}, Lcom/sma/smartv3/ui/device/EarphoneKeySettingsActivity;->getKeyName(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Lcom/sma/smartv3/view/AbhSettingsItem;->setMLeftText(Ljava/lang/String;)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/EarphoneKeySettingsActivity;->getItemHeaderRightClick()Lcom/sma/smartv3/view/AbhSettingsHeader;

    move-result-object v0

    invoke-virtual {v0, v1}, Lcom/sma/smartv3/view/AbhSettingsHeader;->setMListener(Lkotlin/jvm/functions/Function1;)V

    iget-object v2, p0, Lcom/sma/smartv3/ui/device/EarphoneKeySettingsActivity;->mSettings:Lcom/szabh/smable3/entity/BleEarphoneKey;

    invoke-virtual {v2}, Lcom/szabh/smable3/entity/BleEarphoneKey;->getMRightClick()I

    move-result v2

    if-lez v2, :cond_4

    move v2, v4

    goto :goto_4

    :cond_4
    move v2, v3

    :goto_4
    invoke-virtual {v0, v2}, Lcom/sma/smartv3/view/AbhSettingsHeader;->setChecked(Z)V

    new-instance v2, Lcom/android/mltcode/paycertificationapi/O1IIiIIO;

    invoke-direct {v2, p0}, Lcom/android/mltcode/paycertificationapi/O1IIiIIO;-><init>(Lcom/sma/smartv3/ui/device/EarphoneKeySettingsActivity;)V

    invoke-virtual {v0, v2}, Lcom/sma/smartv3/view/AbhSettingsHeader;->setMListener(Lkotlin/jvm/functions/Function1;)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/EarphoneKeySettingsActivity;->getItemRightClick()Lcom/sma/smartv3/view/AbhSettingsItem;

    move-result-object v0

    iget-object v2, p0, Lcom/sma/smartv3/ui/device/EarphoneKeySettingsActivity;->mSettings:Lcom/szabh/smable3/entity/BleEarphoneKey;

    invoke-virtual {v2}, Lcom/szabh/smable3/entity/BleEarphoneKey;->getMRightClick()I

    move-result v2

    invoke-direct {p0, v2}, Lcom/sma/smartv3/ui/device/EarphoneKeySettingsActivity;->getKeyName(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Lcom/sma/smartv3/view/AbhSettingsItem;->setMLeftText(Ljava/lang/String;)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/EarphoneKeySettingsActivity;->getItemHeaderRightDoubleClick()Lcom/sma/smartv3/view/AbhSettingsHeader;

    move-result-object v0

    invoke-virtual {v0, v1}, Lcom/sma/smartv3/view/AbhSettingsHeader;->setMListener(Lkotlin/jvm/functions/Function1;)V

    iget-object v2, p0, Lcom/sma/smartv3/ui/device/EarphoneKeySettingsActivity;->mSettings:Lcom/szabh/smable3/entity/BleEarphoneKey;

    invoke-virtual {v2}, Lcom/szabh/smable3/entity/BleEarphoneKey;->getMRightDoubleClick()I

    move-result v2

    if-lez v2, :cond_5

    move v2, v4

    goto :goto_5

    :cond_5
    move v2, v3

    :goto_5
    invoke-virtual {v0, v2}, Lcom/sma/smartv3/view/AbhSettingsHeader;->setChecked(Z)V

    new-instance v2, Lcom/android/mltcode/paycertificationapi/XX0X;

    invoke-direct {v2, p0}, Lcom/android/mltcode/paycertificationapi/XX0X;-><init>(Lcom/sma/smartv3/ui/device/EarphoneKeySettingsActivity;)V

    invoke-virtual {v0, v2}, Lcom/sma/smartv3/view/AbhSettingsHeader;->setMListener(Lkotlin/jvm/functions/Function1;)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/EarphoneKeySettingsActivity;->getItemRightDoubleClick()Lcom/sma/smartv3/view/AbhSettingsItem;

    move-result-object v0

    iget-object v2, p0, Lcom/sma/smartv3/ui/device/EarphoneKeySettingsActivity;->mSettings:Lcom/szabh/smable3/entity/BleEarphoneKey;

    invoke-virtual {v2}, Lcom/szabh/smable3/entity/BleEarphoneKey;->getMRightDoubleClick()I

    move-result v2

    invoke-direct {p0, v2}, Lcom/sma/smartv3/ui/device/EarphoneKeySettingsActivity;->getKeyName(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Lcom/sma/smartv3/view/AbhSettingsItem;->setMLeftText(Ljava/lang/String;)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/EarphoneKeySettingsActivity;->getItemHeaderRightTripleClick()Lcom/sma/smartv3/view/AbhSettingsHeader;

    move-result-object v0

    invoke-virtual {v0, v1}, Lcom/sma/smartv3/view/AbhSettingsHeader;->setMListener(Lkotlin/jvm/functions/Function1;)V

    iget-object v2, p0, Lcom/sma/smartv3/ui/device/EarphoneKeySettingsActivity;->mSettings:Lcom/szabh/smable3/entity/BleEarphoneKey;

    invoke-virtual {v2}, Lcom/szabh/smable3/entity/BleEarphoneKey;->getMRightTripleClick()I

    move-result v2

    if-lez v2, :cond_6

    move v2, v4

    goto :goto_6

    :cond_6
    move v2, v3

    :goto_6
    invoke-virtual {v0, v2}, Lcom/sma/smartv3/view/AbhSettingsHeader;->setChecked(Z)V

    new-instance v2, Lcom/android/mltcode/paycertificationapi/ii0IiIO11;

    invoke-direct {v2, p0}, Lcom/android/mltcode/paycertificationapi/ii0IiIO11;-><init>(Lcom/sma/smartv3/ui/device/EarphoneKeySettingsActivity;)V

    invoke-virtual {v0, v2}, Lcom/sma/smartv3/view/AbhSettingsHeader;->setMListener(Lkotlin/jvm/functions/Function1;)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/EarphoneKeySettingsActivity;->getItemRightTripleClick()Lcom/sma/smartv3/view/AbhSettingsItem;

    move-result-object v0

    iget-object v2, p0, Lcom/sma/smartv3/ui/device/EarphoneKeySettingsActivity;->mSettings:Lcom/szabh/smable3/entity/BleEarphoneKey;

    invoke-virtual {v2}, Lcom/szabh/smable3/entity/BleEarphoneKey;->getMRightTripleClick()I

    move-result v2

    invoke-direct {p0, v2}, Lcom/sma/smartv3/ui/device/EarphoneKeySettingsActivity;->getKeyName(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Lcom/sma/smartv3/view/AbhSettingsItem;->setMLeftText(Ljava/lang/String;)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/EarphoneKeySettingsActivity;->getItemHeaderRightLongClick()Lcom/sma/smartv3/view/AbhSettingsHeader;

    move-result-object v0

    invoke-virtual {v0, v1}, Lcom/sma/smartv3/view/AbhSettingsHeader;->setMListener(Lkotlin/jvm/functions/Function1;)V

    iget-object v1, p0, Lcom/sma/smartv3/ui/device/EarphoneKeySettingsActivity;->mSettings:Lcom/szabh/smable3/entity/BleEarphoneKey;

    invoke-virtual {v1}, Lcom/szabh/smable3/entity/BleEarphoneKey;->getMRightLongClick()I

    move-result v1

    if-lez v1, :cond_7

    move v3, v4

    :cond_7
    invoke-virtual {v0, v3}, Lcom/sma/smartv3/view/AbhSettingsHeader;->setChecked(Z)V

    new-instance v1, Lcom/android/mltcode/paycertificationapi/Ii0I01;

    invoke-direct {v1, p0}, Lcom/android/mltcode/paycertificationapi/Ii0I01;-><init>(Lcom/sma/smartv3/ui/device/EarphoneKeySettingsActivity;)V

    invoke-virtual {v0, v1}, Lcom/sma/smartv3/view/AbhSettingsHeader;->setMListener(Lkotlin/jvm/functions/Function1;)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/EarphoneKeySettingsActivity;->getItemRightLongClick()Lcom/sma/smartv3/view/AbhSettingsItem;

    move-result-object v0

    iget-object v1, p0, Lcom/sma/smartv3/ui/device/EarphoneKeySettingsActivity;->mSettings:Lcom/szabh/smable3/entity/BleEarphoneKey;

    invoke-virtual {v1}, Lcom/szabh/smable3/entity/BleEarphoneKey;->getMRightLongClick()I

    move-result v1

    invoke-direct {p0, v1}, Lcom/sma/smartv3/ui/device/EarphoneKeySettingsActivity;->getKeyName(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/sma/smartv3/view/AbhSettingsItem;->setMLeftText(Ljava/lang/String;)V

    return-void
.end method

.method private static final updateUI$lambda$0$0(Lcom/sma/smartv3/ui/device/EarphoneKeySettingsActivity;Z)Lkotlin/Unit;
    .locals 4

    new-instance v0, Lcom/android/mltcode/paycertificationapi/II1XiIO01;

    invoke-direct {v0, p0, p1}, Lcom/android/mltcode/paycertificationapi/II1XiIO01;-><init>(Lcom/sma/smartv3/ui/device/EarphoneKeySettingsActivity;Z)V

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x1

    invoke-static {v2, v0, v3, v1}, Lcom/android/mltcode/paycertificationapi/X0IOiX1O;->XIi00iiXO(ZLkotlin/jvm/functions/Function1;ILjava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/EarphoneKeySettingsActivity;->getItemHeaderLeftClick()Lcom/sma/smartv3/view/AbhSettingsHeader;

    move-result-object p0

    xor-int/2addr p1, v3

    invoke-virtual {p0, p1}, Lcom/sma/smartv3/view/AbhSettingsHeader;->setChecked(Z)V

    :cond_0
    sget-object p0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p0
.end method

.method private static final updateUI$lambda$0$0$0(Lcom/sma/smartv3/ui/device/EarphoneKeySettingsActivity;ZLcom/szabh/smable3/component/BleConnector;)Lkotlin/Unit;
    .locals 9

    const-string v0, "it"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/EarphoneKeySettingsActivity;->mSettings:Lcom/szabh/smable3/entity/BleEarphoneKey;

    invoke-virtual {v0, p1}, Lcom/szabh/smable3/entity/BleEarphoneKey;->setMLeftClick(I)V

    sget-object v2, Lcom/szabh/smable3/BleKey;->EARPHONE_KEY:Lcom/szabh/smable3/BleKey;

    sget-object v3, Lcom/szabh/smable3/BleKeyFlag;->UPDATE:Lcom/szabh/smable3/BleKeyFlag;

    iget-object v4, p0, Lcom/sma/smartv3/ui/device/EarphoneKeySettingsActivity;->mSettings:Lcom/szabh/smable3/entity/BleEarphoneKey;

    const/16 v7, 0x18

    const/4 v8, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    move-object v1, p2

    invoke-static/range {v1 .. v8}, Lcom/szabh/smable3/component/BaseBleConnector;->sendObject$default(Lcom/szabh/smable3/component/BaseBleConnector;Lcom/szabh/smable3/BleKey;Lcom/szabh/smable3/BleKeyFlag;Lcom/bestmafen/baseble/data/BleBuffer;ZZILjava/lang/Object;)Z

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/EarphoneKeySettingsActivity;->updateUI()V

    sget-object p0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p0
.end method

.method private static final updateUI$lambda$1$0(Lcom/sma/smartv3/ui/device/EarphoneKeySettingsActivity;Z)Lkotlin/Unit;
    .locals 4

    new-instance v0, Lcom/android/mltcode/paycertificationapi/X0IOOX11;

    invoke-direct {v0, p0, p1}, Lcom/android/mltcode/paycertificationapi/X0IOOX11;-><init>(Lcom/sma/smartv3/ui/device/EarphoneKeySettingsActivity;Z)V

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x1

    invoke-static {v2, v0, v3, v1}, Lcom/android/mltcode/paycertificationapi/X0IOiX1O;->XIi00iiXO(ZLkotlin/jvm/functions/Function1;ILjava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/EarphoneKeySettingsActivity;->getItemHeaderLeftDoubleClick()Lcom/sma/smartv3/view/AbhSettingsHeader;

    move-result-object p0

    xor-int/2addr p1, v3

    invoke-virtual {p0, p1}, Lcom/sma/smartv3/view/AbhSettingsHeader;->setChecked(Z)V

    :cond_0
    sget-object p0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p0
.end method

.method private static final updateUI$lambda$1$0$0(Lcom/sma/smartv3/ui/device/EarphoneKeySettingsActivity;ZLcom/szabh/smable3/component/BleConnector;)Lkotlin/Unit;
    .locals 9

    const-string v0, "it"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/EarphoneKeySettingsActivity;->mSettings:Lcom/szabh/smable3/entity/BleEarphoneKey;

    invoke-virtual {v0, p1}, Lcom/szabh/smable3/entity/BleEarphoneKey;->setMLeftDoubleClick(I)V

    sget-object v2, Lcom/szabh/smable3/BleKey;->EARPHONE_KEY:Lcom/szabh/smable3/BleKey;

    sget-object v3, Lcom/szabh/smable3/BleKeyFlag;->UPDATE:Lcom/szabh/smable3/BleKeyFlag;

    iget-object v4, p0, Lcom/sma/smartv3/ui/device/EarphoneKeySettingsActivity;->mSettings:Lcom/szabh/smable3/entity/BleEarphoneKey;

    const/16 v7, 0x18

    const/4 v8, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    move-object v1, p2

    invoke-static/range {v1 .. v8}, Lcom/szabh/smable3/component/BaseBleConnector;->sendObject$default(Lcom/szabh/smable3/component/BaseBleConnector;Lcom/szabh/smable3/BleKey;Lcom/szabh/smable3/BleKeyFlag;Lcom/bestmafen/baseble/data/BleBuffer;ZZILjava/lang/Object;)Z

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/EarphoneKeySettingsActivity;->updateUI()V

    sget-object p0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p0
.end method

.method private static final updateUI$lambda$2$0(Lcom/sma/smartv3/ui/device/EarphoneKeySettingsActivity;Z)Lkotlin/Unit;
    .locals 4

    new-instance v0, Lcom/android/mltcode/paycertificationapi/i1IXX1Oi0;

    invoke-direct {v0, p0, p1}, Lcom/android/mltcode/paycertificationapi/i1IXX1Oi0;-><init>(Lcom/sma/smartv3/ui/device/EarphoneKeySettingsActivity;Z)V

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x1

    invoke-static {v2, v0, v3, v1}, Lcom/android/mltcode/paycertificationapi/X0IOiX1O;->XIi00iiXO(ZLkotlin/jvm/functions/Function1;ILjava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/EarphoneKeySettingsActivity;->getItemHeaderLeftTripleClick()Lcom/sma/smartv3/view/AbhSettingsHeader;

    move-result-object p0

    xor-int/2addr p1, v3

    invoke-virtual {p0, p1}, Lcom/sma/smartv3/view/AbhSettingsHeader;->setChecked(Z)V

    :cond_0
    sget-object p0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p0
.end method

.method private static final updateUI$lambda$2$0$0(Lcom/sma/smartv3/ui/device/EarphoneKeySettingsActivity;ZLcom/szabh/smable3/component/BleConnector;)Lkotlin/Unit;
    .locals 9

    const-string v0, "it"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/EarphoneKeySettingsActivity;->mSettings:Lcom/szabh/smable3/entity/BleEarphoneKey;

    invoke-virtual {v0, p1}, Lcom/szabh/smable3/entity/BleEarphoneKey;->setMLeftTripleClick(I)V

    sget-object v2, Lcom/szabh/smable3/BleKey;->EARPHONE_KEY:Lcom/szabh/smable3/BleKey;

    sget-object v3, Lcom/szabh/smable3/BleKeyFlag;->UPDATE:Lcom/szabh/smable3/BleKeyFlag;

    iget-object v4, p0, Lcom/sma/smartv3/ui/device/EarphoneKeySettingsActivity;->mSettings:Lcom/szabh/smable3/entity/BleEarphoneKey;

    const/16 v7, 0x18

    const/4 v8, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    move-object v1, p2

    invoke-static/range {v1 .. v8}, Lcom/szabh/smable3/component/BaseBleConnector;->sendObject$default(Lcom/szabh/smable3/component/BaseBleConnector;Lcom/szabh/smable3/BleKey;Lcom/szabh/smable3/BleKeyFlag;Lcom/bestmafen/baseble/data/BleBuffer;ZZILjava/lang/Object;)Z

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/EarphoneKeySettingsActivity;->updateUI()V

    sget-object p0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p0
.end method

.method private static final updateUI$lambda$3$0(Lcom/sma/smartv3/ui/device/EarphoneKeySettingsActivity;Z)Lkotlin/Unit;
    .locals 4

    new-instance v0, Lcom/android/mltcode/paycertificationapi/XiI1iII;

    invoke-direct {v0, p0, p1}, Lcom/android/mltcode/paycertificationapi/XiI1iII;-><init>(Lcom/sma/smartv3/ui/device/EarphoneKeySettingsActivity;Z)V

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x1

    invoke-static {v2, v0, v3, v1}, Lcom/android/mltcode/paycertificationapi/X0IOiX1O;->XIi00iiXO(ZLkotlin/jvm/functions/Function1;ILjava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/EarphoneKeySettingsActivity;->getItemHeaderLeftLongClick()Lcom/sma/smartv3/view/AbhSettingsHeader;

    move-result-object p0

    xor-int/2addr p1, v3

    invoke-virtual {p0, p1}, Lcom/sma/smartv3/view/AbhSettingsHeader;->setChecked(Z)V

    :cond_0
    sget-object p0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p0
.end method

.method private static final updateUI$lambda$3$0$0(Lcom/sma/smartv3/ui/device/EarphoneKeySettingsActivity;ZLcom/szabh/smable3/component/BleConnector;)Lkotlin/Unit;
    .locals 9

    const-string v0, "it"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/EarphoneKeySettingsActivity;->mSettings:Lcom/szabh/smable3/entity/BleEarphoneKey;

    invoke-virtual {v0, p1}, Lcom/szabh/smable3/entity/BleEarphoneKey;->setMLeftLongClick(I)V

    sget-object v2, Lcom/szabh/smable3/BleKey;->EARPHONE_KEY:Lcom/szabh/smable3/BleKey;

    sget-object v3, Lcom/szabh/smable3/BleKeyFlag;->UPDATE:Lcom/szabh/smable3/BleKeyFlag;

    iget-object v4, p0, Lcom/sma/smartv3/ui/device/EarphoneKeySettingsActivity;->mSettings:Lcom/szabh/smable3/entity/BleEarphoneKey;

    const/16 v7, 0x18

    const/4 v8, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    move-object v1, p2

    invoke-static/range {v1 .. v8}, Lcom/szabh/smable3/component/BaseBleConnector;->sendObject$default(Lcom/szabh/smable3/component/BaseBleConnector;Lcom/szabh/smable3/BleKey;Lcom/szabh/smable3/BleKeyFlag;Lcom/bestmafen/baseble/data/BleBuffer;ZZILjava/lang/Object;)Z

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/EarphoneKeySettingsActivity;->updateUI()V

    sget-object p0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p0
.end method

.method private static final updateUI$lambda$4$0(Lcom/sma/smartv3/ui/device/EarphoneKeySettingsActivity;Z)Lkotlin/Unit;
    .locals 4

    new-instance v0, Lcom/android/mltcode/paycertificationapi/iXiX00XX;

    invoke-direct {v0, p0, p1}, Lcom/android/mltcode/paycertificationapi/iXiX00XX;-><init>(Lcom/sma/smartv3/ui/device/EarphoneKeySettingsActivity;Z)V

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x1

    invoke-static {v2, v0, v3, v1}, Lcom/android/mltcode/paycertificationapi/X0IOiX1O;->XIi00iiXO(ZLkotlin/jvm/functions/Function1;ILjava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/EarphoneKeySettingsActivity;->getItemHeaderRightClick()Lcom/sma/smartv3/view/AbhSettingsHeader;

    move-result-object p0

    xor-int/2addr p1, v3

    invoke-virtual {p0, p1}, Lcom/sma/smartv3/view/AbhSettingsHeader;->setChecked(Z)V

    :cond_0
    sget-object p0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p0
.end method

.method private static final updateUI$lambda$4$0$0(Lcom/sma/smartv3/ui/device/EarphoneKeySettingsActivity;ZLcom/szabh/smable3/component/BleConnector;)Lkotlin/Unit;
    .locals 9

    const-string v0, "it"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/EarphoneKeySettingsActivity;->mSettings:Lcom/szabh/smable3/entity/BleEarphoneKey;

    invoke-virtual {v0, p1}, Lcom/szabh/smable3/entity/BleEarphoneKey;->setMRightClick(I)V

    sget-object v2, Lcom/szabh/smable3/BleKey;->EARPHONE_KEY:Lcom/szabh/smable3/BleKey;

    sget-object v3, Lcom/szabh/smable3/BleKeyFlag;->UPDATE:Lcom/szabh/smable3/BleKeyFlag;

    iget-object v4, p0, Lcom/sma/smartv3/ui/device/EarphoneKeySettingsActivity;->mSettings:Lcom/szabh/smable3/entity/BleEarphoneKey;

    const/16 v7, 0x18

    const/4 v8, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    move-object v1, p2

    invoke-static/range {v1 .. v8}, Lcom/szabh/smable3/component/BaseBleConnector;->sendObject$default(Lcom/szabh/smable3/component/BaseBleConnector;Lcom/szabh/smable3/BleKey;Lcom/szabh/smable3/BleKeyFlag;Lcom/bestmafen/baseble/data/BleBuffer;ZZILjava/lang/Object;)Z

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/EarphoneKeySettingsActivity;->updateUI()V

    sget-object p0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p0
.end method

.method private static final updateUI$lambda$5$0(Lcom/sma/smartv3/ui/device/EarphoneKeySettingsActivity;Z)Lkotlin/Unit;
    .locals 4

    new-instance v0, Lcom/android/mltcode/paycertificationapi/OX011;

    invoke-direct {v0, p0, p1}, Lcom/android/mltcode/paycertificationapi/OX011;-><init>(Lcom/sma/smartv3/ui/device/EarphoneKeySettingsActivity;Z)V

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x1

    invoke-static {v2, v0, v3, v1}, Lcom/android/mltcode/paycertificationapi/X0IOiX1O;->XIi00iiXO(ZLkotlin/jvm/functions/Function1;ILjava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/EarphoneKeySettingsActivity;->getItemHeaderRightDoubleClick()Lcom/sma/smartv3/view/AbhSettingsHeader;

    move-result-object p0

    xor-int/2addr p1, v3

    invoke-virtual {p0, p1}, Lcom/sma/smartv3/view/AbhSettingsHeader;->setChecked(Z)V

    :cond_0
    sget-object p0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p0
.end method

.method private static final updateUI$lambda$5$0$0(Lcom/sma/smartv3/ui/device/EarphoneKeySettingsActivity;ZLcom/szabh/smable3/component/BleConnector;)Lkotlin/Unit;
    .locals 9

    const-string v0, "it"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/EarphoneKeySettingsActivity;->mSettings:Lcom/szabh/smable3/entity/BleEarphoneKey;

    invoke-virtual {v0, p1}, Lcom/szabh/smable3/entity/BleEarphoneKey;->setMRightDoubleClick(I)V

    sget-object v2, Lcom/szabh/smable3/BleKey;->EARPHONE_KEY:Lcom/szabh/smable3/BleKey;

    sget-object v3, Lcom/szabh/smable3/BleKeyFlag;->UPDATE:Lcom/szabh/smable3/BleKeyFlag;

    iget-object v4, p0, Lcom/sma/smartv3/ui/device/EarphoneKeySettingsActivity;->mSettings:Lcom/szabh/smable3/entity/BleEarphoneKey;

    const/16 v7, 0x18

    const/4 v8, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    move-object v1, p2

    invoke-static/range {v1 .. v8}, Lcom/szabh/smable3/component/BaseBleConnector;->sendObject$default(Lcom/szabh/smable3/component/BaseBleConnector;Lcom/szabh/smable3/BleKey;Lcom/szabh/smable3/BleKeyFlag;Lcom/bestmafen/baseble/data/BleBuffer;ZZILjava/lang/Object;)Z

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/EarphoneKeySettingsActivity;->updateUI()V

    sget-object p0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p0
.end method

.method private static final updateUI$lambda$6$0(Lcom/sma/smartv3/ui/device/EarphoneKeySettingsActivity;Z)Lkotlin/Unit;
    .locals 4

    new-instance v0, Lcom/android/mltcode/paycertificationapi/iO00I01;

    invoke-direct {v0, p0, p1}, Lcom/android/mltcode/paycertificationapi/iO00I01;-><init>(Lcom/sma/smartv3/ui/device/EarphoneKeySettingsActivity;Z)V

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x1

    invoke-static {v2, v0, v3, v1}, Lcom/android/mltcode/paycertificationapi/X0IOiX1O;->XIi00iiXO(ZLkotlin/jvm/functions/Function1;ILjava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/EarphoneKeySettingsActivity;->getItemHeaderRightTripleClick()Lcom/sma/smartv3/view/AbhSettingsHeader;

    move-result-object p0

    xor-int/2addr p1, v3

    invoke-virtual {p0, p1}, Lcom/sma/smartv3/view/AbhSettingsHeader;->setChecked(Z)V

    :cond_0
    sget-object p0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p0
.end method

.method private static final updateUI$lambda$6$0$0(Lcom/sma/smartv3/ui/device/EarphoneKeySettingsActivity;ZLcom/szabh/smable3/component/BleConnector;)Lkotlin/Unit;
    .locals 9

    const-string v0, "it"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/EarphoneKeySettingsActivity;->mSettings:Lcom/szabh/smable3/entity/BleEarphoneKey;

    invoke-virtual {v0, p1}, Lcom/szabh/smable3/entity/BleEarphoneKey;->setMRightTripleClick(I)V

    sget-object v2, Lcom/szabh/smable3/BleKey;->EARPHONE_KEY:Lcom/szabh/smable3/BleKey;

    sget-object v3, Lcom/szabh/smable3/BleKeyFlag;->UPDATE:Lcom/szabh/smable3/BleKeyFlag;

    iget-object v4, p0, Lcom/sma/smartv3/ui/device/EarphoneKeySettingsActivity;->mSettings:Lcom/szabh/smable3/entity/BleEarphoneKey;

    const/16 v7, 0x18

    const/4 v8, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    move-object v1, p2

    invoke-static/range {v1 .. v8}, Lcom/szabh/smable3/component/BaseBleConnector;->sendObject$default(Lcom/szabh/smable3/component/BaseBleConnector;Lcom/szabh/smable3/BleKey;Lcom/szabh/smable3/BleKeyFlag;Lcom/bestmafen/baseble/data/BleBuffer;ZZILjava/lang/Object;)Z

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/EarphoneKeySettingsActivity;->updateUI()V

    sget-object p0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p0
.end method

.method private static final updateUI$lambda$7$0(Lcom/sma/smartv3/ui/device/EarphoneKeySettingsActivity;Z)Lkotlin/Unit;
    .locals 4

    new-instance v0, Lcom/android/mltcode/paycertificationapi/iX11;

    invoke-direct {v0, p0, p1}, Lcom/android/mltcode/paycertificationapi/iX11;-><init>(Lcom/sma/smartv3/ui/device/EarphoneKeySettingsActivity;Z)V

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x1

    invoke-static {v2, v0, v3, v1}, Lcom/android/mltcode/paycertificationapi/X0IOiX1O;->XIi00iiXO(ZLkotlin/jvm/functions/Function1;ILjava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/EarphoneKeySettingsActivity;->getItemHeaderRightLongClick()Lcom/sma/smartv3/view/AbhSettingsHeader;

    move-result-object p0

    xor-int/2addr p1, v3

    invoke-virtual {p0, p1}, Lcom/sma/smartv3/view/AbhSettingsHeader;->setChecked(Z)V

    :cond_0
    sget-object p0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p0
.end method

.method private static final updateUI$lambda$7$0$0(Lcom/sma/smartv3/ui/device/EarphoneKeySettingsActivity;ZLcom/szabh/smable3/component/BleConnector;)Lkotlin/Unit;
    .locals 9

    const-string v0, "it"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/EarphoneKeySettingsActivity;->mSettings:Lcom/szabh/smable3/entity/BleEarphoneKey;

    invoke-virtual {v0, p1}, Lcom/szabh/smable3/entity/BleEarphoneKey;->setMRightLongClick(I)V

    sget-object v2, Lcom/szabh/smable3/BleKey;->EARPHONE_KEY:Lcom/szabh/smable3/BleKey;

    sget-object v3, Lcom/szabh/smable3/BleKeyFlag;->UPDATE:Lcom/szabh/smable3/BleKeyFlag;

    iget-object v4, p0, Lcom/sma/smartv3/ui/device/EarphoneKeySettingsActivity;->mSettings:Lcom/szabh/smable3/entity/BleEarphoneKey;

    const/16 v7, 0x18

    const/4 v8, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    move-object v1, p2

    invoke-static/range {v1 .. v8}, Lcom/szabh/smable3/component/BaseBleConnector;->sendObject$default(Lcom/szabh/smable3/component/BaseBleConnector;Lcom/szabh/smable3/BleKey;Lcom/szabh/smable3/BleKeyFlag;Lcom/bestmafen/baseble/data/BleBuffer;ZZILjava/lang/Object;)Z

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/EarphoneKeySettingsActivity;->updateUI()V

    sget-object p0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p0
.end method


# virtual methods
.method public init(Landroid/os/Bundle;)V
    .locals 8
    .param p1    # Landroid/os/Bundle;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param

    sget-object v0, Lcom/szabh/smable3/component/BleConnector;->INSTANCE:Lcom/szabh/smable3/component/BleConnector;

    iget-object p1, p0, Lcom/sma/smartv3/ui/device/EarphoneKeySettingsActivity;->mBleHandleCallback:Lcom/sma/smartv3/ui/device/EarphoneKeySettingsActivity$OXO1;

    invoke-virtual {v0, p1}, Lcom/szabh/smable3/component/BleConnector;->addHandleCallback(Lcom/szabh/smable3/component/BleHandleCallback;)V

    sget-object v1, Lcom/szabh/smable3/BleKey;->EARPHONE_KEY:Lcom/szabh/smable3/BleKey;

    sget-object v2, Lcom/szabh/smable3/BleKeyFlag;->READ:Lcom/szabh/smable3/BleKeyFlag;

    const/16 v6, 0x1c

    const/4 v7, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-static/range {v0 .. v7}, Lcom/szabh/smable3/component/BaseBleConnector;->sendData$default(Lcom/szabh/smable3/component/BaseBleConnector;Lcom/szabh/smable3/BleKey;Lcom/szabh/smable3/BleKeyFlag;[BZZILjava/lang/Object;)Z

    return-void
.end method

.method public initView()V
    .locals 5

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseActivity;->getMArg1()I

    move-result v0

    const/4 v1, 0x1

    const/4 v2, 0x0

    const/16 v3, 0x8

    const v4, 0x7f0a0023

    if-ne v0, v1, :cond_0

    invoke-virtual {p0, v4}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    const v1, 0x7f1404aa

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/EarphoneKeySettingsActivity;->getLeftPanel()Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, v3}, Landroid/view/View;->setVisibility(I)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/EarphoneKeySettingsActivity;->getRightPanel()Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    goto :goto_0

    :cond_0
    invoke-virtual {p0, v4}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    const v1, 0x7f1404a9

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/EarphoneKeySettingsActivity;->getLeftPanel()Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/EarphoneKeySettingsActivity;->getRightPanel()Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, v3}, Landroid/view/View;->setVisibility(I)V

    :goto_0
    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/EarphoneKeySettingsActivity;->updateUI()V

    return-void
.end method

.method public layoutId()I
    .locals 1

    const v0, 0x7f0d0090

    return v0
.end method

.method public onDestroy()V
    .locals 2

    sget-object v0, Lcom/szabh/smable3/component/BleConnector;->INSTANCE:Lcom/szabh/smable3/component/BleConnector;

    iget-object v1, p0, Lcom/sma/smartv3/ui/device/EarphoneKeySettingsActivity;->mBleHandleCallback:Lcom/sma/smartv3/ui/device/EarphoneKeySettingsActivity$OXO1;

    invoke-virtual {v0, v1}, Lcom/szabh/smable3/component/BleConnector;->removeHandleCallback(Lcom/szabh/smable3/component/BleHandleCallback;)V

    invoke-super {p0}, Lcom/bestmafen/androidbase/base/BaseActivity;->onDestroy()V

    return-void
.end method

.method public final onShowKeysPopup(Landroid/view/View;)V
    .locals 7
    .param p1    # Landroid/view/View;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "view"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/android/mltcode/paycertificationapi/dj4;

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/EarphoneKeySettingsActivity;->mSettings:Lcom/szabh/smable3/entity/BleEarphoneKey;

    invoke-virtual {v0}, Lcom/szabh/smable3/entity/BleEarphoneKey;->getMType()I

    move-result v0

    const/4 v2, 0x1

    if-eq v0, v2, :cond_2

    const/4 v2, 0x2

    if-eq v0, v2, :cond_1

    const/4 v2, 0x3

    if-eq v0, v2, :cond_0

    const v0, 0x7f030018

    :goto_0
    move v3, v0

    goto :goto_1

    :cond_0
    const v0, 0x7f03001b

    goto :goto_0

    :cond_1
    const v0, 0x7f03001a

    goto :goto_0

    :cond_2
    const v0, 0x7f030019

    goto :goto_0

    :goto_1
    const/4 v5, 0x4

    const/4 v6, 0x0

    const/4 v4, 0x0

    move-object v2, p0

    invoke-direct/range {v1 .. v6}, Lcom/android/mltcode/paycertificationapi/dj4;-><init>(Landroid/app/Activity;IIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v0

    const v3, 0x7f1402e4

    const v4, 0x7f14046f

    const v5, 0x7f140e3f

    const v6, 0x7f1413c3

    packed-switch v0, :pswitch_data_0

    packed-switch v0, :pswitch_data_1

    goto/16 :goto_2

    :pswitch_0
    invoke-virtual {v1, v6}, Lcom/android/mltcode/paycertificationapi/dj4;->iX(I)V

    iget-object v0, v2, Lcom/sma/smartv3/ui/device/EarphoneKeySettingsActivity;->mSettings:Lcom/szabh/smable3/entity/BleEarphoneKey;

    invoke-virtual {v0}, Lcom/szabh/smable3/entity/BleEarphoneKey;->getMRightTripleClick()I

    move-result v0

    invoke-direct {p0, v0}, Lcom/sma/smartv3/ui/device/EarphoneKeySettingsActivity;->keyToIndex(I)I

    move-result v0

    invoke-virtual {v1, v0}, Lcom/android/mltcode/paycertificationapi/dj4;->II1Xi0(I)V

    goto/16 :goto_2

    :pswitch_1
    invoke-virtual {v1, v5}, Lcom/android/mltcode/paycertificationapi/dj4;->iX(I)V

    iget-object v0, v2, Lcom/sma/smartv3/ui/device/EarphoneKeySettingsActivity;->mSettings:Lcom/szabh/smable3/entity/BleEarphoneKey;

    invoke-virtual {v0}, Lcom/szabh/smable3/entity/BleEarphoneKey;->getMRightLongClick()I

    move-result v0

    invoke-direct {p0, v0}, Lcom/sma/smartv3/ui/device/EarphoneKeySettingsActivity;->keyToIndex(I)I

    move-result v0

    invoke-virtual {v1, v0}, Lcom/android/mltcode/paycertificationapi/dj4;->II1Xi0(I)V

    goto :goto_2

    :pswitch_2
    invoke-virtual {v1, v4}, Lcom/android/mltcode/paycertificationapi/dj4;->iX(I)V

    iget-object v0, v2, Lcom/sma/smartv3/ui/device/EarphoneKeySettingsActivity;->mSettings:Lcom/szabh/smable3/entity/BleEarphoneKey;

    invoke-virtual {v0}, Lcom/szabh/smable3/entity/BleEarphoneKey;->getMRightDoubleClick()I

    move-result v0

    invoke-direct {p0, v0}, Lcom/sma/smartv3/ui/device/EarphoneKeySettingsActivity;->keyToIndex(I)I

    move-result v0

    invoke-virtual {v1, v0}, Lcom/android/mltcode/paycertificationapi/dj4;->II1Xi0(I)V

    goto :goto_2

    :pswitch_3
    invoke-virtual {v1, v3}, Lcom/android/mltcode/paycertificationapi/dj4;->iX(I)V

    iget-object v0, v2, Lcom/sma/smartv3/ui/device/EarphoneKeySettingsActivity;->mSettings:Lcom/szabh/smable3/entity/BleEarphoneKey;

    invoke-virtual {v0}, Lcom/szabh/smable3/entity/BleEarphoneKey;->getMRightClick()I

    move-result v0

    invoke-direct {p0, v0}, Lcom/sma/smartv3/ui/device/EarphoneKeySettingsActivity;->keyToIndex(I)I

    move-result v0

    invoke-virtual {v1, v0}, Lcom/android/mltcode/paycertificationapi/dj4;->II1Xi0(I)V

    goto :goto_2

    :pswitch_4
    invoke-virtual {v1, v6}, Lcom/android/mltcode/paycertificationapi/dj4;->iX(I)V

    iget-object v0, v2, Lcom/sma/smartv3/ui/device/EarphoneKeySettingsActivity;->mSettings:Lcom/szabh/smable3/entity/BleEarphoneKey;

    invoke-virtual {v0}, Lcom/szabh/smable3/entity/BleEarphoneKey;->getMLeftTripleClick()I

    move-result v0

    invoke-direct {p0, v0}, Lcom/sma/smartv3/ui/device/EarphoneKeySettingsActivity;->keyToIndex(I)I

    move-result v0

    invoke-virtual {v1, v0}, Lcom/android/mltcode/paycertificationapi/dj4;->II1Xi0(I)V

    goto :goto_2

    :pswitch_5
    invoke-virtual {v1, v5}, Lcom/android/mltcode/paycertificationapi/dj4;->iX(I)V

    iget-object v0, v2, Lcom/sma/smartv3/ui/device/EarphoneKeySettingsActivity;->mSettings:Lcom/szabh/smable3/entity/BleEarphoneKey;

    invoke-virtual {v0}, Lcom/szabh/smable3/entity/BleEarphoneKey;->getMLeftLongClick()I

    move-result v0

    invoke-direct {p0, v0}, Lcom/sma/smartv3/ui/device/EarphoneKeySettingsActivity;->keyToIndex(I)I

    move-result v0

    invoke-virtual {v1, v0}, Lcom/android/mltcode/paycertificationapi/dj4;->II1Xi0(I)V

    goto :goto_2

    :pswitch_6
    invoke-virtual {v1, v4}, Lcom/android/mltcode/paycertificationapi/dj4;->iX(I)V

    iget-object v0, v2, Lcom/sma/smartv3/ui/device/EarphoneKeySettingsActivity;->mSettings:Lcom/szabh/smable3/entity/BleEarphoneKey;

    invoke-virtual {v0}, Lcom/szabh/smable3/entity/BleEarphoneKey;->getMLeftDoubleClick()I

    move-result v0

    invoke-direct {p0, v0}, Lcom/sma/smartv3/ui/device/EarphoneKeySettingsActivity;->keyToIndex(I)I

    move-result v0

    invoke-virtual {v1, v0}, Lcom/android/mltcode/paycertificationapi/dj4;->II1Xi0(I)V

    goto :goto_2

    :pswitch_7
    invoke-virtual {v1, v3}, Lcom/android/mltcode/paycertificationapi/dj4;->iX(I)V

    iget-object v0, v2, Lcom/sma/smartv3/ui/device/EarphoneKeySettingsActivity;->mSettings:Lcom/szabh/smable3/entity/BleEarphoneKey;

    invoke-virtual {v0}, Lcom/szabh/smable3/entity/BleEarphoneKey;->getMLeftClick()I

    move-result v0

    invoke-direct {p0, v0}, Lcom/sma/smartv3/ui/device/EarphoneKeySettingsActivity;->keyToIndex(I)I

    move-result v0

    invoke-virtual {v1, v0}, Lcom/android/mltcode/paycertificationapi/dj4;->II1Xi0(I)V

    :goto_2
    new-instance v0, Lcom/android/mltcode/paycertificationapi/iO0iXO0XO;

    invoke-direct {v0, p1, p0}, Lcom/android/mltcode/paycertificationapi/iO0iXO0XO;-><init>(Landroid/view/View;Lcom/sma/smartv3/ui/device/EarphoneKeySettingsActivity;)V

    invoke-virtual {v1, v0}, Lcom/android/mltcode/paycertificationapi/dj4;->i010I(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v1}, Lcom/android/mltcode/paycertificationapi/OIXIOIO;->IIX1OXO()V

    return-void

    :pswitch_data_0
    .packed-switch 0x7f0a05b4
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
    .end packed-switch

    :pswitch_data_1
    .packed-switch 0x7f0a05d7
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
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
