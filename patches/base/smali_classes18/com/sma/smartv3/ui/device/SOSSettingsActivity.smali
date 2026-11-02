.class public final Lcom/sma/smartv3/ui/device/SOSSettingsActivity;
.super Lcom/bestmafen/androidbase/base/BaseActivity;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nSOSSettingsActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SOSSettingsActivity.kt\ncom/sma/smartv3/ui/device/SOSSettingsActivity\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,249:1\n1#2:250\n*E\n"
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nSOSSettingsActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SOSSettingsActivity.kt\ncom/sma/smartv3/ui/device/SOSSettingsActivity\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,249:1\n1#2:250\n*E\n"
    }
.end annotation


# instance fields
.field private final etPhone$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final fallDetectionHeader$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final itemHeader$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final mBleHandleCallback:Lcom/sma/smartv3/ui/device/SOSSettingsActivity$OXO1;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private mBleSOSSettings:Lcom/szabh/smable3/entity/BleSOSSettings;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private mPermissionPopup:Lcom/android/mltcode/paycertificationapi/go0;
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation
.end field

.field private final rootView$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final tvCode$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final tvLabel$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 8

    invoke-direct {p0}, Lcom/bestmafen/androidbase/base/BaseActivity;-><init>()V

    new-instance v0, Lcom/android/mltcode/paycertificationapi/es3;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/es3;-><init>(Lcom/sma/smartv3/ui/device/SOSSettingsActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/SOSSettingsActivity;->itemHeader$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/fs3;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/fs3;-><init>(Lcom/sma/smartv3/ui/device/SOSSettingsActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/SOSSettingsActivity;->rootView$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/gs3;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/gs3;-><init>(Lcom/sma/smartv3/ui/device/SOSSettingsActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/SOSSettingsActivity;->tvLabel$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/vr3;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/vr3;-><init>(Lcom/sma/smartv3/ui/device/SOSSettingsActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/SOSSettingsActivity;->etPhone$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/wr3;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/wr3;-><init>(Lcom/sma/smartv3/ui/device/SOSSettingsActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/SOSSettingsActivity;->tvCode$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/xr3;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/xr3;-><init>(Lcom/sma/smartv3/ui/device/SOSSettingsActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/SOSSettingsActivity;->fallDetectionHeader$delegate:Lkotlin/Lazy;

    sget-object v1, Lcom/szabh/smable3/component/BleCache;->INSTANCE:Lcom/szabh/smable3/component/BleCache;

    sget-object v2, Lcom/szabh/smable3/BleKey;->SOS_SET:Lcom/szabh/smable3/BleKey;

    const/16 v6, 0xc

    const/4 v7, 0x0

    const-class v3, Lcom/szabh/smable3/entity/BleSOSSettings;

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-static/range {v1 .. v7}, Lcom/szabh/smable3/component/BaseBleCache;->getObjectNotNull$default(Lcom/szabh/smable3/component/BaseBleCache;Lcom/szabh/smable3/BleKey;Ljava/lang/Class;Ljava/lang/Object;Lcom/szabh/smable3/BleKeyFlag;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/szabh/smable3/entity/BleSOSSettings;

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/SOSSettingsActivity;->mBleSOSSettings:Lcom/szabh/smable3/entity/BleSOSSettings;

    new-instance v0, Lcom/sma/smartv3/ui/device/SOSSettingsActivity$OXO1;

    invoke-direct {v0, p0}, Lcom/sma/smartv3/ui/device/SOSSettingsActivity$OXO1;-><init>(Lcom/sma/smartv3/ui/device/SOSSettingsActivity;)V

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/SOSSettingsActivity;->mBleHandleCallback:Lcom/sma/smartv3/ui/device/SOSSettingsActivity$OXO1;

    return-void
.end method

.method public static synthetic I0iXXO(Lcom/sma/smartv3/ui/device/SOSSettingsActivity;)Landroid/view/View;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/device/SOSSettingsActivity;->rootView_delegate$lambda$0(Lcom/sma/smartv3/ui/device/SOSSettingsActivity;)Landroid/view/View;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic I1XOi1(Lcom/sma/smartv3/ui/device/SOSSettingsActivity;)Lcom/sma/smartv3/view/AbhSettingsHeader;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/device/SOSSettingsActivity;->fallDetectionHeader_delegate$lambda$0(Lcom/sma/smartv3/ui/device/SOSSettingsActivity;)Lcom/sma/smartv3/view/AbhSettingsHeader;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic IIX1OXO(Lcom/sma/smartv3/ui/device/SOSSettingsActivity;)Lcom/sma/smartv3/view/AbhSettingsHeader;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/device/SOSSettingsActivity;->itemHeader_delegate$lambda$0(Lcom/sma/smartv3/ui/device/SOSSettingsActivity;)Lcom/sma/smartv3/view/AbhSettingsHeader;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic O10IXXX0X(Lcom/sma/smartv3/ui/device/SOSSettingsActivity;Z)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Lcom/sma/smartv3/ui/device/SOSSettingsActivity;->updateUI$lambda$1$0(Lcom/sma/smartv3/ui/device/SOSSettingsActivity;Z)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic OIX0iXi(Lcom/sma/smartv3/ui/device/SOSSettingsActivity;)Landroid/widget/TextView;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/device/SOSSettingsActivity;->tvLabel_delegate$lambda$0(Lcom/sma/smartv3/ui/device/SOSSettingsActivity;)Landroid/widget/TextView;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic OiIIX101O(Lcom/sma/smartv3/ui/device/SOSSettingsActivity;)Lcom/google/android/material/textfield/TextInputEditText;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/device/SOSSettingsActivity;->etPhone_delegate$lambda$0(Lcom/sma/smartv3/ui/device/SOSSettingsActivity;)Lcom/google/android/material/textfield/TextInputEditText;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic X0O(Lcom/sma/smartv3/ui/device/SOSSettingsActivity;)Landroid/widget/TextView;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/device/SOSSettingsActivity;->tvCode_delegate$lambda$0(Lcom/sma/smartv3/ui/device/SOSSettingsActivity;)Landroid/widget/TextView;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic X1ii(Lcom/sma/smartv3/ui/device/SOSSettingsActivity;Lcom/bestmafen/androidbase/extension/PermissionStatus;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Lcom/sma/smartv3/ui/device/SOSSettingsActivity;->pickContact$lambda$0(Lcom/sma/smartv3/ui/device/SOSSettingsActivity;Lcom/bestmafen/androidbase/extension/PermissionStatus;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic XX0(Lcom/sma/smartv3/ui/device/SOSSettingsActivity;Z)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Lcom/sma/smartv3/ui/device/SOSSettingsActivity;->upFallDetection$lambda$0$0(Lcom/sma/smartv3/ui/device/SOSSettingsActivity;Z)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic XXI(Ljava/lang/String;Lcom/sma/smartv3/ui/device/SOSSettingsActivity;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/sma/smartv3/ui/device/SOSSettingsActivity;->setViewPhone$lambda$0(Ljava/lang/String;Lcom/sma/smartv3/ui/device/SOSSettingsActivity;)V

    return-void
.end method

.method public static synthetic XiOIO()Z
    .locals 1

    invoke-static {}, Lcom/sma/smartv3/ui/device/SOSSettingsActivity;->noPermissionRemind$lambda$0$0()Z

    move-result v0

    return v0
.end method

.method public static synthetic XiOIii1(Lcom/sma/smartv3/ui/device/SOSSettingsActivity;Ljava/lang/String;Lcom/szabh/smable3/component/BleConnector;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/sma/smartv3/ui/device/SOSSettingsActivity;->onSaveClick$lambda$0(Lcom/sma/smartv3/ui/device/SOSSettingsActivity;Ljava/lang/String;Lcom/szabh/smable3/component/BleConnector;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$setMBleSOSSettings$p(Lcom/sma/smartv3/ui/device/SOSSettingsActivity;Lcom/szabh/smable3/entity/BleSOSSettings;)V
    .locals 0

    iput-object p1, p0, Lcom/sma/smartv3/ui/device/SOSSettingsActivity;->mBleSOSSettings:Lcom/szabh/smable3/entity/BleSOSSettings;

    return-void
.end method

.method public static final synthetic access$upFallDetection(Lcom/sma/smartv3/ui/device/SOSSettingsActivity;)V
    .locals 0

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/SOSSettingsActivity;->upFallDetection()V

    return-void
.end method

.method public static final synthetic access$updateUI(Lcom/sma/smartv3/ui/device/SOSSettingsActivity;)V
    .locals 0

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/SOSSettingsActivity;->updateUI()V

    return-void
.end method

.method private static final etPhone_delegate$lambda$0(Lcom/sma/smartv3/ui/device/SOSSettingsActivity;)Lcom/google/android/material/textfield/TextInputEditText;
    .locals 1

    const v0, 0x7f0a037a

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Lcom/google/android/material/textfield/TextInputEditText;

    return-object p0
.end method

.method private static final fallDetectionHeader_delegate$lambda$0(Lcom/sma/smartv3/ui/device/SOSSettingsActivity;)Lcom/sma/smartv3/view/AbhSettingsHeader;
    .locals 1

    const v0, 0x7f0a03c4

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Lcom/sma/smartv3/view/AbhSettingsHeader;

    return-object p0
.end method

.method private final getEtPhone()Lcom/google/android/material/textfield/TextInputEditText;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/SOSSettingsActivity;->etPhone$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/material/textfield/TextInputEditText;

    return-object v0
.end method

.method private final getFallDetectionHeader()Lcom/sma/smartv3/view/AbhSettingsHeader;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/SOSSettingsActivity;->fallDetectionHeader$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/sma/smartv3/view/AbhSettingsHeader;

    return-object v0
.end method

.method private final getItemHeader()Lcom/sma/smartv3/view/AbhSettingsHeader;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/SOSSettingsActivity;->itemHeader$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/sma/smartv3/view/AbhSettingsHeader;

    return-object v0
.end method

.method private final getRootView()Landroid/view/View;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/SOSSettingsActivity;->rootView$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    return-object v0
.end method

.method private final getTvCode()Landroid/widget/TextView;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/SOSSettingsActivity;->tvCode$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    return-object v0
.end method

.method private final getTvLabel()Landroid/widget/TextView;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/SOSSettingsActivity;->tvLabel$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    return-object v0
.end method

.method public static synthetic iIiiO(Lcom/sma/smartv3/ui/device/SOSSettingsActivity;Lme/zheteng/countrycodeselector/CountryCodeSelectorFragment;Lme/zheteng/countrycodeselector/Country;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/sma/smartv3/ui/device/SOSSettingsActivity;->onCountryCode$lambda$0$0(Lcom/sma/smartv3/ui/device/SOSSettingsActivity;Lme/zheteng/countrycodeselector/CountryCodeSelectorFragment;Lme/zheteng/countrycodeselector/Country;)V

    return-void
.end method

.method private static final itemHeader_delegate$lambda$0(Lcom/sma/smartv3/ui/device/SOSSettingsActivity;)Lcom/sma/smartv3/view/AbhSettingsHeader;
    .locals 1

    const v0, 0x7f0a0594

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Lcom/sma/smartv3/view/AbhSettingsHeader;

    return-object p0
.end method

.method private final noPermissionRemind()V
    .locals 4

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/SOSSettingsActivity;->mPermissionPopup:Lcom/android/mltcode/paycertificationapi/go0;

    if-nez v0, :cond_0

    new-instance v0, Lcom/android/mltcode/paycertificationapi/go0;

    const/4 v1, 0x0

    const/4 v2, 0x2

    const/4 v3, 0x0

    invoke-direct {v0, p0, v1, v2, v3}, Lcom/android/mltcode/paycertificationapi/go0;-><init>(Landroid/app/Activity;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const v1, 0x7f1410be

    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/go0;->O1O(I)V

    const v1, 0x7f14027f

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-static {v0, v1, v3, v2, v3}, Lcom/android/mltcode/paycertificationapi/go0;->X11iII1O1(Lcom/android/mltcode/paycertificationapi/go0;Ljava/lang/Integer;Lkotlin/jvm/functions/Function0;ILjava/lang/Object;)V

    new-instance v1, Lcom/android/mltcode/paycertificationapi/yr3;

    invoke-direct {v1}, Lcom/android/mltcode/paycertificationapi/yr3;-><init>()V

    const v2, 0x7f14122c

    invoke-virtual {v0, v2, v1}, Lcom/android/mltcode/paycertificationapi/go0;->X1IX(ILkotlin/jvm/functions/Function0;)V

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/SOSSettingsActivity;->mPermissionPopup:Lcom/android/mltcode/paycertificationapi/go0;

    :cond_0
    iget-object v0, p0, Lcom/sma/smartv3/ui/device/SOSSettingsActivity;->mPermissionPopup:Lcom/android/mltcode/paycertificationapi/go0;

    if-eqz v0, :cond_1

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/SOSSettingsActivity;->getRootView()Landroid/view/View;

    move-result-object v1

    const-string v2, "<get-rootView>(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/I0OIO1i;->I1XOi1(Landroid/view/View;)V

    :cond_1
    return-void
.end method

.method private static final noPermissionRemind$lambda$0$0()Z
    .locals 1

    invoke-static {}, Lcom/blankj/utilcode/util/PermissionUtils;->launchAppDetailsSettings()V

    const/4 v0, 0x1

    return v0
.end method

.method private static final onCountryCode$lambda$0$0(Lcom/sma/smartv3/ui/device/SOSSettingsActivity;Lme/zheteng/countrycodeselector/CountryCodeSelectorFragment;Lme/zheteng/countrycodeselector/Country;)V
    .locals 2

    invoke-virtual {p2}, Lme/zheteng/countrycodeselector/Country;->iO()Ljava/lang/String;

    move-result-object v0

    const-string v1, "getCode(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v0

    if-lez v0, :cond_0

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/SOSSettingsActivity;->getTvCode()Landroid/widget/TextView;

    move-result-object p0

    invoke-virtual {p2}, Lme/zheteng/countrycodeselector/Country;->iO()Ljava/lang/String;

    move-result-object p2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "+"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p0, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_0

    :cond_0
    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/SOSSettingsActivity;->getTvCode()Landroid/widget/TextView;

    move-result-object p0

    const-string p2, ""

    invoke-virtual {p0, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :goto_0
    invoke-virtual {p1}, Landroidx/fragment/app/DialogFragment;->dismiss()V

    return-void
.end method

.method private static final onSaveClick$lambda$0(Lcom/sma/smartv3/ui/device/SOSSettingsActivity;Ljava/lang/String;Lcom/szabh/smable3/component/BleConnector;)Lkotlin/Unit;
    .locals 11

    const-string v0, "it"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v2, Lcom/szabh/smable3/BleKey;->SOS_SET:Lcom/szabh/smable3/BleKey;

    sget-object v3, Lcom/szabh/smable3/BleKeyFlag;->UPDATE:Lcom/szabh/smable3/BleKeyFlag;

    new-instance v4, Lcom/szabh/smable3/entity/BleSOSSettings;

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/SOSSettingsActivity;->getItemHeader()Lcom/sma/smartv3/view/AbhSettingsHeader;

    move-result-object v0

    invoke-virtual {v0}, Lcom/sma/smartv3/view/AbhSettingsHeader;->iO()Z

    move-result v0

    invoke-static {v0}, Lcom/android/mltcode/paycertificationapi/OiOX0i;->iO(Z)I

    move-result v0

    invoke-direct {v4, v0, p1}, Lcom/szabh/smable3/entity/BleSOSSettings;-><init>(ILjava/lang/String;)V

    const/16 v7, 0x18

    const/4 v8, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    move-object v1, p2

    invoke-static/range {v1 .. v8}, Lcom/szabh/smable3/component/BaseBleConnector;->sendObject$default(Lcom/szabh/smable3/component/BaseBleConnector;Lcom/szabh/smable3/BleKey;Lcom/szabh/smable3/BleKeyFlag;Lcom/bestmafen/baseble/data/BleBuffer;ZZILjava/lang/Object;)Z

    sget-object p1, Lcom/android/mltcode/paycertificationapi/q62;->OXO1:Lcom/android/mltcode/paycertificationapi/q62;

    invoke-virtual {p1}, Lcom/android/mltcode/paycertificationapi/q62;->Oi0X1iiii()Z

    move-result p1

    if-eqz p1, :cond_0

    sget-object v4, Lcom/szabh/smable3/BleKey;->FALL_SET:Lcom/szabh/smable3/BleKey;

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/SOSSettingsActivity;->getFallDetectionHeader()Lcom/sma/smartv3/view/AbhSettingsHeader;

    move-result-object p0

    invoke-virtual {p0}, Lcom/sma/smartv3/view/AbhSettingsHeader;->iO()Z

    move-result p0

    invoke-static {p0}, Lcom/android/mltcode/paycertificationapi/OiOX0i;->iO(Z)I

    move-result v6

    const/16 v9, 0x18

    const/4 v10, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    move-object v5, v3

    move-object v3, v1

    invoke-static/range {v3 .. v10}, Lcom/szabh/smable3/component/BaseBleConnector;->sendInt8$default(Lcom/szabh/smable3/component/BaseBleConnector;Lcom/szabh/smable3/BleKey;Lcom/szabh/smable3/BleKeyFlag;IZZILjava/lang/Object;)Z

    :cond_0
    sget-object p0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p0
.end method

.method private static final pickContact$lambda$0(Lcom/sma/smartv3/ui/device/SOSSettingsActivity;Lcom/bestmafen/androidbase/extension/PermissionStatus;)Lkotlin/Unit;
    .locals 3

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/bestmafen/androidbase/extension/PermissionStatus;->GRANTED:Lcom/bestmafen/androidbase/extension/PermissionStatus;

    if-ne p1, v0, :cond_0

    new-instance p1, Lcom/sma/smartv3/ui/contactpicker/ContactPicker$Builder;

    invoke-direct {p1, p0}, Lcom/sma/smartv3/ui/contactpicker/ContactPicker$Builder;-><init>(Landroid/app/Activity;)V

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Lcom/sma/smartv3/ui/contactpicker/ContactPicker$Builder;->hideScrollbar(Z)Lcom/sma/smartv3/ui/contactpicker/ContactPicker$Builder;

    move-result-object p1

    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Lcom/sma/smartv3/ui/contactpicker/ContactPicker$Builder;->setMaxSelectCount(I)Lcom/sma/smartv3/ui/contactpicker/ContactPicker$Builder;

    move-result-object p1

    invoke-virtual {p1, v0}, Lcom/sma/smartv3/ui/contactpicker/ContactPicker$Builder;->showTrack(Z)Lcom/sma/smartv3/ui/contactpicker/ContactPicker$Builder;

    move-result-object p1

    const/4 v1, -0x1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {p1, v2}, Lcom/sma/smartv3/ui/contactpicker/ContactPicker$Builder;->searchIconColor(Ljava/lang/Integer;)Lcom/sma/smartv3/ui/contactpicker/ContactPicker$Builder;

    move-result-object p1

    invoke-virtual {p1, v0}, Lcom/sma/smartv3/ui/contactpicker/ContactPicker$Builder;->setChoiceMode(I)Lcom/sma/smartv3/ui/contactpicker/ContactPicker$Builder;

    move-result-object p1

    invoke-virtual {p1, v1}, Lcom/sma/smartv3/ui/contactpicker/ContactPicker$Builder;->bubbleTextColor(I)Lcom/sma/smartv3/ui/contactpicker/ContactPicker$Builder;

    move-result-object p1

    const v1, 0x7f1410d8

    invoke-virtual {p0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p1, p0}, Lcom/sma/smartv3/ui/contactpicker/ContactPicker$Builder;->setTitleText(Ljava/lang/String;)Lcom/sma/smartv3/ui/contactpicker/ContactPicker$Builder;

    move-result-object p0

    invoke-virtual {p0, v0}, Lcom/sma/smartv3/ui/contactpicker/ContactPicker$Builder;->setLoadingType(I)Lcom/sma/smartv3/ui/contactpicker/ContactPicker$Builder;

    move-result-object p0

    sget-object p1, Lcom/sma/smartv3/ui/contactpicker/LimitColumn;->PHONE:Lcom/sma/smartv3/ui/contactpicker/LimitColumn;

    invoke-virtual {p0, p1}, Lcom/sma/smartv3/ui/contactpicker/ContactPicker$Builder;->limitToColumn(Lcom/sma/smartv3/ui/contactpicker/LimitColumn;)Lcom/sma/smartv3/ui/contactpicker/ContactPicker$Builder;

    move-result-object p0

    const/16 p1, 0x3df

    invoke-virtual {p0, p1}, Lcom/sma/smartv3/ui/contactpicker/ContactPicker$Builder;->showPickerForResult(I)V

    goto :goto_0

    :cond_0
    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/SOSSettingsActivity;->noPermissionRemind()V

    :goto_0
    sget-object p0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p0
.end method

.method private static final rootView_delegate$lambda$0(Lcom/sma/smartv3/ui/device/SOSSettingsActivity;)Landroid/view/View;
    .locals 1

    const v0, 0x7f0a09af

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    return-object p0
.end method

.method private static final setViewPhone$lambda$0(Ljava/lang/String;Lcom/sma/smartv3/ui/device/SOSSettingsActivity;)V
    .locals 10

    const-string v0, "-"

    const/4 v1, 0x0

    const/4 v2, 0x2

    const/4 v3, 0x0

    invoke-static {p0, v0, v1, v2, v3}, Lkotlin/text/StringsKt__StringsKt;->iIi011O(Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZILjava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_3

    if-eqz p0, :cond_0

    filled-new-array {v0}, [Ljava/lang/String;

    move-result-object v5

    const/4 v8, 0x6

    const/4 v9, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    move-object v4, p0

    invoke-static/range {v4 .. v9}, Lkotlin/text/StringsKt__StringsKt;->i1I(Ljava/lang/CharSequence;[Ljava/lang/String;ZIILjava/lang/Object;)Ljava/util/List;

    move-result-object p0

    goto :goto_0

    :cond_0
    move-object p0, v3

    :goto_0
    invoke-direct {p1}, Lcom/sma/smartv3/ui/device/SOSSettingsActivity;->getTvCode()Landroid/widget/TextView;

    move-result-object v0

    if-eqz p0, :cond_1

    invoke-interface {p0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    goto :goto_1

    :cond_1
    move-object v1, v3

    :goto_1
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    invoke-direct {p1}, Lcom/sma/smartv3/ui/device/SOSSettingsActivity;->getEtPhone()Lcom/google/android/material/textfield/TextInputEditText;

    move-result-object p1

    if-eqz p0, :cond_2

    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    invoke-interface {p0, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p0

    move-object v3, p0

    check-cast v3, Ljava/lang/String;

    :cond_2
    invoke-virtual {p1, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void

    :cond_3
    move-object v4, p0

    invoke-direct {p1}, Lcom/sma/smartv3/ui/device/SOSSettingsActivity;->getEtPhone()Lcom/google/android/material/textfield/TextInputEditText;

    move-result-object p0

    invoke-virtual {p0, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method

.method private static final tvCode_delegate$lambda$0(Lcom/sma/smartv3/ui/device/SOSSettingsActivity;)Landroid/widget/TextView;
    .locals 1

    const v0, 0x7f0a0c53

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/TextView;

    return-object p0
.end method

.method private static final tvLabel_delegate$lambda$0(Lcom/sma/smartv3/ui/device/SOSSettingsActivity;)Landroid/widget/TextView;
    .locals 1

    const v0, 0x7f0a0ca0

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/TextView;

    return-object p0
.end method

.method private final upFallDetection()V
    .locals 8

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/SOSSettingsActivity;->getFallDetectionHeader()Lcom/sma/smartv3/view/AbhSettingsHeader;

    move-result-object v0

    sget-object v1, Lcom/android/mltcode/paycertificationapi/q62;->OXO1:Lcom/android/mltcode/paycertificationapi/q62;

    invoke-virtual {v1}, Lcom/android/mltcode/paycertificationapi/q62;->Oi0X1iiii()Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, 0x0

    goto :goto_0

    :cond_0
    const/16 v1, 0x8

    :goto_0
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/sma/smartv3/view/AbhSettingsHeader;->setMListener(Lkotlin/jvm/functions/Function1;)V

    sget-object v2, Lcom/szabh/smable3/component/BleCache;->INSTANCE:Lcom/szabh/smable3/component/BleCache;

    sget-object v3, Lcom/szabh/smable3/BleKey;->FALL_SET:Lcom/szabh/smable3/BleKey;

    const/4 v6, 0x6

    const/4 v7, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-static/range {v2 .. v7}, Lcom/szabh/smable3/component/BaseBleCache;->getInt$default(Lcom/szabh/smable3/component/BaseBleCache;Lcom/szabh/smable3/BleKey;ILcom/szabh/smable3/BleKeyFlag;ILjava/lang/Object;)I

    move-result v1

    invoke-static {v1}, Lcom/android/mltcode/paycertificationapi/OiOX0i;->XIi00iiXO(I)Z

    move-result v1

    invoke-virtual {v0, v1}, Lcom/sma/smartv3/view/AbhSettingsHeader;->setChecked(Z)V

    new-instance v1, Lcom/android/mltcode/paycertificationapi/as3;

    invoke-direct {v1, p0}, Lcom/android/mltcode/paycertificationapi/as3;-><init>(Lcom/sma/smartv3/ui/device/SOSSettingsActivity;)V

    invoke-virtual {v0, v1}, Lcom/sma/smartv3/view/AbhSettingsHeader;->setMListener(Lkotlin/jvm/functions/Function1;)V

    return-void
.end method

.method private static final upFallDetection$lambda$0$0(Lcom/sma/smartv3/ui/device/SOSSettingsActivity;Z)Lkotlin/Unit;
    .locals 0

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/SOSSettingsActivity;->getFallDetectionHeader()Lcom/sma/smartv3/view/AbhSettingsHeader;

    move-result-object p0

    invoke-virtual {p0, p1}, Lcom/sma/smartv3/view/AbhSettingsHeader;->setChecked(Z)V

    sget-object p0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p0
.end method

.method private final updateUI()V
    .locals 3

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/SOSSettingsActivity;->getTvLabel()Landroid/widget/TextView;

    move-result-object v0

    iget-object v1, p0, Lcom/sma/smartv3/ui/device/SOSSettingsActivity;->mBleSOSSettings:Lcom/szabh/smable3/entity/BleSOSSettings;

    invoke-virtual {v1}, Lcom/szabh/smable3/entity/BleSOSSettings;->getMEnabled()I

    move-result v1

    invoke-static {v1}, Lcom/android/mltcode/paycertificationapi/OiOX0i;->XIi00iiXO(I)Z

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setEnabled(Z)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/SOSSettingsActivity;->getItemHeader()Lcom/sma/smartv3/view/AbhSettingsHeader;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/sma/smartv3/view/AbhSettingsHeader;->setMListener(Lkotlin/jvm/functions/Function1;)V

    iget-object v1, p0, Lcom/sma/smartv3/ui/device/SOSSettingsActivity;->mBleSOSSettings:Lcom/szabh/smable3/entity/BleSOSSettings;

    invoke-virtual {v1}, Lcom/szabh/smable3/entity/BleSOSSettings;->getMEnabled()I

    move-result v1

    invoke-static {v1}, Lcom/android/mltcode/paycertificationapi/OiOX0i;->XIi00iiXO(I)Z

    move-result v1

    invoke-virtual {v0, v1}, Lcom/sma/smartv3/view/AbhSettingsHeader;->setChecked(Z)V

    new-instance v1, Lcom/android/mltcode/paycertificationapi/ur3;

    invoke-direct {v1, p0}, Lcom/android/mltcode/paycertificationapi/ur3;-><init>(Lcom/sma/smartv3/ui/device/SOSSettingsActivity;)V

    invoke-virtual {v0, v1}, Lcom/sma/smartv3/view/AbhSettingsHeader;->setMListener(Lkotlin/jvm/functions/Function1;)V

    sget-object v1, Lcom/android/mltcode/paycertificationapi/q62;->OXO1:Lcom/android/mltcode/paycertificationapi/q62;

    invoke-virtual {v1}, Lcom/android/mltcode/paycertificationapi/q62;->Oi0X1iiii()Z

    move-result v1

    const-string v2, "getString(...)"

    if-eqz v1, :cond_0

    const v1, 0x7f14127a

    :goto_0
    invoke-virtual {p0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    goto :goto_1

    :cond_0
    const v1, 0x7f141279

    goto :goto_0

    :goto_1
    invoke-virtual {v0, v1}, Lcom/sma/smartv3/view/AbhSettingsHeader;->setMDescription(Ljava/lang/String;)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/SOSSettingsActivity;->upFallDetection()V

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/SOSSettingsActivity;->mBleSOSSettings:Lcom/szabh/smable3/entity/BleSOSSettings;

    invoke-virtual {v0}, Lcom/szabh/smable3/entity/BleSOSSettings;->getMPhone()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/sma/smartv3/ui/device/SOSSettingsActivity;->setViewPhone(Ljava/lang/String;)V

    return-void
.end method

.method private static final updateUI$lambda$1$0(Lcom/sma/smartv3/ui/device/SOSSettingsActivity;Z)Lkotlin/Unit;
    .locals 1

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/SOSSettingsActivity;->getItemHeader()Lcom/sma/smartv3/view/AbhSettingsHeader;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/sma/smartv3/view/AbhSettingsHeader;->setChecked(Z)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/SOSSettingsActivity;->getTvLabel()Landroid/widget/TextView;

    move-result-object p0

    invoke-virtual {p0, p1}, Landroid/widget/TextView;->setEnabled(Z)V

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

    iget-object p1, p0, Lcom/sma/smartv3/ui/device/SOSSettingsActivity;->mBleHandleCallback:Lcom/sma/smartv3/ui/device/SOSSettingsActivity$OXO1;

    invoke-virtual {v0, p1}, Lcom/szabh/smable3/component/BleConnector;->addHandleCallback(Lcom/szabh/smable3/component/BleHandleCallback;)V

    sget-object p1, Lcom/android/mltcode/paycertificationapi/q62;->OXO1:Lcom/android/mltcode/paycertificationapi/q62;

    invoke-virtual {p1}, Lcom/android/mltcode/paycertificationapi/q62;->Oi0X1iiii()Z

    move-result p1

    if-eqz p1, :cond_0

    sget-object v1, Lcom/szabh/smable3/BleKey;->FALL_SET:Lcom/szabh/smable3/BleKey;

    sget-object v2, Lcom/szabh/smable3/BleKeyFlag;->READ:Lcom/szabh/smable3/BleKeyFlag;

    const/16 v6, 0x18

    const/4 v7, 0x0

    const/16 v3, 0xff

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-static/range {v0 .. v7}, Lcom/szabh/smable3/component/BaseBleConnector;->sendInt8$default(Lcom/szabh/smable3/component/BaseBleConnector;Lcom/szabh/smable3/BleKey;Lcom/szabh/smable3/BleKeyFlag;IZZILjava/lang/Object;)Z

    :cond_0
    return-void
.end method

.method public initView()V
    .locals 2

    const v0, 0x7f0a0023

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    const v1, 0x7f141278

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/SOSSettingsActivity;->updateUI()V

    return-void
.end method

.method public layoutId()I
    .locals 1

    const v0, 0x7f0d010a

    return v0
.end method

.method public final obtainResult(Landroid/content/Intent;)Ljava/util/ArrayList;
    .locals 1
    .param p1    # Landroid/content/Intent;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Intent;",
            ")",
            "Ljava/util/ArrayList<",
            "Lcom/sma/smartv3/ui/contactpicker/ContactResult;",
            ">;"
        }
    .end annotation

    const-string v0, "data"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "extra_result_selection"

    invoke-virtual {p1, v0}, Landroid/content/Intent;->getParcelableArrayListExtra(Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object p1

    return-object p1
.end method

.method public onActivityResult(IILandroid/content/Intent;)V
    .locals 1
    .param p3    # Landroid/content/Intent;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param

    invoke-super {p0, p1, p2, p3}, Landroidx/fragment/app/FragmentActivity;->onActivityResult(IILandroid/content/Intent;)V

    const/4 v0, -0x1

    if-ne p2, v0, :cond_1

    const/16 p2, 0x3df

    if-ne p1, p2, :cond_1

    if-eqz p3, :cond_1

    invoke-virtual {p0, p3}, Lcom/sma/smartv3/ui/device/SOSSettingsActivity;->obtainResult(Landroid/content/Intent;)Ljava/util/ArrayList;

    move-result-object p1

    const/4 p2, 0x0

    if-eqz p1, :cond_0

    invoke-virtual {p1, p2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/sma/smartv3/ui/contactpicker/ContactResult;

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    invoke-virtual {p1}, Lcom/sma/smartv3/ui/contactpicker/ContactResult;->getPhoneNumbers()Ljava/util/List;

    move-result-object p1

    invoke-interface {p1, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/sma/smartv3/ui/contactpicker/PhoneNumber;

    invoke-virtual {p1}, Lcom/sma/smartv3/ui/contactpicker/PhoneNumber;->getNumber()Ljava/lang/String;

    move-result-object p1

    const-string p2, "getNumber(...)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1}, Lcom/sma/smartv3/ui/device/SOSSettingsActivity;->setViewPhone(Ljava/lang/String;)V

    :cond_1
    return-void
.end method

.method public final onCountryCode(Landroid/view/View;)V
    .locals 2
    .param p1    # Landroid/view/View;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "view"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p1, Landroid/content/Intent;

    invoke-direct {p1}, Landroid/content/Intent;-><init>()V

    const-string v0, "me.zheteng.countrycodeselector.extra.Type"

    const/4 v1, 0x1

    invoke-virtual {p1, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseActivity;->getMContext()Landroid/app/Activity;

    move-result-object v0

    const v1, 0x7f0600c2

    invoke-static {v0, v1}, Landroidx/core/content/ContextCompat;->getColor(Landroid/content/Context;I)I

    move-result v0

    const-string v1, "me.zheteng.countrycodeselector.extra.ThemeColor"

    invoke-virtual {p1, v1, v0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    invoke-static {p1}, Lme/zheteng/countrycodeselector/CountryCodeSelectorFragment;->newInstance(Landroid/content/Intent;)Lme/zheteng/countrycodeselector/CountryCodeSelectorFragment;

    move-result-object p1

    invoke-virtual {p0}, Landroidx/fragment/app/FragmentActivity;->getSupportFragmentManager()Landroidx/fragment/app/FragmentManager;

    move-result-object v0

    const-string v1, "CountryCodeSelector"

    invoke-virtual {p1, v0, v1}, Landroidx/fragment/app/DialogFragment;->show(Landroidx/fragment/app/FragmentManager;Ljava/lang/String;)V

    new-instance v0, Lcom/android/mltcode/paycertificationapi/ds3;

    invoke-direct {v0, p0, p1}, Lcom/android/mltcode/paycertificationapi/ds3;-><init>(Lcom/sma/smartv3/ui/device/SOSSettingsActivity;Lme/zheteng/countrycodeselector/CountryCodeSelectorFragment;)V

    invoke-virtual {p1, v0}, Lme/zheteng/countrycodeselector/CountryCodeSelectorFragment;->setOnCountrySelectListener(Lme/zheteng/countrycodeselector/CountryCodeSelectorFragment$OXO1;)V

    return-void
.end method

.method public onDestroy()V
    .locals 2

    sget-object v0, Lcom/szabh/smable3/component/BleConnector;->INSTANCE:Lcom/szabh/smable3/component/BleConnector;

    iget-object v1, p0, Lcom/sma/smartv3/ui/device/SOSSettingsActivity;->mBleHandleCallback:Lcom/sma/smartv3/ui/device/SOSSettingsActivity$OXO1;

    invoke-virtual {v0, v1}, Lcom/szabh/smable3/component/BleConnector;->removeHandleCallback(Lcom/szabh/smable3/component/BleHandleCallback;)V

    invoke-super {p0}, Lcom/bestmafen/androidbase/base/BaseActivity;->onDestroy()V

    return-void
.end method

.method public final onSaveClick(Landroid/view/View;)V
    .locals 3
    .param p1    # Landroid/view/View;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "view"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/SOSSettingsActivity;->getEtPhone()Lcom/google/android/material/textfield/TextInputEditText;

    move-result-object p1

    invoke-virtual {p1}, Landroidx/appcompat/widget/AppCompatEditText;->getText()Landroid/text/Editable;

    move-result-object p1

    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result v0

    if-nez v0, :cond_0

    const p1, 0x7f140d20

    invoke-static {p1}, Lcom/blankj/utilcode/util/ToastUtils;->showShort(I)V

    return-void

    :cond_0
    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/SOSSettingsActivity;->getTvCode()Landroid/widget/TextView;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v0

    if-nez v0, :cond_1

    goto :goto_0

    :cond_1
    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/SOSSettingsActivity;->getTvCode()Landroid/widget/TextView;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, "-"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    :goto_0
    sget-object v0, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    const-string v1, "UTF_8"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1, v0}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object v0

    const-string v1, "getBytes(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    array-length v0, v0

    const/16 v1, 0x12

    const/4 v2, 0x0

    if-le v0, v1, :cond_2

    const p1, 0x7f1410ce

    invoke-virtual {p0, p1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p1

    const v0, 0x7f14035c

    invoke-virtual {p0, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-array v0, v2, [Ljava/lang/Object;

    invoke-static {p1, v0}, Lcom/blankj/utilcode/util/ToastUtils;->showShort(Ljava/lang/String;[Ljava/lang/Object;)V

    return-void

    :cond_2
    new-instance v0, Lcom/android/mltcode/paycertificationapi/bs3;

    invoke-direct {v0, p0, p1}, Lcom/android/mltcode/paycertificationapi/bs3;-><init>(Lcom/sma/smartv3/ui/device/SOSSettingsActivity;Ljava/lang/String;)V

    const/4 p1, 0x1

    const/4 v1, 0x0

    invoke-static {v2, v0, p1, v1}, Lcom/android/mltcode/paycertificationapi/X0IOiX1O;->XIi00iiXO(ZLkotlin/jvm/functions/Function1;ILjava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_3

    const p1, 0x7f1412e1

    invoke-static {p1}, Lcom/blankj/utilcode/util/ToastUtils;->showLong(I)V

    const-string p1, "sos_screen"

    const/4 v0, 0x2

    invoke-static {p1, v1, v0, v1}, Lcom/android/mltcode/paycertificationapi/I01XX0;->XIi00iiXO(Ljava/lang/String;Ljava/lang/Object;ILjava/lang/Object;)V

    :cond_3
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

.method public final pickContact(Landroid/view/View;)V
    .locals 6
    .param p1    # Landroid/view/View;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "view"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "CONTACTS"

    filled-new-array {p1}, [Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lcom/blankj/utilcode/util/PermissionUtils;->permission([Ljava/lang/String;)Lcom/blankj/utilcode/util/PermissionUtils;

    move-result-object v0

    const-string p1, "permission(...)"

    invoke-static {v0, p1}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v3, Lcom/android/mltcode/paycertificationapi/cs3;

    invoke-direct {v3, p0}, Lcom/android/mltcode/paycertificationapi/cs3;-><init>(Lcom/sma/smartv3/ui/device/SOSSettingsActivity;)V

    const/4 v4, 0x3

    const/4 v5, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-static/range {v0 .. v5}, Lcom/android/mltcode/paycertificationapi/ds1;->iO(Lcom/blankj/utilcode/util/PermissionUtils;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)V

    return-void
.end method

.method public final setViewPhone(Ljava/lang/String;)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "phone"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/android/mltcode/paycertificationapi/zr3;

    invoke-direct {v0, p1, p0}, Lcom/android/mltcode/paycertificationapi/zr3;-><init>(Ljava/lang/String;Lcom/sma/smartv3/ui/device/SOSSettingsActivity;)V

    invoke-virtual {p0, v0}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    return-void
.end method
