.class public final Lcom/sma/smartv3/ui/me/FeedbackActivity;
.super Lcom/bestmafen/androidbase/base/BaseActivity;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/sma/smartv3/ui/me/FeedbackActivity$OXO1;
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nFeedbackActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FeedbackActivity.kt\ncom/sma/smartv3/ui/me/FeedbackActivity\n+ 2 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n+ 3 TextView.kt\nandroidx/core/widget/TextViewKt\n+ 4 NetWorkUtils.kt\ncom/sma/smartv3/network/NetWorkUtils\n+ 5 NetWork.kt\ncom/sma/androidnetworklib/method/NetWork\n*L\n1#1,86:1\n19#2:87\n15#2:88\n55#3,12:89\n84#3,3:101\n183#4,4:104\n196#4:116\n252#5,7:108\n270#5:115\n*S KotlinDebug\n*F\n+ 1 FeedbackActivity.kt\ncom/sma/smartv3/ui/me/FeedbackActivity\n*L\n27#1:87\n27#1:88\n40#1:89,12\n40#1:101,3\n63#1:104,4\n63#1:116\n63#1:108,7\n63#1:115\n*E\n"
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nFeedbackActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FeedbackActivity.kt\ncom/sma/smartv3/ui/me/FeedbackActivity\n+ 2 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n+ 3 TextView.kt\nandroidx/core/widget/TextViewKt\n+ 4 NetWorkUtils.kt\ncom/sma/smartv3/network/NetWorkUtils\n+ 5 NetWork.kt\ncom/sma/androidnetworklib/method/NetWork\n*L\n1#1,86:1\n19#2:87\n15#2:88\n55#3,12:89\n84#3,3:101\n183#4,4:104\n196#4:116\n252#5,7:108\n270#5:115\n*S KotlinDebug\n*F\n+ 1 FeedbackActivity.kt\ncom/sma/smartv3/ui/me/FeedbackActivity\n*L\n27#1:87\n27#1:88\n40#1:89,12\n40#1:101,3\n63#1:104,4\n63#1:116\n63#1:108,7\n63#1:115\n*E\n"
    }
.end annotation


# static fields
.field public static final Companion:Lcom/sma/smartv3/ui/me/FeedbackActivity$OXO1;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private static final MAX_LENGTH:I = 0x1f4


# instance fields
.field private final appUser:Lcom/sma/smartv3/model/AppUser;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final edtContact$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final edtFeedback$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final rootView$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final tvCount$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/sma/smartv3/ui/me/FeedbackActivity$OXO1;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/sma/smartv3/ui/me/FeedbackActivity$OXO1;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/sma/smartv3/ui/me/FeedbackActivity;->Companion:Lcom/sma/smartv3/ui/me/FeedbackActivity$OXO1;

    return-void
.end method

