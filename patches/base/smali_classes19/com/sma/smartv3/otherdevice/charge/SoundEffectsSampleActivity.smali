.class public final Lcom/sma/smartv3/otherdevice/charge/SoundEffectsSampleActivity;
.super Lcom/sma/smartv3/otherdevice/charge/BaseChargeActivity;
.source "SourceFile"


# instance fields
.field private final cbClassical$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final cbCountry$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final cbJazz$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final cbNormal$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final cbPop$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final cbRock$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final mBleHandleCallback:Lcom/sma/smartv3/otherdevice/charge/SoundEffectsSampleActivity$OXO1;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private mEarphoneSoundEffectsSettings:Lcom/szabh/smable3/entity/BleEarphoneSoundEffectsSettings;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 8

    invoke-direct {p0}, Lcom/sma/smartv3/otherdevice/charge/BaseChargeActivity;-><init>()V

    new-instance v0, Lcom/android/mltcode/paycertificationapi/xo4;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/xo4;-><init>(Lcom/sma/smartv3/otherdevice/charge/SoundEffectsSampleActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/otherdevice/charge/SoundEffectsSampleActivity;->cbNormal$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/yo4;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/yo4;-><init>(Lcom/sma/smartv3/otherdevice/charge/SoundEffectsSampleActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/otherdevice/charge/SoundEffectsSampleActivity;->cbRock$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/zo4;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/zo4;-><init>(Lcom/sma/smartv3/otherdevice/charge/SoundEffectsSampleActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/otherdevice/charge/SoundEffectsSampleActivity;->cbPop$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/ap4;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/ap4;-><init>(Lcom/sma/smartv3/otherdevice/charge/SoundEffectsSampleActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/otherdevice/charge/SoundEffectsSampleActivity;->cbClassical$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/bp4;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/bp4;-><init>(Lcom/sma/smartv3/otherdevice/charge/SoundEffectsSampleActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/otherdevice/charge/SoundEffectsSampleActivity;->cbJazz$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/cp4;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/cp4;-><init>(Lcom/sma/smartv3/otherdevice/charge/SoundEffectsSampleActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/otherdevice/charge/SoundEffectsSampleActivity;->cbCountry$delegate:Lkotlin/Lazy;

    sget-object v1, Lcom/szabh/smable3/component/BleCache;->INSTANCE:Lcom/szabh/smable3/component/BleCache;

    sget-object v2, Lcom/szabh/smable3/BleKey;->EARPHONE_SOUND_EFFECTS_SET:Lcom/szabh/smable3/BleKey;

    const/16 v6, 0xc

    const/4 v7, 0x0

    const-class v3, Lcom/szabh/smable3/entity/BleEarphoneSoundEffectsSettings;

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-static/range {v1 .. v7}, Lcom/szabh/smable3/component/BaseBleCache;->getObjectNotNull$default(Lcom/szabh/smable3/component/BaseBleCache;Lcom/szabh/smable3/BleKey;Ljava/lang/Class;Ljava/lang/Object;Lcom/szabh/smable3/BleKeyFlag;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/szabh/smable3/entity/BleEarphoneSoundEffectsSettings;

    iput-object v0, p0, Lcom/sma/smartv3/otherdevice/charge/SoundEffectsSampleActivity;->mEarphoneSoundEffectsSettings:Lcom/szabh/smable3/entity/BleEarphoneSoundEffectsSettings;

    new-instance v0, Lcom/sma/smartv3/otherdevice/charge/SoundEffectsSampleActivity$OXO1;

    invoke-direct {v0, p0}, Lcom/sma/smartv3/otherdevice/charge/SoundEffectsSampleActivity$OXO1;-><init>(Lcom/sma/smartv3/otherdevice/charge/SoundEffectsSampleActivity;)V

    iput-object v0, p0, Lcom/sma/smartv3/otherdevice/charge/SoundEffectsSampleActivity;->mBleHandleCallback:Lcom/sma/smartv3/otherdevice/charge/SoundEffectsSampleActivity$OXO1;

    return-void
.end method

.method public static synthetic I0iXXO(Lcom/sma/smartv3/otherdevice/charge/SoundEffectsSampleActivity;)Landroid/widget/CheckBox;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/otherdevice/charge/SoundEffectsSampleActivity;->cbJazz_delegate$lambda$0(Lcom/sma/smartv3/otherdevice/charge/SoundEffectsSampleActivity;)Landroid/widget/CheckBox;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic O10IXXX0X(Lcom/sma/smartv3/otherdevice/charge/SoundEffectsSampleActivity;)Landroid/widget/CheckBox;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/otherdevice/charge/SoundEffectsSampleActivity;->cbClassical_delegate$lambda$0(Lcom/sma/smartv3/otherdevice/charge/SoundEffectsSampleActivity;)Landroid/widget/CheckBox;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic OIX0iXi(Lcom/sma/smartv3/otherdevice/charge/SoundEffectsSampleActivity;)Landroid/widget/CheckBox;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/otherdevice/charge/SoundEffectsSampleActivity;->cbCountry_delegate$lambda$0(Lcom/sma/smartv3/otherdevice/charge/SoundEffectsSampleActivity;)Landroid/widget/CheckBox;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic X0O(Lcom/sma/smartv3/otherdevice/charge/SoundEffectsSampleActivity;)Landroid/widget/CheckBox;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/otherdevice/charge/SoundEffectsSampleActivity;->cbNormal_delegate$lambda$0(Lcom/sma/smartv3/otherdevice/charge/SoundEffectsSampleActivity;)Landroid/widget/CheckBox;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic X1ii(Lcom/sma/smartv3/otherdevice/charge/SoundEffectsSampleActivity;)Landroid/widget/CheckBox;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/otherdevice/charge/SoundEffectsSampleActivity;->cbPop_delegate$lambda$0(Lcom/sma/smartv3/otherdevice/charge/SoundEffectsSampleActivity;)Landroid/widget/CheckBox;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic XXI(Lcom/sma/smartv3/otherdevice/charge/SoundEffectsSampleActivity;)Landroid/widget/CheckBox;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/otherdevice/charge/SoundEffectsSampleActivity;->cbRock_delegate$lambda$0(Lcom/sma/smartv3/otherdevice/charge/SoundEffectsSampleActivity;)Landroid/widget/CheckBox;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$setMEarphoneSoundEffectsSettings$p(Lcom/sma/smartv3/otherdevice/charge/SoundEffectsSampleActivity;Lcom/szabh/smable3/entity/BleEarphoneSoundEffectsSettings;)V
    .locals 0

    iput-object p1, p0, Lcom/sma/smartv3/otherdevice/charge/SoundEffectsSampleActivity;->mEarphoneSoundEffectsSettings:Lcom/szabh/smable3/entity/BleEarphoneSoundEffectsSettings;

    return-void
.end method

.method public static final synthetic access$updateUI(Lcom/sma/smartv3/otherdevice/charge/SoundEffectsSampleActivity;)V
    .locals 0

    invoke-direct {p0}, Lcom/sma/smartv3/otherdevice/charge/SoundEffectsSampleActivity;->updateUI()V

    return-void
.end method

.method private static final cbClassical_delegate$lambda$0(Lcom/sma/smartv3/otherdevice/charge/SoundEffectsSampleActivity;)Landroid/widget/CheckBox;
    .locals 1

    const v0, 0x7f0a020b

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/CheckBox;

    return-object p0
.end method

.method private static final cbCountry_delegate$lambda$0(Lcom/sma/smartv3/otherdevice/charge/SoundEffectsSampleActivity;)Landroid/widget/CheckBox;
    .locals 1

    const v0, 0x7f0a020c

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/CheckBox;

    return-object p0
.end method

.method private static final cbJazz_delegate$lambda$0(Lcom/sma/smartv3/otherdevice/charge/SoundEffectsSampleActivity;)Landroid/widget/CheckBox;
    .locals 1

    const v0, 0x7f0a020d

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/CheckBox;

    return-object p0
.end method

.method private static final cbNormal_delegate$lambda$0(Lcom/sma/smartv3/otherdevice/charge/SoundEffectsSampleActivity;)Landroid/widget/CheckBox;
    .locals 1

    const v0, 0x7f0a020e

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/CheckBox;

    return-object p0
.end method

.method private static final cbPop_delegate$lambda$0(Lcom/sma/smartv3/otherdevice/charge/SoundEffectsSampleActivity;)Landroid/widget/CheckBox;
    .locals 1

    const v0, 0x7f0a020f

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/CheckBox;

    return-object p0
.end method

.method private static final cbRock_delegate$lambda$0(Lcom/sma/smartv3/otherdevice/charge/SoundEffectsSampleActivity;)Landroid/widget/CheckBox;
    .locals 1

    const v0, 0x7f0a0210

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/CheckBox;

    return-object p0
.end method

.method private final getCbClassical()Landroid/widget/CheckBox;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/otherdevice/charge/SoundEffectsSampleActivity;->cbClassical$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/CheckBox;

    return-object v0
.end method

.method private final getCbCountry()Landroid/widget/CheckBox;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/otherdevice/charge/SoundEffectsSampleActivity;->cbCountry$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/CheckBox;

    return-object v0
.end method

.method private final getCbJazz()Landroid/widget/CheckBox;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/otherdevice/charge/SoundEffectsSampleActivity;->cbJazz$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/CheckBox;

    return-object v0
.end method

.method private final getCbNormal()Landroid/widget/CheckBox;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/otherdevice/charge/SoundEffectsSampleActivity;->cbNormal$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/CheckBox;

    return-object v0
.end method

.method private final getCbPop()Landroid/widget/CheckBox;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/otherdevice/charge/SoundEffectsSampleActivity;->cbPop$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/CheckBox;

    return-object v0
.end method

.method private final getCbRock()Landroid/widget/CheckBox;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/otherdevice/charge/SoundEffectsSampleActivity;->cbRock$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/CheckBox;

    return-object v0
.end method

.method private final isModeCheck(II)Z
    .locals 0

    if-ne p1, p2, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method private final updateUI()V
    .locals 3

    invoke-direct {p0}, Lcom/sma/smartv3/otherdevice/charge/SoundEffectsSampleActivity;->getCbNormal()Landroid/widget/CheckBox;

    move-result-object v0

    iget-object v1, p0, Lcom/sma/smartv3/otherdevice/charge/SoundEffectsSampleActivity;->mEarphoneSoundEffectsSettings:Lcom/szabh/smable3/entity/BleEarphoneSoundEffectsSettings;

    invoke-virtual {v1}, Lcom/szabh/smable3/entity/BleEarphoneSoundEffectsSettings;->getMMode()I

    move-result v1

    const/4 v2, 0x0

    invoke-direct {p0, v2, v1}, Lcom/sma/smartv3/otherdevice/charge/SoundEffectsSampleActivity;->isModeCheck(II)Z

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/CompoundButton;->setChecked(Z)V

    invoke-direct {p0}, Lcom/sma/smartv3/otherdevice/charge/SoundEffectsSampleActivity;->getCbRock()Landroid/widget/CheckBox;

    move-result-object v0

    iget-object v1, p0, Lcom/sma/smartv3/otherdevice/charge/SoundEffectsSampleActivity;->mEarphoneSoundEffectsSettings:Lcom/szabh/smable3/entity/BleEarphoneSoundEffectsSettings;

    invoke-virtual {v1}, Lcom/szabh/smable3/entity/BleEarphoneSoundEffectsSettings;->getMMode()I

    move-result v1

    const/4 v2, 0x1

    invoke-direct {p0, v2, v1}, Lcom/sma/smartv3/otherdevice/charge/SoundEffectsSampleActivity;->isModeCheck(II)Z

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/CompoundButton;->setChecked(Z)V

    invoke-direct {p0}, Lcom/sma/smartv3/otherdevice/charge/SoundEffectsSampleActivity;->getCbPop()Landroid/widget/CheckBox;

    move-result-object v0

    iget-object v1, p0, Lcom/sma/smartv3/otherdevice/charge/SoundEffectsSampleActivity;->mEarphoneSoundEffectsSettings:Lcom/szabh/smable3/entity/BleEarphoneSoundEffectsSettings;

    invoke-virtual {v1}, Lcom/szabh/smable3/entity/BleEarphoneSoundEffectsSettings;->getMMode()I

    move-result v1

    const/4 v2, 0x2

    invoke-direct {p0, v2, v1}, Lcom/sma/smartv3/otherdevice/charge/SoundEffectsSampleActivity;->isModeCheck(II)Z

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/CompoundButton;->setChecked(Z)V

    invoke-direct {p0}, Lcom/sma/smartv3/otherdevice/charge/SoundEffectsSampleActivity;->getCbClassical()Landroid/widget/CheckBox;

    move-result-object v0

    iget-object v1, p0, Lcom/sma/smartv3/otherdevice/charge/SoundEffectsSampleActivity;->mEarphoneSoundEffectsSettings:Lcom/szabh/smable3/entity/BleEarphoneSoundEffectsSettings;

    invoke-virtual {v1}, Lcom/szabh/smable3/entity/BleEarphoneSoundEffectsSettings;->getMMode()I

    move-result v1

    const/4 v2, 0x3

    invoke-direct {p0, v2, v1}, Lcom/sma/smartv3/otherdevice/charge/SoundEffectsSampleActivity;->isModeCheck(II)Z

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/CompoundButton;->setChecked(Z)V

    invoke-direct {p0}, Lcom/sma/smartv3/otherdevice/charge/SoundEffectsSampleActivity;->getCbJazz()Landroid/widget/CheckBox;

    move-result-object v0

    iget-object v1, p0, Lcom/sma/smartv3/otherdevice/charge/SoundEffectsSampleActivity;->mEarphoneSoundEffectsSettings:Lcom/szabh/smable3/entity/BleEarphoneSoundEffectsSettings;

    invoke-virtual {v1}, Lcom/szabh/smable3/entity/BleEarphoneSoundEffectsSettings;->getMMode()I

    move-result v1

    const/4 v2, 0x4

    invoke-direct {p0, v2, v1}, Lcom/sma/smartv3/otherdevice/charge/SoundEffectsSampleActivity;->isModeCheck(II)Z

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/CompoundButton;->setChecked(Z)V

    invoke-direct {p0}, Lcom/sma/smartv3/otherdevice/charge/SoundEffectsSampleActivity;->getCbCountry()Landroid/widget/CheckBox;

    move-result-object v0

    iget-object v1, p0, Lcom/sma/smartv3/otherdevice/charge/SoundEffectsSampleActivity;->mEarphoneSoundEffectsSettings:Lcom/szabh/smable3/entity/BleEarphoneSoundEffectsSettings;

    invoke-virtual {v1}, Lcom/szabh/smable3/entity/BleEarphoneSoundEffectsSettings;->getMMode()I

    move-result v1

    const/4 v2, 0x5

    invoke-direct {p0, v2, v1}, Lcom/sma/smartv3/otherdevice/charge/SoundEffectsSampleActivity;->isModeCheck(II)Z

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/CompoundButton;->setChecked(Z)V

    return-void
.end method


# virtual methods
.method public init(Landroid/os/Bundle;)V
    .locals 1
    .param p1    # Landroid/os/Bundle;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param

    sget-object p1, Lcom/szabh/smable3/component/BleConnector;->INSTANCE:Lcom/szabh/smable3/component/BleConnector;

    iget-object v0, p0, Lcom/sma/smartv3/otherdevice/charge/SoundEffectsSampleActivity;->mBleHandleCallback:Lcom/sma/smartv3/otherdevice/charge/SoundEffectsSampleActivity$OXO1;

    invoke-virtual {p1, v0}, Lcom/szabh/smable3/component/BleConnector;->addHandleCallback(Lcom/szabh/smable3/component/BleHandleCallback;)V

    return-void
.end method

.method public initView()V
    .locals 10

    const v0, 0x7f0a0023

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    const v1, 0x7f140b4f

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    const v0, 0x7f0a0020

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    const-string v1, ""

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    sget-object v2, Lcom/szabh/smable3/component/BleConnector;->INSTANCE:Lcom/szabh/smable3/component/BleConnector;

    sget-object v3, Lcom/szabh/smable3/BleKey;->EARPHONE_SOUND_EFFECTS_SET:Lcom/szabh/smable3/BleKey;

    sget-object v4, Lcom/szabh/smable3/BleKeyFlag;->READ:Lcom/szabh/smable3/BleKeyFlag;

    const/16 v8, 0x1c

    const/4 v9, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-static/range {v2 .. v9}, Lcom/szabh/smable3/component/BaseBleConnector;->sendData$default(Lcom/szabh/smable3/component/BaseBleConnector;Lcom/szabh/smable3/BleKey;Lcom/szabh/smable3/BleKeyFlag;[BZZILjava/lang/Object;)Z

    invoke-direct {p0}, Lcom/sma/smartv3/otherdevice/charge/SoundEffectsSampleActivity;->updateUI()V

    return-void
.end method

.method public layoutId()I
    .locals 1

    const v0, 0x7f0d010c

    return v0
.end method

.method public onDestroy()V
    .locals 2

    invoke-super {p0}, Lcom/bestmafen/androidbase/base/BaseActivity;->onDestroy()V

    sget-object v0, Lcom/szabh/smable3/component/BleConnector;->INSTANCE:Lcom/szabh/smable3/component/BleConnector;

    iget-object v1, p0, Lcom/sma/smartv3/otherdevice/charge/SoundEffectsSampleActivity;->mBleHandleCallback:Lcom/sma/smartv3/otherdevice/charge/SoundEffectsSampleActivity$OXO1;

    invoke-virtual {v0, v1}, Lcom/szabh/smable3/component/BleConnector;->removeHandleCallback(Lcom/szabh/smable3/component/BleHandleCallback;)V

    return-void
.end method

.method public final onModeClick(Landroid/view/View;)V
    .locals 9
    .param p1    # Landroid/view/View;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "view"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result p1

    packed-switch p1, :pswitch_data_0

    :pswitch_0
    const/4 p1, 0x0

    goto :goto_0

    :pswitch_1
    const/4 p1, 0x1

    goto :goto_0

    :pswitch_2
    const/4 p1, 0x2

    goto :goto_0

    :pswitch_3
    const/4 p1, 0x4

    goto :goto_0

    :pswitch_4
    const/4 p1, 0x5

    goto :goto_0

    :pswitch_5
    const/4 p1, 0x3

    :goto_0
    iget-object v0, p0, Lcom/sma/smartv3/otherdevice/charge/SoundEffectsSampleActivity;->mEarphoneSoundEffectsSettings:Lcom/szabh/smable3/entity/BleEarphoneSoundEffectsSettings;

    invoke-virtual {v0}, Lcom/szabh/smable3/entity/BleEarphoneSoundEffectsSettings;->getMMode()I

    move-result v0

    if-eq p1, v0, :cond_0

    iget-object v0, p0, Lcom/sma/smartv3/otherdevice/charge/SoundEffectsSampleActivity;->mEarphoneSoundEffectsSettings:Lcom/szabh/smable3/entity/BleEarphoneSoundEffectsSettings;

    invoke-virtual {v0, p1}, Lcom/szabh/smable3/entity/BleEarphoneSoundEffectsSettings;->setMMode(I)V

    sget-object v1, Lcom/szabh/smable3/component/BleConnector;->INSTANCE:Lcom/szabh/smable3/component/BleConnector;

    sget-object v2, Lcom/szabh/smable3/BleKey;->EARPHONE_SOUND_EFFECTS_SET:Lcom/szabh/smable3/BleKey;

    sget-object v3, Lcom/szabh/smable3/BleKeyFlag;->UPDATE:Lcom/szabh/smable3/BleKeyFlag;

    iget-object v4, p0, Lcom/sma/smartv3/otherdevice/charge/SoundEffectsSampleActivity;->mEarphoneSoundEffectsSettings:Lcom/szabh/smable3/entity/BleEarphoneSoundEffectsSettings;

    const/16 v7, 0x18

    const/4 v8, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-static/range {v1 .. v8}, Lcom/szabh/smable3/component/BaseBleConnector;->sendObject$default(Lcom/szabh/smable3/component/BaseBleConnector;Lcom/szabh/smable3/BleKey;Lcom/szabh/smable3/BleKeyFlag;Lcom/bestmafen/baseble/data/BleBuffer;ZZILjava/lang/Object;)Z

    invoke-direct {p0}, Lcom/sma/smartv3/otherdevice/charge/SoundEffectsSampleActivity;->updateUI()V

    :cond_0
    return-void

    :pswitch_data_0
    .packed-switch 0x7f0a06e7
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_0
        :pswitch_2
        :pswitch_1
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
