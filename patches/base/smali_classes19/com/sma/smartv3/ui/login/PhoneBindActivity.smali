.class public final Lcom/sma/smartv3/ui/login/PhoneBindActivity;
.super Lcom/bestmafen/androidbase/base/BaseActivity;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nPhoneBindActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PhoneBindActivity.kt\ncom/sma/smartv3/ui/login/PhoneBindActivity\n+ 2 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n+ 3 NetWorkUtils.kt\ncom/sma/smartv3/network/NetWorkUtils\n+ 4 NetWork.kt\ncom/sma/androidnetworklib/method/NetWork\n*L\n1#1,214:1\n19#2:215\n15#2:216\n176#3,11:217\n196#3:236\n176#3,11:237\n196#3:256\n252#4,7:228\n270#4:235\n252#4,7:248\n270#4:255\n*S KotlinDebug\n*F\n+ 1 PhoneBindActivity.kt\ncom/sma/smartv3/ui/login/PhoneBindActivity\n*L\n46#1:215\n46#1:216\n139#1:217,11\n139#1:236\n161#1:237,11\n161#1:256\n139#1:228,7\n139#1:235\n161#1:248,7\n161#1:255\n*E\n"
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nPhoneBindActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PhoneBindActivity.kt\ncom/sma/smartv3/ui/login/PhoneBindActivity\n+ 2 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n+ 3 NetWorkUtils.kt\ncom/sma/smartv3/network/NetWorkUtils\n+ 4 NetWork.kt\ncom/sma/androidnetworklib/method/NetWork\n*L\n1#1,214:1\n19#2:215\n15#2:216\n176#3,11:217\n196#3:236\n176#3,11:237\n196#3:256\n252#4,7:228\n270#4:235\n252#4,7:248\n270#4:255\n*S KotlinDebug\n*F\n+ 1 PhoneBindActivity.kt\ncom/sma/smartv3/ui/login/PhoneBindActivity\n*L\n46#1:215\n46#1:216\n139#1:217,11\n139#1:236\n161#1:237,11\n161#1:256\n139#1:228,7\n139#1:235\n161#1:248,7\n161#1:255\n*E\n"
    }
.end annotation


# instance fields
.field private final bottomBtn$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final btGetVerificationCode$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private isExistsPhone:Z

.field private final llCheckCode$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final llInputPhone$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private mAppUser:Lcom/sma/smartv3/model/AppUser;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private nowPage:I

.field private final phone$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final rv$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final tvCode$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final tvCodeError$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final tvDescription$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final tvTitle$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final verificationCode$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private verificationType:I


# direct methods
.method public constructor <init>()V
    .locals 32

    move-object/from16 v0, p0

    invoke-direct {v0}, Lcom/bestmafen/androidbase/base/BaseActivity;-><init>()V

    new-instance v1, Lcom/android/mltcode/paycertificationapi/mu1;

    invoke-direct {v1, v0}, Lcom/android/mltcode/paycertificationapi/mu1;-><init>(Lcom/sma/smartv3/ui/login/PhoneBindActivity;)V

    invoke-static {v1}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v1

    iput-object v1, v0, Lcom/sma/smartv3/ui/login/PhoneBindActivity;->rv$delegate:Lkotlin/Lazy;

    new-instance v1, Lcom/android/mltcode/paycertificationapi/su1;

    invoke-direct {v1, v0}, Lcom/android/mltcode/paycertificationapi/su1;-><init>(Lcom/sma/smartv3/ui/login/PhoneBindActivity;)V

    invoke-static {v1}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v1

    iput-object v1, v0, Lcom/sma/smartv3/ui/login/PhoneBindActivity;->llInputPhone$delegate:Lkotlin/Lazy;

    new-instance v1, Lcom/android/mltcode/paycertificationapi/tu1;

    invoke-direct {v1, v0}, Lcom/android/mltcode/paycertificationapi/tu1;-><init>(Lcom/sma/smartv3/ui/login/PhoneBindActivity;)V

    invoke-static {v1}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v1

    iput-object v1, v0, Lcom/sma/smartv3/ui/login/PhoneBindActivity;->llCheckCode$delegate:Lkotlin/Lazy;

    new-instance v1, Lcom/android/mltcode/paycertificationapi/uu1;

    invoke-direct {v1, v0}, Lcom/android/mltcode/paycertificationapi/uu1;-><init>(Lcom/sma/smartv3/ui/login/PhoneBindActivity;)V

    invoke-static {v1}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v1

    iput-object v1, v0, Lcom/sma/smartv3/ui/login/PhoneBindActivity;->tvTitle$delegate:Lkotlin/Lazy;

    new-instance v1, Lcom/android/mltcode/paycertificationapi/vu1;

    invoke-direct {v1, v0}, Lcom/android/mltcode/paycertificationapi/vu1;-><init>(Lcom/sma/smartv3/ui/login/PhoneBindActivity;)V

    invoke-static {v1}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v1

    iput-object v1, v0, Lcom/sma/smartv3/ui/login/PhoneBindActivity;->tvDescription$delegate:Lkotlin/Lazy;

    new-instance v1, Lcom/android/mltcode/paycertificationapi/wu1;

    invoke-direct {v1, v0}, Lcom/android/mltcode/paycertificationapi/wu1;-><init>(Lcom/sma/smartv3/ui/login/PhoneBindActivity;)V

    invoke-static {v1}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v1

    iput-object v1, v0, Lcom/sma/smartv3/ui/login/PhoneBindActivity;->tvCode$delegate:Lkotlin/Lazy;

    new-instance v1, Lcom/android/mltcode/paycertificationapi/xu1;

    invoke-direct {v1, v0}, Lcom/android/mltcode/paycertificationapi/xu1;-><init>(Lcom/sma/smartv3/ui/login/PhoneBindActivity;)V

    invoke-static {v1}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v1

    iput-object v1, v0, Lcom/sma/smartv3/ui/login/PhoneBindActivity;->phone$delegate:Lkotlin/Lazy;

    new-instance v1, Lcom/android/mltcode/paycertificationapi/yu1;

    invoke-direct {v1, v0}, Lcom/android/mltcode/paycertificationapi/yu1;-><init>(Lcom/sma/smartv3/ui/login/PhoneBindActivity;)V

    invoke-static {v1}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v1

    iput-object v1, v0, Lcom/sma/smartv3/ui/login/PhoneBindActivity;->verificationCode$delegate:Lkotlin/Lazy;

    new-instance v1, Lcom/android/mltcode/paycertificationapi/zu1;

    invoke-direct {v1, v0}, Lcom/android/mltcode/paycertificationapi/zu1;-><init>(Lcom/sma/smartv3/ui/login/PhoneBindActivity;)V

    invoke-static {v1}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v1

    iput-object v1, v0, Lcom/sma/smartv3/ui/login/PhoneBindActivity;->btGetVerificationCode$delegate:Lkotlin/Lazy;

    new-instance v1, Lcom/android/mltcode/paycertificationapi/nu1;

    invoke-direct {v1, v0}, Lcom/android/mltcode/paycertificationapi/nu1;-><init>(Lcom/sma/smartv3/ui/login/PhoneBindActivity;)V

    invoke-static {v1}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v1

    iput-object v1, v0, Lcom/sma/smartv3/ui/login/PhoneBindActivity;->bottomBtn$delegate:Lkotlin/Lazy;

    new-instance v1, Lcom/android/mltcode/paycertificationapi/ru1;

    invoke-direct {v1, v0}, Lcom/android/mltcode/paycertificationapi/ru1;-><init>(Lcom/sma/smartv3/ui/login/PhoneBindActivity;)V

    invoke-static {v1}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v1

    iput-object v1, v0, Lcom/sma/smartv3/ui/login/PhoneBindActivity;->tvCodeError$delegate:Lkotlin/Lazy;

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

    iput-object v2, v0, Lcom/sma/smartv3/ui/login/PhoneBindActivity;->mAppUser:Lcom/sma/smartv3/model/AppUser;

    return-void
