.class public final Lcom/sma/smartv3/ui/me/DeveloperSmsTestActivity;
.super Lcom/bestmafen/androidbase/base/BaseActivity;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nDeveloperSmsTestActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DeveloperSmsTestActivity.kt\ncom/sma/smartv3/ui/me/DeveloperSmsTestActivity\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,109:1\n1563#2:110\n1634#2,3:111\n*S KotlinDebug\n*F\n+ 1 DeveloperSmsTestActivity.kt\ncom/sma/smartv3/ui/me/DeveloperSmsTestActivity\n*L\n48#1:110\n48#1:111,3\n*E\n"
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nDeveloperSmsTestActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DeveloperSmsTestActivity.kt\ncom/sma/smartv3/ui/me/DeveloperSmsTestActivity\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,109:1\n1563#2:110\n1634#2,3:111\n*S KotlinDebug\n*F\n+ 1 DeveloperSmsTestActivity.kt\ncom/sma/smartv3/ui/me/DeveloperSmsTestActivity\n*L\n48#1:110\n48#1:111,3\n*E\n"
    }
.end annotation


# instance fields
.field private final mEtContent$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final mEtPhone$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final mSpSims$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private subId:I


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lcom/bestmafen/androidbase/base/BaseActivity;-><init>()V

    new-instance v0, Lcom/android/mltcode/paycertificationapi/X1OXOIXii;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/X1OXOIXii;-><init>(Lcom/sma/smartv3/ui/me/DeveloperSmsTestActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/me/DeveloperSmsTestActivity;->mSpSims$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/O00iiXi;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/O00iiXi;-><init>(Lcom/sma/smartv3/ui/me/DeveloperSmsTestActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/me/DeveloperSmsTestActivity;->mEtPhone$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/OOIXIO1II;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/OOIXIO1II;-><init>(Lcom/sma/smartv3/ui/me/DeveloperSmsTestActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/me/DeveloperSmsTestActivity;->mEtContent$delegate:Lkotlin/Lazy;

    const/4 v0, -0x1

    iput v0, p0, Lcom/sma/smartv3/ui/me/DeveloperSmsTestActivity;->subId:I

    return-void
.end method

.method public static synthetic I0iXXO(Lcom/sma/smartv3/ui/me/DeveloperSmsTestActivity;Lcom/bestmafen/androidbase/extension/PermissionStatus;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Lcom/sma/smartv3/ui/me/DeveloperSmsTestActivity;->onSend$lambda$0(Lcom/sma/smartv3/ui/me/DeveloperSmsTestActivity;Lcom/bestmafen/androidbase/extension/PermissionStatus;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic O10IXXX0X(Lcom/sma/smartv3/ui/me/DeveloperSmsTestActivity;)Landroidx/appcompat/widget/AppCompatSpinner;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/me/DeveloperSmsTestActivity;->mSpSims_delegate$lambda$0(Lcom/sma/smartv3/ui/me/DeveloperSmsTestActivity;)Landroidx/appcompat/widget/AppCompatSpinner;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic OIX0iXi(Lcom/sma/smartv3/ui/me/DeveloperSmsTestActivity;)Landroid/widget/EditText;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/me/DeveloperSmsTestActivity;->mEtPhone_delegate$lambda$0(Lcom/sma/smartv3/ui/me/DeveloperSmsTestActivity;)Landroid/widget/EditText;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic X1ii(Lcom/sma/smartv3/ui/me/DeveloperSmsTestActivity;)Landroid/widget/EditText;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/me/DeveloperSmsTestActivity;->mEtContent_delegate$lambda$0(Lcom/sma/smartv3/ui/me/DeveloperSmsTestActivity;)Landroid/widget/EditText;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic XXI(Lcom/sma/smartv3/ui/me/DeveloperSmsTestActivity;Lcom/bestmafen/androidbase/extension/PermissionStatus;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Lcom/sma/smartv3/ui/me/DeveloperSmsTestActivity;->initView$lambda$0(Lcom/sma/smartv3/ui/me/DeveloperSmsTestActivity;Lcom/bestmafen/androidbase/extension/PermissionStatus;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$getSubId$p(Lcom/sma/smartv3/ui/me/DeveloperSmsTestActivity;)I
    .locals 0

    iget p0, p0, Lcom/sma/smartv3/ui/me/DeveloperSmsTestActivity;->subId:I

    return p0
.end method

.method public static final synthetic access$setSubId$p(Lcom/sma/smartv3/ui/me/DeveloperSmsTestActivity;I)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/ui/me/DeveloperSmsTestActivity;->subId:I

    return-void
.end method

.method private final getMEtContent()Landroid/widget/EditText;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/me/DeveloperSmsTestActivity;->mEtContent$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/EditText;

    return-object v0
.end method

.method private final getMEtPhone()Landroid/widget/EditText;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/me/DeveloperSmsTestActivity;->mEtPhone$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/EditText;

    return-object v0
.end method

.method private final getMSpSims()Landroidx/appcompat/widget/AppCompatSpinner;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/me/DeveloperSmsTestActivity;->mSpSims$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroidx/appcompat/widget/AppCompatSpinner;

    return-object v0
.end method

.method private static final initView$lambda$0(Lcom/sma/smartv3/ui/me/DeveloperSmsTestActivity;Lcom/bestmafen/androidbase/extension/PermissionStatus;)Lkotlin/Unit;
    .locals 4

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/bestmafen/androidbase/extension/PermissionStatus;->GRANTED:Lcom/bestmafen/androidbase/extension/PermissionStatus;

    if-ne p1, v0, :cond_1

    const-string p1, "telephony_subscription_service"

    invoke-virtual {p0, p1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    const-string v0, "null cannot be cast to non-null type android.telephony.SubscriptionManager"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X1ii(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Landroid/telephony/SubscriptionManager;

    invoke-virtual {p1}, Landroid/telephony/SubscriptionManager;->getActiveSubscriptionInfoList()Ljava/util/List;

    move-result-object p1

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "subscriptionInfoList => "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lcom/blankj/utilcode/util/LogUtils;->d([Ljava/lang/Object;)V

    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    move-object v0, p1

    check-cast v0, Ljava/lang/Iterable;

    new-instance v1, Ljava/util/ArrayList;

    const/16 v2, 0xa

    invoke-static {v0, v2}, Lkotlin/collections/CollectionsKt__IterablesKt;->X00XIX1(Ljava/lang/Iterable;I)I

    move-result v2

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/telephony/SubscriptionInfo;

    invoke-virtual {v2}, Landroid/telephony/SubscriptionInfo;->getDisplayName()Ljava/lang/CharSequence;

    move-result-object v2

    invoke-interface {v1, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    new-instance v0, Landroid/widget/ArrayAdapter;

    const v2, 0x1090003

    const v3, 0x1020014

    invoke-direct {v0, p0, v2, v3, v1}, Landroid/widget/ArrayAdapter;-><init>(Landroid/content/Context;IILjava/util/List;)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/me/DeveloperSmsTestActivity;->getMSpSims()Landroidx/appcompat/widget/AppCompatSpinner;

    move-result-object v1

    invoke-virtual {v1, v0}, Landroidx/appcompat/widget/AppCompatSpinner;->setAdapter(Landroid/widget/SpinnerAdapter;)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/me/DeveloperSmsTestActivity;->getMSpSims()Landroidx/appcompat/widget/AppCompatSpinner;

    move-result-object v0

    new-instance v1, Lcom/sma/smartv3/ui/me/DeveloperSmsTestActivity$OXO1;

    invoke-direct {v1, p0, p1}, Lcom/sma/smartv3/ui/me/DeveloperSmsTestActivity$OXO1;-><init>(Lcom/sma/smartv3/ui/me/DeveloperSmsTestActivity;Ljava/util/List;)V

    invoke-virtual {v0, v1}, Landroid/widget/AdapterView;->setOnItemSelectedListener(Landroid/widget/AdapterView$OnItemSelectedListener;)V

    :cond_1
    sget-object p0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p0
.end method

.method private static final mEtContent_delegate$lambda$0(Lcom/sma/smartv3/ui/me/DeveloperSmsTestActivity;)Landroid/widget/EditText;
    .locals 1

    const v0, 0x7f0a0371

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/EditText;

    return-object p0
.end method

.method private static final mEtPhone_delegate$lambda$0(Lcom/sma/smartv3/ui/me/DeveloperSmsTestActivity;)Landroid/widget/EditText;
    .locals 1

    const v0, 0x7f0a0379

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/EditText;

    return-object p0
.end method

.method private static final mSpSims_delegate$lambda$0(Lcom/sma/smartv3/ui/me/DeveloperSmsTestActivity;)Landroidx/appcompat/widget/AppCompatSpinner;
    .locals 1

    const v0, 0x7f0a0a68

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroidx/appcompat/widget/AppCompatSpinner;

    return-object p0
.end method

.method private static final onSend$lambda$0(Lcom/sma/smartv3/ui/me/DeveloperSmsTestActivity;Lcom/bestmafen/androidbase/extension/PermissionStatus;)Lkotlin/Unit;
    .locals 7

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/bestmafen/androidbase/extension/PermissionStatus;->GRANTED:Lcom/bestmafen/androidbase/extension/PermissionStatus;

    if-ne p1, v0, :cond_2

    invoke-direct {p0}, Lcom/sma/smartv3/ui/me/DeveloperSmsTestActivity;->getMEtPhone()Landroid/widget/EditText;

    move-result-object p1

    invoke-virtual {p1}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {p0}, Lcom/sma/smartv3/ui/me/DeveloperSmsTestActivity;->getMEtContent()Landroid/widget/EditText;

    move-result-object p1

    invoke-virtual {p1}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-interface {v1}, Ljava/lang/CharSequence;->length()I

    move-result v0

    if-lez v0, :cond_2

    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result v0

    if-lez v0, :cond_2

    iget v0, p0, Lcom/sma/smartv3/ui/me/DeveloperSmsTestActivity;->subId:I

    const/4 v2, -0x1

    if-ne v0, v2, :cond_0

    invoke-static {}, Landroid/telephony/SmsManager;->getDefaultSmsSubscriptionId()I

    move-result v0

    iput v0, p0, Lcom/sma/smartv3/ui/me/DeveloperSmsTestActivity;->subId:I

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Default subId "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lcom/blankj/utilcode/util/LogUtils;->d([Ljava/lang/Object;)V

    :cond_0
    iget v0, p0, Lcom/sma/smartv3/ui/me/DeveloperSmsTestActivity;->subId:I

    invoke-static {v0}, Landroid/telephony/SmsManager;->getSmsManagerForSubscriptionId(I)Landroid/telephony/SmsManager;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/telephony/SmsManager;->divideMessage(Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object v2

    const-string v3, "divideMessage(...)"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :goto_0
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    move-object v3, v2

    check-cast v3, Ljava/lang/String;

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v2, 0x0

    invoke-virtual/range {v0 .. v5}, Landroid/telephony/SmsManager;->sendTextMessage(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/app/PendingIntent;Landroid/app/PendingIntent;)V

    goto :goto_0

    :cond_1
    iget p0, p0, Lcom/sma/smartv3/ui/me/DeveloperSmsTestActivity;->subId:I

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p0, " "

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p0, " ========> "

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    filled-new-array {p0}, [Ljava/lang/Object;

    move-result-object p0

    invoke-static {p0}, Lcom/blankj/utilcode/util/LogUtils;->d([Ljava/lang/Object;)V

    :cond_2
    sget-object p0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p0
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
    .locals 7

    const-string v0, "PHONE"

    const-string v1, "SMS"

    filled-new-array {v0, v1}, [Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/blankj/utilcode/util/PermissionUtils;->permission([Ljava/lang/String;)Lcom/blankj/utilcode/util/PermissionUtils;

    move-result-object v1

    const-string v0, "permission(...)"

    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v4, Lcom/android/mltcode/paycertificationapi/X0OiXI1;

    invoke-direct {v4, p0}, Lcom/android/mltcode/paycertificationapi/X0OiXI1;-><init>(Lcom/sma/smartv3/ui/me/DeveloperSmsTestActivity;)V

    const/4 v5, 0x3

    const/4 v6, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static/range {v1 .. v6}, Lcom/android/mltcode/paycertificationapi/ds1;->iO(Lcom/blankj/utilcode/util/PermissionUtils;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)V

    return-void
.end method

.method public layoutId()I
    .locals 1

    const v0, 0x7f0d0065

    return v0
.end method

.method public final onSend(Landroid/view/View;)V
    .locals 6
    .param p1    # Landroid/view/View;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "v"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "PHONE"

    const-string v0, "SMS"

    filled-new-array {p1, v0}, [Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lcom/blankj/utilcode/util/PermissionUtils;->permission([Ljava/lang/String;)Lcom/blankj/utilcode/util/PermissionUtils;

    move-result-object v0

    const-string p1, "permission(...)"

    invoke-static {v0, p1}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v3, Lcom/android/mltcode/paycertificationapi/X10XOX1OO;

    invoke-direct {v3, p0}, Lcom/android/mltcode/paycertificationapi/X10XOX1OO;-><init>(Lcom/sma/smartv3/ui/me/DeveloperSmsTestActivity;)V

    const/4 v4, 0x3

    const/4 v5, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-static/range {v0 .. v5}, Lcom/android/mltcode/paycertificationapi/ds1;->iO(Lcom/blankj/utilcode/util/PermissionUtils;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)V

    return-void
.end method
