.class public final Lcom/sma/smartv3/ui/me/CoachingEditActivity;
.super Lcom/bestmafen/androidbase/base/BaseActivity;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nCoachingEditActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoachingEditActivity.kt\ncom/sma/smartv3/ui/me/CoachingEditActivity\n+ 2 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n+ 3 TextView.kt\nandroidx/core/widget/TextViewKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 Activity.kt\ncom/bestmafen/androidbase/extension/ActivityKt\n*L\n1#1,134:1\n18#2,2:135\n15#2:137\n18#2,2:138\n15#2:140\n11#2,2:172\n55#3,12:141\n84#3,3:153\n55#3,12:156\n84#3,3:168\n1#4:171\n1#4:179\n140#5,5:174\n145#5,5:180\n*S KotlinDebug\n*F\n+ 1 CoachingEditActivity.kt\ncom/sma/smartv3/ui/me/CoachingEditActivity\n*L\n45#1:135,2\n45#1:137\n46#1:138,2\n46#1:140\n103#1:172,2\n66#1:141,12\n66#1:153,3\n67#1:156,12\n67#1:168,3\n132#1:179\n132#1:174,5\n132#1:180,5\n*E\n"
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nCoachingEditActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoachingEditActivity.kt\ncom/sma/smartv3/ui/me/CoachingEditActivity\n+ 2 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n+ 3 TextView.kt\nandroidx/core/widget/TextViewKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 Activity.kt\ncom/bestmafen/androidbase/extension/ActivityKt\n*L\n1#1,134:1\n18#2,2:135\n15#2:137\n18#2,2:138\n15#2:140\n11#2,2:172\n55#3,12:141\n84#3,3:153\n55#3,12:156\n84#3,3:168\n1#4:171\n1#4:179\n140#5,5:174\n145#5,5:180\n*S KotlinDebug\n*F\n+ 1 CoachingEditActivity.kt\ncom/sma/smartv3/ui/me/CoachingEditActivity\n*L\n45#1:135,2\n45#1:137\n46#1:138,2\n46#1:140\n103#1:172,2\n66#1:141,12\n66#1:153,3\n67#1:156,12\n67#1:168,3\n132#1:179\n132#1:174,5\n132#1:180,5\n*E\n"
    }
.end annotation


# instance fields
.field private final btnBottom$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final edtDescription$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final edtName$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final mCoaching:Lcom/szabh/smable3/entity/BleCoaching;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final mDescriptionTextWatcher:Lkotlin/jvm/functions/Function1;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1<",
            "Landroid/text/Editable;",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field

.field private mDiscardChangesPopup:Lcom/android/mltcode/paycertificationapi/go0;
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation
.end field

.field private final mOriginCoaching:Lcom/szabh/smable3/entity/BleCoaching;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private mRepeatPopup:Lcom/android/mltcode/paycertificationapi/qv1;
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation
.end field

.field private final mTitleTextWatcher:Lkotlin/jvm/functions/Function1;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1<",
            "Landroid/text/Editable;",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field

