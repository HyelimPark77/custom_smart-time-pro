.class public final Lcom/sma/smartv3/ui/device/WatchPasswordActivity;
.super Lcom/bestmafen/androidbase/base/BaseActivity;
.source "SourceFile"


# instance fields
.field private final itemHeader$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final mBleHandleCallback:Lcom/sma/smartv3/ui/device/WatchPasswordActivity$OXO1;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private mPasswordPopup:Lcom/android/mltcode/paycertificationapi/dn1;
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation
.end field

.field private mWatchPassword:Lcom/szabh/smable3/entity/BleSettingWatchPassword;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final rootView$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 8

    invoke-direct {p0}, Lcom/bestmafen/androidbase/base/BaseActivity;-><init>()V

    new-instance v0, Lcom/android/mltcode/paycertificationapi/cq6;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/cq6;-><init>(Lcom/sma/smartv3/ui/device/WatchPasswordActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/WatchPasswordActivity;->rootView$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/dq6;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/dq6;-><init>(Lcom/sma/smartv3/ui/device/WatchPasswordActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/WatchPasswordActivity;->itemHeader$delegate:Lkotlin/Lazy;

    sget-object v1, Lcom/szabh/smable3/component/BleCache;->INSTANCE:Lcom/szabh/smable3/component/BleCache;

    sget-object v2, Lcom/szabh/smable3/BleKey;->SET_WATCH_PASSWORD:Lcom/szabh/smable3/BleKey;

    const/16 v6, 0xc

    const/4 v7, 0x0

    const-class v3, Lcom/szabh/smable3/entity/BleSettingWatchPassword;

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-static/range {v1 .. v7}, Lcom/szabh/smable3/component/BaseBleCache;->getObjectNotNull$default(Lcom/szabh/smable3/component/BaseBleCache;Lcom/szabh/smable3/BleKey;Ljava/lang/Class;Ljava/lang/Object;Lcom/szabh/smable3/BleKeyFlag;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/szabh/smable3/entity/BleSettingWatchPassword;

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/WatchPasswordActivity;->mWatchPassword:Lcom/szabh/smable3/entity/BleSettingWatchPassword;

    new-instance v0, Lcom/sma/smartv3/ui/device/WatchPasswordActivity$OXO1;

    invoke-direct {v0, p0}, Lcom/sma/smartv3/ui/device/WatchPasswordActivity$OXO1;-><init>(Lcom/sma/smartv3/ui/device/WatchPasswordActivity;)V

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/WatchPasswordActivity;->mBleHandleCallback:Lcom/sma/smartv3/ui/device/WatchPasswordActivity$OXO1;

    return-void
.end method

.method public static synthetic I0iXXO(Lcom/sma/smartv3/ui/device/WatchPasswordActivity;)Lcom/sma/smartv3/view/AbhSettingsHeader;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/device/WatchPasswordActivity;->itemHeader_delegate$lambda$0(Lcom/sma/smartv3/ui/device/WatchPasswordActivity;)Lcom/sma/smartv3/view/AbhSettingsHeader;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic O10IXXX0X(Lcom/sma/smartv3/ui/device/WatchPasswordActivity;Z)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Lcom/sma/smartv3/ui/device/WatchPasswordActivity;->updateUI$lambda$0$0(Lcom/sma/smartv3/ui/device/WatchPasswordActivity;Z)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic OIX0iXi(Lcom/sma/smartv3/ui/device/WatchPasswordActivity;)Landroid/view/View;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/device/WatchPasswordActivity;->rootView_delegate$lambda$0(Lcom/sma/smartv3/ui/device/WatchPasswordActivity;)Landroid/view/View;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic X0O(Lcom/sma/smartv3/ui/device/WatchPasswordActivity;Ljava/lang/String;)Z
    .locals 0

    invoke-static {p0, p1}, Lcom/sma/smartv3/ui/device/WatchPasswordActivity;->onResetPassword$lambda$0$0(Lcom/sma/smartv3/ui/device/WatchPasswordActivity;Ljava/lang/String;)Z

    move-result p0

    return p0
.end method

.method public static synthetic X1ii(Lcom/sma/smartv3/ui/device/WatchPasswordActivity;ZLcom/szabh/smable3/component/BleConnector;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/sma/smartv3/ui/device/WatchPasswordActivity;->updateUI$lambda$0$0$0(Lcom/sma/smartv3/ui/device/WatchPasswordActivity;ZLcom/szabh/smable3/component/BleConnector;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic XXI(Lcom/sma/smartv3/ui/device/WatchPasswordActivity;Ljava/lang/String;Lcom/szabh/smable3/component/BleConnector;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/sma/smartv3/ui/device/WatchPasswordActivity;->onResetPassword$lambda$0$0$0(Lcom/sma/smartv3/ui/device/WatchPasswordActivity;Ljava/lang/String;Lcom/szabh/smable3/component/BleConnector;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$setMWatchPassword$p(Lcom/sma/smartv3/ui/device/WatchPasswordActivity;Lcom/szabh/smable3/entity/BleSettingWatchPassword;)V
    .locals 0

    iput-object p1, p0, Lcom/sma/smartv3/ui/device/WatchPasswordActivity;->mWatchPassword:Lcom/szabh/smable3/entity/BleSettingWatchPassword;

    return-void
.end method

.method public static final synthetic access$updateUI(Lcom/sma/smartv3/ui/device/WatchPasswordActivity;)V
    .locals 0

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/WatchPasswordActivity;->updateUI()V

    return-void
.end method

.method private final getItemHeader()Lcom/sma/smartv3/view/AbhSettingsHeader;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/WatchPasswordActivity;->itemHeader$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/sma/smartv3/view/AbhSettingsHeader;

    return-object v0
.end method

.method private final getRootView()Landroid/view/View;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/WatchPasswordActivity;->rootView$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    return-object v0
.end method

.method private static final itemHeader_delegate$lambda$0(Lcom/sma/smartv3/ui/device/WatchPasswordActivity;)Lcom/sma/smartv3/view/AbhSettingsHeader;
    .locals 1

    const v0, 0x7f0a0594

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Lcom/sma/smartv3/view/AbhSettingsHeader;

    return-object p0
.end method

.method private static final onResetPassword$lambda$0$0(Lcom/sma/smartv3/ui/device/WatchPasswordActivity;Ljava/lang/String;)Z
    .locals 3

    const-string v0, "text"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result v0

    const/4 v1, 0x0

    if-lez v0, :cond_0

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v2, 0x4

    if-ne v0, v2, :cond_0

    new-instance v0, Lcom/android/mltcode/paycertificationapi/bq6;

    invoke-direct {v0, p0, p1}, Lcom/android/mltcode/paycertificationapi/bq6;-><init>(Lcom/sma/smartv3/ui/device/WatchPasswordActivity;Ljava/lang/String;)V

    const/4 p0, 0x1

    const/4 p1, 0x0

    invoke-static {v1, v0, p0, p1}, Lcom/android/mltcode/paycertificationapi/X0IOiX1O;->XIi00iiXO(ZLkotlin/jvm/functions/Function1;ILjava/lang/Object;)Z

    move-result p0

    return p0

    :cond_0
    return v1
.end method

.method private static final onResetPassword$lambda$0$0$0(Lcom/sma/smartv3/ui/device/WatchPasswordActivity;Ljava/lang/String;Lcom/szabh/smable3/component/BleConnector;)Lkotlin/Unit;
    .locals 9

    const-string v0, "it"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/WatchPasswordActivity;->mWatchPassword:Lcom/szabh/smable3/entity/BleSettingWatchPassword;

    invoke-virtual {v0, p1}, Lcom/szabh/smable3/entity/BleSettingWatchPassword;->setMPassword(Ljava/lang/String;)V

    sget-object v2, Lcom/szabh/smable3/BleKey;->SET_WATCH_PASSWORD:Lcom/szabh/smable3/BleKey;

    sget-object v3, Lcom/szabh/smable3/BleKeyFlag;->UPDATE:Lcom/szabh/smable3/BleKeyFlag;

    iget-object v4, p0, Lcom/sma/smartv3/ui/device/WatchPasswordActivity;->mWatchPassword:Lcom/szabh/smable3/entity/BleSettingWatchPassword;

    const/16 v7, 0x18

    const/4 v8, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    move-object v1, p2

    invoke-static/range {v1 .. v8}, Lcom/szabh/smable3/component/BaseBleConnector;->sendObject$default(Lcom/szabh/smable3/component/BaseBleConnector;Lcom/szabh/smable3/BleKey;Lcom/szabh/smable3/BleKeyFlag;Lcom/bestmafen/baseble/data/BleBuffer;ZZILjava/lang/Object;)Z

    sget-object p0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p0
.end method

.method private static final rootView_delegate$lambda$0(Lcom/sma/smartv3/ui/device/WatchPasswordActivity;)Landroid/view/View;
    .locals 1

    const v0, 0x7f0a09b5

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    return-object p0
.end method

.method private final updateUI()V
    .locals 2

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/WatchPasswordActivity;->getItemHeader()Lcom/sma/smartv3/view/AbhSettingsHeader;

    move-result-object v0

    iget-object v1, p0, Lcom/sma/smartv3/ui/device/WatchPasswordActivity;->mWatchPassword:Lcom/szabh/smable3/entity/BleSettingWatchPassword;

    invoke-virtual {v1}, Lcom/szabh/smable3/entity/BleSettingWatchPassword;->getMEnabled()I

    move-result v1

    invoke-static {v1}, Lcom/android/mltcode/paycertificationapi/OiOX0i;->XIi00iiXO(I)Z

    move-result v1

    invoke-virtual {v0, v1}, Lcom/sma/smartv3/view/AbhSettingsHeader;->setChecked(Z)V

    new-instance v1, Lcom/android/mltcode/paycertificationapi/eq6;

    invoke-direct {v1, p0}, Lcom/android/mltcode/paycertificationapi/eq6;-><init>(Lcom/sma/smartv3/ui/device/WatchPasswordActivity;)V

    invoke-virtual {v0, v1}, Lcom/sma/smartv3/view/AbhSettingsHeader;->setMListener(Lkotlin/jvm/functions/Function1;)V

    return-void
.end method

.method private static final updateUI$lambda$0$0(Lcom/sma/smartv3/ui/device/WatchPasswordActivity;Z)Lkotlin/Unit;
    .locals 4

    new-instance v0, Lcom/android/mltcode/paycertificationapi/fq6;

    invoke-direct {v0, p0, p1}, Lcom/android/mltcode/paycertificationapi/fq6;-><init>(Lcom/sma/smartv3/ui/device/WatchPasswordActivity;Z)V

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x1

    invoke-static {v2, v0, v3, v1}, Lcom/android/mltcode/paycertificationapi/X0IOiX1O;->XIi00iiXO(ZLkotlin/jvm/functions/Function1;ILjava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/WatchPasswordActivity;->getItemHeader()Lcom/sma/smartv3/view/AbhSettingsHeader;

    move-result-object p0

    xor-int/2addr p1, v3

    invoke-virtual {p0, p1}, Lcom/sma/smartv3/view/AbhSettingsHeader;->setChecked(Z)V

    :cond_0
    sget-object p0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p0
.end method

.method private static final updateUI$lambda$0$0$0(Lcom/sma/smartv3/ui/device/WatchPasswordActivity;ZLcom/szabh/smable3/component/BleConnector;)Lkotlin/Unit;
    .locals 9

    const-string v0, "it"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/WatchPasswordActivity;->mWatchPassword:Lcom/szabh/smable3/entity/BleSettingWatchPassword;

    invoke-static {p1}, Lcom/android/mltcode/paycertificationapi/OiOX0i;->iO(Z)I

    move-result p1

    invoke-virtual {v0, p1}, Lcom/szabh/smable3/entity/BleSettingWatchPassword;->setMEnabled(I)V

    sget-object v2, Lcom/szabh/smable3/BleKey;->SET_WATCH_PASSWORD:Lcom/szabh/smable3/BleKey;

    sget-object v3, Lcom/szabh/smable3/BleKeyFlag;->UPDATE:Lcom/szabh/smable3/BleKeyFlag;

    iget-object v4, p0, Lcom/sma/smartv3/ui/device/WatchPasswordActivity;->mWatchPassword:Lcom/szabh/smable3/entity/BleSettingWatchPassword;

    const/16 v7, 0x18

    const/4 v8, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    move-object v1, p2

    invoke-static/range {v1 .. v8}, Lcom/szabh/smable3/component/BaseBleConnector;->sendObject$default(Lcom/szabh/smable3/component/BaseBleConnector;Lcom/szabh/smable3/BleKey;Lcom/szabh/smable3/BleKeyFlag;Lcom/bestmafen/baseble/data/BleBuffer;ZZILjava/lang/Object;)Z

    const/4 p0, 0x0

    const/4 p1, 0x2

    const-string p2, "watch_password_change"

    invoke-static {p2, p0, p1, p0}, Lcom/android/mltcode/paycertificationapi/I01XX0;->XIi00iiXO(Ljava/lang/String;Ljava/lang/Object;ILjava/lang/Object;)V

    sget-object p0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p0
.end method


# virtual methods
.method public init(Landroid/os/Bundle;)V
    .locals 1
    .param p1    # Landroid/os/Bundle;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param

    sget-object p1, Lcom/szabh/smable3/component/BleConnector;->INSTANCE:Lcom/szabh/smable3/component/BleConnector;

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/WatchPasswordActivity;->mBleHandleCallback:Lcom/sma/smartv3/ui/device/WatchPasswordActivity$OXO1;

    invoke-virtual {p1, v0}, Lcom/szabh/smable3/component/BleConnector;->addHandleCallback(Lcom/szabh/smable3/component/BleHandleCallback;)V

    return-void
.end method

.method public initView()V
    .locals 2

    const v0, 0x7f0a0023

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    const v1, 0x7f1414cb

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/WatchPasswordActivity;->updateUI()V

    return-void
.end method

.method public layoutId()I
    .locals 1

    const v0, 0x7f0d013a

    return v0
.end method

.method public onDestroy()V
    .locals 2

    sget-object v0, Lcom/szabh/smable3/component/BleConnector;->INSTANCE:Lcom/szabh/smable3/component/BleConnector;

    iget-object v1, p0, Lcom/sma/smartv3/ui/device/WatchPasswordActivity;->mBleHandleCallback:Lcom/sma/smartv3/ui/device/WatchPasswordActivity$OXO1;

    invoke-virtual {v0, v1}, Lcom/szabh/smable3/component/BleConnector;->removeHandleCallback(Lcom/szabh/smable3/component/BleHandleCallback;)V

    invoke-super {p0}, Lcom/bestmafen/androidbase/base/BaseActivity;->onDestroy()V

    return-void
.end method

.method public final onResetPassword(Landroid/view/View;)V
    .locals 4
    .param p1    # Landroid/view/View;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const/4 v0, 0x0

    const-string v1, "view"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, Lcom/sma/smartv3/ui/device/WatchPasswordActivity;->mPasswordPopup:Lcom/android/mltcode/paycertificationapi/dn1;

    if-nez p1, :cond_0

    new-instance p1, Lcom/android/mltcode/paycertificationapi/dn1;

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseActivity;->getMContext()Landroid/app/Activity;

    move-result-object v1

    invoke-direct {p1, v1}, Lcom/android/mltcode/paycertificationapi/dn1;-><init>(Landroid/app/Activity;)V

    invoke-virtual {p1}, Lcom/android/mltcode/paycertificationapi/dn1;->X01IiOiIi()Landroid/widget/EditText;

    move-result-object v1

    const v2, 0x7f140d1d

    invoke-virtual {p0, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setHint(Ljava/lang/CharSequence;)V

    const/4 v1, 0x2

    invoke-virtual {p1, v1}, Lcom/android/mltcode/paycertificationapi/dn1;->iOO1ii1(I)V

    invoke-virtual {p1}, Lcom/android/mltcode/paycertificationapi/dn1;->X01IiOiIi()Landroid/widget/EditText;

    move-result-object v1

    new-instance v2, Landroid/text/InputFilter$LengthFilter;

    const/4 v3, 0x4

    invoke-direct {v2, v3}, Landroid/text/InputFilter$LengthFilter;-><init>(I)V

    const/4 v3, 0x1

    new-array v3, v3, [Landroid/text/InputFilter;

    aput-object v2, v3, v0

    invoke-virtual {v1, v3}, Landroid/widget/TextView;->setFilters([Landroid/text/InputFilter;)V

    invoke-virtual {p1}, Lcom/android/mltcode/paycertificationapi/dn1;->X01IiOiIi()Landroid/widget/EditText;

    move-result-object v1

    invoke-virtual {v1, v0}, Landroid/view/View;->setEnabled(Z)V

    new-instance v0, Lcom/android/mltcode/paycertificationapi/aq6;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/aq6;-><init>(Lcom/sma/smartv3/ui/device/WatchPasswordActivity;)V

    invoke-virtual {p1, v0}, Lcom/android/mltcode/paycertificationapi/dn1;->O1O(Lkotlin/jvm/functions/Function1;)V

    iput-object p1, p0, Lcom/sma/smartv3/ui/device/WatchPasswordActivity;->mPasswordPopup:Lcom/android/mltcode/paycertificationapi/dn1;

    :cond_0
    iget-object p1, p0, Lcom/sma/smartv3/ui/device/WatchPasswordActivity;->mPasswordPopup:Lcom/android/mltcode/paycertificationapi/dn1;

    if-eqz p1, :cond_1

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/WatchPasswordActivity;->getRootView()Landroid/view/View;

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
