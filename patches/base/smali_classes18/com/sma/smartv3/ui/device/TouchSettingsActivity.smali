.class public final Lcom/sma/smartv3/ui/device/TouchSettingsActivity;
.super Lcom/bestmafen/androidbase/base/BaseActivity;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nTouchSettingsActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TouchSettingsActivity.kt\ncom/sma/smartv3/ui/device/TouchSettingsActivity\n+ 2 _Sequences.kt\nkotlin/sequences/SequencesKt___SequencesKt\n+ 3 Activity.kt\ncom/bestmafen/androidbase/extension/ActivityKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,410:1\n1332#2,3:411\n69#3,3:414\n72#3,5:418\n1#4:417\n*S KotlinDebug\n*F\n+ 1 TouchSettingsActivity.kt\ncom/sma/smartv3/ui/device/TouchSettingsActivity\n*L\n221#1:411,3\n140#1:414,3\n140#1:418,5\n140#1:417\n*E\n"
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nTouchSettingsActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TouchSettingsActivity.kt\ncom/sma/smartv3/ui/device/TouchSettingsActivity\n+ 2 _Sequences.kt\nkotlin/sequences/SequencesKt___SequencesKt\n+ 3 Activity.kt\ncom/bestmafen/androidbase/extension/ActivityKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,410:1\n1332#2,3:411\n69#3,3:414\n72#3,5:418\n1#4:417\n*S KotlinDebug\n*F\n+ 1 TouchSettingsActivity.kt\ncom/sma/smartv3/ui/device/TouchSettingsActivity\n*L\n221#1:411,3\n140#1:414,3\n140#1:418,5\n140#1:417\n*E\n"
    }
.end annotation


# instance fields
.field private final containerPanel$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final itemDouble$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final itemHeader$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final itemHeaderCustom$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final itemHeaderMusic$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final itemHeaderPhoto$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final itemHeaderSlide$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final itemHeaderTouchRepair$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final itemLong$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final itemSingle$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private mBluetoothReceiver:Lcom/sma/smartv3/ui/device/TouchSettingsActivity$mBluetoothReceiver$1;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private mFailPopup:Lcom/android/mltcode/paycertificationapi/go0;
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation
.end field

.field private mLoadingPopup:Lcom/android/mltcode/paycertificationapi/uq;
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation
.end field

.field private final mSettings:Lcom/szabh/smable3/entity/BleTouchSettings;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final mSingleChoiceItems:Ljava/util/List;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/android/mltcode/paycertificationapi/aj4;",
            ">;"
        }
    .end annotation
.end field