.field private final titleRight$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final tvRepeat$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 5

    invoke-direct {p0}, Lcom/bestmafen/androidbase/base/BaseActivity;-><init>()V

    new-instance v0, Lcom/android/mltcode/paycertificationapi/I0XIOI11X;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/I0XIOI11X;-><init>(Lcom/sma/smartv3/ui/me/CoachingEditActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/me/CoachingEditActivity;->titleRight$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/I0iO0;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/I0iO0;-><init>(Lcom/sma/smartv3/ui/me/CoachingEditActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/me/CoachingEditActivity;->edtName$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/iOIO0iIIO;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/iOIO0iIIO;-><init>(Lcom/sma/smartv3/ui/me/CoachingEditActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/me/CoachingEditActivity;->tvRepeat$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/XIIXXXOO;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/XIIXXXOO;-><init>(Lcom/sma/smartv3/ui/me/CoachingEditActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/me/CoachingEditActivity;->edtDescription$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/O01iXi;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/O01iXi;-><init>(Lcom/sma/smartv3/ui/me/CoachingEditActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/me/CoachingEditActivity;->btnBottom$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/i0Oii0OI;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/i0Oii0OI;-><init>(Lcom/sma/smartv3/ui/me/CoachingEditActivity;)V

    iput-object v0, p0, Lcom/sma/smartv3/ui/me/CoachingEditActivity;->mTitleTextWatcher:Lkotlin/jvm/functions/Function1;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/Oi100iii;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/Oi100iii;-><init>(Lcom/sma/smartv3/ui/me/CoachingEditActivity;)V

    iput-object v0, p0, Lcom/sma/smartv3/ui/me/CoachingEditActivity;->mDescriptionTextWatcher:Lkotlin/jvm/functions/Function1;

    sget-object v0, Lcom/android/mltcode/paycertificationapi/a01;->OXO1:Lcom/android/mltcode/paycertificationapi/a01;

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/a01;->XO0O10()Lcom/blankj/utilcode/util/SPUtils;

    move-result-object v1

    new-instance v2, Lcom/google/gson/Gson;

    invoke-direct {v2}, Lcom/google/gson/Gson;-><init>()V

    const-class v3, Lcom/szabh/smable3/entity/BleCoaching;

    invoke-virtual {v3}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1, v4}, Lcom/blankj/utilcode/util/SPUtils;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v1, v3}, Lcom/google/gson/Gson;->fromJson(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    if-nez v1, :cond_0

    invoke-virtual {v3}, Ljava/lang/Class;->newInstance()Ljava/lang/Object;

    move-result-object v1

    :cond_0
    check-cast v1, Lcom/szabh/smable3/entity/BleCoaching;

    iput-object v1, p0, Lcom/sma/smartv3/ui/me/CoachingEditActivity;->mCoaching:Lcom/szabh/smable3/entity/BleCoaching;

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/a01;->XO0O10()Lcom/blankj/utilcode/util/SPUtils;

    move-result-object v0

    new-instance v1, Lcom/google/gson/Gson;

    invoke-direct {v1}, Lcom/google/gson/Gson;-><init>()V

    invoke-virtual {v3}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Lcom/blankj/utilcode/util/SPUtils;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0, v3}, Lcom/google/gson/Gson;->fromJson(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_1

    invoke-virtual {v3}, Ljava/lang/Class;->newInstance()Ljava/lang/Object;

    move-result-object v0

    :cond_1
    check-cast v0, Lcom/szabh/smable3/entity/BleCoaching;

    iput-object v0, p0, Lcom/sma/smartv3/ui/me/CoachingEditActivity;->mOriginCoaching:Lcom/szabh/smable3/entity/BleCoaching;

    return-void
.end method

.method public static synthetic I0iXXO(Lcom/sma/smartv3/ui/me/CoachingEditActivity;Landroid/text/Editable;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Lcom/sma/smartv3/ui/me/CoachingEditActivity;->mTitleTextWatcher$lambda$0(Lcom/sma/smartv3/ui/me/CoachingEditActivity;Landroid/text/Editable;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic I1XOi1(Lcom/sma/smartv3/ui/me/CoachingEditActivity;Landroid/text/Editable;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Lcom/sma/smartv3/ui/me/CoachingEditActivity;->mDescriptionTextWatcher$lambda$0(Lcom/sma/smartv3/ui/me/CoachingEditActivity;Landroid/text/Editable;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic IIX1OXO(Lcom/sma/smartv3/ui/me/CoachingEditActivity;I)Z
    .locals 0

    invoke-static {p0, p1}, Lcom/sma/smartv3/ui/me/CoachingEditActivity;->setRepeat$lambda$1$0(Lcom/sma/smartv3/ui/me/CoachingEditActivity;I)Z

    move-result p0

    return p0
.end method

.method public static synthetic O10IXXX0X(Lcom/sma/smartv3/ui/me/CoachingEditActivity;)Lcom/sma/smartv3/view/text/FontEditText;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/me/CoachingEditActivity;->edtDescription_delegate$lambda$0(Lcom/sma/smartv3/ui/me/CoachingEditActivity;)Lcom/sma/smartv3/view/text/FontEditText;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic OIX0iXi(Lcom/sma/smartv3/ui/me/CoachingEditActivity;)Lcom/sma/smartv3/view/text/FontTextView;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/me/CoachingEditActivity;->tvRepeat_delegate$lambda$0(Lcom/sma/smartv3/ui/me/CoachingEditActivity;)Lcom/sma/smartv3/view/text/FontTextView;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic X0O(Lcom/sma/smartv3/ui/me/CoachingEditActivity;)Landroid/widget/ImageView;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/me/CoachingEditActivity;->titleRight_delegate$lambda$0(Lcom/sma/smartv3/ui/me/CoachingEditActivity;)Landroid/widget/ImageView;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic X1ii(Lcom/sma/smartv3/ui/me/CoachingEditActivity;)Lcom/sma/smartv3/view/text/FontEditText;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/me/CoachingEditActivity;->edtName_delegate$lambda$0(Lcom/sma/smartv3/ui/me/CoachingEditActivity;)Lcom/sma/smartv3/view/text/FontEditText;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic XXI(Lcom/sma/smartv3/ui/me/CoachingEditActivity;)Z
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/me/CoachingEditActivity;->onTitleLeftClick$lambda$0$0(Lcom/sma/smartv3/ui/me/CoachingEditActivity;)Z

    move-result p0

    return p0
.end method

.method public static synthetic XiOIO(Lcom/sma/smartv3/ui/me/CoachingEditActivity;)Landroid/view/View;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/me/CoachingEditActivity;->btnBottom_delegate$lambda$0(Lcom/sma/smartv3/ui/me/CoachingEditActivity;)Landroid/view/View;

    move-result-object p0

    return-object p0
.end method

.method private static final btnBottom_delegate$lambda$0(Lcom/sma/smartv3/ui/me/CoachingEditActivity;)Landroid/view/View;
    .locals 1

    const v0, 0x7f0a01b9

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    return-object p0
.end method

.method private final checkFields()V
    .locals 2

    invoke-direct {p0}, Lcom/sma/smartv3/ui/me/CoachingEditActivity;->getBtnBottom()Landroid/view/View;

    move-result-object v0

    iget-object v1, p0, Lcom/sma/smartv3/ui/me/CoachingEditActivity;->mCoaching:Lcom/szabh/smable3/entity/BleCoaching;

    invoke-virtual {v1}, Lcom/szabh/smable3/entity/BleCoaching;->getMTitle()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    xor-int/lit8 v1, v1, 0x1

    invoke-virtual {v0, v1}, Landroid/view/View;->setEnabled(Z)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/me/CoachingEditActivity;->getTitleRight()Landroid/widget/ImageView;

    move-result-object v0

    invoke-direct {p0}, Lcom/sma/smartv3/ui/me/CoachingEditActivity;->getBtnBottom()Landroid/view/View;

    move-result-object v1

    invoke-virtual {v1}, Landroid/view/View;->isEnabled()Z

    move-result v1

    invoke-virtual {v0, v1}, Landroid/view/View;->setEnabled(Z)V

    return-void
.end method

.method private static final edtDescription_delegate$lambda$0(Lcom/sma/smartv3/ui/me/CoachingEditActivity;)Lcom/sma/smartv3/view/text/FontEditText;
    .locals 1

    const v0, 0x7f0a0346

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Lcom/sma/smartv3/view/text/FontEditText;

    return-object p0
.end method

.method private static final edtName_delegate$lambda$0(Lcom/sma/smartv3/ui/me/CoachingEditActivity;)Lcom/sma/smartv3/view/text/FontEditText;
    .locals 1

    const v0, 0x7f0a0348

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Lcom/sma/smartv3/view/text/FontEditText;

    return-object p0
.end method

.method private final getBtnBottom()Landroid/view/View;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/me/CoachingEditActivity;->btnBottom$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    return-object v0
.end method

.method private final getEdtDescription()Lcom/sma/smartv3/view/text/FontEditText;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/me/CoachingEditActivity;->edtDescription$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/sma/smartv3/view/text/FontEditText;

    return-object v0
.end method

.method private final getEdtName()Lcom/sma/smartv3/view/text/FontEditText;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/me/CoachingEditActivity;->edtName$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/sma/smartv3/view/text/FontEditText;

    return-object v0
.end method

.method private final getTitleRight()Landroid/widget/ImageView;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/me/CoachingEditActivity;->titleRight$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    return-object v0
.end method

.method private final getTvRepeat()Lcom/sma/smartv3/view/text/FontTextView;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/me/CoachingEditActivity;->tvRepeat$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/sma/smartv3/view/text/FontTextView;

    return-object v0
.end method

.method private static final mDescriptionTextWatcher$lambda$0(Lcom/sma/smartv3/ui/me/CoachingEditActivity;Landroid/text/Editable;)Lkotlin/Unit;
    .locals 0

    iget-object p0, p0, Lcom/sma/smartv3/ui/me/CoachingEditActivity;->mCoaching:Lcom/szabh/smable3/entity/BleCoaching;

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    if-nez p1, :cond_1

    :cond_0
    const-string p1, ""

    :cond_1
    invoke-virtual {p0, p1}, Lcom/szabh/smable3/entity/BleCoaching;->setMDescription(Ljava/lang/String;)V

    sget-object p0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p0
.end method

.method private static final mTitleTextWatcher$lambda$0(Lcom/sma/smartv3/ui/me/CoachingEditActivity;Landroid/text/Editable;)Lkotlin/Unit;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/me/CoachingEditActivity;->mCoaching:Lcom/szabh/smable3/entity/BleCoaching;

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    if-nez p1, :cond_1

    :cond_0
    const-string p1, ""

    :cond_1
    invoke-virtual {v0, p1}, Lcom/szabh/smable3/entity/BleCoaching;->setMTitle(Ljava/lang/String;)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/me/CoachingEditActivity;->checkFields()V

    sget-object p0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p0
.end method

.method private static final onTitleLeftClick$lambda$0$0(Lcom/sma/smartv3/ui/me/CoachingEditActivity;)Z
    .locals 0

    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    const/4 p0, 0x1

    return p0
.end method

.method private final save()V
    .locals 4

    sget-object v0, Lcom/android/mltcode/paycertificationapi/a01;->OXO1:Lcom/android/mltcode/paycertificationapi/a01;

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/a01;->XO0O10()Lcom/blankj/utilcode/util/SPUtils;

    move-result-object v0

    iget-object v1, p0, Lcom/sma/smartv3/ui/me/CoachingEditActivity;->mCoaching:Lcom/szabh/smable3/entity/BleCoaching;

    const-class v2, Lcom/szabh/smable3/entity/BleCoaching;

    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v2

    new-instance v3, Lcom/google/gson/Gson;

    invoke-direct {v3}, Lcom/google/gson/Gson;-><init>()V

    invoke-virtual {v3, v1}, Lcom/google/gson/Gson;->toJson(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v2, v1}, Lcom/blankj/utilcode/util/SPUtils;->put(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method private static final setRepeat$lambda$1$0(Lcom/sma/smartv3/ui/me/CoachingEditActivity;I)Z
    .locals 3

    invoke-direct {p0}, Lcom/sma/smartv3/ui/me/CoachingEditActivity;->getTvRepeat()Lcom/sma/smartv3/view/text/FontTextView;

    move-result-object v0

    const/4 v1, 0x1

    add-int/2addr p1, v1

    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object p0, p0, Lcom/sma/smartv3/ui/me/CoachingEditActivity;->mCoaching:Lcom/szabh/smable3/entity/BleCoaching;

    invoke-virtual {p0, p1}, Lcom/szabh/smable3/entity/BleCoaching;->setMRepeat(I)V

    return v1
.end method

.method private static final titleRight_delegate$lambda$0(Lcom/sma/smartv3/ui/me/CoachingEditActivity;)Landroid/widget/ImageView;
    .locals 1

    const v0, 0x7f0a0026

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/ImageView;

    return-object p0
.end method

.method private static final tvRepeat_delegate$lambda$0(Lcom/sma/smartv3/ui/me/CoachingEditActivity;)Lcom/sma/smartv3/view/text/FontTextView;
    .locals 1

    const v0, 0x7f0a0cf9

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Lcom/sma/smartv3/view/text/FontTextView;

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
    .locals 3

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseActivity;->getMArg1()I

    move-result v0

    const v1, 0x7f0a0023

    if-gez v0, :cond_0

    invoke-virtual {p0, v1}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    const v1, 0x7f14007f

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    goto :goto_0

    :cond_0
    invoke-virtual {p0, v1}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    const v1, 0x7f1404b8

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    :goto_0
    invoke-direct {p0}, Lcom/sma/smartv3/ui/me/CoachingEditActivity;->getTitleRight()Landroid/widget/ImageView;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    const v1, 0x7f080ffc

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/me/CoachingEditActivity;->getEdtName()Lcom/sma/smartv3/view/text/FontEditText;

    move-result-object v0

    iget-object v1, p0, Lcom/sma/smartv3/ui/me/CoachingEditActivity;->mCoaching:Lcom/szabh/smable3/entity/BleCoaching;

    invoke-virtual {v1}, Lcom/szabh/smable3/entity/BleCoaching;->getMTitle()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/me/CoachingEditActivity;->getTvRepeat()Lcom/sma/smartv3/view/text/FontTextView;

    move-result-object v0

    iget-object v1, p0, Lcom/sma/smartv3/ui/me/CoachingEditActivity;->mCoaching:Lcom/szabh/smable3/entity/BleCoaching;

    invoke-virtual {v1}, Lcom/szabh/smable3/entity/BleCoaching;->getMRepeat()I

    move-result v1

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/me/CoachingEditActivity;->getEdtDescription()Lcom/sma/smartv3/view/text/FontEditText;

    move-result-object v0

    iget-object v1, p0, Lcom/sma/smartv3/ui/me/CoachingEditActivity;->mCoaching:Lcom/szabh/smable3/entity/BleCoaching;

    invoke-virtual {v1}, Lcom/szabh/smable3/entity/BleCoaching;->getMDescription()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/me/CoachingEditActivity;->getEdtName()Lcom/sma/smartv3/view/text/FontEditText;

    move-result-object v0

    const-string v1, "<get-edtName>(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v1, p0, Lcom/sma/smartv3/ui/me/CoachingEditActivity;->mTitleTextWatcher:Lkotlin/jvm/functions/Function1;

    new-instance v2, Lcom/sma/smartv3/ui/me/CoachingEditActivity$OXO1;

    invoke-direct {v2, v1}, Lcom/sma/smartv3/ui/me/CoachingEditActivity$OXO1;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->addTextChangedListener(Landroid/text/TextWatcher;)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/me/CoachingEditActivity;->getEdtDescription()Lcom/sma/smartv3/view/text/FontEditText;

    move-result-object v0

    const-string v1, "<get-edtDescription>(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v1, p0, Lcom/sma/smartv3/ui/me/CoachingEditActivity;->mDescriptionTextWatcher:Lkotlin/jvm/functions/Function1;

    new-instance v2, Lcom/sma/smartv3/ui/me/CoachingEditActivity$XIi00iiXO;

    invoke-direct {v2, v1}, Lcom/sma/smartv3/ui/me/CoachingEditActivity$XIi00iiXO;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->addTextChangedListener(Landroid/text/TextWatcher;)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/me/CoachingEditActivity;->checkFields()V

    return-void
.end method

.method public layoutId()I
    .locals 1

    const v0, 0x7f0d0048

    return v0
.end method

.method public onActivityResult(IILandroid/content/Intent;)V
    .locals 0
    .param p3    # Landroid/content/Intent;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param

    invoke-super {p0, p1, p2, p3}, Landroidx/fragment/app/FragmentActivity;->onActivityResult(IILandroid/content/Intent;)V

    const/4 p1, -0x1

    if-ne p2, p1, :cond_0

    invoke-virtual {p0, p1}, Landroid/app/Activity;->setResult(I)V

    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    :cond_0
    return-void
.end method

.method public final onBottomClick(Landroid/view/View;)V
    .locals 1
    .param p1    # Landroid/view/View;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "view"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/me/CoachingEditActivity;->save()V

    new-instance p1, Landroid/content/Intent;

    const-class v0, Lcom/sma/smartv3/ui/me/CoachingSegmentsActivity;

    invoke-direct {p1, p0, v0}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, Landroid/app/Activity;->startActivityForResult(Landroid/content/Intent;I)V

    return-void
.end method

.method public final onTitleLeftClick(Landroid/view/View;)V
    .locals 4
    .param p1    # Landroid/view/View;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "view"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, Lcom/sma/smartv3/ui/me/CoachingEditActivity;->mCoaching:Lcom/szabh/smable3/entity/BleCoaching;

    iget-object v0, p0, Lcom/sma/smartv3/ui/me/CoachingEditActivity;->mOriginCoaching:Lcom/szabh/smable3/entity/BleCoaching;

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    return-void

    :cond_0
    iget-object p1, p0, Lcom/sma/smartv3/ui/me/CoachingEditActivity;->mDiscardChangesPopup:Lcom/android/mltcode/paycertificationapi/go0;

    if-nez p1, :cond_1

    new-instance p1, Lcom/android/mltcode/paycertificationapi/go0;

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseActivity;->getMContext()Landroid/app/Activity;

    move-result-object v0

    const/4 v1, 0x0

    const/4 v2, 0x2

    const/4 v3, 0x0

    invoke-direct {p1, v0, v1, v2, v3}, Lcom/android/mltcode/paycertificationapi/go0;-><init>(Landroid/app/Activity;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const v0, 0x7f140460

    invoke-virtual {p1, v0}, Lcom/android/mltcode/paycertificationapi/go0;->O1O(I)V

    const v0, 0x7f14027f

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {p1, v0, v3, v2, v3}, Lcom/android/mltcode/paycertificationapi/go0;->X11iII1O1(Lcom/android/mltcode/paycertificationapi/go0;Ljava/lang/Integer;Lkotlin/jvm/functions/Function0;ILjava/lang/Object;)V

    new-instance v0, Lcom/android/mltcode/paycertificationapi/XIO0O11;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/XIO0O11;-><init>(Lcom/sma/smartv3/ui/me/CoachingEditActivity;)V

    const v1, 0x7f14034b

    invoke-virtual {p1, v1, v0}, Lcom/android/mltcode/paycertificationapi/go0;->X1IX(ILkotlin/jvm/functions/Function0;)V

    iput-object p1, p0, Lcom/sma/smartv3/ui/me/CoachingEditActivity;->mDiscardChangesPopup:Lcom/android/mltcode/paycertificationapi/go0;

    :cond_1
    iget-object p1, p0, Lcom/sma/smartv3/ui/me/CoachingEditActivity;->mDiscardChangesPopup:Lcom/android/mltcode/paycertificationapi/go0;

    if-eqz p1, :cond_2

    invoke-virtual {p1}, Lcom/android/mltcode/paycertificationapi/OIXIOIO;->IIX1OXO()V

    :cond_2
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

    invoke-direct {p0}, Lcom/sma/smartv3/ui/me/CoachingEditActivity;->save()V

    const/4 p1, -0x1

    invoke-virtual {p0, p1}, Landroid/app/Activity;->setResult(I)V

    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    return-void
.end method

.method public final setRepeat(Landroid/view/View;)V
    .locals 3
    .param p1    # Landroid/view/View;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "view"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, Lcom/sma/smartv3/ui/me/CoachingEditActivity;->mRepeatPopup:Lcom/android/mltcode/paycertificationapi/qv1;

    if-nez p1, :cond_1

    new-instance p1, Ljava/util/ArrayList;

    const/16 v0, 0x14

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

    const p1, 0x7f141190

    invoke-virtual {v0, p1}, Lcom/android/mltcode/paycertificationapi/qv1;->IXXOO(I)V

    const p1, 0x7f141344

    invoke-virtual {v0, p1}, Lcom/android/mltcode/paycertificationapi/qv1;->iOO1ii1(I)V

    new-instance p1, Lcom/android/mltcode/paycertificationapi/XXIXI;

    invoke-direct {p1, p0}, Lcom/android/mltcode/paycertificationapi/XXIXI;-><init>(Lcom/sma/smartv3/ui/me/CoachingEditActivity;)V

    invoke-virtual {v0, p1}, Lcom/android/mltcode/paycertificationapi/qv1;->iX(Lkotlin/jvm/functions/Function1;)V

    iput-object v0, p0, Lcom/sma/smartv3/ui/me/CoachingEditActivity;->mRepeatPopup:Lcom/android/mltcode/paycertificationapi/qv1;

    :cond_1
    iget-object p1, p0, Lcom/sma/smartv3/ui/me/CoachingEditActivity;->mRepeatPopup:Lcom/android/mltcode/paycertificationapi/qv1;

    if-eqz p1, :cond_2

    iget-object v0, p0, Lcom/sma/smartv3/ui/me/CoachingEditActivity;->mCoaching:Lcom/szabh/smable3/entity/BleCoaching;

    invoke-virtual {v0}, Lcom/szabh/smable3/entity/BleCoaching;->getMRepeat()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    invoke-virtual {p1, v0}, Lcom/android/mltcode/paycertificationapi/qv1;->O1O(I)V

    invoke-virtual {p1}, Lcom/android/mltcode/paycertificationapi/OIXIOIO;->IIX1OXO()V

    :cond_2
    return-void
.end method