.end method

.method public static synthetic I0iXXO(Lcom/sma/smartv3/ui/login/PhoneBindActivity;)V
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/login/PhoneBindActivity;->initView$lambda$1(Lcom/sma/smartv3/ui/login/PhoneBindActivity;)V

    return-void
.end method

.method public static synthetic I1XOi1(Lcom/sma/smartv3/ui/login/PhoneBindActivity;)Lcom/sma/smartv3/view/text/PFMedium;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/login/PhoneBindActivity;->tvDescription_delegate$lambda$0(Lcom/sma/smartv3/ui/login/PhoneBindActivity;)Lcom/sma/smartv3/view/text/PFMedium;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic IIX1OXO(Lcom/sma/smartv3/ui/login/PhoneBindActivity;)Lcom/sma/smartv3/view/text/PFMedium;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/login/PhoneBindActivity;->tvCodeError_delegate$lambda$0(Lcom/sma/smartv3/ui/login/PhoneBindActivity;)Lcom/sma/smartv3/view/text/PFMedium;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic O10IXXX0X(Lcom/sma/smartv3/ui/login/PhoneBindActivity;)Lcom/google/android/material/textfield/TextInputEditText;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/login/PhoneBindActivity;->phone_delegate$lambda$0(Lcom/sma/smartv3/ui/login/PhoneBindActivity;)Lcom/google/android/material/textfield/TextInputEditText;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic OII(Lcom/sma/smartv3/ui/login/PhoneBindActivity;)Landroid/widget/Button;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/login/PhoneBindActivity;->bottomBtn_delegate$lambda$0(Lcom/sma/smartv3/ui/login/PhoneBindActivity;)Landroid/widget/Button;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic OIX0iXi(Lcom/sma/smartv3/ui/login/PhoneBindActivity;Landroid/widget/TextView;ILandroid/view/KeyEvent;)Z
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lcom/sma/smartv3/ui/login/PhoneBindActivity;->initView$lambda$3(Lcom/sma/smartv3/ui/login/PhoneBindActivity;Landroid/widget/TextView;ILandroid/view/KeyEvent;)Z

    move-result p0

    return p0
.end method

.method public static synthetic OiIIX101O(Lcom/sma/smartv3/ui/login/PhoneBindActivity;)Landroid/widget/LinearLayout;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/login/PhoneBindActivity;->llCheckCode_delegate$lambda$0(Lcom/sma/smartv3/ui/login/PhoneBindActivity;)Landroid/widget/LinearLayout;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic X0O(Lcom/sma/smartv3/ui/login/PhoneBindActivity;Landroid/widget/TextView;ILandroid/view/KeyEvent;)Z
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lcom/sma/smartv3/ui/login/PhoneBindActivity;->initView$lambda$2(Lcom/sma/smartv3/ui/login/PhoneBindActivity;Landroid/widget/TextView;ILandroid/view/KeyEvent;)Z

    move-result p0

    return p0
.end method

