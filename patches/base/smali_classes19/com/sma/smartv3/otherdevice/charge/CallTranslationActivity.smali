.class public final Lcom/sma/smartv3/otherdevice/charge/CallTranslationActivity;
.super Lcom/bestmafen/androidbase/base/BaseActivity;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nCallTranslationActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CallTranslationActivity.kt\ncom/sma/smartv3/otherdevice/charge/CallTranslationActivity\n+ 2 Activity.kt\ncom/bestmafen/androidbase/extension/ActivityKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,186:1\n87#2,7:187\n94#2,3:195\n70#2,7:198\n97#2:205\n173#2,7:206\n180#2,3:214\n143#2,7:217\n183#2:224\n173#2,7:225\n180#2,3:233\n143#2,7:236\n183#2:243\n1#3:194\n1#3:213\n1#3:232\n*S KotlinDebug\n*F\n+ 1 CallTranslationActivity.kt\ncom/sma/smartv3/otherdevice/charge/CallTranslationActivity\n*L\n87#1:187,7\n87#1:195,3\n87#1:198,7\n87#1:205\n111#1:206,7\n111#1:214,3\n111#1:217,7\n111#1:224\n114#1:225,7\n114#1:233,3\n114#1:236,7\n114#1:243\n87#1:194\n111#1:213\n114#1:232\n*E\n"
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nCallTranslationActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CallTranslationActivity.kt\ncom/sma/smartv3/otherdevice/charge/CallTranslationActivity\n+ 2 Activity.kt\ncom/bestmafen/androidbase/extension/ActivityKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,186:1\n87#2,7:187\n94#2,3:195\n70#2,7:198\n97#2:205\n173#2,7:206\n180#2,3:214\n143#2,7:217\n183#2:224\n173#2,7:225\n180#2,3:233\n143#2,7:236\n183#2:243\n1#3:194\n1#3:213\n1#3:232\n*S KotlinDebug\n*F\n+ 1 CallTranslationActivity.kt\ncom/sma/smartv3/otherdevice/charge/CallTranslationActivity\n*L\n87#1:187,7\n87#1:195,3\n87#1:198,7\n87#1:205\n111#1:206,7\n111#1:214,3\n111#1:217,7\n111#1:224\n114#1:225,7\n114#1:233,3\n114#1:236,7\n114#1:243\n87#1:194\n111#1:213\n114#1:232\n*E\n"
    }
.end annotation


# instance fields
.field private final CODE_LEFT_LANGUAGE:I

.field private final CODE_RIGHT_LANGUAGE:I

.field private final abhTitleCenter$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final abhTitleRight$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final callMeLanguage$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final callOtherLanguage$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public mLanguageTranslationList:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/sma/smartv3/model/LanguageTranslationData;",
            ">;"
        }
    .end annotation
.end field

.field public mLeftLanguage:Lcom/sma/smartv3/model/LanguageTranslationData;

.field private mMode:Ljava/lang/String;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public mRightLanguage:Lcom/sma/smartv3/model/LanguageTranslationData;