.method public constructor <init>()V
    .locals 32

    move-object/from16 v0, p0

    invoke-direct {v0}, Lcom/bestmafen/androidbase/base/BaseActivity;-><init>()V

    new-instance v1, Lcom/android/mltcode/paycertificationapi/X11i0O11;

    invoke-direct {v1, v0}, Lcom/android/mltcode/paycertificationapi/X11i0O11;-><init>(Lcom/sma/smartv3/ui/me/FeedbackActivity;)V

    invoke-static {v1}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v1

    iput-object v1, v0, Lcom/sma/smartv3/ui/me/FeedbackActivity;->edtFeedback$delegate:Lkotlin/Lazy;

    new-instance v1, Lcom/android/mltcode/paycertificationapi/i0011XiI;

    invoke-direct {v1, v0}, Lcom/android/mltcode/paycertificationapi/i0011XiI;-><init>(Lcom/sma/smartv3/ui/me/FeedbackActivity;)V

    invoke-static {v1}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v1

    iput-object v1, v0, Lcom/sma/smartv3/ui/me/FeedbackActivity;->edtContact$delegate:Lkotlin/Lazy;

    new-instance v1, Lcom/android/mltcode/paycertificationapi/I1101O1I;

    invoke-direct {v1, v0}, Lcom/android/mltcode/paycertificationapi/I1101O1I;-><init>(Lcom/sma/smartv3/ui/me/FeedbackActivity;)V

    invoke-static {v1}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v1

    iput-object v1, v0, Lcom/sma/smartv3/ui/me/FeedbackActivity;->tvCount$delegate:Lkotlin/Lazy;

    new-instance v1, Lcom/android/mltcode/paycertificationapi/XO1i0X0i1;

    invoke-direct {v1, v0}, Lcom/android/mltcode/paycertificationapi/XO1i0X0i1;-><init>(Lcom/sma/smartv3/ui/me/FeedbackActivity;)V

    invoke-static {v1}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v1

    iput-object v1, v0, Lcom/sma/smartv3/ui/me/FeedbackActivity;->rootView$delegate:Lkotlin/Lazy;

    sget-object v1, Lcom/android/mltcode/paycertificationapi/a01;->OXO1:Lcom/android/mltcode/paycertificationapi/a01;

    invoke-virtual {v1}, Lcom/android/mltcode/paycertificationapi/a01;->IiI10X()Lcom/blankj/utilcode/util/SPUtils;

    move-result-object v1

    new-instance v2, Lcom/sma/smartv3/model/AppUser;

    const v30, 0x7ffffff

    const/16 v31, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    const/16 v29, 0x0

    invoke-direct/range {v2 .. v31}, Lcom/sma/smartv3/model/AppUser;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IIFFLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;FFIILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/sma/smartv3/model/ThirdPlatform;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v3, Lcom/google/gson/Gson;

    invoke-direct {v3}, Lcom/google/gson/Gson;-><init>()V

    const-class v4, Lcom/sma/smartv3/model/AppUser;

    invoke-virtual {v4}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v1, v5}, Lcom/blankj/utilcode/util/SPUtils;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3, v1, v4}, Lcom/google/gson/Gson;->fromJson(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    if-nez v1, :cond_0

    goto :goto_0

    :cond_0
    move-object v2, v1

    :goto_0
    check-cast v2, Lcom/sma/smartv3/model/AppUser;

    iput-object v2, v0, Lcom/sma/smartv3/ui/me/FeedbackActivity;->appUser:Lcom/sma/smartv3/model/AppUser;

    return-void
.end method

.method public static synthetic I0iXXO(Lcom/sma/smartv3/ui/me/FeedbackActivity;)Landroid/widget/TextView;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/me/FeedbackActivity;->tvCount_delegate$lambda$0(Lcom/sma/smartv3/ui/me/FeedbackActivity;)Landroid/widget/TextView;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic OIX0iXi(Lcom/sma/smartv3/ui/me/FeedbackActivity;)Landroid/widget/EditText;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/me/FeedbackActivity;->edtContact_delegate$lambda$0(Lcom/sma/smartv3/ui/me/FeedbackActivity;)Landroid/widget/EditText;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic X1ii(Lcom/sma/smartv3/ui/me/FeedbackActivity;)Landroid/widget/EditText;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/me/FeedbackActivity;->edtFeedback_delegate$lambda$0(Lcom/sma/smartv3/ui/me/FeedbackActivity;)Landroid/widget/EditText;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic XXI(Lcom/sma/smartv3/ui/me/FeedbackActivity;)Landroid/widget/LinearLayout;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/me/FeedbackActivity;->rootView_delegate$lambda$0(Lcom/sma/smartv3/ui/me/FeedbackActivity;)Landroid/widget/LinearLayout;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$updateCount(Lcom/sma/smartv3/ui/me/FeedbackActivity;)V
    .locals 0

    invoke-direct {p0}, Lcom/sma/smartv3/ui/me/FeedbackActivity;->updateCount()V

    return-void
.end method

.method private static final edtContact_delegate$lambda$0(Lcom/sma/smartv3/ui/me/FeedbackActivity;)Landroid/widget/EditText;
    .locals 1

    const v0, 0x7f0a0344

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/EditText;

    return-object p0
.end method

.method private static final edtFeedback_delegate$lambda$0(Lcom/sma/smartv3/ui/me/FeedbackActivity;)Landroid/widget/EditText;
    .locals 1

    const v0, 0x7f0a0347

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/EditText;

    return-object p0
.end method

.method private final getEdtContact()Landroid/widget/EditText;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/me/FeedbackActivity;->edtContact$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/EditText;

    return-object v0
.end method

.method private final getEdtFeedback()Landroid/widget/EditText;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/me/FeedbackActivity;->edtFeedback$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/EditText;

    return-object v0
.end method

.method private final getRootView()Landroid/widget/LinearLayout;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/me/FeedbackActivity;->rootView$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    return-object v0
.end method

.method private final getTvCount()Landroid/widget/TextView;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/me/FeedbackActivity;->tvCount$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    return-object v0
.end method

.method private static final rootView_delegate$lambda$0(Lcom/sma/smartv3/ui/me/FeedbackActivity;)Landroid/widget/LinearLayout;
    .locals 1

    const v0, 0x7f0a09b0

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/LinearLayout;

    return-object p0
.end method

.method private static final tvCount_delegate$lambda$0(Lcom/sma/smartv3/ui/me/FeedbackActivity;)Landroid/widget/TextView;
    .locals 1

    const v0, 0x7f0a0c5c

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/TextView;

    return-object p0
.end method

.method private final updateCount()V
    .locals 3

    invoke-direct {p0}, Lcom/sma/smartv3/ui/me/FeedbackActivity;->getEdtFeedback()Landroid/widget/EditText;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v0

    invoke-direct {p0}, Lcom/sma/smartv3/ui/me/FeedbackActivity;->getTvCount()Landroid/widget/TextView;

    move-result-object v1

    sget-object v2, Lkotlin/jvm/internal/StringCompanionObject;->OXO1:Lkotlin/jvm/internal/StringCompanionObject;

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    const/16 v2, 0x1f4

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    filled-new-array {v0, v2}, [Ljava/lang/Object;

    move-result-object v0

    const/4 v2, 0x2

    invoke-static {v0, v2}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v0

    const-string v2, "%d/%d"

    invoke-static {v2, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    const-string v2, "format(...)"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

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
    .locals 2

    const v0, 0x7f0a0023

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    const v1, 0x7f140bce

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/me/FeedbackActivity;->appUser:Lcom/sma/smartv3/model/AppUser;

    invoke-virtual {v0}, Lcom/sma/smartv3/model/AppUser;->getEmail()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v0

    if-lez v0, :cond_0

    invoke-direct {p0}, Lcom/sma/smartv3/ui/me/FeedbackActivity;->getEdtContact()Landroid/widget/EditText;

    move-result-object v0

    iget-object v1, p0, Lcom/sma/smartv3/ui/me/FeedbackActivity;->appUser:Lcom/sma/smartv3/model/AppUser;

    invoke-virtual {v1}, Lcom/sma/smartv3/model/AppUser;->getEmail()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :cond_0
    invoke-direct {p0}, Lcom/sma/smartv3/ui/me/FeedbackActivity;->updateCount()V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/me/FeedbackActivity;->getEdtFeedback()Landroid/widget/EditText;

    move-result-object v0

    const-string v1, "<get-edtFeedback>(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/sma/smartv3/ui/me/FeedbackActivity$XIi00iiXO;

    invoke-direct {v1, p0}, Lcom/sma/smartv3/ui/me/FeedbackActivity$XIi00iiXO;-><init>(Lcom/sma/smartv3/ui/me/FeedbackActivity;)V

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->addTextChangedListener(Landroid/text/TextWatcher;)V

    return-void
.end method

.method public layoutId()I
    .locals 1

    const v0, 0x7f0d009d

    return v0
.end method

.method public final onBottomClick(Landroid/view/View;)V
    .locals 6
    .param p1    # Landroid/view/View;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "view"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/me/FeedbackActivity;->getEdtFeedback()Landroid/widget/EditText;

    move-result-object p1

    invoke-virtual {p1}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result p1

    if-nez p1, :cond_0

    const p1, 0x7f1403f3

    invoke-static {p1}, Lcom/blankj/utilcode/util/ToastUtils;->showLong(I)V

    return-void

    :cond_0
    invoke-direct {p0}, Lcom/sma/smartv3/ui/me/FeedbackActivity;->getEdtContact()Landroid/widget/EditText;

    move-result-object p1

    invoke-virtual {p1}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result p1

    if-nez p1, :cond_1

    goto :goto_0

    :cond_1
    invoke-direct {p0}, Lcom/sma/smartv3/ui/me/FeedbackActivity;->getEdtContact()Landroid/widget/EditText;

    move-result-object p1

    invoke-virtual {p1}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object p1

    invoke-static {p1}, Lcom/blankj/utilcode/util/RegexUtils;->isEmail(Ljava/lang/CharSequence;)Z

    move-result p1

    if-nez p1, :cond_2

    :goto_0
    const p1, 0x7f1404d2

    invoke-static {p1}, Lcom/blankj/utilcode/util/ToastUtils;->showLong(I)V

    return-void

    :cond_2
    sget-object p1, Lcom/sma/smartv3/network/NetWorkUtils;->INSTANCE:Lcom/sma/smartv3/network/NetWorkUtils;

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseActivity;->getMContext()Landroid/app/Activity;

    move-result-object v0

    invoke-direct {p0}, Lcom/sma/smartv3/ui/me/FeedbackActivity;->getEdtContact()Landroid/widget/EditText;

    move-result-object v1

    invoke-virtual {v1}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {p0}, Lcom/sma/smartv3/ui/me/FeedbackActivity;->getEdtFeedback()Landroid/widget/EditText;

    move-result-object v2

    invoke-virtual {v2}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v0, v1, v2}, Lcom/sma/smartv3/network/RequestBodyKt;->getFeedbackBody(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/util/HashMap;

    move-result-object v0

    new-instance v1, Lcom/sma/smartv3/ui/me/FeedbackActivity$onBottomClick$1;

    invoke-direct {v1, p0}, Lcom/sma/smartv3/ui/me/FeedbackActivity$onBottomClick$1;-><init>(Lcom/sma/smartv3/ui/me/FeedbackActivity;)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/me/FeedbackActivity;->getRootView()Landroid/widget/LinearLayout;

    move-result-object v2

    invoke-virtual {p1, p0, v2}, Lcom/sma/smartv3/network/NetWorkUtils;->loadPopup(Landroid/app/Activity;Landroid/view/View;)Lcom/android/mltcode/paycertificationapi/uq;

    move-result-object v2

    sget-object v3, Lcom/sma/smartv3/network/Api;->INSTANCE:Lcom/sma/smartv3/network/Api;

    invoke-virtual {v3}, Lcom/sma/smartv3/network/Api;->getBASE_URL()Ljava/lang/String;

    move-result-object v3

    const-string v4, "/feedback/add"

    invoke-virtual {p1, v3, v4}, Lcom/sma/smartv3/network/NetWorkUtils;->convertBaseUrl(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {p1, v5, v0}, Lcom/sma/smartv3/network/NetWorkUtils;->printParam(Ljava/lang/String;Ljava/util/Map;)V

    sget-object p1, Lcom/sma/androidnetworklib/method/NetWork;->OXO1:Lcom/sma/androidnetworklib/method/NetWork;

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-instance v3, Lcom/sma/smartv3/ui/me/FeedbackActivity$onBottomClick$$inlined$post$1;

    invoke-direct {v3, p0, v1, v2}, Lcom/sma/smartv3/ui/me/FeedbackActivity$onBottomClick$$inlined$post$1;-><init>(Landroid/app/Activity;Lcom/android/mltcode/paycertificationapi/O1XIiIO;Lcom/android/mltcode/paycertificationapi/uq;)V

    invoke-static {p1}, Lcom/androidnetworking/AndroidNetworking;->post(Ljava/lang/String;)Lcom/androidnetworking/common/ANRequest$PostRequestBuilder;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/androidnetworking/common/ANRequest$PostRequestBuilder;->addBodyParameter(Ljava/util/Map;)Lcom/androidnetworking/common/ANRequest$PostRequestBuilder;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/androidnetworking/common/ANRequest$PostRequestBuilder;->setTag(Ljava/lang/Object;)Lcom/androidnetworking/common/ANRequest$PostRequestBuilder;

    move-result-object p1

    sget-object v0, Lcom/androidnetworking/common/Priority;->HIGH:Lcom/androidnetworking/common/Priority;

    invoke-virtual {p1, v0}, Lcom/androidnetworking/common/ANRequest$PostRequestBuilder;->setPriority(Lcom/androidnetworking/common/Priority;)Lcom/androidnetworking/common/ANRequest$PostRequestBuilder;

    move-result-object p1

    invoke-virtual {p1}, Lcom/androidnetworking/common/ANRequest$PostRequestBuilder;->build()Lcom/androidnetworking/common/ANRequest;

    move-result-object p1

    const/4 v0, 0x1

    new-array v0, v0, [Ljava/lang/reflect/Type;

    const-class v1, Ljava/lang/String;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    const-class v1, Lcom/sma/androidnetworklib/model/Response;

    invoke-static {v1, v0}, Lcom/google/gson/reflect/TypeToken;->getParameterized(Ljava/lang/reflect/Type;[Ljava/lang/reflect/Type;)Lcom/google/gson/reflect/TypeToken;

    move-result-object v0

    new-instance v1, Lcom/sma/smartv3/ui/me/FeedbackActivity$onBottomClick$$inlined$post$2;

    invoke-direct {v1, v3}, Lcom/sma/smartv3/ui/me/FeedbackActivity$onBottomClick$$inlined$post$2;-><init>(Lcom/android/mltcode/paycertificationapi/O1XIiIO;)V

    invoke-virtual {p1, v0, v1}, Lcom/androidnetworking/common/ANRequest;->getAsParsed(Lcom/google/gson/reflect/TypeToken;Lcom/androidnetworking/interfaces/ParsedRequestListener;)V

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