.method public static synthetic X1ii(Lcom/sma/smartv3/ui/login/PhoneBindActivity;)Landroid/widget/LinearLayout;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/login/PhoneBindActivity;->llInputPhone_delegate$lambda$0(Lcom/sma/smartv3/ui/login/PhoneBindActivity;)Landroid/widget/LinearLayout;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic XX0(Lcom/sma/smartv3/ui/login/PhoneBindActivity;)Lcom/google/android/material/textfield/TextInputEditText;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/login/PhoneBindActivity;->verificationCode_delegate$lambda$0(Lcom/sma/smartv3/ui/login/PhoneBindActivity;)Lcom/google/android/material/textfield/TextInputEditText;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic XXI(Lcom/sma/smartv3/ui/login/PhoneBindActivity;)Landroid/widget/Button;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/login/PhoneBindActivity;->btGetVerificationCode_delegate$lambda$0(Lcom/sma/smartv3/ui/login/PhoneBindActivity;)Landroid/widget/Button;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic XiOIO(Lcom/sma/smartv3/ui/login/PhoneBindActivity;)Landroid/widget/TextView;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/login/PhoneBindActivity;->tvCode_delegate$lambda$0(Lcom/sma/smartv3/ui/login/PhoneBindActivity;)Landroid/widget/TextView;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic XiOIii1(Lcom/sma/smartv3/ui/login/PhoneBindActivity;)Lcom/sma/smartv3/view/text/PFMedium;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/login/PhoneBindActivity;->tvTitle_delegate$lambda$0(Lcom/sma/smartv3/ui/login/PhoneBindActivity;)Lcom/sma/smartv3/view/text/PFMedium;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$changePhone(Lcom/sma/smartv3/ui/login/PhoneBindActivity;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/sma/smartv3/ui/login/PhoneBindActivity;->changePhone(Ljava/lang/String;)V

    return-void
.end method

.method public static final synthetic access$getBottomBtn(Lcom/sma/smartv3/ui/login/PhoneBindActivity;)Landroid/widget/Button;
    .locals 0

    invoke-direct {p0}, Lcom/sma/smartv3/ui/login/PhoneBindActivity;->getBottomBtn()Landroid/widget/Button;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$getMAppUser$p(Lcom/sma/smartv3/ui/login/PhoneBindActivity;)Lcom/sma/smartv3/model/AppUser;
    .locals 0

    iget-object p0, p0, Lcom/sma/smartv3/ui/login/PhoneBindActivity;->mAppUser:Lcom/sma/smartv3/model/AppUser;

    return-object p0
.end method

.method public static final synthetic access$getPhone(Lcom/sma/smartv3/ui/login/PhoneBindActivity;)Lcom/google/android/material/textfield/TextInputEditText;
    .locals 0

    invoke-direct {p0}, Lcom/sma/smartv3/ui/login/PhoneBindActivity;->getPhone()Lcom/google/android/material/textfield/TextInputEditText;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$getTvCodeError(Lcom/sma/smartv3/ui/login/PhoneBindActivity;)Lcom/sma/smartv3/view/text/PFMedium;
    .locals 0

    invoke-direct {p0}, Lcom/sma/smartv3/ui/login/PhoneBindActivity;->getTvCodeError()Lcom/sma/smartv3/view/text/PFMedium;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$getVerificationCode(Lcom/sma/smartv3/ui/login/PhoneBindActivity;)Lcom/google/android/material/textfield/TextInputEditText;
    .locals 0

    invoke-direct {p0}, Lcom/sma/smartv3/ui/login/PhoneBindActivity;->getVerificationCode()Lcom/google/android/material/textfield/TextInputEditText;

    move-result-object p0

    return-object p0
.end method

.method private static final bottomBtn_delegate$lambda$0(Lcom/sma/smartv3/ui/login/PhoneBindActivity;)Landroid/widget/Button;
    .locals 1

    const v0, 0x7f0a0164

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/Button;

    return-object p0
.end method

.method private static final btGetVerificationCode_delegate$lambda$0(Lcom/sma/smartv3/ui/login/PhoneBindActivity;)Landroid/widget/Button;
    .locals 1

    const v0, 0x7f0a017f

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/Button;

    return-object p0
.end method

.method private final changePhone(Ljava/lang/String;)V
    .locals 10

    const/4 v0, 0x0

    new-instance v1, Lkotlin/jvm/internal/Ref$ObjectRef;

    invoke-direct {v1}, Lkotlin/jvm/internal/Ref$ObjectRef;-><init>()V

    sget-object v2, Lcom/sma/smartv3/network/RequestCommonMethod;->INSTANCE:Lcom/sma/smartv3/network/RequestCommonMethod;

    invoke-direct {p0}, Lcom/sma/smartv3/ui/login/PhoneBindActivity;->getPhone()Lcom/google/android/material/textfield/TextInputEditText;

    move-result-object v3

    invoke-virtual {v3}, Landroidx/appcompat/widget/AppCompatEditText;->getText()Landroid/text/Editable;

    move-result-object v3

    invoke-static {v3}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    const/4 v5, 0x1

    invoke-static {v2, v4, v3, v5, v4}, Lcom/sma/smartv3/network/RequestCommonMethod;->getPhoneWithCode$default(Lcom/sma/smartv3/network/RequestCommonMethod;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    iput-object v2, v1, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    iget-object v2, p0, Lcom/sma/smartv3/ui/login/PhoneBindActivity;->mAppUser:Lcom/sma/smartv3/model/AppUser;

    invoke-virtual {v2}, Lcom/sma/smartv3/model/AppUser;->getPhone()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v2}, Ljava/lang/CharSequence;->length()I

    move-result v2

    const-class v3, Lcom/sma/androidnetworklib/model/Response;

    if-nez v2, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseActivity;->getMArg1()I

    move-result v2

    if-ne v2, v5, :cond_1

    :goto_0
    sget-object v2, Lcom/sma/smartv3/network/NetWorkUtils;->INSTANCE:Lcom/sma/smartv3/network/NetWorkUtils;

    iget-object v6, p0, Lcom/sma/smartv3/ui/login/PhoneBindActivity;->mAppUser:Lcom/sma/smartv3/model/AppUser;

    invoke-virtual {v6}, Lcom/sma/smartv3/model/AppUser;->getIdentity()Ljava/lang/String;

    move-result-object v6

    iget-object v7, v1, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    check-cast v7, Ljava/lang/String;

    invoke-static {v6, v7, p1}, Lcom/sma/smartv3/network/RequestBodyKt;->getSetEmailBody(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/util/HashMap;

    move-result-object p1

    new-instance v6, Lcom/sma/smartv3/ui/login/PhoneBindActivity$changePhone$1;

    invoke-direct {v6, p0, v1}, Lcom/sma/smartv3/ui/login/PhoneBindActivity$changePhone$1;-><init>(Lcom/sma/smartv3/ui/login/PhoneBindActivity;Lkotlin/jvm/internal/Ref$ObjectRef;)V

    invoke-virtual {v2, v4, v4}, Lcom/sma/smartv3/network/NetWorkUtils;->loadPopup(Landroid/app/Activity;Landroid/view/View;)Lcom/android/mltcode/paycertificationapi/uq;

    move-result-object v1

    sget-object v7, Lcom/sma/smartv3/network/Api;->INSTANCE:Lcom/sma/smartv3/network/Api;

    invoke-virtual {v7}, Lcom/sma/smartv3/network/Api;->getBASE_URL()Ljava/lang/String;

    move-result-object v7

    const-string v8, "/appuser/set_email"

    invoke-virtual {v2, v7, v8}, Lcom/sma/smartv3/network/NetWorkUtils;->convertBaseUrl(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    new-instance v9, Ljava/lang/StringBuilder;

    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v9, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v2, v9, p1}, Lcom/sma/smartv3/network/NetWorkUtils;->printParam(Ljava/lang/String;Ljava/util/Map;)V

    sget-object v2, Lcom/sma/androidnetworklib/method/NetWork;->OXO1:Lcom/sma/androidnetworklib/method/NetWork;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    new-instance v7, Lcom/sma/smartv3/ui/login/PhoneBindActivity$changePhone$$inlined$post$default$1;

    invoke-direct {v7, v4, v6, v1}, Lcom/sma/smartv3/ui/login/PhoneBindActivity$changePhone$$inlined$post$default$1;-><init>(Landroid/app/Activity;Lcom/android/mltcode/paycertificationapi/O1XIiIO;Lcom/android/mltcode/paycertificationapi/uq;)V

    invoke-static {v2}, Lcom/androidnetworking/AndroidNetworking;->post(Ljava/lang/String;)Lcom/androidnetworking/common/ANRequest$PostRequestBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Lcom/androidnetworking/common/ANRequest$PostRequestBuilder;->addBodyParameter(Ljava/util/Map;)Lcom/androidnetworking/common/ANRequest$PostRequestBuilder;

    move-result-object p1

    invoke-virtual {p1, v2}, Lcom/androidnetworking/common/ANRequest$PostRequestBuilder;->setTag(Ljava/lang/Object;)Lcom/androidnetworking/common/ANRequest$PostRequestBuilder;

    move-result-object p1

    sget-object v1, Lcom/androidnetworking/common/Priority;->HIGH:Lcom/androidnetworking/common/Priority;

    invoke-virtual {p1, v1}, Lcom/androidnetworking/common/ANRequest$PostRequestBuilder;->setPriority(Lcom/androidnetworking/common/Priority;)Lcom/androidnetworking/common/ANRequest$PostRequestBuilder;

    move-result-object p1

    invoke-virtual {p1}, Lcom/androidnetworking/common/ANRequest$PostRequestBuilder;->build()Lcom/androidnetworking/common/ANRequest;

    move-result-object p1

    new-array v1, v5, [Ljava/lang/reflect/Type;

    const-class v2, Lcom/sma/smartv3/model/AppUser;

    aput-object v2, v1, v0

    invoke-static {v3, v1}, Lcom/google/gson/reflect/TypeToken;->getParameterized(Ljava/lang/reflect/Type;[Ljava/lang/reflect/Type;)Lcom/google/gson/reflect/TypeToken;

    move-result-object v0

    new-instance v1, Lcom/sma/smartv3/ui/login/PhoneBindActivity$changePhone$$inlined$post$default$2;

    invoke-direct {v1, v7}, Lcom/sma/smartv3/ui/login/PhoneBindActivity$changePhone$$inlined$post$default$2;-><init>(Lcom/android/mltcode/paycertificationapi/O1XIiIO;)V

    invoke-virtual {p1, v0, v1}, Lcom/androidnetworking/common/ANRequest;->getAsParsed(Lcom/google/gson/reflect/TypeToken;Lcom/androidnetworking/interfaces/ParsedRequestListener;)V

    return-void

    :cond_1
    sget-object v2, Lcom/sma/smartv3/network/NetWorkUtils;->INSTANCE:Lcom/sma/smartv3/network/NetWorkUtils;

    iget-object v1, v1, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    check-cast v1, Ljava/lang/String;

    invoke-static {v1, p1}, Lcom/sma/smartv3/network/RequestBodyKt;->getVerificationCodeCheckBody(Ljava/lang/String;Ljava/lang/String;)Ljava/util/HashMap;

    move-result-object p1

    new-instance v1, Lcom/sma/smartv3/ui/login/PhoneBindActivity$changePhone$2;

    invoke-direct {v1, p0}, Lcom/sma/smartv3/ui/login/PhoneBindActivity$changePhone$2;-><init>(Lcom/sma/smartv3/ui/login/PhoneBindActivity;)V

    invoke-virtual {v2, v4, v4}, Lcom/sma/smartv3/network/NetWorkUtils;->loadPopup(Landroid/app/Activity;Landroid/view/View;)Lcom/android/mltcode/paycertificationapi/uq;

    move-result-object v6

    sget-object v7, Lcom/sma/smartv3/network/Api;->INSTANCE:Lcom/sma/smartv3/network/Api;

    invoke-virtual {v7}, Lcom/sma/smartv3/network/Api;->getBASE_URL()Ljava/lang/String;

    move-result-object v7

    const-string v8, "/verification_code/verification"

    invoke-virtual {v2, v7, v8}, Lcom/sma/smartv3/network/NetWorkUtils;->convertBaseUrl(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    new-instance v9, Ljava/lang/StringBuilder;

    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v9, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v2, v9, p1}, Lcom/sma/smartv3/network/NetWorkUtils;->printParam(Ljava/lang/String;Ljava/util/Map;)V

    sget-object v2, Lcom/sma/androidnetworklib/method/NetWork;->OXO1:Lcom/sma/androidnetworklib/method/NetWork;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    new-instance v7, Lcom/sma/smartv3/ui/login/PhoneBindActivity$changePhone$$inlined$post$default$3;

    invoke-direct {v7, v4, v1, v6}, Lcom/sma/smartv3/ui/login/PhoneBindActivity$changePhone$$inlined$post$default$3;-><init>(Landroid/app/Activity;Lcom/android/mltcode/paycertificationapi/O1XIiIO;Lcom/android/mltcode/paycertificationapi/uq;)V

    invoke-static {v2}, Lcom/androidnetworking/AndroidNetworking;->post(Ljava/lang/String;)Lcom/androidnetworking/common/ANRequest$PostRequestBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Lcom/androidnetworking/common/ANRequest$PostRequestBuilder;->addBodyParameter(Ljava/util/Map;)Lcom/androidnetworking/common/ANRequest$PostRequestBuilder;

    move-result-object p1

    invoke-virtual {p1, v2}, Lcom/androidnetworking/common/ANRequest$PostRequestBuilder;->setTag(Ljava/lang/Object;)Lcom/androidnetworking/common/ANRequest$PostRequestBuilder;

    move-result-object p1

    sget-object v1, Lcom/androidnetworking/common/Priority;->HIGH:Lcom/androidnetworking/common/Priority;

    invoke-virtual {p1, v1}, Lcom/androidnetworking/common/ANRequest$PostRequestBuilder;->setPriority(Lcom/androidnetworking/common/Priority;)Lcom/androidnetworking/common/ANRequest$PostRequestBuilder;

    move-result-object p1

    invoke-virtual {p1}, Lcom/androidnetworking/common/ANRequest$PostRequestBuilder;->build()Lcom/androidnetworking/common/ANRequest;

    move-result-object p1

    new-array v1, v5, [Ljava/lang/reflect/Type;

    const-class v2, Ljava/lang/String;

    aput-object v2, v1, v0

    invoke-static {v3, v1}, Lcom/google/gson/reflect/TypeToken;->getParameterized(Ljava/lang/reflect/Type;[Ljava/lang/reflect/Type;)Lcom/google/gson/reflect/TypeToken;

    move-result-object v0

    new-instance v1, Lcom/sma/smartv3/ui/login/PhoneBindActivity$changePhone$$inlined$post$default$4;

    invoke-direct {v1, v7}, Lcom/sma/smartv3/ui/login/PhoneBindActivity$changePhone$$inlined$post$default$4;-><init>(Lcom/android/mltcode/paycertificationapi/O1XIiIO;)V

    invoke-virtual {p1, v0, v1}, Lcom/androidnetworking/common/ANRequest;->getAsParsed(Lcom/google/gson/reflect/TypeToken;Lcom/androidnetworking/interfaces/ParsedRequestListener;)V

    return-void
.end method

.method private final getBottomBtn()Landroid/widget/Button;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/login/PhoneBindActivity;->bottomBtn$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/Button;

    return-object v0
.end method

.method private final getBtGetVerificationCode()Landroid/widget/Button;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/login/PhoneBindActivity;->btGetVerificationCode$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/Button;

    return-object v0
.end method

.method private final getLlCheckCode()Landroid/widget/LinearLayout;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/login/PhoneBindActivity;->llCheckCode$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    return-object v0
.end method

.method private final getLlInputPhone()Landroid/widget/LinearLayout;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/login/PhoneBindActivity;->llInputPhone$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    return-object v0
.end method

.method private final getPhone()Lcom/google/android/material/textfield/TextInputEditText;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/login/PhoneBindActivity;->phone$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/material/textfield/TextInputEditText;

    return-object v0
.end method

.method private final getRv()Landroid/widget/LinearLayout;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/login/PhoneBindActivity;->rv$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    return-object v0
.end method

.method private final getTvCode()Landroid/widget/TextView;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/login/PhoneBindActivity;->tvCode$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    return-object v0
.end method

.method private final getTvCodeError()Lcom/sma/smartv3/view/text/PFMedium;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/login/PhoneBindActivity;->tvCodeError$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/sma/smartv3/view/text/PFMedium;

    return-object v0
.end method

.method private final getTvDescription()Lcom/sma/smartv3/view/text/PFMedium;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/login/PhoneBindActivity;->tvDescription$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/sma/smartv3/view/text/PFMedium;

    return-object v0
.end method

.method private final getTvTitle()Lcom/sma/smartv3/view/text/PFMedium;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/login/PhoneBindActivity;->tvTitle$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/sma/smartv3/view/text/PFMedium;

    return-object v0
.end method

.method private final getVerificationCode()Lcom/google/android/material/textfield/TextInputEditText;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/sma/smartv3/ui/login/PhoneBindActivity;->verificationCode$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/material/textfield/TextInputEditText;

    return-object v0
.end method

.method public static synthetic iIiiO(Lcom/sma/smartv3/ui/login/PhoneBindActivity;)Landroid/widget/LinearLayout;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/login/PhoneBindActivity;->rv_delegate$lambda$0(Lcom/sma/smartv3/ui/login/PhoneBindActivity;)Landroid/widget/LinearLayout;

    move-result-object p0

    return-object p0
.end method

.method private static final initView$lambda$1(Lcom/sma/smartv3/ui/login/PhoneBindActivity;)V
    .locals 2

    invoke-direct {p0}, Lcom/sma/smartv3/ui/login/PhoneBindActivity;->getPhone()Lcom/google/android/material/textfield/TextInputEditText;

    move-result-object v0

    const-string v1, "<get-phone>(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, v0}, Lcom/sma/smartv3/ui/login/PhoneBindActivity;->getVerificationCode(Landroid/view/View;)V

    return-void
.end method

.method private static final initView$lambda$2(Lcom/sma/smartv3/ui/login/PhoneBindActivity;Landroid/widget/TextView;ILandroid/view/KeyEvent;)Z
    .locals 0

    const/4 p1, 0x6

    if-ne p2, p1, :cond_0

    invoke-direct {p0}, Lcom/sma/smartv3/ui/login/PhoneBindActivity;->getPhone()Lcom/google/android/material/textfield/TextInputEditText;

    move-result-object p1

    const-string p2, "<get-phone>(...)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1}, Lcom/sma/smartv3/ui/login/PhoneBindActivity;->getVerificationCode(Landroid/view/View;)V

    :cond_0
    const/4 p0, 0x0

    return p0
.end method

.method private static final initView$lambda$3(Lcom/sma/smartv3/ui/login/PhoneBindActivity;Landroid/widget/TextView;ILandroid/view/KeyEvent;)Z
    .locals 0

    const/4 p1, 0x6

    if-ne p2, p1, :cond_0

    invoke-direct {p0}, Lcom/sma/smartv3/ui/login/PhoneBindActivity;->getVerificationCode()Lcom/google/android/material/textfield/TextInputEditText;

    move-result-object p1

    invoke-virtual {p1}, Landroidx/appcompat/widget/AppCompatEditText;->getText()Landroid/text/Editable;

    move-result-object p1

    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Lcom/sma/smartv3/ui/login/PhoneBindActivity;->changePhone(Ljava/lang/String;)V

    :cond_0
    const/4 p0, 0x0

    return p0
.end method

.method private static final llCheckCode_delegate$lambda$0(Lcom/sma/smartv3/ui/login/PhoneBindActivity;)Landroid/widget/LinearLayout;
    .locals 1

    const v0, 0x7f0a06b8

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/LinearLayout;

    return-object p0
.end method

.method private static final llInputPhone_delegate$lambda$0(Lcom/sma/smartv3/ui/login/PhoneBindActivity;)Landroid/widget/LinearLayout;
    .locals 1

    const v0, 0x7f0a06be

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/LinearLayout;

    return-object p0
.end method

.method private static final phone_delegate$lambda$0(Lcom/sma/smartv3/ui/login/PhoneBindActivity;)Lcom/google/android/material/textfield/TextInputEditText;
    .locals 1

    const v0, 0x7f0a0910

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Lcom/google/android/material/textfield/TextInputEditText;

    return-object p0
.end method

.method private static final rv_delegate$lambda$0(Lcom/sma/smartv3/ui/login/PhoneBindActivity;)Landroid/widget/LinearLayout;
    .locals 1

    const v0, 0x7f0a09c1

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/LinearLayout;

    return-object p0
.end method

.method private static final tvCodeError_delegate$lambda$0(Lcom/sma/smartv3/ui/login/PhoneBindActivity;)Lcom/sma/smartv3/view/text/PFMedium;
    .locals 1

    const v0, 0x7f0a0bff

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Lcom/sma/smartv3/view/text/PFMedium;

    return-object p0
.end method

.method private static final tvCode_delegate$lambda$0(Lcom/sma/smartv3/ui/login/PhoneBindActivity;)Landroid/widget/TextView;
    .locals 1

    const v0, 0x7f0a0c53

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/TextView;

    return-object p0
.end method

.method private static final tvDescription_delegate$lambda$0(Lcom/sma/smartv3/ui/login/PhoneBindActivity;)Lcom/sma/smartv3/view/text/PFMedium;
    .locals 1

    const v0, 0x7f0a0c04

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Lcom/sma/smartv3/view/text/PFMedium;

    return-object p0
.end method

.method private static final tvTitle_delegate$lambda$0(Lcom/sma/smartv3/ui/login/PhoneBindActivity;)Lcom/sma/smartv3/view/text/PFMedium;
    .locals 1

    const v0, 0x7f0a0c17

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Lcom/sma/smartv3/view/text/PFMedium;

    return-object p0
.end method

.method private static final verificationCode_delegate$lambda$0(Lcom/sma/smartv3/ui/login/PhoneBindActivity;)Lcom/google/android/material/textfield/TextInputEditText;
    .locals 1

    const v0, 0x7f0a18ea

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Lcom/google/android/material/textfield/TextInputEditText;

    return-object p0
.end method


# virtual methods
.method public final backClick(Landroid/view/View;)V
    .locals 2
    .param p1    # Landroid/view/View;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "view"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p1, Lcom/android/mltcode/paycertificationapi/a01;->OXO1:Lcom/android/mltcode/paycertificationapi/a01;

    invoke-virtual {p1}, Lcom/android/mltcode/paycertificationapi/a01;->IiI10X()Lcom/blankj/utilcode/util/SPUtils;

    move-result-object p1

    const-string v0, "IS_SKIP_SET_PHONE"

    const/4 v1, 0x1

    invoke-virtual {p1, v0, v1}, Lcom/blankj/utilcode/util/SPUtils;->put(Ljava/lang/String;Z)V

    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    return-void
.end method

.method public final getVerificationCode(Landroid/view/View;)V
    .locals 10
    .param p1    # Landroid/view/View;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "view"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Lcom/sma/smartv3/ui/login/PhoneBindActivity;->getPhone()Lcom/google/android/material/textfield/TextInputEditText;

    move-result-object p1

    invoke-virtual {p1}, Landroidx/appcompat/widget/AppCompatEditText;->getText()Landroid/text/Editable;

    move-result-object p1

    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lcom/sma/smartv3/util/UtilsKt;->IXOIIIO(Ljava/lang/String;)Z

    move-result p1

    if-nez p1, :cond_0

    const p1, 0x7f140d1f

    .line 3
    invoke-static {p1}, Lcom/blankj/utilcode/util/ToastUtils;->showShort(I)V

    return-void

    .line 4
    :cond_0
    iget p1, p0, Lcom/sma/smartv3/ui/login/PhoneBindActivity;->nowPage:I

    if-nez p1, :cond_1

    add-int/lit8 p1, p1, 0x1

    .line 5
    iput p1, p0, Lcom/sma/smartv3/ui/login/PhoneBindActivity;->nowPage:I

    .line 6
    :cond_1
    invoke-direct {p0}, Lcom/sma/smartv3/ui/login/PhoneBindActivity;->getLlInputPhone()Landroid/widget/LinearLayout;

    move-result-object p1

    const/16 v0, 0x8

    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

    .line 7
    invoke-direct {p0}, Lcom/sma/smartv3/ui/login/PhoneBindActivity;->getLlCheckCode()Landroid/widget/LinearLayout;

    move-result-object p1

    const/4 v1, 0x0

    invoke-virtual {p1, v1}, Landroid/view/View;->setVisibility(I)V

    .line 8
    invoke-direct {p0}, Lcom/sma/smartv3/ui/login/PhoneBindActivity;->getTvCodeError()Lcom/sma/smartv3/view/text/PFMedium;

    move-result-object p1

    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

    .line 9
    sget-object v1, Lcom/sma/smartv3/network/RequestCommonMethod;->INSTANCE:Lcom/sma/smartv3/network/RequestCommonMethod;

    .line 10
    invoke-direct {p0}, Lcom/sma/smartv3/ui/login/PhoneBindActivity;->getRv()Landroid/widget/LinearLayout;

    move-result-object v3

    .line 11
    invoke-direct {p0}, Lcom/sma/smartv3/ui/login/PhoneBindActivity;->getPhone()Lcom/google/android/material/textfield/TextInputEditText;

    move-result-object p1

    invoke-virtual {p1}, Landroidx/appcompat/widget/AppCompatEditText;->getText()Landroid/text/Editable;

    move-result-object p1

    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    .line 12
    invoke-direct {p0}, Lcom/sma/smartv3/ui/login/PhoneBindActivity;->getBtGetVerificationCode()Landroid/widget/Button;

    move-result-object v5

    const-string p1, "<get-btGetVerificationCode>(...)"

    invoke-static {v5, p1}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    .line 13
    iget v6, p0, Lcom/sma/smartv3/ui/login/PhoneBindActivity;->verificationType:I

    const/16 v8, 0x20

    const/4 v9, 0x0

    const/4 v7, 0x0

    move-object v2, p0

    .line 14
    invoke-static/range {v1 .. v9}, Lcom/sma/smartv3/network/RequestCommonMethod;->requestVerificationCode$default(Lcom/sma/smartv3/network/RequestCommonMethod;Landroid/app/Activity;Landroid/view/View;Ljava/lang/String;Landroid/widget/TextView;ILcom/android/mltcode/paycertificationapi/O1XIiIO;ILjava/lang/Object;)V

    return-void
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
    .locals 12

    iget-object v0, p0, Lcom/sma/smartv3/ui/login/PhoneBindActivity;->mAppUser:Lcom/sma/smartv3/model/AppUser;

    invoke-virtual {v0}, Lcom/sma/smartv3/model/AppUser;->getPhone()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v0

    const/4 v1, 0x2

    const/4 v2, 0x0

    if-nez v0, :cond_0

    iput v1, p0, Lcom/sma/smartv3/ui/login/PhoneBindActivity;->verificationType:I

    iput-boolean v2, p0, Lcom/sma/smartv3/ui/login/PhoneBindActivity;->isExistsPhone:Z

    invoke-direct {p0}, Lcom/sma/smartv3/ui/login/PhoneBindActivity;->getTvTitle()Lcom/sma/smartv3/view/text/PFMedium;

    move-result-object v0

    const v1, 0x7f14020a

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/login/PhoneBindActivity;->getTvDescription()Lcom/sma/smartv3/view/text/PFMedium;

    move-result-object v0

    const v1, 0x7f14020b

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    goto/16 :goto_1

    :cond_0
    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseActivity;->getMArg1()I

    move-result v0

    const/16 v3, 0x8

    const v4, 0x7f1411bb

    const/4 v5, 0x1

    if-ne v0, v5, :cond_1

    iget v0, p0, Lcom/sma/smartv3/ui/login/PhoneBindActivity;->nowPage:I

    add-int/2addr v0, v5

    iput v0, p0, Lcom/sma/smartv3/ui/login/PhoneBindActivity;->nowPage:I

    iput v1, p0, Lcom/sma/smartv3/ui/login/PhoneBindActivity;->verificationType:I

    iput-boolean v2, p0, Lcom/sma/smartv3/ui/login/PhoneBindActivity;->isExistsPhone:Z

    invoke-direct {p0}, Lcom/sma/smartv3/ui/login/PhoneBindActivity;->getTvTitle()Lcom/sma/smartv3/view/text/PFMedium;

    move-result-object v0

    const v1, 0x7f14146a

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/login/PhoneBindActivity;->getTvDescription()Lcom/sma/smartv3/view/text/PFMedium;

    move-result-object v0

    invoke-virtual {v0, v4}, Landroid/widget/TextView;->setText(I)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/login/PhoneBindActivity;->getLlInputPhone()Landroid/widget/LinearLayout;

    move-result-object v0

    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/login/PhoneBindActivity;->getBottomBtn()Landroid/widget/Button;

    move-result-object v0

    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/login/PhoneBindActivity;->getLlCheckCode()Landroid/widget/LinearLayout;

    move-result-object v0

    invoke-virtual {v0, v3}, Landroid/view/View;->setVisibility(I)V

    goto/16 :goto_1

    :cond_1
    iput v5, p0, Lcom/sma/smartv3/ui/login/PhoneBindActivity;->verificationType:I

    const/4 v0, -0x1

    iput v0, p0, Lcom/sma/smartv3/ui/login/PhoneBindActivity;->nowPage:I

    iput-boolean v5, p0, Lcom/sma/smartv3/ui/login/PhoneBindActivity;->isExistsPhone:Z

    invoke-direct {p0}, Lcom/sma/smartv3/ui/login/PhoneBindActivity;->getTvTitle()Lcom/sma/smartv3/view/text/PFMedium;

    move-result-object v0

    const v1, 0x7f1411ba

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/login/PhoneBindActivity;->getTvDescription()Lcom/sma/smartv3/view/text/PFMedium;

    move-result-object v0

    invoke-virtual {v0, v4}, Landroid/widget/TextView;->setText(I)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/login/PhoneBindActivity;->mAppUser:Lcom/sma/smartv3/model/AppUser;

    invoke-virtual {v0}, Lcom/sma/smartv3/model/AppUser;->getPhone()Ljava/lang/String;

    move-result-object v6

    const-string v0, "-"

    filled-new-array {v0}, [Ljava/lang/String;

    move-result-object v7

    const/4 v10, 0x6

    const/4 v11, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    invoke-static/range {v6 .. v11}, Lkotlin/text/StringsKt__StringsKt;->i1I(Ljava/lang/CharSequence;[Ljava/lang/String;ZIILjava/lang/Object;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    if-le v1, v5, :cond_2

    invoke-direct {p0}, Lcom/sma/smartv3/ui/login/PhoneBindActivity;->getTvCode()Landroid/widget/TextView;

    move-result-object v1

    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/CharSequence;

    invoke-virtual {v1, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/login/PhoneBindActivity;->getPhone()Lcom/google/android/material/textfield/TextInputEditText;

    move-result-object v1

    invoke-interface {v0, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/CharSequence;

    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_0

    :cond_2
    invoke-direct {p0}, Lcom/sma/smartv3/ui/login/PhoneBindActivity;->getTvCode()Landroid/widget/TextView;

    move-result-object v0

    const-string v1, "+86"

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/login/PhoneBindActivity;->getPhone()Lcom/google/android/material/textfield/TextInputEditText;

    move-result-object v0

    iget-object v1, p0, Lcom/sma/smartv3/ui/login/PhoneBindActivity;->mAppUser:Lcom/sma/smartv3/model/AppUser;

    invoke-virtual {v1}, Lcom/sma/smartv3/model/AppUser;->getPhone()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :goto_0
    invoke-direct {p0}, Lcom/sma/smartv3/ui/login/PhoneBindActivity;->getBottomBtn()Landroid/widget/Button;

    move-result-object v0

    invoke-virtual {v0, v3}, Landroid/view/View;->setVisibility(I)V

    const v0, 0x7f141498

    invoke-virtual {p0, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    new-array v1, v2, [Ljava/lang/Object;

    invoke-static {v0, v1}, Lcom/blankj/utilcode/util/ToastUtils;->showShort(Ljava/lang/String;[Ljava/lang/Object;)V

    new-instance v0, Landroid/os/Handler;

    invoke-direct {v0}, Landroid/os/Handler;-><init>()V

    new-instance v1, Lcom/android/mltcode/paycertificationapi/ou1;

    invoke-direct {v1, p0}, Lcom/android/mltcode/paycertificationapi/ou1;-><init>(Lcom/sma/smartv3/ui/login/PhoneBindActivity;)V

    const-wide/16 v3, 0x7d0

    invoke-virtual {v0, v1, v3, v4}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    :goto_1
    invoke-direct {p0}, Lcom/sma/smartv3/ui/login/PhoneBindActivity;->getBottomBtn()Landroid/widget/Button;

    move-result-object v0

    invoke-virtual {v0, v2}, Landroid/view/View;->setEnabled(Z)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/login/PhoneBindActivity;->getPhone()Lcom/google/android/material/textfield/TextInputEditText;

    move-result-object v0

    new-instance v1, Lcom/sma/smartv3/ui/login/PhoneBindActivity$OXO1;

    invoke-direct {v1, p0}, Lcom/sma/smartv3/ui/login/PhoneBindActivity$OXO1;-><init>(Lcom/sma/smartv3/ui/login/PhoneBindActivity;)V

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->addTextChangedListener(Landroid/text/TextWatcher;)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/login/PhoneBindActivity;->getVerificationCode()Lcom/google/android/material/textfield/TextInputEditText;

    move-result-object v0

    new-instance v1, Lcom/sma/smartv3/ui/login/PhoneBindActivity$XIi00iiXO;

    invoke-direct {v1, p0}, Lcom/sma/smartv3/ui/login/PhoneBindActivity$XIi00iiXO;-><init>(Lcom/sma/smartv3/ui/login/PhoneBindActivity;)V

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->addTextChangedListener(Landroid/text/TextWatcher;)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/login/PhoneBindActivity;->getPhone()Lcom/google/android/material/textfield/TextInputEditText;

    move-result-object v0

    new-instance v1, Lcom/android/mltcode/paycertificationapi/pu1;

    invoke-direct {v1, p0}, Lcom/android/mltcode/paycertificationapi/pu1;-><init>(Lcom/sma/smartv3/ui/login/PhoneBindActivity;)V

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setOnEditorActionListener(Landroid/widget/TextView$OnEditorActionListener;)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/login/PhoneBindActivity;->getVerificationCode()Lcom/google/android/material/textfield/TextInputEditText;

    move-result-object v0

    new-instance v1, Lcom/android/mltcode/paycertificationapi/qu1;

    invoke-direct {v1, p0}, Lcom/android/mltcode/paycertificationapi/qu1;-><init>(Lcom/sma/smartv3/ui/login/PhoneBindActivity;)V

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setOnEditorActionListener(Landroid/widget/TextView$OnEditorActionListener;)V

    return-void
.end method

.method public layoutId()I
    .locals 1

    const v0, 0x7f0d00df

    return v0
.end method

.method public onHandleBackPressed()V
    .locals 2

    iget v0, p0, Lcom/sma/smartv3/ui/login/PhoneBindActivity;->nowPage:I

    if-lez v0, :cond_0

    add-int/lit8 v0, v0, -0x1

    iput v0, p0, Lcom/sma/smartv3/ui/login/PhoneBindActivity;->nowPage:I

    invoke-direct {p0}, Lcom/sma/smartv3/ui/login/PhoneBindActivity;->getLlInputPhone()Landroid/widget/LinearLayout;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/login/PhoneBindActivity;->getBottomBtn()Landroid/widget/Button;

    move-result-object v0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/login/PhoneBindActivity;->getLlCheckCode()Landroid/widget/LinearLayout;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    return-void

    :cond_0
    invoke-direct {p0}, Lcom/sma/smartv3/ui/login/PhoneBindActivity;->getRv()Landroid/widget/LinearLayout;

    move-result-object v0

    const-string v1, "<get-rv>(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, v0}, Lcom/sma/smartv3/ui/login/PhoneBindActivity;->backClick(Landroid/view/View;)V

    return-void
.end method