.field private final modelVideoCall$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final modelVoiceCall$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lcom/bestmafen/androidbase/base/BaseActivity;-><init>()V

    new-instance v0, Lcom/android/mltcode/paycertificationapi/OIOX0OIiI;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/OIOX0OIiI;-><init>(Lcom/sma/smartv3/otherdevice/charge/CallTranslationActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/otherdevice/charge/CallTranslationActivity;->abhTitleCenter$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/XOXI0I;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/XOXI0I;-><init>(Lcom/sma/smartv3/otherdevice/charge/CallTranslationActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/otherdevice/charge/CallTranslationActivity;->abhTitleRight$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/OO11Oii;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/OO11Oii;-><init>(Lcom/sma/smartv3/otherdevice/charge/CallTranslationActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/otherdevice/charge/CallTranslationActivity;->callMeLanguage$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/O01i;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/O01i;-><init>(Lcom/sma/smartv3/otherdevice/charge/CallTranslationActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/otherdevice/charge/CallTranslationActivity;->callOtherLanguage$delegate:Lkotlin/Lazy;

    const-string v0, "video"

    iput-object v0, p0, Lcom/sma/smartv3/otherdevice/charge/CallTranslationActivity;->mMode:Ljava/lang/String;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/IIIXiOI1i;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/IIIXiOI1i;-><init>(Lcom/sma/smartv3/otherdevice/charge/CallTranslationActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/otherdevice/charge/CallTranslationActivity;->modelVideoCall$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/X1i1X10iX;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/X1i1X10iX;-><init>(Lcom/sma/smartv3/otherdevice/charge/CallTranslationActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/otherdevice/charge/CallTranslationActivity;->modelVoiceCall$delegate:Lkotlin/Lazy;

    const/16 v0, 0x67

    iput v0, p0, Lcom/sma/smartv3/otherdevice/charge/CallTranslationActivity;->CODE_LEFT_LANGUAGE:I

    const/16 v0, 0x69

    iput v0, p0, Lcom/sma/smartv3/otherdevice/charge/CallTranslationActivity;->CODE_RIGHT_LANGUAGE:I

    return-void
.end method

.method public static synthetic I0iXXO(Lcom/sma/smartv3/otherdevice/charge/CallTranslationActivity;Landroid/view/View;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/sma/smartv3/otherdevice/charge/CallTranslationActivity;->initView$lambda$3(Lcom/sma/smartv3/otherdevice/charge/CallTranslationActivity;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic I1XOi1(Lcom/sma/smartv3/otherdevice/charge/CallTranslationActivity;)Landroid/widget/TextView;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/otherdevice/charge/CallTranslationActivity;->callMeLanguage_delegate$lambda$0(Lcom/sma/smartv3/otherdevice/charge/CallTranslationActivity;)Landroid/widget/TextView;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic IIX1OXO(Lcom/sma/smartv3/otherdevice/charge/CallTranslationActivity;Landroid/view/View;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/sma/smartv3/otherdevice/charge/CallTranslationActivity;->initView$lambda$1(Lcom/sma/smartv3/otherdevice/charge/CallTranslationActivity;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic O10IXXX0X(Lcom/sma/smartv3/otherdevice/charge/CallTranslationActivity;Lcom/bestmafen/androidbase/extension/PermissionStatus;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Lcom/sma/smartv3/otherdevice/charge/CallTranslationActivity;->permission$lambda$0(Lcom/sma/smartv3/otherdevice/charge/CallTranslationActivity;Lcom/bestmafen/androidbase/extension/PermissionStatus;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic OIX0iXi(Lcom/sma/smartv3/otherdevice/charge/CallTranslationActivity;)Landroid/widget/TextView;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/otherdevice/charge/CallTranslationActivity;->callOtherLanguage_delegate$lambda$0(Lcom/sma/smartv3/otherdevice/charge/CallTranslationActivity;)Landroid/widget/TextView;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic OiIIX101O(Lcom/sma/smartv3/otherdevice/charge/CallTranslationActivity;)Landroid/widget/ImageView;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/otherdevice/charge/CallTranslationActivity;->abhTitleRight_delegate$lambda$0(Lcom/sma/smartv3/otherdevice/charge/CallTranslationActivity;)Landroid/widget/ImageView;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic X0O(Lcom/sma/smartv3/otherdevice/charge/CallTranslationActivity;)Landroid/widget/TextView;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/otherdevice/charge/CallTranslationActivity;->modelVoiceCall_delegate$lambda$0(Lcom/sma/smartv3/otherdevice/charge/CallTranslationActivity;)Landroid/widget/TextView;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic X1ii(Lcom/sma/smartv3/otherdevice/charge/CallTranslationActivity;Landroid/view/View;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/sma/smartv3/otherdevice/charge/CallTranslationActivity;->initView$lambda$2(Lcom/sma/smartv3/otherdevice/charge/CallTranslationActivity;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic XX0(Lcom/sma/smartv3/otherdevice/charge/CallTranslationActivity;)Lcom/sma/smartv3/view/text/PFMedium;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/otherdevice/charge/CallTranslationActivity;->abhTitleCenter_delegate$lambda$0(Lcom/sma/smartv3/otherdevice/charge/CallTranslationActivity;)Lcom/sma/smartv3/view/text/PFMedium;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic XXI(Lcom/sma/smartv3/otherdevice/charge/CallTranslationActivity;Landroid/view/View;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/sma/smartv3/otherdevice/charge/CallTranslationActivity;->initView$lambda$0(Lcom/sma/smartv3/otherdevice/charge/CallTranslationActivity;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic XiOIO(Lcom/sma/smartv3/otherdevice/charge/CallTranslationActivity;Lcom/sma/smartv3/model/AITranslationUrl;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Lcom/sma/smartv3/otherdevice/charge/CallTranslationActivity;->getCallTranslationUrl$lambda$0(Lcom/sma/smartv3/otherdevice/charge/CallTranslationActivity;Lcom/sma/smartv3/model/AITranslationUrl;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method private static final abhTitleCenter_delegate$lambda$0(Lcom/sma/smartv3/otherdevice/charge/CallTranslationActivity;)Lcom/sma/smartv3/view/text/PFMedium;
    .locals 1

    const v0, 0x7f0a0023

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Lcom/sma/smartv3/view/text/PFMedium;

    return-object p0
.end method

.method private static final abhTitleRight_delegate$lambda$0(Lcom/sma/smartv3/otherdevice/charge/CallTranslationActivity;)Landroid/widget/ImageView;
    .locals 1

    const v0, 0x7f0a0026

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/ImageView;

    return-object p0
.end method

.method private static final callMeLanguage_delegate$lambda$0(Lcom/sma/smartv3/otherdevice/charge/CallTranslationActivity;)Landroid/widget/TextView;
    .locals 1

    const v0, 0x7f0a0bed

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/TextView;

    return-object p0
.end method

.method private static final callOtherLanguage_delegate$lambda$0(Lcom/sma/smartv3/otherdevice/charge/CallTranslationActivity;)Landroid/widget/TextView;
    .locals 1

    const v0, 0x7f0a0bee

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/TextView;

    return-object p0
.end method

.method private final getAbhTitleCenter()Lcom/sma/smartv3/view/text/PFMedium;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/otherdevice/charge/CallTranslationActivity;->abhTitleCenter$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/sma/smartv3/view/text/PFMedium;

    return-object v0
.end method

.method private final getAbhTitleRight()Landroid/widget/ImageView;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/otherdevice/charge/CallTranslationActivity;->abhTitleRight$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    return-object v0
.end method

.method private final getCallMeLanguage()Landroid/widget/TextView;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/otherdevice/charge/CallTranslationActivity;->callMeLanguage$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    return-object v0
.end method

.method private final getCallOtherLanguage()Landroid/widget/TextView;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/otherdevice/charge/CallTranslationActivity;->callOtherLanguage$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    return-object v0
.end method

.method private final getCallTranslationUrl()V
    .locals 5

    sget-object v0, Lcom/android/mltcode/paycertificationapi/i72;->OXO1:Lcom/android/mltcode/paycertificationapi/i72;

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/i72;->O001I()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v0

    if-nez v0, :cond_0

    const v0, 0x7f140e38

    invoke-static {v0}, Lcom/blankj/utilcode/util/ToastUtils;->showLong(I)V

    return-void

    :cond_0
    sget-object v0, Lcom/sma/smartv3/biz/AIManager;->OXO1:Lcom/sma/smartv3/biz/AIManager;

    invoke-virtual {p0}, Lcom/sma/smartv3/otherdevice/charge/CallTranslationActivity;->getMLeftLanguage()Lcom/sma/smartv3/model/LanguageTranslationData;

    move-result-object v1

    invoke-virtual {v1}, Lcom/sma/smartv3/model/LanguageTranslationData;->getAsrLanguage()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0}, Lcom/sma/smartv3/otherdevice/charge/CallTranslationActivity;->getMRightLanguage()Lcom/sma/smartv3/model/LanguageTranslationData;

    move-result-object v2

    invoke-virtual {v2}, Lcom/sma/smartv3/model/LanguageTranslationData;->getAsrLanguage()Ljava/lang/String;

    move-result-object v2

    iget-object v3, p0, Lcom/sma/smartv3/otherdevice/charge/CallTranslationActivity;->mMode:Ljava/lang/String;

    new-instance v4, Lcom/android/mltcode/paycertificationapi/OXOi0;

    invoke-direct {v4, p0}, Lcom/android/mltcode/paycertificationapi/OXOi0;-><init>(Lcom/sma/smartv3/otherdevice/charge/CallTranslationActivity;)V

    invoke-virtual {v0, v1, v2, v3, v4}, Lcom/sma/smartv3/biz/AIManager;->X0O(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V

    return-void
.end method

.method private static final getCallTranslationUrl$lambda$0(Lcom/sma/smartv3/otherdevice/charge/CallTranslationActivity;Lcom/sma/smartv3/model/AITranslationUrl;)Lkotlin/Unit;
    .locals 3

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Lcom/sma/smartv3/model/AITranslationUrl;->getCreateUrl()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Landroid/os/Bundle;

    invoke-direct {v1}, Landroid/os/Bundle;-><init>()V

    const-string v2, "mArg0"

    invoke-virtual {v1, v2, v0}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "mArg1"

    const/4 v2, 0x2

    invoke-virtual {v1, v0, v2}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    const-string v0, "mArg2"

    const/4 v2, 0x0

    invoke-virtual {v1, v0, v2}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    const-string v0, "mArg3"

    invoke-virtual {v1, v0, p1}, Landroid/os/Bundle;->putSerializable(Ljava/lang/String;Ljava/io/Serializable;)V

    new-instance p1, Landroid/content/Intent;

    const-class v0, Lcom/sma/smartv3/otherdevice/charge/WebTranslationActivity;

    invoke-direct {p1, p0, v0}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    invoke-virtual {p1, v1}, Landroid/content/Intent;->putExtras(Landroid/os/Bundle;)Landroid/content/Intent;

    invoke-virtual {p0, p1}, Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V

    goto :goto_0

    :cond_0
    const p0, 0x7f1414af

    invoke-static {p0}, Lcom/blankj/utilcode/util/ToastUtils;->showLong(I)V

    :goto_0
    sget-object p0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p0
.end method

.method private final getModelVideoCall()Landroid/widget/TextView;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/otherdevice/charge/CallTranslationActivity;->modelVideoCall$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    return-object v0
.end method

.method private final getModelVoiceCall()Landroid/widget/TextView;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/otherdevice/charge/CallTranslationActivity;->modelVoiceCall$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    return-object v0
.end method

.method public static synthetic iIiiO(Lcom/sma/smartv3/otherdevice/charge/CallTranslationActivity;)Landroid/widget/TextView;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/otherdevice/charge/CallTranslationActivity;->modelVideoCall_delegate$lambda$0(Lcom/sma/smartv3/otherdevice/charge/CallTranslationActivity;)Landroid/widget/TextView;

    move-result-object p0

    return-object p0
.end method

.method private static final initView$lambda$0(Lcom/sma/smartv3/otherdevice/charge/CallTranslationActivity;Landroid/view/View;)V
    .locals 5

    iget p1, p0, Lcom/sma/smartv3/otherdevice/charge/CallTranslationActivity;->CODE_LEFT_LANGUAGE:I

    invoke-virtual {p0}, Lcom/sma/smartv3/otherdevice/charge/CallTranslationActivity;->getMLeftLanguage()Lcom/sma/smartv3/model/LanguageTranslationData;

    move-result-object v0

    new-instance v1, Landroid/os/Bundle;

    invoke-direct {v1}, Landroid/os/Bundle;-><init>()V

    const-string v2, "mArg0"

    const/4 v3, 0x0

    invoke-virtual {v1, v2, v3}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const-string v2, "mArg1"

    const/4 v4, 0x1

    invoke-virtual {v1, v2, v4}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    const-string v2, "mArg2"

    invoke-virtual {v1, v2, v3}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    const-string v2, "mArg3"

    invoke-virtual {v1, v2, v0}, Landroid/os/Bundle;->putSerializable(Ljava/lang/String;Ljava/io/Serializable;)V

    new-instance v0, Landroid/content/Intent;

    const-class v2, Lcom/sma/smartv3/otherdevice/charge/ChooseLanguageActivity;

    invoke-direct {v0, p0, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    invoke-virtual {v0, v1}, Landroid/content/Intent;->putExtras(Landroid/os/Bundle;)Landroid/content/Intent;

    invoke-virtual {p0, v0, p1}, Landroid/app/Activity;->startActivityForResult(Landroid/content/Intent;I)V

    return-void
.end method

.method private static final initView$lambda$1(Lcom/sma/smartv3/otherdevice/charge/CallTranslationActivity;Landroid/view/View;)V
    .locals 5

    iget p1, p0, Lcom/sma/smartv3/otherdevice/charge/CallTranslationActivity;->CODE_RIGHT_LANGUAGE:I

    invoke-virtual {p0}, Lcom/sma/smartv3/otherdevice/charge/CallTranslationActivity;->getMRightLanguage()Lcom/sma/smartv3/model/LanguageTranslationData;

    move-result-object v0

    new-instance v1, Landroid/os/Bundle;

    invoke-direct {v1}, Landroid/os/Bundle;-><init>()V

    const-string v2, "mArg0"

    const/4 v3, 0x0

    invoke-virtual {v1, v2, v3}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const-string v2, "mArg1"

    const/4 v4, 0x1

    invoke-virtual {v1, v2, v4}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    const-string v2, "mArg2"

    invoke-virtual {v1, v2, v3}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    const-string v2, "mArg3"

    invoke-virtual {v1, v2, v0}, Landroid/os/Bundle;->putSerializable(Ljava/lang/String;Ljava/io/Serializable;)V

    new-instance v0, Landroid/content/Intent;

    const-class v2, Lcom/sma/smartv3/otherdevice/charge/ChooseLanguageActivity;

    invoke-direct {v0, p0, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    invoke-virtual {v0, v1}, Landroid/content/Intent;->putExtras(Landroid/os/Bundle;)Landroid/content/Intent;

    invoke-virtual {p0, v0, p1}, Landroid/app/Activity;->startActivityForResult(Landroid/content/Intent;I)V

    return-void
.end method

.method private static final initView$lambda$2(Lcom/sma/smartv3/otherdevice/charge/CallTranslationActivity;Landroid/view/View;)V
    .locals 1

    const-string p1, "video"

    iput-object p1, p0, Lcom/sma/smartv3/otherdevice/charge/CallTranslationActivity;->mMode:Ljava/lang/String;

    invoke-direct {p0}, Lcom/sma/smartv3/otherdevice/charge/CallTranslationActivity;->getModelVideoCall()Landroid/widget/TextView;

    move-result-object p1

    const-string v0, "<get-modelVideoCall>(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    const v0, 0x7f08100f

    invoke-direct {p0, p1, v0}, Lcom/sma/smartv3/otherdevice/charge/CallTranslationActivity;->setDrawableLeft(Landroid/widget/TextView;I)V

    invoke-direct {p0}, Lcom/sma/smartv3/otherdevice/charge/CallTranslationActivity;->getModelVoiceCall()Landroid/widget/TextView;

    move-result-object p1

    const-string v0, "<get-modelVoiceCall>(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    const v0, 0x7f08100e

    invoke-direct {p0, p1, v0}, Lcom/sma/smartv3/otherdevice/charge/CallTranslationActivity;->setDrawableLeft(Landroid/widget/TextView;I)V

    return-void
.end method

.method private static final initView$lambda$3(Lcom/sma/smartv3/otherdevice/charge/CallTranslationActivity;Landroid/view/View;)V
    .locals 1

    const-string p1, "audio"

    iput-object p1, p0, Lcom/sma/smartv3/otherdevice/charge/CallTranslationActivity;->mMode:Ljava/lang/String;

    invoke-direct {p0}, Lcom/sma/smartv3/otherdevice/charge/CallTranslationActivity;->getModelVoiceCall()Landroid/widget/TextView;

    move-result-object p1

    const-string v0, "<get-modelVoiceCall>(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    const v0, 0x7f08100f

    invoke-direct {p0, p1, v0}, Lcom/sma/smartv3/otherdevice/charge/CallTranslationActivity;->setDrawableLeft(Landroid/widget/TextView;I)V

    invoke-direct {p0}, Lcom/sma/smartv3/otherdevice/charge/CallTranslationActivity;->getModelVideoCall()Landroid/widget/TextView;

    move-result-object p1

    const-string v0, "<get-modelVideoCall>(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    const v0, 0x7f08100e

    invoke-direct {p0, p1, v0}, Lcom/sma/smartv3/otherdevice/charge/CallTranslationActivity;->setDrawableLeft(Landroid/widget/TextView;I)V

    return-void
.end method

.method private static final modelVideoCall_delegate$lambda$0(Lcom/sma/smartv3/otherdevice/charge/CallTranslationActivity;)Landroid/widget/TextView;
    .locals 1

    const v0, 0x7f0a0bef

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/TextView;

    return-object p0
.end method

.method private static final modelVoiceCall_delegate$lambda$0(Lcom/sma/smartv3/otherdevice/charge/CallTranslationActivity;)Landroid/widget/TextView;
    .locals 1

    const v0, 0x7f0a0bf0

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/TextView;

    return-object p0
.end method

.method private final permission()V
    .locals 4

    const-string v0, "MICROPHONE"

    const-string v1, "CAMERA"

    filled-new-array {v0, v1}, [Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/blankj/utilcode/util/PermissionUtils;->permission([Ljava/lang/String;)Lcom/blankj/utilcode/util/PermissionUtils;

    move-result-object v0

    const-string v1, "permission(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    const v1, 0x7f140f4b

    invoke-virtual {p0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "getString(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    const v3, 0x7f140f4a

    invoke-virtual {p0, v3}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3, v2}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v2, Lcom/android/mltcode/paycertificationapi/IiiOXXi;

    invoke-direct {v2, p0}, Lcom/android/mltcode/paycertificationapi/IiiOXXi;-><init>(Lcom/sma/smartv3/otherdevice/charge/CallTranslationActivity;)V

    invoke-static {v0, v1, v3, v2}, Lcom/android/mltcode/paycertificationapi/ds1;->XIi00iiXO(Lcom/blankj/utilcode/util/PermissionUtils;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V

    return-void
.end method

.method private static final permission$lambda$0(Lcom/sma/smartv3/otherdevice/charge/CallTranslationActivity;Lcom/bestmafen/androidbase/extension/PermissionStatus;)Lkotlin/Unit;
    .locals 1

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/bestmafen/androidbase/extension/PermissionStatus;->GRANTED:Lcom/bestmafen/androidbase/extension/PermissionStatus;

    if-ne p1, v0, :cond_0

    invoke-direct {p0}, Lcom/sma/smartv3/otherdevice/charge/CallTranslationActivity;->getCallTranslationUrl()V

    :cond_0
    sget-object p0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p0
.end method

.method private final setDrawableLeft(Landroid/widget/TextView;I)V
    .locals 1

    const/4 v0, 0x0

    invoke-virtual {p1, p2, v0, v0, v0}, Landroid/widget/TextView;->setCompoundDrawablesWithIntrinsicBounds(IIII)V

    return-void
.end method


# virtual methods
.method public final getMLanguageTranslationList()Ljava/util/List;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/sma/smartv3/model/LanguageTranslationData;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/otherdevice/charge/CallTranslationActivity;->mLanguageTranslationList:Ljava/util/List;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "mLanguageTranslationList"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    const/4 v0, 0x0

    return-object v0
.end method

.method public final getMLeftLanguage()Lcom/sma/smartv3/model/LanguageTranslationData;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/otherdevice/charge/CallTranslationActivity;->mLeftLanguage:Lcom/sma/smartv3/model/LanguageTranslationData;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "mLeftLanguage"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    const/4 v0, 0x0

    return-object v0
.end method

.method public final getMRightLanguage()Lcom/sma/smartv3/model/LanguageTranslationData;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/otherdevice/charge/CallTranslationActivity;->mRightLanguage:Lcom/sma/smartv3/model/LanguageTranslationData;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "mRightLanguage"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    const/4 v0, 0x0

    return-object v0
.end method

.method public init(Landroid/os/Bundle;)V
    .locals 0
    .param p1    # Landroid/os/Bundle;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param

    return-void
.end method

.method public initView()V
    .locals 2

    invoke-static {}, Lcom/sma/smartv3/model/LanguageTranslationKt;->getCallTranslationLanguageList()Ljava/util/List;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/sma/smartv3/otherdevice/charge/CallTranslationActivity;->setMLanguageTranslationList(Ljava/util/List;)V

    invoke-virtual {p0}, Lcom/sma/smartv3/otherdevice/charge/CallTranslationActivity;->getMLanguageTranslationList()Ljava/util/List;

    move-result-object v0

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/sma/smartv3/model/LanguageTranslationData;

    invoke-virtual {p0, v0}, Lcom/sma/smartv3/otherdevice/charge/CallTranslationActivity;->setMLeftLanguage(Lcom/sma/smartv3/model/LanguageTranslationData;)V

    invoke-virtual {p0}, Lcom/sma/smartv3/otherdevice/charge/CallTranslationActivity;->getMLanguageTranslationList()Ljava/util/List;

    move-result-object v0

    const/4 v1, 0x1

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/sma/smartv3/model/LanguageTranslationData;

    invoke-virtual {p0, v0}, Lcom/sma/smartv3/otherdevice/charge/CallTranslationActivity;->setMRightLanguage(Lcom/sma/smartv3/model/LanguageTranslationData;)V

    invoke-direct {p0}, Lcom/sma/smartv3/otherdevice/charge/CallTranslationActivity;->getAbhTitleCenter()Lcom/sma/smartv3/view/text/PFMedium;

    move-result-object v0

    const v1, 0x7f140273

    invoke-virtual {p0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    invoke-direct {p0}, Lcom/sma/smartv3/otherdevice/charge/CallTranslationActivity;->getCallMeLanguage()Landroid/widget/TextView;

    move-result-object v0

    invoke-virtual {p0}, Lcom/sma/smartv3/otherdevice/charge/CallTranslationActivity;->getMLeftLanguage()Lcom/sma/smartv3/model/LanguageTranslationData;

    move-result-object v1

    invoke-virtual {v1}, Lcom/sma/smartv3/model/LanguageTranslationData;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    invoke-direct {p0}, Lcom/sma/smartv3/otherdevice/charge/CallTranslationActivity;->getCallOtherLanguage()Landroid/widget/TextView;

    move-result-object v0

    invoke-virtual {p0}, Lcom/sma/smartv3/otherdevice/charge/CallTranslationActivity;->getMRightLanguage()Lcom/sma/smartv3/model/LanguageTranslationData;

    move-result-object v1

    invoke-virtual {v1}, Lcom/sma/smartv3/model/LanguageTranslationData;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    invoke-direct {p0}, Lcom/sma/smartv3/otherdevice/charge/CallTranslationActivity;->getCallMeLanguage()Landroid/widget/TextView;

    move-result-object v0

    new-instance v1, Lcom/android/mltcode/paycertificationapi/X01OOIi;

    invoke-direct {v1, p0}, Lcom/android/mltcode/paycertificationapi/X01OOIi;-><init>(Lcom/sma/smartv3/otherdevice/charge/CallTranslationActivity;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    invoke-direct {p0}, Lcom/sma/smartv3/otherdevice/charge/CallTranslationActivity;->getCallOtherLanguage()Landroid/widget/TextView;

    move-result-object v0

    new-instance v1, Lcom/android/mltcode/paycertificationapi/Xi111;

    invoke-direct {v1, p0}, Lcom/android/mltcode/paycertificationapi/Xi111;-><init>(Lcom/sma/smartv3/otherdevice/charge/CallTranslationActivity;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    invoke-direct {p0}, Lcom/sma/smartv3/otherdevice/charge/CallTranslationActivity;->getModelVideoCall()Landroid/widget/TextView;

    move-result-object v0

    new-instance v1, Lcom/android/mltcode/paycertificationapi/IIXO0;

    invoke-direct {v1, p0}, Lcom/android/mltcode/paycertificationapi/IIXO0;-><init>(Lcom/sma/smartv3/otherdevice/charge/CallTranslationActivity;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    invoke-direct {p0}, Lcom/sma/smartv3/otherdevice/charge/CallTranslationActivity;->getModelVoiceCall()Landroid/widget/TextView;

    move-result-object v0

    new-instance v1, Lcom/android/mltcode/paycertificationapi/XXi1iXiI;

    invoke-direct {v1, p0}, Lcom/android/mltcode/paycertificationapi/XXi1iXiI;-><init>(Lcom/sma/smartv3/otherdevice/charge/CallTranslationActivity;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method

.method public layoutId()I
    .locals 1

    const v0, 0x7f0d0133

    return v0
.end method

.method public onActivityResult(IILandroid/content/Intent;)V
    .locals 5
    .param p3    # Landroid/content/Intent;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param

    invoke-super {p0, p1, p2, p3}, Landroidx/fragment/app/FragmentActivity;->onActivityResult(IILandroid/content/Intent;)V

    const/4 v0, -0x1

    if-ne p2, v0, :cond_5

    iget p2, p0, Lcom/sma/smartv3/otherdevice/charge/CallTranslationActivity;->CODE_LEFT_LANGUAGE:I

    const/4 v0, 0x2

    const-string v1, "LANGUAGE_CHANGE"

    const-string v2, "null cannot be cast to non-null type com.sma.smartv3.model.LanguageTranslationData"

    const-string v3, "language"

    const/4 v4, 0x0

    if-ne p1, p2, :cond_2

    if-eqz p3, :cond_0

    invoke-virtual {p3, v3}, Landroid/content/Intent;->getSerializableExtra(Ljava/lang/String;)Ljava/io/Serializable;

    move-result-object p1

    goto :goto_0

    :cond_0
    move-object p1, v4

    :goto_0
    invoke-static {p1, v2}, Lkotlin/jvm/internal/Intrinsics;->X1ii(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Lcom/sma/smartv3/model/LanguageTranslationData;

    invoke-virtual {p1}, Lcom/sma/smartv3/model/LanguageTranslationData;->getName()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p0}, Lcom/sma/smartv3/otherdevice/charge/CallTranslationActivity;->getMRightLanguage()Lcom/sma/smartv3/model/LanguageTranslationData;

    move-result-object p3

    invoke-virtual {p3}, Lcom/sma/smartv3/model/LanguageTranslationData;->getName()Ljava/lang/String;

    move-result-object p3

    invoke-static {p2, p3}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_1

    invoke-virtual {p0, p1}, Lcom/sma/smartv3/otherdevice/charge/CallTranslationActivity;->setMLeftLanguage(Lcom/sma/smartv3/model/LanguageTranslationData;)V

    invoke-direct {p0}, Lcom/sma/smartv3/otherdevice/charge/CallTranslationActivity;->getCallMeLanguage()Landroid/widget/TextView;

    move-result-object p1

    invoke-virtual {p0}, Lcom/sma/smartv3/otherdevice/charge/CallTranslationActivity;->getMLeftLanguage()Lcom/sma/smartv3/model/LanguageTranslationData;

    move-result-object p2

    invoke-virtual {p2}, Lcom/sma/smartv3/model/LanguageTranslationData;->getName()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    invoke-static {v1, v4, v0, v4}, Lcom/android/mltcode/paycertificationapi/I01XX0;->XIi00iiXO(Ljava/lang/String;Ljava/lang/Object;ILjava/lang/Object;)V

    return-void

    :cond_1
    invoke-virtual {p0}, Lcom/sma/smartv3/otherdevice/charge/CallTranslationActivity;->getMLeftLanguage()Lcom/sma/smartv3/model/LanguageTranslationData;

    move-result-object p1

    invoke-virtual {p0}, Lcom/sma/smartv3/otherdevice/charge/CallTranslationActivity;->getMRightLanguage()Lcom/sma/smartv3/model/LanguageTranslationData;

    move-result-object p2

    invoke-virtual {p0, p2}, Lcom/sma/smartv3/otherdevice/charge/CallTranslationActivity;->setMLeftLanguage(Lcom/sma/smartv3/model/LanguageTranslationData;)V

    invoke-virtual {p0, p1}, Lcom/sma/smartv3/otherdevice/charge/CallTranslationActivity;->setMRightLanguage(Lcom/sma/smartv3/model/LanguageTranslationData;)V

    invoke-direct {p0}, Lcom/sma/smartv3/otherdevice/charge/CallTranslationActivity;->getCallMeLanguage()Landroid/widget/TextView;

    move-result-object p1

    invoke-virtual {p0}, Lcom/sma/smartv3/otherdevice/charge/CallTranslationActivity;->getMLeftLanguage()Lcom/sma/smartv3/model/LanguageTranslationData;

    move-result-object p2

    invoke-virtual {p2}, Lcom/sma/smartv3/model/LanguageTranslationData;->getName()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    invoke-direct {p0}, Lcom/sma/smartv3/otherdevice/charge/CallTranslationActivity;->getCallOtherLanguage()Landroid/widget/TextView;

    move-result-object p1

    invoke-virtual {p0}, Lcom/sma/smartv3/otherdevice/charge/CallTranslationActivity;->getMRightLanguage()Lcom/sma/smartv3/model/LanguageTranslationData;

    move-result-object p2

    invoke-virtual {p2}, Lcom/sma/smartv3/model/LanguageTranslationData;->getName()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void

    :cond_2
    iget p2, p0, Lcom/sma/smartv3/otherdevice/charge/CallTranslationActivity;->CODE_RIGHT_LANGUAGE:I

    if-ne p1, p2, :cond_5

    if-eqz p3, :cond_3

    invoke-virtual {p3, v3}, Landroid/content/Intent;->getSerializableExtra(Ljava/lang/String;)Ljava/io/Serializable;

    move-result-object p1

    goto :goto_1

    :cond_3
    move-object p1, v4

    :goto_1
    invoke-static {p1, v2}, Lkotlin/jvm/internal/Intrinsics;->X1ii(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Lcom/sma/smartv3/model/LanguageTranslationData;

    invoke-virtual {p0}, Lcom/sma/smartv3/otherdevice/charge/CallTranslationActivity;->getMLeftLanguage()Lcom/sma/smartv3/model/LanguageTranslationData;

    move-result-object p2

    invoke-virtual {p2}, Lcom/sma/smartv3/model/LanguageTranslationData;->getName()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1}, Lcom/sma/smartv3/model/LanguageTranslationData;->getName()Ljava/lang/String;

    move-result-object p3

    invoke-static {p2, p3}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_4

    invoke-virtual {p0, p1}, Lcom/sma/smartv3/otherdevice/charge/CallTranslationActivity;->setMRightLanguage(Lcom/sma/smartv3/model/LanguageTranslationData;)V

    invoke-direct {p0}, Lcom/sma/smartv3/otherdevice/charge/CallTranslationActivity;->getCallOtherLanguage()Landroid/widget/TextView;

    move-result-object p1

    invoke-virtual {p0}, Lcom/sma/smartv3/otherdevice/charge/CallTranslationActivity;->getMRightLanguage()Lcom/sma/smartv3/model/LanguageTranslationData;

    move-result-object p2

    invoke-virtual {p2}, Lcom/sma/smartv3/model/LanguageTranslationData;->getName()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    invoke-static {v1, v4, v0, v4}, Lcom/android/mltcode/paycertificationapi/I01XX0;->XIi00iiXO(Ljava/lang/String;Ljava/lang/Object;ILjava/lang/Object;)V

    return-void

    :cond_4
    invoke-virtual {p0}, Lcom/sma/smartv3/otherdevice/charge/CallTranslationActivity;->getMLeftLanguage()Lcom/sma/smartv3/model/LanguageTranslationData;

    move-result-object p1

    invoke-virtual {p0}, Lcom/sma/smartv3/otherdevice/charge/CallTranslationActivity;->getMRightLanguage()Lcom/sma/smartv3/model/LanguageTranslationData;

    move-result-object p2

    invoke-virtual {p0, p2}, Lcom/sma/smartv3/otherdevice/charge/CallTranslationActivity;->setMLeftLanguage(Lcom/sma/smartv3/model/LanguageTranslationData;)V

    invoke-virtual {p0, p1}, Lcom/sma/smartv3/otherdevice/charge/CallTranslationActivity;->setMRightLanguage(Lcom/sma/smartv3/model/LanguageTranslationData;)V

    invoke-direct {p0}, Lcom/sma/smartv3/otherdevice/charge/CallTranslationActivity;->getCallMeLanguage()Landroid/widget/TextView;

    move-result-object p1

    invoke-virtual {p0}, Lcom/sma/smartv3/otherdevice/charge/CallTranslationActivity;->getMLeftLanguage()Lcom/sma/smartv3/model/LanguageTranslationData;

    move-result-object p2

    invoke-virtual {p2}, Lcom/sma/smartv3/model/LanguageTranslationData;->getName()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    invoke-direct {p0}, Lcom/sma/smartv3/otherdevice/charge/CallTranslationActivity;->getCallOtherLanguage()Landroid/widget/TextView;

    move-result-object p1

    invoke-virtual {p0}, Lcom/sma/smartv3/otherdevice/charge/CallTranslationActivity;->getMRightLanguage()Lcom/sma/smartv3/model/LanguageTranslationData;

    move-result-object p2

    invoke-virtual {p2}, Lcom/sma/smartv3/model/LanguageTranslationData;->getName()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :cond_5
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

    const-string p1, "MICROPHONE"

    const-string v0, "CAMERA"

    filled-new-array {p1, v0}, [Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lcom/blankj/utilcode/util/PermissionUtils;->isGranted([Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_0

    invoke-direct {p0}, Lcom/sma/smartv3/otherdevice/charge/CallTranslationActivity;->getCallTranslationUrl()V

    return-void

    :cond_0
    invoke-direct {p0}, Lcom/sma/smartv3/otherdevice/charge/CallTranslationActivity;->permission()V

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

.method public final onTitleRightClick(Landroid/view/View;)V
    .locals 1
    .param p1    # Landroid/view/View;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "view"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method public final setMLanguageTranslationList(Ljava/util/List;)V
    .locals 1
    .param p1    # Ljava/util/List;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/sma/smartv3/model/LanguageTranslationData;",
            ">;)V"
        }
    .end annotation

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/sma/smartv3/otherdevice/charge/CallTranslationActivity;->mLanguageTranslationList:Ljava/util/List;

    return-void
.end method

.method public final setMLeftLanguage(Lcom/sma/smartv3/model/LanguageTranslationData;)V
    .locals 1
    .param p1    # Lcom/sma/smartv3/model/LanguageTranslationData;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/sma/smartv3/otherdevice/charge/CallTranslationActivity;->mLeftLanguage:Lcom/sma/smartv3/model/LanguageTranslationData;

    return-void
.end method

.method public final setMRightLanguage(Lcom/sma/smartv3/model/LanguageTranslationData;)V
    .locals 1
    .param p1    # Lcom/sma/smartv3/model/LanguageTranslationData;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/sma/smartv3/otherdevice/charge/CallTranslationActivity;->mRightLanguage:Lcom/sma/smartv3/model/LanguageTranslationData;

    return-void
.end method