.field private mTouchICPopup:Lcom/android/mltcode/paycertificationapi/go0;
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 8

    invoke-direct {p0}, Lcom/bestmafen/androidbase/base/BaseActivity;-><init>()V

    new-instance v0, Lcom/android/mltcode/paycertificationapi/ox5;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/ox5;-><init>(Lcom/sma/smartv3/ui/device/TouchSettingsActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/TouchSettingsActivity;->itemHeader$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/px5;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/px5;-><init>(Lcom/sma/smartv3/ui/device/TouchSettingsActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/TouchSettingsActivity;->containerPanel$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/qx5;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/qx5;-><init>(Lcom/sma/smartv3/ui/device/TouchSettingsActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/TouchSettingsActivity;->itemHeaderMusic$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/rx5;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/rx5;-><init>(Lcom/sma/smartv3/ui/device/TouchSettingsActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/TouchSettingsActivity;->itemHeaderPhoto$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/sx5;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/sx5;-><init>(Lcom/sma/smartv3/ui/device/TouchSettingsActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/TouchSettingsActivity;->itemHeaderSlide$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/sw5;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/sw5;-><init>(Lcom/sma/smartv3/ui/device/TouchSettingsActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/TouchSettingsActivity;->itemHeaderCustom$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/tw5;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/tw5;-><init>(Lcom/sma/smartv3/ui/device/TouchSettingsActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/TouchSettingsActivity;->itemHeaderTouchRepair$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/uw5;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/uw5;-><init>(Lcom/sma/smartv3/ui/device/TouchSettingsActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/TouchSettingsActivity;->itemSingle$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/vw5;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/vw5;-><init>(Lcom/sma/smartv3/ui/device/TouchSettingsActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/TouchSettingsActivity;->itemDouble$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/ww5;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/ww5;-><init>(Lcom/sma/smartv3/ui/device/TouchSettingsActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/TouchSettingsActivity;->itemLong$delegate:Lkotlin/Lazy;

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/TouchSettingsActivity;->getSingleChoiceItems()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/TouchSettingsActivity;->mSingleChoiceItems:Ljava/util/List;

    sget-object v1, Lcom/szabh/smable3/component/BleCache;->INSTANCE:Lcom/szabh/smable3/component/BleCache;

    sget-object v2, Lcom/szabh/smable3/BleKey;->TOUCH_SET:Lcom/szabh/smable3/BleKey;

    const/16 v6, 0xc

    const/4 v7, 0x0

    const-class v3, Lcom/szabh/smable3/entity/BleTouchSettings;

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-static/range {v1 .. v7}, Lcom/szabh/smable3/component/BaseBleCache;->getObjectNotNull$default(Lcom/szabh/smable3/component/BaseBleCache;Lcom/szabh/smable3/BleKey;Ljava/lang/Class;Ljava/lang/Object;Lcom/szabh/smable3/BleKeyFlag;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/szabh/smable3/entity/BleTouchSettings;

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/TouchSettingsActivity;->mSettings:Lcom/szabh/smable3/entity/BleTouchSettings;

    new-instance v0, Lcom/sma/smartv3/ui/device/TouchSettingsActivity$mBluetoothReceiver$1;

    invoke-direct {v0, p0}, Lcom/sma/smartv3/ui/device/TouchSettingsActivity$mBluetoothReceiver$1;-><init>(Lcom/sma/smartv3/ui/device/TouchSettingsActivity;)V

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/TouchSettingsActivity;->mBluetoothReceiver:Lcom/sma/smartv3/ui/device/TouchSettingsActivity$mBluetoothReceiver$1;

    return-void
.end method

.method public static synthetic I0iXXO(Landroid/view/View;Lcom/sma/smartv3/ui/device/TouchSettingsActivity;I)Z
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/sma/smartv3/ui/device/TouchSettingsActivity;->onShowKeysPopup$lambda$0$0(Landroid/view/View;Lcom/sma/smartv3/ui/device/TouchSettingsActivity;I)Z

    move-result p0

    return p0
.end method

.method public static synthetic I1(Lcom/sma/smartv3/ui/device/TouchSettingsActivity;Lcom/szabh/smable3/component/BleConnector;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Lcom/sma/smartv3/ui/device/TouchSettingsActivity;->updateUI$lambda$0$0$0(Lcom/sma/smartv3/ui/device/TouchSettingsActivity;Lcom/szabh/smable3/component/BleConnector;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic I1XOi1(ZLcom/sma/smartv3/ui/device/TouchSettingsActivity;Lcom/szabh/smable3/component/BleConnector;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/sma/smartv3/ui/device/TouchSettingsActivity;->setHeaderChecked$lambda$0(ZLcom/sma/smartv3/ui/device/TouchSettingsActivity;Lcom/szabh/smable3/component/BleConnector;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic II1Xi0(Lcom/sma/smartv3/ui/device/TouchSettingsActivity;)Lcom/sma/smartv3/view/AbhSettingsHeader;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/device/TouchSettingsActivity;->itemHeaderTouchRepair_delegate$lambda$0(Lcom/sma/smartv3/ui/device/TouchSettingsActivity;)Lcom/sma/smartv3/view/AbhSettingsHeader;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic IIX1OXO(Lcom/sma/smartv3/ui/device/TouchSettingsActivity;)Lcom/sma/smartv3/view/AbhSettingsItem;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/device/TouchSettingsActivity;->itemLong_delegate$lambda$0(Lcom/sma/smartv3/ui/device/TouchSettingsActivity;)Lcom/sma/smartv3/view/AbhSettingsItem;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic IXXOO(Lcom/sma/smartv3/ui/device/TouchSettingsActivity;Lcom/szabh/smable3/component/BleConnector;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Lcom/sma/smartv3/ui/device/TouchSettingsActivity;->updateUI$lambda$1$0$0(Lcom/sma/smartv3/ui/device/TouchSettingsActivity;Lcom/szabh/smable3/component/BleConnector;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic O10IXXX0X(Lcom/sma/smartv3/ui/device/TouchSettingsActivity;Landroid/view/View;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/sma/smartv3/ui/device/TouchSettingsActivity;->updateUI$lambda$1$0(Lcom/sma/smartv3/ui/device/TouchSettingsActivity;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic O1O(Lcom/sma/smartv3/ui/device/TouchSettingsActivity;Lcom/sma/smartv3/view/AbhSettingsHeader;Landroid/view/View;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/sma/smartv3/ui/device/TouchSettingsActivity;->updateUI$lambda$2$0(Lcom/sma/smartv3/ui/device/TouchSettingsActivity;Lcom/sma/smartv3/view/AbhSettingsHeader;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic OII(Lkotlin/jvm/functions/Function1;)Z
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/device/TouchSettingsActivity;->showTouchICPopup$lambda$0$0(Lkotlin/jvm/functions/Function1;)Z

    move-result p0

    return p0
.end method

.method public static synthetic OIX0iXi(Lcom/sma/smartv3/ui/device/TouchSettingsActivity;)Lcom/sma/smartv3/view/SettingsPanel;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/device/TouchSettingsActivity;->containerPanel_delegate$lambda$0(Lcom/sma/smartv3/ui/device/TouchSettingsActivity;)Lcom/sma/smartv3/view/SettingsPanel;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic OX(Lcom/sma/smartv3/ui/device/TouchSettingsActivity;)Lcom/sma/smartv3/view/AbhSettingsItem;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/device/TouchSettingsActivity;->itemDouble_delegate$lambda$0(Lcom/sma/smartv3/ui/device/TouchSettingsActivity;)Lcom/sma/smartv3/view/AbhSettingsItem;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic OiIIX101O(Lcom/sma/smartv3/ui/device/TouchSettingsActivity;)Lcom/sma/smartv3/view/AbhSettingsHeader;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/device/TouchSettingsActivity;->itemHeaderCustom_delegate$lambda$0(Lcom/sma/smartv3/ui/device/TouchSettingsActivity;)Lcom/sma/smartv3/view/AbhSettingsHeader;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic X01IiOiIi(Lcom/sma/smartv3/ui/device/TouchSettingsActivity;)Lcom/sma/smartv3/view/AbhSettingsItem;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/device/TouchSettingsActivity;->itemSingle_delegate$lambda$0(Lcom/sma/smartv3/ui/device/TouchSettingsActivity;)Lcom/sma/smartv3/view/AbhSettingsItem;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic X0O(Lcom/sma/smartv3/ui/device/TouchSettingsActivity;)Lcom/sma/smartv3/view/AbhSettingsHeader;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/device/TouchSettingsActivity;->itemHeader_delegate$lambda$0(Lcom/sma/smartv3/ui/device/TouchSettingsActivity;)Lcom/sma/smartv3/view/AbhSettingsHeader;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic X11iII1O1(Lcom/sma/smartv3/ui/device/TouchSettingsActivity;Landroid/view/View;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/sma/smartv3/ui/device/TouchSettingsActivity;->updateUI$lambda$0$0(Lcom/sma/smartv3/ui/device/TouchSettingsActivity;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic X1ii(Lcom/sma/smartv3/ui/device/TouchSettingsActivity;Lcom/szabh/smable3/component/BleConnector;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Lcom/sma/smartv3/ui/device/TouchSettingsActivity;->updateUI$lambda$3$0$0(Lcom/sma/smartv3/ui/device/TouchSettingsActivity;Lcom/szabh/smable3/component/BleConnector;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic XX0(Lcom/sma/smartv3/ui/device/TouchSettingsActivity;)Lcom/sma/smartv3/view/AbhSettingsHeader;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/device/TouchSettingsActivity;->itemHeaderSlide_delegate$lambda$0(Lcom/sma/smartv3/ui/device/TouchSettingsActivity;)Lcom/sma/smartv3/view/AbhSettingsHeader;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic XXI(Lcom/sma/smartv3/ui/device/TouchSettingsActivity;Landroid/view/View;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/sma/smartv3/ui/device/TouchSettingsActivity;->updateUI$lambda$3$0(Lcom/sma/smartv3/ui/device/TouchSettingsActivity;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic XXIIO1i11(Lcom/sma/smartv3/ui/device/TouchSettingsActivity;Lcom/szabh/smable3/component/BleConnector;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Lcom/sma/smartv3/ui/device/TouchSettingsActivity;->updateUI$lambda$2$0$0(Lcom/sma/smartv3/ui/device/TouchSettingsActivity;Lcom/szabh/smable3/component/BleConnector;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic XiOIO(Lkotlin/jvm/functions/Function1;)Z
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/device/TouchSettingsActivity;->showTouchICPopup$lambda$0$1(Lkotlin/jvm/functions/Function1;)Z

    move-result p0

    return p0
.end method

.method public static synthetic XiOIii1(Lcom/sma/smartv3/ui/device/TouchSettingsActivity;)Lcom/sma/smartv3/view/AbhSettingsHeader;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/device/TouchSettingsActivity;->itemHeaderMusic_delegate$lambda$0(Lcom/sma/smartv3/ui/device/TouchSettingsActivity;)Lcom/sma/smartv3/view/AbhSettingsHeader;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$getMLoadingPopup$p(Lcom/sma/smartv3/ui/device/TouchSettingsActivity;)Lcom/android/mltcode/paycertificationapi/uq;
    .locals 0

    iget-object p0, p0, Lcom/sma/smartv3/ui/device/TouchSettingsActivity;->mLoadingPopup:Lcom/android/mltcode/paycertificationapi/uq;

    return-object p0
.end method

.method public static final synthetic access$getMSettings$p(Lcom/sma/smartv3/ui/device/TouchSettingsActivity;)Lcom/szabh/smable3/entity/BleTouchSettings;
    .locals 0

    iget-object p0, p0, Lcom/sma/smartv3/ui/device/TouchSettingsActivity;->mSettings:Lcom/szabh/smable3/entity/BleTouchSettings;

    return-object p0
.end method

.method public static final synthetic access$showConnectFailPopup(Lcom/sma/smartv3/ui/device/TouchSettingsActivity;)V
    .locals 0

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/TouchSettingsActivity;->showConnectFailPopup()V

    return-void
.end method

.method public static final synthetic access$updateUI(Lcom/sma/smartv3/ui/device/TouchSettingsActivity;)V
    .locals 0

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/TouchSettingsActivity;->updateUI()V

    return-void
.end method

.method private static final containerPanel_delegate$lambda$0(Lcom/sma/smartv3/ui/device/TouchSettingsActivity;)Lcom/sma/smartv3/view/SettingsPanel;
    .locals 1

    const v0, 0x7f0a0572

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Lcom/sma/smartv3/view/SettingsPanel;

    return-object p0
.end method

.method private final getContainerPanel()Lcom/sma/smartv3/view/SettingsPanel;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/TouchSettingsActivity;->containerPanel$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/sma/smartv3/view/SettingsPanel;

    return-object v0
.end method

.method private final getItemDouble()Lcom/sma/smartv3/view/AbhSettingsItem;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/TouchSettingsActivity;->itemDouble$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/sma/smartv3/view/AbhSettingsItem;

    return-object v0
.end method

.method private final getItemHeader()Lcom/sma/smartv3/view/AbhSettingsHeader;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/TouchSettingsActivity;->itemHeader$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/sma/smartv3/view/AbhSettingsHeader;

    return-object v0
.end method

.method private final getItemHeaderCustom()Lcom/sma/smartv3/view/AbhSettingsHeader;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/TouchSettingsActivity;->itemHeaderCustom$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/sma/smartv3/view/AbhSettingsHeader;

    return-object v0
.end method

.method private final getItemHeaderMusic()Lcom/sma/smartv3/view/AbhSettingsHeader;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/TouchSettingsActivity;->itemHeaderMusic$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/sma/smartv3/view/AbhSettingsHeader;

    return-object v0
.end method

.method private final getItemHeaderPhoto()Lcom/sma/smartv3/view/AbhSettingsHeader;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/TouchSettingsActivity;->itemHeaderPhoto$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/sma/smartv3/view/AbhSettingsHeader;

    return-object v0
.end method

.method private final getItemHeaderSlide()Lcom/sma/smartv3/view/AbhSettingsHeader;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/TouchSettingsActivity;->itemHeaderSlide$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/sma/smartv3/view/AbhSettingsHeader;

    return-object v0
.end method

.method private final getItemHeaderTouchRepair()Lcom/sma/smartv3/view/AbhSettingsHeader;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/TouchSettingsActivity;->itemHeaderTouchRepair$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/sma/smartv3/view/AbhSettingsHeader;

    return-object v0
.end method

.method private final getItemLong()Lcom/sma/smartv3/view/AbhSettingsItem;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/TouchSettingsActivity;->itemLong$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/sma/smartv3/view/AbhSettingsItem;

    return-object v0
.end method

.method private final getItemSingle()Lcom/sma/smartv3/view/AbhSettingsItem;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/TouchSettingsActivity;->itemSingle$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/sma/smartv3/view/AbhSettingsItem;

    return-object v0
.end method

.method private final getSingleChoiceItems()Ljava/util/List;
    .locals 14
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/android/mltcode/paycertificationapi/aj4;",
            ">;"
        }
    .end annotation

    new-instance v0, Lcom/android/mltcode/paycertificationapi/aj4;

    const v1, 0x7f14137a

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/android/mltcode/paycertificationapi/aj4;-><init>(II)V

    new-instance v1, Lcom/android/mltcode/paycertificationapi/aj4;

    const v2, 0x7f141372

    const v3, 0x7f141373

    invoke-direct {v1, v2, v3}, Lcom/android/mltcode/paycertificationapi/aj4;-><init>(II)V

    new-instance v2, Lcom/android/mltcode/paycertificationapi/aj4;

    const v3, 0x7f141387

    const v4, 0x7f141388

    invoke-direct {v2, v3, v4}, Lcom/android/mltcode/paycertificationapi/aj4;-><init>(II)V

    new-instance v3, Lcom/android/mltcode/paycertificationapi/aj4;

    const v4, 0x7f141381

    const v5, 0x7f141382

    invoke-direct {v3, v4, v5}, Lcom/android/mltcode/paycertificationapi/aj4;-><init>(II)V

    new-instance v4, Lcom/android/mltcode/paycertificationapi/aj4;

    const v5, 0x7f141383

    const v6, 0x7f141384

    invoke-direct {v4, v5, v6}, Lcom/android/mltcode/paycertificationapi/aj4;-><init>(II)V

    new-instance v5, Lcom/android/mltcode/paycertificationapi/aj4;

    const v6, 0x7f141385

    const v7, 0x7f141386

    invoke-direct {v5, v6, v7}, Lcom/android/mltcode/paycertificationapi/aj4;-><init>(II)V

    new-instance v6, Lcom/android/mltcode/paycertificationapi/aj4;

    const v7, 0x7f141380

    const v8, 0x7f141374

    invoke-direct {v6, v7, v8}, Lcom/android/mltcode/paycertificationapi/aj4;-><init>(II)V

    new-instance v7, Lcom/android/mltcode/paycertificationapi/aj4;

    const v8, 0x7f14138b

    const v9, 0x7f14138c

    invoke-direct {v7, v8, v9}, Lcom/android/mltcode/paycertificationapi/aj4;-><init>(II)V

    new-instance v8, Lcom/android/mltcode/paycertificationapi/aj4;

    const v9, 0x7f141389

    const v10, 0x7f14138a

    invoke-direct {v8, v9, v10}, Lcom/android/mltcode/paycertificationapi/aj4;-><init>(II)V

    new-instance v9, Lcom/android/mltcode/paycertificationapi/aj4;

    const v10, 0x7f141379

    const v11, 0x7f14137d

    invoke-direct {v9, v10, v11}, Lcom/android/mltcode/paycertificationapi/aj4;-><init>(II)V

    new-instance v10, Lcom/android/mltcode/paycertificationapi/aj4;

    const v11, 0x7f141377

    const v12, 0x7f14137b

    invoke-direct {v10, v11, v12}, Lcom/android/mltcode/paycertificationapi/aj4;-><init>(II)V

    new-instance v11, Lcom/android/mltcode/paycertificationapi/aj4;

    const v12, 0x7f141378

    const v13, 0x7f14137c

    invoke-direct {v11, v12, v13}, Lcom/android/mltcode/paycertificationapi/aj4;-><init>(II)V

    filled-new-array/range {v0 .. v11}, [Lcom/android/mltcode/paycertificationapi/aj4;

    move-result-object v0

    invoke-static {v0}, Lkotlin/collections/CollectionsKt__CollectionsKt;->iXiX011([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic i010I(Lcom/sma/smartv3/ui/device/TouchSettingsActivity;Z)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Lcom/sma/smartv3/ui/device/TouchSettingsActivity;->setHeader$lambda$0$0(Lcom/sma/smartv3/ui/device/TouchSettingsActivity;Z)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic iI()Z
    .locals 1

    invoke-static {}, Lcom/sma/smartv3/ui/device/TouchSettingsActivity;->showConnectFailPopup$lambda$0$0()Z

    move-result v0

    return v0
.end method

.method public static synthetic iIiiO(Lcom/sma/smartv3/ui/device/TouchSettingsActivity;ZZ)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/sma/smartv3/ui/device/TouchSettingsActivity;->setHeader$lambda$0$0$0(Lcom/sma/smartv3/ui/device/TouchSettingsActivity;ZZ)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic iOO1ii1(Lcom/sma/smartv3/ui/device/TouchSettingsActivity;)Lcom/sma/smartv3/view/AbhSettingsHeader;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/device/TouchSettingsActivity;->itemHeaderPhoto_delegate$lambda$0(Lcom/sma/smartv3/ui/device/TouchSettingsActivity;)Lcom/sma/smartv3/view/AbhSettingsHeader;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic iOOX010X(Lcom/sma/smartv3/ui/device/TouchSettingsActivity;Landroid/view/View;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/sma/smartv3/ui/device/TouchSettingsActivity;->initView$lambda$0$0(Lcom/sma/smartv3/ui/device/TouchSettingsActivity;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic iX(Lcom/android/mltcode/paycertificationapi/go0;Lcom/sma/smartv3/ui/device/TouchSettingsActivity;)Z
    .locals 0

    invoke-static {p0, p1}, Lcom/sma/smartv3/ui/device/TouchSettingsActivity;->showConnectFailPopup$lambda$0$1(Lcom/android/mltcode/paycertificationapi/go0;Lcom/sma/smartv3/ui/device/TouchSettingsActivity;)Z

    move-result p0

    return p0
.end method

.method public static synthetic iX1O1(Landroid/view/View;Lcom/sma/smartv3/ui/device/TouchSettingsActivity;ILcom/szabh/smable3/component/BleConnector;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lcom/sma/smartv3/ui/device/TouchSettingsActivity;->onShowKeysPopup$lambda$0$0$0(Landroid/view/View;Lcom/sma/smartv3/ui/device/TouchSettingsActivity;ILcom/szabh/smable3/component/BleConnector;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method private static final initView$lambda$0$0(Lcom/sma/smartv3/ui/device/TouchSettingsActivity;Landroid/view/View;)V
    .locals 1

    new-instance p1, Landroid/content/Intent;

    const-class v0, Lcom/sma/smartv3/ui/device/TouchRepairActivity;

    invoke-direct {p1, p0, v0}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    invoke-virtual {p0, p1}, Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V

    return-void
.end method

.method private static final itemDouble_delegate$lambda$0(Lcom/sma/smartv3/ui/device/TouchSettingsActivity;)Lcom/sma/smartv3/view/AbhSettingsItem;
    .locals 1

    const v0, 0x7f0a0588

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Lcom/sma/smartv3/view/AbhSettingsItem;

    return-object p0
.end method

.method private static final itemHeaderCustom_delegate$lambda$0(Lcom/sma/smartv3/ui/device/TouchSettingsActivity;)Lcom/sma/smartv3/view/AbhSettingsHeader;
    .locals 1

    const v0, 0x7f0a0595

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Lcom/sma/smartv3/view/AbhSettingsHeader;

    return-object p0
.end method

.method private static final itemHeaderMusic_delegate$lambda$0(Lcom/sma/smartv3/ui/device/TouchSettingsActivity;)Lcom/sma/smartv3/view/AbhSettingsHeader;
    .locals 1

    const v0, 0x7f0a059c

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Lcom/sma/smartv3/view/AbhSettingsHeader;

    return-object p0
.end method

.method private static final itemHeaderPhoto_delegate$lambda$0(Lcom/sma/smartv3/ui/device/TouchSettingsActivity;)Lcom/sma/smartv3/view/AbhSettingsHeader;
    .locals 1

    const v0, 0x7f0a059d

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Lcom/sma/smartv3/view/AbhSettingsHeader;

    return-object p0
.end method

.method private static final itemHeaderSlide_delegate$lambda$0(Lcom/sma/smartv3/ui/device/TouchSettingsActivity;)Lcom/sma/smartv3/view/AbhSettingsHeader;
    .locals 1

    const v0, 0x7f0a05a3

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Lcom/sma/smartv3/view/AbhSettingsHeader;

    return-object p0
.end method

.method private static final itemHeaderTouchRepair_delegate$lambda$0(Lcom/sma/smartv3/ui/device/TouchSettingsActivity;)Lcom/sma/smartv3/view/AbhSettingsHeader;
    .locals 1

    const v0, 0x7f0a05a5

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Lcom/sma/smartv3/view/AbhSettingsHeader;

    return-object p0
.end method

.method private static final itemHeader_delegate$lambda$0(Lcom/sma/smartv3/ui/device/TouchSettingsActivity;)Lcom/sma/smartv3/view/AbhSettingsHeader;
    .locals 1

    const v0, 0x7f0a0594

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Lcom/sma/smartv3/view/AbhSettingsHeader;

    return-object p0
.end method

.method private static final itemLong_delegate$lambda$0(Lcom/sma/smartv3/ui/device/TouchSettingsActivity;)Lcom/sma/smartv3/view/AbhSettingsItem;
    .locals 1

    const v0, 0x7f0a05c3

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Lcom/sma/smartv3/view/AbhSettingsItem;

    return-object p0
.end method

.method private static final itemSingle_delegate$lambda$0(Lcom/sma/smartv3/ui/device/TouchSettingsActivity;)Lcom/sma/smartv3/view/AbhSettingsItem;
    .locals 1

    const v0, 0x7f0a05db

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Lcom/sma/smartv3/view/AbhSettingsItem;

    return-object p0
.end method

.method private static final onShowKeysPopup$lambda$0$0(Landroid/view/View;Lcom/sma/smartv3/ui/device/TouchSettingsActivity;I)Z
    .locals 1

    new-instance v0, Lcom/android/mltcode/paycertificationapi/mx5;

    invoke-direct {v0, p0, p1, p2}, Lcom/android/mltcode/paycertificationapi/mx5;-><init>(Landroid/view/View;Lcom/sma/smartv3/ui/device/TouchSettingsActivity;I)V

    const/4 p0, 0x1

    const/4 p1, 0x0

    const/4 p2, 0x0

    invoke-static {p2, v0, p0, p1}, Lcom/android/mltcode/paycertificationapi/X0IOiX1O;->XIi00iiXO(ZLkotlin/jvm/functions/Function1;ILjava/lang/Object;)Z

    move-result p0

    return p0
.end method

.method private static final onShowKeysPopup$lambda$0$0$0(Landroid/view/View;Lcom/sma/smartv3/ui/device/TouchSettingsActivity;ILcom/szabh/smable3/component/BleConnector;)Lkotlin/Unit;
    .locals 8

    const-string v0, "it"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Landroid/view/View;->getId()I

    move-result p0

    const v0, 0x7f0a0588

    if-eq p0, v0, :cond_2

    const v0, 0x7f0a05c3

    if-eq p0, v0, :cond_1

    const v0, 0x7f0a05db

    if-eq p0, v0, :cond_0

    goto :goto_0

    :cond_0
    iget-object p0, p1, Lcom/sma/smartv3/ui/device/TouchSettingsActivity;->mSettings:Lcom/szabh/smable3/entity/BleTouchSettings;

    invoke-virtual {p0, p2}, Lcom/szabh/smable3/entity/BleTouchSettings;->setMCustomSingle(I)V

    goto :goto_0

    :cond_1
    iget-object p0, p1, Lcom/sma/smartv3/ui/device/TouchSettingsActivity;->mSettings:Lcom/szabh/smable3/entity/BleTouchSettings;

    invoke-virtual {p0, p2}, Lcom/szabh/smable3/entity/BleTouchSettings;->setMCustomLong(I)V

    goto :goto_0

    :cond_2
    iget-object p0, p1, Lcom/sma/smartv3/ui/device/TouchSettingsActivity;->mSettings:Lcom/szabh/smable3/entity/BleTouchSettings;

    invoke-virtual {p0, p2}, Lcom/szabh/smable3/entity/BleTouchSettings;->setMCustomDouble(I)V

    :goto_0
    sget-object v1, Lcom/szabh/smable3/BleKey;->TOUCH_SET:Lcom/szabh/smable3/BleKey;

    sget-object v2, Lcom/szabh/smable3/BleKeyFlag;->UPDATE:Lcom/szabh/smable3/BleKeyFlag;

    iget-object v3, p1, Lcom/sma/smartv3/ui/device/TouchSettingsActivity;->mSettings:Lcom/szabh/smable3/entity/BleTouchSettings;

    const/16 v6, 0x18

    const/4 v7, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object v0, p3

    invoke-static/range {v0 .. v7}, Lcom/szabh/smable3/component/BaseBleConnector;->sendObject$default(Lcom/szabh/smable3/component/BaseBleConnector;Lcom/szabh/smable3/BleKey;Lcom/szabh/smable3/BleKeyFlag;Lcom/bestmafen/baseble/data/BleBuffer;ZZILjava/lang/Object;)Z

    invoke-direct {p1}, Lcom/sma/smartv3/ui/device/TouchSettingsActivity;->updateUI()V

    sget-object p0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p0
.end method

.method private final setHeader()V
    .locals 2

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/TouchSettingsActivity;->getItemHeader()Lcom/sma/smartv3/view/AbhSettingsHeader;

    move-result-object v0

    iget-object v1, p0, Lcom/sma/smartv3/ui/device/TouchSettingsActivity;->mSettings:Lcom/szabh/smable3/entity/BleTouchSettings;

    invoke-virtual {v1}, Lcom/szabh/smable3/entity/BleTouchSettings;->getMEnabled()I

    move-result v1

    invoke-static {v1}, Lcom/android/mltcode/paycertificationapi/OiOX0i;->XIi00iiXO(I)Z

    move-result v1

    invoke-virtual {v0, v1}, Lcom/sma/smartv3/view/AbhSettingsHeader;->setChecked(Z)V

    new-instance v1, Lcom/android/mltcode/paycertificationapi/lx5;

    invoke-direct {v1, p0}, Lcom/android/mltcode/paycertificationapi/lx5;-><init>(Lcom/sma/smartv3/ui/device/TouchSettingsActivity;)V

    invoke-virtual {v0, v1}, Lcom/sma/smartv3/view/AbhSettingsHeader;->setMListener(Lkotlin/jvm/functions/Function1;)V

    return-void
.end method

.method private static final setHeader$lambda$0$0(Lcom/sma/smartv3/ui/device/TouchSettingsActivity;Z)Lkotlin/Unit;
    .locals 1

    if-eqz p1, :cond_0

    new-instance v0, Lcom/android/mltcode/paycertificationapi/ax5;

    invoke-direct {v0, p0, p1}, Lcom/android/mltcode/paycertificationapi/ax5;-><init>(Lcom/sma/smartv3/ui/device/TouchSettingsActivity;Z)V

    invoke-direct {p0, v0}, Lcom/sma/smartv3/ui/device/TouchSettingsActivity;->showTouchICPopup(Lkotlin/jvm/functions/Function1;)V

    goto :goto_0

    :cond_0
    invoke-direct {p0, p1}, Lcom/sma/smartv3/ui/device/TouchSettingsActivity;->setHeaderChecked(Z)V

    :goto_0
    sget-object p0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p0
.end method

.method private static final setHeader$lambda$0$0$0(Lcom/sma/smartv3/ui/device/TouchSettingsActivity;ZZ)Lkotlin/Unit;
    .locals 0

    if-eqz p2, :cond_0

    invoke-direct {p0, p1}, Lcom/sma/smartv3/ui/device/TouchSettingsActivity;->setHeaderChecked(Z)V

    goto :goto_0

    :cond_0
    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/TouchSettingsActivity;->getItemHeader()Lcom/sma/smartv3/view/AbhSettingsHeader;

    move-result-object p0

    const/4 p1, 0x0

    invoke-virtual {p0, p1}, Lcom/sma/smartv3/view/AbhSettingsHeader;->setChecked(Z)V

    :goto_0
    sget-object p0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p0
.end method

.method private final setHeaderChecked(Z)V
    .locals 4

    new-instance v0, Lcom/android/mltcode/paycertificationapi/nx5;

    invoke-direct {v0, p1, p0}, Lcom/android/mltcode/paycertificationapi/nx5;-><init>(ZLcom/sma/smartv3/ui/device/TouchSettingsActivity;)V

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x1

    invoke-static {v2, v0, v3, v1}, Lcom/android/mltcode/paycertificationapi/X0IOiX1O;->XIi00iiXO(ZLkotlin/jvm/functions/Function1;ILjava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/TouchSettingsActivity;->getItemHeader()Lcom/sma/smartv3/view/AbhSettingsHeader;

    move-result-object v0

    xor-int/2addr p1, v3

    invoke-virtual {v0, p1}, Lcom/sma/smartv3/view/AbhSettingsHeader;->setChecked(Z)V

    :cond_0
    return-void
.end method

.method private static final setHeaderChecked$lambda$0(ZLcom/sma/smartv3/ui/device/TouchSettingsActivity;Lcom/szabh/smable3/component/BleConnector;)Lkotlin/Unit;
    .locals 11

    const-string v0, "it"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-eqz p0, :cond_1

    sget-object p0, Lcom/szabh/smable3/component/BleConnector;->INSTANCE:Lcom/szabh/smable3/component/BleConnector;

    invoke-virtual {p0}, Lcom/szabh/smable3/component/BaseBleConnector;->isBoundHID()Z

    move-result p0

    if-eqz p0, :cond_0

    iget-object p0, p1, Lcom/sma/smartv3/ui/device/TouchSettingsActivity;->mSettings:Lcom/szabh/smable3/entity/BleTouchSettings;

    invoke-virtual {p0, v1}, Lcom/szabh/smable3/entity/BleTouchSettings;->setMEnabled(I)V

    sget-object v4, Lcom/szabh/smable3/BleKey;->TOUCH_SET:Lcom/szabh/smable3/BleKey;

    sget-object v5, Lcom/szabh/smable3/BleKeyFlag;->UPDATE:Lcom/szabh/smable3/BleKeyFlag;

    iget-object v6, p1, Lcom/sma/smartv3/ui/device/TouchSettingsActivity;->mSettings:Lcom/szabh/smable3/entity/BleTouchSettings;

    const/16 v9, 0x18

    const/4 v10, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    move-object v3, p2

    invoke-static/range {v3 .. v10}, Lcom/szabh/smable3/component/BaseBleConnector;->sendObject$default(Lcom/szabh/smable3/component/BaseBleConnector;Lcom/szabh/smable3/BleKey;Lcom/szabh/smable3/BleKeyFlag;Lcom/bestmafen/baseble/data/BleBuffer;ZZILjava/lang/Object;)Z

    invoke-direct {p1}, Lcom/sma/smartv3/ui/device/TouchSettingsActivity;->updateUI()V

    invoke-virtual {p1}, Lcom/bestmafen/androidbase/base/BaseActivity;->getMContext()Landroid/app/Activity;

    move-result-object p0

    const/4 p1, 0x2

    invoke-static {p0, v2, p1, v0}, Lcom/android/mltcode/paycertificationapi/i22;->O00(Landroid/content/Context;IILjava/lang/Object;)V

    goto :goto_0

    :cond_0
    invoke-direct {p1}, Lcom/sma/smartv3/ui/device/TouchSettingsActivity;->getItemHeader()Lcom/sma/smartv3/view/AbhSettingsHeader;

    move-result-object p0

    invoke-virtual {p0, v2}, Lcom/sma/smartv3/view/AbhSettingsHeader;->setChecked(Z)V

    invoke-direct {p1}, Lcom/sma/smartv3/ui/device/TouchSettingsActivity;->tryConnectHID()V

    invoke-static {v2, v1, v0}, Lcom/android/mltcode/paycertificationapi/i22;->iO(IILjava/lang/Object;)V

    goto :goto_0

    :cond_1
    move-object v3, p2

    iget-object p0, p1, Lcom/sma/smartv3/ui/device/TouchSettingsActivity;->mSettings:Lcom/szabh/smable3/entity/BleTouchSettings;

    invoke-virtual {p0, v2}, Lcom/szabh/smable3/entity/BleTouchSettings;->setMEnabled(I)V

    sget-object v4, Lcom/szabh/smable3/BleKey;->TOUCH_SET:Lcom/szabh/smable3/BleKey;

    sget-object v5, Lcom/szabh/smable3/BleKeyFlag;->UPDATE:Lcom/szabh/smable3/BleKeyFlag;

    iget-object v6, p1, Lcom/sma/smartv3/ui/device/TouchSettingsActivity;->mSettings:Lcom/szabh/smable3/entity/BleTouchSettings;

    const/16 v9, 0x18

    const/4 v10, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    invoke-static/range {v3 .. v10}, Lcom/szabh/smable3/component/BaseBleConnector;->sendObject$default(Lcom/szabh/smable3/component/BaseBleConnector;Lcom/szabh/smable3/BleKey;Lcom/szabh/smable3/BleKeyFlag;Lcom/bestmafen/baseble/data/BleBuffer;ZZILjava/lang/Object;)Z

    invoke-static {v2, v1, v0}, Lcom/android/mltcode/paycertificationapi/i22;->iO(IILjava/lang/Object;)V

    invoke-direct {p1}, Lcom/sma/smartv3/ui/device/TouchSettingsActivity;->updateUI()V

    :goto_0
    sget-object p0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p0
.end method

.method private final showConnectFailPopup()V
    .locals 4

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/TouchSettingsActivity;->mFailPopup:Lcom/android/mltcode/paycertificationapi/go0;

    if-nez v0, :cond_0

    new-instance v0, Lcom/android/mltcode/paycertificationapi/go0;

    const/4 v1, 0x2

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-direct {v0, p0, v3, v1, v2}, Lcom/android/mltcode/paycertificationapi/go0;-><init>(Landroid/app/Activity;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const v1, 0x7f140cd2

    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/go0;->O1O(I)V

    const v1, 0x7f14027f

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    new-instance v2, Lcom/android/mltcode/paycertificationapi/gx5;

    invoke-direct {v2}, Lcom/android/mltcode/paycertificationapi/gx5;-><init>()V

    invoke-virtual {v0, v1, v2}, Lcom/android/mltcode/paycertificationapi/go0;->iX1O1(Ljava/lang/Integer;Lkotlin/jvm/functions/Function0;)V

    new-instance v1, Lcom/android/mltcode/paycertificationapi/hx5;

    invoke-direct {v1, v0, p0}, Lcom/android/mltcode/paycertificationapi/hx5;-><init>(Lcom/android/mltcode/paycertificationapi/go0;Lcom/sma/smartv3/ui/device/TouchSettingsActivity;)V

    const v2, 0x7f14034b

    invoke-virtual {v0, v2, v1}, Lcom/android/mltcode/paycertificationapi/go0;->X1IX(ILkotlin/jvm/functions/Function0;)V

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/TouchSettingsActivity;->mFailPopup:Lcom/android/mltcode/paycertificationapi/go0;

    :cond_0
    iget-object v0, p0, Lcom/sma/smartv3/ui/device/TouchSettingsActivity;->mFailPopup:Lcom/android/mltcode/paycertificationapi/go0;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Landroid/widget/PopupWindow;->isShowing()Z

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_1

    return-void

    :cond_1
    iget-object v0, p0, Lcom/sma/smartv3/ui/device/TouchSettingsActivity;->mFailPopup:Lcom/android/mltcode/paycertificationapi/go0;

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/OIXIOIO;->IIX1OXO()V

    :cond_2
    return-void
.end method

.method private static final showConnectFailPopup$lambda$0$0()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method private static final showConnectFailPopup$lambda$0$1(Lcom/android/mltcode/paycertificationapi/go0;Lcom/sma/smartv3/ui/device/TouchSettingsActivity;)Z
    .locals 0

    invoke-virtual {p0}, Landroid/widget/PopupWindow;->dismiss()V

    invoke-direct {p1}, Lcom/sma/smartv3/ui/device/TouchSettingsActivity;->tryConnectHID()V

    const/4 p0, 0x1

    return p0
.end method

.method private final showTouchICPopup(Lkotlin/jvm/functions/Function1;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Ljava/lang/Boolean;",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/TouchSettingsActivity;->mTouchICPopup:Lcom/android/mltcode/paycertificationapi/go0;

    if-nez v0, :cond_0

    new-instance v0, Lcom/android/mltcode/paycertificationapi/go0;

    const/4 v1, 0x2

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-direct {v0, p0, v3, v1, v2}, Lcom/android/mltcode/paycertificationapi/go0;-><init>(Landroid/app/Activity;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const v1, 0x7f140b9f

    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/go0;->O1O(I)V

    const v1, 0x7f140ba0

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/go0;->iX(Ljava/lang/Integer;)V

    const v1, 0x7f14124b

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    new-instance v2, Lcom/android/mltcode/paycertificationapi/rw5;

    invoke-direct {v2, p1}, Lcom/android/mltcode/paycertificationapi/rw5;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v0, v1, v2}, Lcom/android/mltcode/paycertificationapi/go0;->iX1O1(Ljava/lang/Integer;Lkotlin/jvm/functions/Function0;)V

    new-instance v1, Lcom/android/mltcode/paycertificationapi/cx5;

    invoke-direct {v1, p1}, Lcom/android/mltcode/paycertificationapi/cx5;-><init>(Lkotlin/jvm/functions/Function1;)V

    const p1, 0x7f141073

    invoke-virtual {v0, p1, v1}, Lcom/android/mltcode/paycertificationapi/go0;->X1IX(ILkotlin/jvm/functions/Function0;)V

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/TouchSettingsActivity;->mTouchICPopup:Lcom/android/mltcode/paycertificationapi/go0;

    :cond_0
    iget-object p1, p0, Lcom/sma/smartv3/ui/device/TouchSettingsActivity;->mTouchICPopup:Lcom/android/mltcode/paycertificationapi/go0;

    if-eqz p1, :cond_1

    invoke-virtual {p1}, Landroid/widget/PopupWindow;->isShowing()Z

    move-result p1

    const/4 v0, 0x1

    if-ne p1, v0, :cond_1

    return-void

    :cond_1
    iget-object p1, p0, Lcom/sma/smartv3/ui/device/TouchSettingsActivity;->mTouchICPopup:Lcom/android/mltcode/paycertificationapi/go0;

    if-eqz p1, :cond_2

    invoke-virtual {p1}, Lcom/android/mltcode/paycertificationapi/OIXIOIO;->IIX1OXO()V

    :cond_2
    return-void
.end method

.method private static final showTouchICPopup$lambda$0$0(Lkotlin/jvm/functions/Function1;)Z
    .locals 1

    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    const/4 p0, 0x1

    return p0
.end method

.method private static final showTouchICPopup$lambda$0$1(Lkotlin/jvm/functions/Function1;)Z
    .locals 1

    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    const/4 p0, 0x1

    return p0
.end method

.method private final tryConnectHID()V
    .locals 2

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/TouchSettingsActivity;->mLoadingPopup:Lcom/android/mltcode/paycertificationapi/uq;

    if-nez v0, :cond_0

    new-instance v0, Lcom/android/mltcode/paycertificationapi/uq;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/uq;-><init>(Landroid/app/Activity;)V

    const v1, 0x7f1403f9

    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/uq;->X01IiOiIi(I)V

    const v1, 0x7f140354

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/uq;->I1(Ljava/lang/Integer;)V

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/TouchSettingsActivity;->mLoadingPopup:Lcom/android/mltcode/paycertificationapi/uq;

    :cond_0
    iget-object v0, p0, Lcom/sma/smartv3/ui/device/TouchSettingsActivity;->mLoadingPopup:Lcom/android/mltcode/paycertificationapi/uq;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/OIXIOIO;->IIX1OXO()V

    :cond_1
    sget-object v0, Lcom/szabh/smable3/component/BleConnector;->INSTANCE:Lcom/szabh/smable3/component/BleConnector;

    invoke-virtual {v0}, Lcom/szabh/smable3/component/BleConnector;->connectHID()V

    return-void
.end method

.method private final updateCrossAppToAiTransPage(Z)V
    .locals 2

    sget-object v0, Lcom/android/mltcode/paycertificationapi/a01;->OXO1:Lcom/android/mltcode/paycertificationapi/a01;

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/a01;->OXO1()Lcom/blankj/utilcode/util/SPUtils;

    move-result-object v0

    const-string v1, "WINDOW_FLOAT_STATUS"

    invoke-virtual {v0, v1, p1}, Lcom/blankj/utilcode/util/SPUtils;->put(Ljava/lang/String;Z)V

    const/4 p1, 0x0

    const/4 v0, 0x2

    const-string v1, "WINDOW_FLOAT_CHANGE"

    invoke-static {v1, p1, v0, p1}, Lcom/android/mltcode/paycertificationapi/I01XX0;->XIi00iiXO(Ljava/lang/String;Ljava/lang/Object;ILjava/lang/Object;)V

    return-void
.end method

.method private final updateUI()V
    .locals 9

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/TouchSettingsActivity;->getItemHeaderMusic()Lcom/sma/smartv3/view/AbhSettingsHeader;

    move-result-object v0

    invoke-virtual {v0}, Lcom/sma/smartv3/view/AbhSettingsHeader;->getCheckEnabled()Landroid/widget/CheckBox;

    move-result-object v1

    const v2, 0x7f081685

    invoke-virtual {v1, v2}, Landroid/widget/CompoundButton;->setButtonDrawable(I)V

    iget-object v1, p0, Lcom/sma/smartv3/ui/device/TouchSettingsActivity;->mSettings:Lcom/szabh/smable3/entity/BleTouchSettings;

    invoke-virtual {v1}, Lcom/szabh/smable3/entity/BleTouchSettings;->getMType()I

    move-result v1

    const/4 v3, 0x0

    const/4 v4, 0x1

    if-nez v1, :cond_0

    move v1, v4

    goto :goto_0

    :cond_0
    move v1, v3

    :goto_0
    invoke-virtual {v0, v1}, Lcom/sma/smartv3/view/AbhSettingsHeader;->setChecked(Z)V

    new-instance v1, Lcom/android/mltcode/paycertificationapi/bx5;

    invoke-direct {v1, p0}, Lcom/android/mltcode/paycertificationapi/bx5;-><init>(Lcom/sma/smartv3/ui/device/TouchSettingsActivity;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/TouchSettingsActivity;->getItemHeaderPhoto()Lcom/sma/smartv3/view/AbhSettingsHeader;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/TouchSettingsActivity;->getItemHeaderPhoto()Lcom/sma/smartv3/view/AbhSettingsHeader;

    move-result-object v0

    invoke-virtual {v0}, Lcom/sma/smartv3/view/AbhSettingsHeader;->getCheckEnabled()Landroid/widget/CheckBox;

    move-result-object v5

    invoke-virtual {v5, v2}, Landroid/widget/CompoundButton;->setButtonDrawable(I)V

    iget-object v5, p0, Lcom/sma/smartv3/ui/device/TouchSettingsActivity;->mSettings:Lcom/szabh/smable3/entity/BleTouchSettings;

    invoke-virtual {v5}, Lcom/szabh/smable3/entity/BleTouchSettings;->getMType()I

    move-result v5

    if-ne v5, v4, :cond_1

    move v5, v4

    goto :goto_1

    :cond_1
    move v5, v3

    :goto_1
    invoke-virtual {v0, v5}, Lcom/sma/smartv3/view/AbhSettingsHeader;->setChecked(Z)V

    new-instance v5, Lcom/android/mltcode/paycertificationapi/dx5;

    invoke-direct {v5, p0}, Lcom/android/mltcode/paycertificationapi/dx5;-><init>(Lcom/sma/smartv3/ui/device/TouchSettingsActivity;)V

    invoke-virtual {v0, v5}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    sget-object v0, Lcom/android/mltcode/paycertificationapi/q62;->OXO1:Lcom/android/mltcode/paycertificationapi/q62;

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/q62;->ii1I()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/TouchSettingsActivity;->getItemHeaderSlide()Lcom/sma/smartv3/view/AbhSettingsHeader;

    move-result-object v0

    invoke-virtual {v0, v3}, Landroid/view/View;->setVisibility(I)V

    goto :goto_2

    :cond_2
    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/TouchSettingsActivity;->getItemHeaderSlide()Lcom/sma/smartv3/view/AbhSettingsHeader;

    move-result-object v0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    :goto_2
    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/TouchSettingsActivity;->getItemHeaderSlide()Lcom/sma/smartv3/view/AbhSettingsHeader;

    move-result-object v0

    invoke-virtual {v0}, Lcom/sma/smartv3/view/AbhSettingsHeader;->getCheckEnabled()Landroid/widget/CheckBox;

    move-result-object v5

    invoke-virtual {v5, v2}, Landroid/widget/CompoundButton;->setButtonDrawable(I)V

    iget-object v5, p0, Lcom/sma/smartv3/ui/device/TouchSettingsActivity;->mSettings:Lcom/szabh/smable3/entity/BleTouchSettings;

    invoke-virtual {v5}, Lcom/szabh/smable3/entity/BleTouchSettings;->getMType()I

    move-result v5

    const/4 v6, 0x2

    if-ne v5, v6, :cond_3

    move v5, v4

    goto :goto_3

    :cond_3
    move v5, v3

    :goto_3
    invoke-virtual {v0, v5}, Lcom/sma/smartv3/view/AbhSettingsHeader;->setChecked(Z)V

    new-instance v5, Lcom/android/mltcode/paycertificationapi/ex5;

    invoke-direct {v5, p0, v0}, Lcom/android/mltcode/paycertificationapi/ex5;-><init>(Lcom/sma/smartv3/ui/device/TouchSettingsActivity;Lcom/sma/smartv3/view/AbhSettingsHeader;)V

    invoke-virtual {v0, v5}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/TouchSettingsActivity;->getItemHeaderCustom()Lcom/sma/smartv3/view/AbhSettingsHeader;

    move-result-object v0

    invoke-virtual {v0}, Lcom/sma/smartv3/view/AbhSettingsHeader;->getCheckEnabled()Landroid/widget/CheckBox;

    move-result-object v5

    invoke-virtual {v5, v2}, Landroid/widget/CompoundButton;->setButtonDrawable(I)V

    iget-object v2, p0, Lcom/sma/smartv3/ui/device/TouchSettingsActivity;->mSettings:Lcom/szabh/smable3/entity/BleTouchSettings;

    invoke-virtual {v2}, Lcom/szabh/smable3/entity/BleTouchSettings;->getMType()I

    move-result v2

    const/4 v5, 0x3

    if-ne v2, v5, :cond_4

    move v2, v4

    goto :goto_4

    :cond_4
    move v2, v3

    :goto_4
    invoke-virtual {v0, v2}, Lcom/sma/smartv3/view/AbhSettingsHeader;->setChecked(Z)V

    new-instance v2, Lcom/android/mltcode/paycertificationapi/fx5;

    invoke-direct {v2, p0}, Lcom/android/mltcode/paycertificationapi/fx5;-><init>(Lcom/sma/smartv3/ui/device/TouchSettingsActivity;)V

    invoke-virtual {v0, v2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    invoke-virtual {v0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v2

    const-string v5, "null cannot be cast to non-null type android.view.ViewGroup"

    invoke-static {v2, v5}, Lkotlin/jvm/internal/Intrinsics;->X1ii(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v2, Landroid/view/ViewGroup;

    invoke-static {v2}, Landroidx/core/view/ViewGroupKt;->getChildren(Landroid/view/ViewGroup;)Lkotlin/sequences/Sequence;

    move-result-object v2

    invoke-interface {v2}, Lkotlin/sequences/Sequence;->iterator()Ljava/util/Iterator;

    move-result-object v2

    move v5, v3

    :goto_5
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_8

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    add-int/lit8 v7, v5, 0x1

    if-gez v5, :cond_5

    invoke-static {}, Lkotlin/collections/CollectionsKt__CollectionsKt;->XOX0O0()V

    :cond_5
    check-cast v6, Landroid/view/View;

    instance-of v8, v6, Lcom/sma/smartv3/view/AbhSettingsItem;

    if-eqz v8, :cond_7

    if-lez v5, :cond_7

    check-cast v6, Lcom/sma/smartv3/view/AbhSettingsItem;

    invoke-virtual {v0}, Lcom/sma/smartv3/view/AbhSettingsHeader;->iO()Z

    move-result v5

    if-eqz v5, :cond_6

    move v5, v3

    goto :goto_6

    :cond_6
    move v5, v1

    :goto_6
    invoke-virtual {v6, v5}, Landroid/view/View;->setVisibility(I)V

    :cond_7
    move v5, v7

    goto :goto_5

    :cond_8
    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/TouchSettingsActivity;->getContainerPanel()Lcom/sma/smartv3/view/SettingsPanel;

    move-result-object v0

    iget-object v1, p0, Lcom/sma/smartv3/ui/device/TouchSettingsActivity;->mSettings:Lcom/szabh/smable3/entity/BleTouchSettings;

    invoke-virtual {v1}, Lcom/szabh/smable3/entity/BleTouchSettings;->getMEnabled()I

    move-result v1

    invoke-static {v1}, Lcom/android/mltcode/paycertificationapi/OiOX0i;->XIi00iiXO(I)Z

    move-result v1

    xor-int/2addr v1, v4

    invoke-virtual {v0, v1}, Lcom/sma/smartv3/view/SettingsPanel;->OXO1(Z)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/TouchSettingsActivity;->getItemSingle()Lcom/sma/smartv3/view/AbhSettingsItem;

    move-result-object v0

    iget-object v1, p0, Lcom/sma/smartv3/ui/device/TouchSettingsActivity;->mSingleChoiceItems:Ljava/util/List;

    iget-object v2, p0, Lcom/sma/smartv3/ui/device/TouchSettingsActivity;->mSettings:Lcom/szabh/smable3/entity/BleTouchSettings;

    invoke-virtual {v2}, Lcom/szabh/smable3/entity/BleTouchSettings;->getMCustomSingle()I

    move-result v2

    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/android/mltcode/paycertificationapi/aj4;

    invoke-virtual {v1}, Lcom/android/mltcode/paycertificationapi/aj4;->IiI10X()I

    move-result v1

    invoke-virtual {p0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "getString(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Lcom/sma/smartv3/view/AbhSettingsItem;->setMRightText(Ljava/lang/String;)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/TouchSettingsActivity;->getItemDouble()Lcom/sma/smartv3/view/AbhSettingsItem;

    move-result-object v0

    iget-object v1, p0, Lcom/sma/smartv3/ui/device/TouchSettingsActivity;->mSingleChoiceItems:Ljava/util/List;

    iget-object v3, p0, Lcom/sma/smartv3/ui/device/TouchSettingsActivity;->mSettings:Lcom/szabh/smable3/entity/BleTouchSettings;

    invoke-virtual {v3}, Lcom/szabh/smable3/entity/BleTouchSettings;->getMCustomDouble()I

    move-result v3

    invoke-interface {v1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/android/mltcode/paycertificationapi/aj4;

    invoke-virtual {v1}, Lcom/android/mltcode/paycertificationapi/aj4;->IiI10X()I

    move-result v1

    invoke-virtual {p0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Lcom/sma/smartv3/view/AbhSettingsItem;->setMRightText(Ljava/lang/String;)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/TouchSettingsActivity;->getItemLong()Lcom/sma/smartv3/view/AbhSettingsItem;

    move-result-object v0

    iget-object v1, p0, Lcom/sma/smartv3/ui/device/TouchSettingsActivity;->mSingleChoiceItems:Ljava/util/List;

    iget-object v3, p0, Lcom/sma/smartv3/ui/device/TouchSettingsActivity;->mSettings:Lcom/szabh/smable3/entity/BleTouchSettings;

    invoke-virtual {v3}, Lcom/szabh/smable3/entity/BleTouchSettings;->getMCustomLong()I

    move-result v3

    invoke-interface {v1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/android/mltcode/paycertificationapi/aj4;

    invoke-virtual {v1}, Lcom/android/mltcode/paycertificationapi/aj4;->IiI10X()I

    move-result v1

    invoke-virtual {p0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Lcom/sma/smartv3/view/AbhSettingsItem;->setMRightText(Ljava/lang/String;)V

    return-void
.end method

.method private static final updateUI$lambda$0$0(Lcom/sma/smartv3/ui/device/TouchSettingsActivity;Landroid/view/View;)V
    .locals 2

    new-instance p1, Lcom/android/mltcode/paycertificationapi/ix5;

    invoke-direct {p1, p0}, Lcom/android/mltcode/paycertificationapi/ix5;-><init>(Lcom/sma/smartv3/ui/device/TouchSettingsActivity;)V

    const/4 p0, 0x1

    const/4 v0, 0x0

    const/4 v1, 0x0

    invoke-static {v1, p1, p0, v0}, Lcom/android/mltcode/paycertificationapi/X0IOiX1O;->XIi00iiXO(ZLkotlin/jvm/functions/Function1;ILjava/lang/Object;)Z

    return-void
.end method

.method private static final updateUI$lambda$0$0$0(Lcom/sma/smartv3/ui/device/TouchSettingsActivity;Lcom/szabh/smable3/component/BleConnector;)Lkotlin/Unit;
    .locals 10

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/TouchSettingsActivity;->mSettings:Lcom/szabh/smable3/entity/BleTouchSettings;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/szabh/smable3/entity/BleTouchSettings;->setMType(I)V

    sget-object v3, Lcom/szabh/smable3/BleKey;->TOUCH_SET:Lcom/szabh/smable3/BleKey;

    sget-object v4, Lcom/szabh/smable3/BleKeyFlag;->UPDATE:Lcom/szabh/smable3/BleKeyFlag;

    iget-object v5, p0, Lcom/sma/smartv3/ui/device/TouchSettingsActivity;->mSettings:Lcom/szabh/smable3/entity/BleTouchSettings;

    const/16 v8, 0x18

    const/4 v9, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    move-object v2, p1

    invoke-static/range {v2 .. v9}, Lcom/szabh/smable3/component/BaseBleConnector;->sendObject$default(Lcom/szabh/smable3/component/BaseBleConnector;Lcom/szabh/smable3/BleKey;Lcom/szabh/smable3/BleKeyFlag;Lcom/bestmafen/baseble/data/BleBuffer;ZZILjava/lang/Object;)Z

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/TouchSettingsActivity;->updateUI()V

    sget-object p0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p0
.end method

.method private static final updateUI$lambda$1$0(Lcom/sma/smartv3/ui/device/TouchSettingsActivity;Landroid/view/View;)V
    .locals 2

    new-instance p1, Lcom/android/mltcode/paycertificationapi/jx5;

    invoke-direct {p1, p0}, Lcom/android/mltcode/paycertificationapi/jx5;-><init>(Lcom/sma/smartv3/ui/device/TouchSettingsActivity;)V

    const/4 p0, 0x1

    const/4 v0, 0x0

    const/4 v1, 0x0

    invoke-static {v1, p1, p0, v0}, Lcom/android/mltcode/paycertificationapi/X0IOiX1O;->XIi00iiXO(ZLkotlin/jvm/functions/Function1;ILjava/lang/Object;)Z

    return-void
.end method

.method private static final updateUI$lambda$1$0$0(Lcom/sma/smartv3/ui/device/TouchSettingsActivity;Lcom/szabh/smable3/component/BleConnector;)Lkotlin/Unit;
    .locals 10

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/TouchSettingsActivity;->mSettings:Lcom/szabh/smable3/entity/BleTouchSettings;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/szabh/smable3/entity/BleTouchSettings;->setMType(I)V

    sget-object v3, Lcom/szabh/smable3/BleKey;->TOUCH_SET:Lcom/szabh/smable3/BleKey;

    sget-object v4, Lcom/szabh/smable3/BleKeyFlag;->UPDATE:Lcom/szabh/smable3/BleKeyFlag;

    iget-object v5, p0, Lcom/sma/smartv3/ui/device/TouchSettingsActivity;->mSettings:Lcom/szabh/smable3/entity/BleTouchSettings;

    const/16 v8, 0x18

    const/4 v9, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    move-object v2, p1

    invoke-static/range {v2 .. v9}, Lcom/szabh/smable3/component/BaseBleConnector;->sendObject$default(Lcom/szabh/smable3/component/BaseBleConnector;Lcom/szabh/smable3/BleKey;Lcom/szabh/smable3/BleKeyFlag;Lcom/bestmafen/baseble/data/BleBuffer;ZZILjava/lang/Object;)Z

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/TouchSettingsActivity;->updateUI()V

    sget-object p0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p0
.end method

.method private static final updateUI$lambda$2$0(Lcom/sma/smartv3/ui/device/TouchSettingsActivity;Lcom/sma/smartv3/view/AbhSettingsHeader;Landroid/view/View;)V
    .locals 3

    new-instance p2, Lcom/android/mltcode/paycertificationapi/zw5;

    invoke-direct {p2, p0}, Lcom/android/mltcode/paycertificationapi/zw5;-><init>(Lcom/sma/smartv3/ui/device/TouchSettingsActivity;)V

    const/4 v0, 0x1

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-static {v2, p2, v0, v1}, Lcom/android/mltcode/paycertificationapi/X0IOiX1O;->XIi00iiXO(ZLkotlin/jvm/functions/Function1;ILjava/lang/Object;)Z

    invoke-virtual {p1}, Lcom/sma/smartv3/view/AbhSettingsHeader;->iO()Z

    move-result p1

    invoke-direct {p0, p1}, Lcom/sma/smartv3/ui/device/TouchSettingsActivity;->updateCrossAppToAiTransPage(Z)V

    return-void
.end method

.method private static final updateUI$lambda$2$0$0(Lcom/sma/smartv3/ui/device/TouchSettingsActivity;Lcom/szabh/smable3/component/BleConnector;)Lkotlin/Unit;
    .locals 10

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/TouchSettingsActivity;->mSettings:Lcom/szabh/smable3/entity/BleTouchSettings;

    const/4 v1, 0x2

    invoke-virtual {v0, v1}, Lcom/szabh/smable3/entity/BleTouchSettings;->setMType(I)V

    sget-object v3, Lcom/szabh/smable3/BleKey;->TOUCH_SET:Lcom/szabh/smable3/BleKey;

    sget-object v4, Lcom/szabh/smable3/BleKeyFlag;->UPDATE:Lcom/szabh/smable3/BleKeyFlag;

    iget-object v5, p0, Lcom/sma/smartv3/ui/device/TouchSettingsActivity;->mSettings:Lcom/szabh/smable3/entity/BleTouchSettings;

    const/16 v8, 0x18

    const/4 v9, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    move-object v2, p1

    invoke-static/range {v2 .. v9}, Lcom/szabh/smable3/component/BaseBleConnector;->sendObject$default(Lcom/szabh/smable3/component/BaseBleConnector;Lcom/szabh/smable3/BleKey;Lcom/szabh/smable3/BleKeyFlag;Lcom/bestmafen/baseble/data/BleBuffer;ZZILjava/lang/Object;)Z

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/TouchSettingsActivity;->updateUI()V

    sget-object p0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p0
.end method

.method private static final updateUI$lambda$3$0(Lcom/sma/smartv3/ui/device/TouchSettingsActivity;Landroid/view/View;)V
    .locals 2

    new-instance p1, Lcom/android/mltcode/paycertificationapi/yw5;

    invoke-direct {p1, p0}, Lcom/android/mltcode/paycertificationapi/yw5;-><init>(Lcom/sma/smartv3/ui/device/TouchSettingsActivity;)V

    const/4 p0, 0x1

    const/4 v0, 0x0

    const/4 v1, 0x0

    invoke-static {v1, p1, p0, v0}, Lcom/android/mltcode/paycertificationapi/X0IOiX1O;->XIi00iiXO(ZLkotlin/jvm/functions/Function1;ILjava/lang/Object;)Z

    return-void
.end method

.method private static final updateUI$lambda$3$0$0(Lcom/sma/smartv3/ui/device/TouchSettingsActivity;Lcom/szabh/smable3/component/BleConnector;)Lkotlin/Unit;
    .locals 10

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/TouchSettingsActivity;->mSettings:Lcom/szabh/smable3/entity/BleTouchSettings;

    const/4 v1, 0x3

    invoke-virtual {v0, v1}, Lcom/szabh/smable3/entity/BleTouchSettings;->setMType(I)V

    sget-object v3, Lcom/szabh/smable3/BleKey;->TOUCH_SET:Lcom/szabh/smable3/BleKey;

    sget-object v4, Lcom/szabh/smable3/BleKeyFlag;->UPDATE:Lcom/szabh/smable3/BleKeyFlag;

    iget-object v5, p0, Lcom/sma/smartv3/ui/device/TouchSettingsActivity;->mSettings:Lcom/szabh/smable3/entity/BleTouchSettings;

    const/16 v8, 0x18

    const/4 v9, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    move-object v2, p1

    invoke-static/range {v2 .. v9}, Lcom/szabh/smable3/component/BaseBleConnector;->sendObject$default(Lcom/szabh/smable3/component/BaseBleConnector;Lcom/szabh/smable3/BleKey;Lcom/szabh/smable3/BleKeyFlag;Lcom/bestmafen/baseble/data/BleBuffer;ZZILjava/lang/Object;)Z

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/TouchSettingsActivity;->updateUI()V

    sget-object p0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p0
.end method


# virtual methods
.method public init(Landroid/os/Bundle;)V
    .locals 3
    .param p1    # Landroid/os/Bundle;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param

    sget-object p1, Lcom/android/mltcode/paycertificationapi/I0iIi;->OXO1:Lcom/android/mltcode/paycertificationapi/I0iIi;

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/TouchSettingsActivity;->mBluetoothReceiver:Lcom/sma/smartv3/ui/device/TouchSettingsActivity$mBluetoothReceiver$1;

    new-instance v1, Landroid/content/IntentFilter;

    invoke-direct {v1}, Landroid/content/IntentFilter;-><init>()V

    const-string v2, "android.bluetooth.device.action.BOND_STATE_CHANGED"

    invoke-virtual {v1, v2}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    const-string v2, "android.bluetooth.device.action.ACL_DISCONNECTED"

    invoke-virtual {v1, v2}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    sget-object v2, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    const/4 v2, 0x2

    invoke-virtual {p1, p0, v0, v1, v2}, Lcom/android/mltcode/paycertificationapi/I0iIi;->OXO1(Landroid/content/Context;Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;I)V

    return-void
.end method

.method public initView()V
    .locals 3

    const v0, 0x7f0a0023

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    const v1, 0x7f14138d

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/TouchSettingsActivity;->setHeader()V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/TouchSettingsActivity;->updateUI()V

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/TouchSettingsActivity;->mSettings:Lcom/szabh/smable3/entity/BleTouchSettings;

    invoke-virtual {v0}, Lcom/szabh/smable3/entity/BleTouchSettings;->getMEnabled()I

    move-result v0

    invoke-static {v0}, Lcom/android/mltcode/paycertificationapi/OiOX0i;->XIi00iiXO(I)Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object v0, Lcom/szabh/smable3/component/BleConnector;->INSTANCE:Lcom/szabh/smable3/component/BleConnector;

    invoke-virtual {v0}, Lcom/szabh/smable3/component/BaseBleConnector;->isBoundHID()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/TouchSettingsActivity;->tryConnectHID()V

    :cond_0
    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/TouchSettingsActivity;->getItemHeaderTouchRepair()Lcom/sma/smartv3/view/AbhSettingsHeader;

    move-result-object v0

    sget-object v1, Lcom/android/mltcode/paycertificationapi/i72;->OXO1:Lcom/android/mltcode/paycertificationapi/i72;

    invoke-virtual {v1}, Lcom/android/mltcode/paycertificationapi/i72;->IXI()Z

    move-result v1

    if-eqz v1, :cond_2

    sget-object v1, Lcom/android/mltcode/paycertificationapi/q62;->OXO1:Lcom/android/mltcode/paycertificationapi/q62;

    invoke-virtual {v1}, Lcom/android/mltcode/paycertificationapi/q62;->X0100I()Z

    move-result v1

    if-nez v1, :cond_1

    goto :goto_0

    :cond_1
    invoke-virtual {v0}, Lcom/sma/smartv3/view/AbhSettingsHeader;->getCheckEnabled()Landroid/widget/CheckBox;

    move-result-object v1

    const/4 v2, 0x4

    invoke-virtual {v1, v2}, Landroid/view/View;->setVisibility(I)V

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/sma/smartv3/view/AbhSettingsHeader;->setChecked(Z)V

    new-instance v1, Lcom/android/mltcode/paycertificationapi/kx5;

    invoke-direct {v1, p0}, Lcom/android/mltcode/paycertificationapi/kx5;-><init>(Lcom/sma/smartv3/ui/device/TouchSettingsActivity;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void

    :cond_2
    :goto_0
    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    return-void
.end method

.method public layoutId()I
    .locals 1

    const v0, 0x7f0d0130

    return v0
.end method

.method public onDestroy()V
    .locals 1

    invoke-super {p0}, Lcom/bestmafen/androidbase/base/BaseActivity;->onDestroy()V

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/TouchSettingsActivity;->mBluetoothReceiver:Lcom/sma/smartv3/ui/device/TouchSettingsActivity$mBluetoothReceiver$1;

    invoke-virtual {p0, v0}, Landroid/content/Context;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V

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

    new-instance v1, Lcom/android/mltcode/paycertificationapi/gj4;

    iget-object v3, p0, Lcom/sma/smartv3/ui/device/TouchSettingsActivity;->mSingleChoiceItems:Ljava/util/List;

    const/4 v5, 0x4

    const/4 v6, 0x0

    const/4 v4, 0x0

    move-object v2, p0

    invoke-direct/range {v1 .. v6}, Lcom/android/mltcode/paycertificationapi/gj4;-><init>(Landroid/app/Activity;Ljava/util/List;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v0

    const v3, 0x7f0a0588

    if-eq v0, v3, :cond_2

    const v3, 0x7f0a05c3

    if-eq v0, v3, :cond_1

    const v3, 0x7f0a05db

    if-eq v0, v3, :cond_0

    goto :goto_0

    :cond_0
    const v0, 0x7f141395

    invoke-virtual {v1, v0}, Lcom/android/mltcode/paycertificationapi/gj4;->iX(I)V

    iget-object v0, v2, Lcom/sma/smartv3/ui/device/TouchSettingsActivity;->mSettings:Lcom/szabh/smable3/entity/BleTouchSettings;

    invoke-virtual {v0}, Lcom/szabh/smable3/entity/BleTouchSettings;->getMCustomSingle()I

    move-result v0

    invoke-virtual {v1, v0}, Lcom/android/mltcode/paycertificationapi/gj4;->II1Xi0(I)V

    goto :goto_0

    :cond_1
    const v0, 0x7f141391

    invoke-virtual {v1, v0}, Lcom/android/mltcode/paycertificationapi/gj4;->iX(I)V

    iget-object v0, v2, Lcom/sma/smartv3/ui/device/TouchSettingsActivity;->mSettings:Lcom/szabh/smable3/entity/BleTouchSettings;

    invoke-virtual {v0}, Lcom/szabh/smable3/entity/BleTouchSettings;->getMCustomLong()I

    move-result v0

    invoke-virtual {v1, v0}, Lcom/android/mltcode/paycertificationapi/gj4;->II1Xi0(I)V

    goto :goto_0

    :cond_2
    const v0, 0x7f141390

    invoke-virtual {v1, v0}, Lcom/android/mltcode/paycertificationapi/gj4;->iX(I)V

    iget-object v0, v2, Lcom/sma/smartv3/ui/device/TouchSettingsActivity;->mSettings:Lcom/szabh/smable3/entity/BleTouchSettings;

    invoke-virtual {v0}, Lcom/szabh/smable3/entity/BleTouchSettings;->getMCustomDouble()I

    move-result v0

    invoke-virtual {v1, v0}, Lcom/android/mltcode/paycertificationapi/gj4;->II1Xi0(I)V

    :goto_0
    new-instance v0, Lcom/android/mltcode/paycertificationapi/xw5;

    invoke-direct {v0, p1, p0}, Lcom/android/mltcode/paycertificationapi/xw5;-><init>(Landroid/view/View;Lcom/sma/smartv3/ui/device/TouchSettingsActivity;)V

    invoke-virtual {v1, v0}, Lcom/android/mltcode/paycertificationapi/gj4;->i010I(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v1}, Lcom/android/mltcode/paycertificationapi/OIXIOIO;->IIX1OXO()V

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
