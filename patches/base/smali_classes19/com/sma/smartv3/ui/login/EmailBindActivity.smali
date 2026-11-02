.class public final Lcom/sma/smartv3/ui/login/EmailBindActivity;
.super Lcom/bestmafen/androidbase/base/BaseActivity;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/sma/smartv3/ui/login/EmailBindActivity$OXO1;
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nEmailBindActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EmailBindActivity.kt\ncom/sma/smartv3/ui/login/EmailBindActivity\n+ 2 NetWorkUtils.kt\ncom/sma/smartv3/network/NetWorkUtils\n+ 3 NetWork.kt\ncom/sma/androidnetworklib/method/NetWork\n+ 4 Activity.kt\ncom/bestmafen/androidbase/extension/ActivityKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 6 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n*L\n1#1,289:1\n176#2,11:290\n196#2:309\n176#2,11:310\n196#2:329\n252#3,7:301\n270#3:308\n252#3,7:321\n270#3:328\n69#4,3:330\n72#4,5:334\n69#4,3:339\n72#4,5:343\n1#5:333\n1#5:342\n19#6:348\n15#6:349\n*S KotlinDebug\n*F\n+ 1 EmailBindActivity.kt\ncom/sma/smartv3/ui/login/EmailBindActivity\n*L\n140#1:290,11\n140#1:309\n166#1:310,11\n166#1:329\n140#1:301,7\n140#1:308\n166#1:321,7\n166#1:328\n200#1:330,3\n200#1:334,5\n275#1:339,3\n275#1:343,5\n200#1:333\n275#1:342\n48#1:348\n48#1:349\n*E\n"
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nEmailBindActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EmailBindActivity.kt\ncom/sma/smartv3/ui/login/EmailBindActivity\n+ 2 NetWorkUtils.kt\ncom/sma/smartv3/network/NetWorkUtils\n+ 3 NetWork.kt\ncom/sma/androidnetworklib/method/NetWork\n+ 4 Activity.kt\ncom/bestmafen/androidbase/extension/ActivityKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 6 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n*L\n1#1,289:1\n176#2,11:290\n196#2:309\n176#2,11:310\n196#2:329\n252#3,7:301\n270#3:308\n252#3,7:321\n270#3:328\n69#4,3:330\n72#4,5:334\n69#4,3:339\n72#4,5:343\n1#5:333\n1#5:342\n19#6:348\n15#6:349\n*S KotlinDebug\n*F\n+ 1 EmailBindActivity.kt\ncom/sma/smartv3/ui/login/EmailBindActivity\n*L\n140#1:290,11\n140#1:309\n166#1:310,11\n166#1:329\n140#1:301,7\n140#1:308\n166#1:321,7\n166#1:328\n200#1:330,3\n200#1:334,5\n275#1:339,3\n275#1:343,5\n200#1:333\n275#1:342\n48#1:348\n48#1:349\n*E\n"
    }
.end annotation


# static fields
.field public static final Companion:Lcom/sma/smartv3/ui/login/EmailBindActivity$OXO1;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public static final TYPE_DEFAULT:I = 0x0

.field public static final TYPE_FORCED:I = 0x2

.field public static final TYPE_NEW_MAIL:I = 0x1

.field public static final TYPE_RECOVER_DEFAULT:I = 0x3


# instance fields
.field private final bottomBtn$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final bottomErrorLogin$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final btGetVerificationCode$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final email$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private isExistsEmail:Z

.field private final llCheckCode$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final llInputEmail$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final mAppUser$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private nowPage:I

.field private final rv$delegate:Lkotlin/Lazy;
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
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/sma/smartv3/ui/login/EmailBindActivity$OXO1;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/sma/smartv3/ui/login/EmailBindActivity$OXO1;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/sma/smartv3/ui/login/EmailBindActivity;->Companion:Lcom/sma/smartv3/ui/login/EmailBindActivity$OXO1;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lcom/bestmafen/androidbase/base/BaseActivity;-><init>()V

    new-instance v0, Lcom/android/mltcode/paycertificationapi/IiXXIIXO;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/IiXXIIXO;-><init>(Lcom/sma/smartv3/ui/login/EmailBindActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/login/EmailBindActivity;->rv$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/I00XII1i;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/I00XII1i;-><init>(Lcom/sma/smartv3/ui/login/EmailBindActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/login/EmailBindActivity;->llInputEmail$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/iOII0iii1;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/iOII0iii1;-><init>(Lcom/sma/smartv3/ui/login/EmailBindActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/login/EmailBindActivity;->llCheckCode$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/IIOXXI0X;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/IIOXXI0X;-><init>(Lcom/sma/smartv3/ui/login/EmailBindActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/login/EmailBindActivity;->tvTitle$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/iIOX10;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/iIOX10;-><init>(Lcom/sma/smartv3/ui/login/EmailBindActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/login/EmailBindActivity;->tvDescription$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/OX0iXI;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/OX0iXI;-><init>(Lcom/sma/smartv3/ui/login/EmailBindActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/login/EmailBindActivity;->email$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/OI1O1XO00;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/OI1O1XO00;-><init>(Lcom/sma/smartv3/ui/login/EmailBindActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/login/EmailBindActivity;->verificationCode$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/I110II;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/I110II;-><init>(Lcom/sma/smartv3/ui/login/EmailBindActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/login/EmailBindActivity;->btGetVerificationCode$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/X0II0XO;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/X0II0XO;-><init>(Lcom/sma/smartv3/ui/login/EmailBindActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/login/EmailBindActivity;->bottomBtn$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/i1IX01;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/i1IX01;-><init>(Lcom/sma/smartv3/ui/login/EmailBindActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/login/EmailBindActivity;->tvCodeError$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/XXiI0IX;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/XXiI0IX;-><init>(Lcom/sma/smartv3/ui/login/EmailBindActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/login/EmailBindActivity;->bottomErrorLogin$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/XO1OII10O;

    invoke-direct {v0}, Lcom/android/mltcode/paycertificationapi/XO1OII10O;-><init>()V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/login/EmailBindActivity;->mAppUser$delegate:Lkotlin/Lazy;

    return-void
.end method

.method public static synthetic I0iXXO(Lcom/sma/smartv3/ui/login/EmailBindActivity;Landroid/widget/TextView;ILandroid/view/KeyEvent;)Z
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lcom/sma/smartv3/ui/login/EmailBindActivity;->initView$lambda$2(Lcom/sma/smartv3/ui/login/EmailBindActivity;Landroid/widget/TextView;ILandroid/view/KeyEvent;)Z

    move-result p0

    return p0
.end method

.method public static synthetic I1XOi1(Lcom/sma/smartv3/ui/login/EmailBindActivity;)Landroid/widget/LinearLayout;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/login/EmailBindActivity;->llCheckCode_delegate$lambda$0(Lcom/sma/smartv3/ui/login/EmailBindActivity;)Landroid/widget/LinearLayout;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic IIX1OXO(Lcom/sma/smartv3/ui/login/EmailBindActivity;)Landroid/widget/LinearLayout;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/login/EmailBindActivity;->llInputEmail_delegate$lambda$0(Lcom/sma/smartv3/ui/login/EmailBindActivity;)Landroid/widget/LinearLayout;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic O10IXXX0X(Lcom/sma/smartv3/ui/login/EmailBindActivity;)Lcom/sma/smartv3/view/text/PFMedium;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/login/EmailBindActivity;->tvDescription_delegate$lambda$0(Lcom/sma/smartv3/ui/login/EmailBindActivity;)Lcom/sma/smartv3/view/text/PFMedium;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic OII(Lcom/sma/smartv3/ui/login/EmailBindActivity;)Landroid/widget/Button;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/login/EmailBindActivity;->bottomBtn_delegate$lambda$0(Lcom/sma/smartv3/ui/login/EmailBindActivity;)Landroid/widget/Button;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic OIX0iXi(Lcom/sma/smartv3/ui/login/EmailBindActivity;)Lcom/sma/smartv3/view/text/PFMedium;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/login/EmailBindActivity;->tvTitle_delegate$lambda$0(Lcom/sma/smartv3/ui/login/EmailBindActivity;)Lcom/sma/smartv3/view/text/PFMedium;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic OX(Lcom/sma/smartv3/ui/login/EmailBindActivity;)Landroid/widget/Button;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/login/EmailBindActivity;->btGetVerificationCode_delegate$lambda$0(Lcom/sma/smartv3/ui/login/EmailBindActivity;)Landroid/widget/Button;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic OiIIX101O(Lcom/sma/smartv3/ui/login/EmailBindActivity;)Lcom/google/android/material/textfield/TextInputEditText;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/login/EmailBindActivity;->verificationCode_delegate$lambda$0(Lcom/sma/smartv3/ui/login/EmailBindActivity;)Lcom/google/android/material/textfield/TextInputEditText;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic X0O(Lcom/sma/smartv3/ui/login/EmailBindActivity;Landroid/widget/TextView;ILandroid/view/KeyEvent;)Z
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lcom/sma/smartv3/ui/login/EmailBindActivity;->initView$lambda$1(Lcom/sma/smartv3/ui/login/EmailBindActivity;Landroid/widget/TextView;ILandroid/view/KeyEvent;)Z

    move-result p0

    return p0
.end method

.method public static synthetic X1ii(Lcom/sma/smartv3/ui/login/EmailBindActivity;)Landroid/widget/LinearLayout;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/login/EmailBindActivity;->rv_delegate$lambda$0(Lcom/sma/smartv3/ui/login/EmailBindActivity;)Landroid/widget/LinearLayout;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic XX0(Lcom/sma/smartv3/ui/login/EmailBindActivity;)Lcom/sma/smartv3/view/text/PFMedium;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/login/EmailBindActivity;->tvCodeError_delegate$lambda$0(Lcom/sma/smartv3/ui/login/EmailBindActivity;)Lcom/sma/smartv3/view/text/PFMedium;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic XXI(Lcom/sma/smartv3/ui/login/EmailBindActivity;)Lcom/google/android/material/textfield/TextInputEditText;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/login/EmailBindActivity;->email_delegate$lambda$0(Lcom/sma/smartv3/ui/login/EmailBindActivity;)Lcom/google/android/material/textfield/TextInputEditText;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic XiOIO()Lcom/sma/smartv3/model/AppUser;
    .locals 1

    invoke-static {}, Lcom/sma/smartv3/ui/login/EmailBindActivity;->mAppUser_delegate$lambda$0()Lcom/sma/smartv3/model/AppUser;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic XiOIii1(Lcom/sma/smartv3/ui/login/EmailBindActivity;)Landroid/widget/Button;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/login/EmailBindActivity;->bottomErrorLogin_delegate$lambda$0(Lcom/sma/smartv3/ui/login/EmailBindActivity;)Landroid/widget/Button;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$changeEmail(Lcom/sma/smartv3/ui/login/EmailBindActivity;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/sma/smartv3/ui/login/EmailBindActivity;->changeEmail(Ljava/lang/String;)V

    return-void
.end method

.method public static final synthetic access$getBottomBtn(Lcom/sma/smartv3/ui/login/EmailBindActivity;)Landroid/widget/Button;
    .locals 0

    invoke-direct {p0}, Lcom/sma/smartv3/ui/login/EmailBindActivity;->getBottomBtn()Landroid/widget/Button;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$getEmail(Lcom/sma/smartv3/ui/login/EmailBindActivity;)Lcom/google/android/material/textfield/TextInputEditText;
    .locals 0

    invoke-direct {p0}, Lcom/sma/smartv3/ui/login/EmailBindActivity;->getEmail()Lcom/google/android/material/textfield/TextInputEditText;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$getMAppUser(Lcom/sma/smartv3/ui/login/EmailBindActivity;)Lcom/sma/smartv3/model/AppUser;
    .locals 0

    invoke-direct {p0}, Lcom/sma/smartv3/ui/login/EmailBindActivity;->getMAppUser()Lcom/sma/smartv3/model/AppUser;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$getTvCodeError(Lcom/sma/smartv3/ui/login/EmailBindActivity;)Lcom/sma/smartv3/view/text/PFMedium;
    .locals 0

    invoke-direct {p0}, Lcom/sma/smartv3/ui/login/EmailBindActivity;->getTvCodeError()Lcom/sma/smartv3/view/text/PFMedium;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$getVerificationCode(Lcom/sma/smartv3/ui/login/EmailBindActivity;)Lcom/google/android/material/textfield/TextInputEditText;
    .locals 0

    invoke-direct {p0}, Lcom/sma/smartv3/ui/login/EmailBindActivity;->getVerificationCode()Lcom/google/android/material/textfield/TextInputEditText;

    move-result-object p0

    return-object p0
.end method

.method private static final bottomBtn_delegate$lambda$0(Lcom/sma/smartv3/ui/login/EmailBindActivity;)Landroid/widget/Button;
    .locals 1

    const v0, 0x7f0a0164

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/Button;

    return-object p0
.end method

.method private static final bottomErrorLogin_delegate$lambda$0(Lcom/sma/smartv3/ui/login/EmailBindActivity;)Landroid/widget/Button;
    .locals 1

    const v0, 0x7f0a01c5

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/Button;

    return-object p0
.end method

.method private static final btGetVerificationCode_delegate$lambda$0(Lcom/sma/smartv3/ui/login/EmailBindActivity;)Landroid/widget/Button;
    .locals 1

    const v0, 0x7f0a017f

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/Button;

    return-object p0
.end method

.method private final changeEmail(Ljava/lang/String;)V
    .locals 10

    const/4 v0, 0x0

    const/4 v1, 0x1

    invoke-direct {p0}, Lcom/sma/smartv3/ui/login/EmailBindActivity;->getMAppUser()Lcom/sma/smartv3/model/AppUser;

    move-result-object v2

    invoke-virtual {v2}, Lcom/sma/smartv3/model/AppUser;->getEmail()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v2}, Ljava/lang/CharSequence;->length()I

    move-result v2

    const-class v3, Lcom/sma/androidnetworklib/model/Response;

    const/4 v4, 0x0

    if-nez v2, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseActivity;->getMArg1()I

    move-result v2

    if-ne v2, v1, :cond_1

    :goto_0
    sget-object v2, Lcom/sma/smartv3/network/NetWorkUtils;->INSTANCE:Lcom/sma/smartv3/network/NetWorkUtils;

    invoke-direct {p0}, Lcom/sma/smartv3/ui/login/EmailBindActivity;->getMAppUser()Lcom/sma/smartv3/model/AppUser;

    move-result-object v5

    invoke-virtual {v5}, Lcom/sma/smartv3/model/AppUser;->getIdentity()Ljava/lang/String;

    move-result-object v5

    invoke-direct {p0}, Lcom/sma/smartv3/ui/login/EmailBindActivity;->getEmail()Lcom/google/android/material/textfield/TextInputEditText;

    move-result-object v6

    invoke-virtual {v6}, Landroidx/appcompat/widget/AppCompatEditText;->getText()Landroid/text/Editable;

    move-result-object v6

    invoke-static {v6}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v6

    invoke-static {v5, v6, p1}, Lcom/sma/smartv3/network/RequestBodyKt;->getSetEmailBody(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/util/HashMap;

    move-result-object p1

    new-instance v5, Lcom/sma/smartv3/ui/login/EmailBindActivity$changeEmail$1;

    invoke-direct {v5, p0}, Lcom/sma/smartv3/ui/login/EmailBindActivity$changeEmail$1;-><init>(Lcom/sma/smartv3/ui/login/EmailBindActivity;)V

    invoke-virtual {v2, v4, v4}, Lcom/sma/smartv3/network/NetWorkUtils;->loadPopup(Landroid/app/Activity;Landroid/view/View;)Lcom/android/mltcode/paycertificationapi/uq;

    move-result-object v6

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

    new-instance v7, Lcom/sma/smartv3/ui/login/EmailBindActivity$changeEmail$$inlined$post$default$1;

    invoke-direct {v7, v4, v5, v6}, Lcom/sma/smartv3/ui/login/EmailBindActivity$changeEmail$$inlined$post$default$1;-><init>(Landroid/app/Activity;Lcom/android/mltcode/paycertificationapi/O1XIiIO;Lcom/android/mltcode/paycertificationapi/uq;)V

    invoke-static {v2}, Lcom/androidnetworking/AndroidNetworking;->post(Ljava/lang/String;)Lcom/androidnetworking/common/ANRequest$PostRequestBuilder;

    move-result-object v4

    invoke-virtual {v4, p1}, Lcom/androidnetworking/common/ANRequest$PostRequestBuilder;->addBodyParameter(Ljava/util/Map;)Lcom/androidnetworking/common/ANRequest$PostRequestBuilder;

    move-result-object p1

    invoke-virtual {p1, v2}, Lcom/androidnetworking/common/ANRequest$PostRequestBuilder;->setTag(Ljava/lang/Object;)Lcom/androidnetworking/common/ANRequest$PostRequestBuilder;

    move-result-object p1

    sget-object v2, Lcom/androidnetworking/common/Priority;->HIGH:Lcom/androidnetworking/common/Priority;

    invoke-virtual {p1, v2}, Lcom/androidnetworking/common/ANRequest$PostRequestBuilder;->setPriority(Lcom/androidnetworking/common/Priority;)Lcom/androidnetworking/common/ANRequest$PostRequestBuilder;

    move-result-object p1

    invoke-virtual {p1}, Lcom/androidnetworking/common/ANRequest$PostRequestBuilder;->build()Lcom/androidnetworking/common/ANRequest;

    move-result-object p1

    new-array v1, v1, [Ljava/lang/reflect/Type;

    const-class v2, Lcom/sma/smartv3/model/AppUser;

    aput-object v2, v1, v0

    invoke-static {v3, v1}, Lcom/google/gson/reflect/TypeToken;->getParameterized(Ljava/lang/reflect/Type;[Ljava/lang/reflect/Type;)Lcom/google/gson/reflect/TypeToken;

    move-result-object v0

    new-instance v1, Lcom/sma/smartv3/ui/login/EmailBindActivity$changeEmail$$inlined$post$default$2;

    invoke-direct {v1, v7}, Lcom/sma/smartv3/ui/login/EmailBindActivity$changeEmail$$inlined$post$default$2;-><init>(Lcom/android/mltcode/paycertificationapi/O1XIiIO;)V

    invoke-virtual {p1, v0, v1}, Lcom/androidnetworking/common/ANRequest;->getAsParsed(Lcom/google/gson/reflect/TypeToken;Lcom/androidnetworking/interfaces/ParsedRequestListener;)V

    return-void

    :cond_1
    sget-object v2, Lcom/sma/smartv3/network/NetWorkUtils;->INSTANCE:Lcom/sma/smartv3/network/NetWorkUtils;

    invoke-direct {p0}, Lcom/sma/smartv3/ui/login/EmailBindActivity;->getEmail()Lcom/google/android/material/textfield/TextInputEditText;

    move-result-object v5

    invoke-virtual {v5}, Landroidx/appcompat/widget/AppCompatEditText;->getText()Landroid/text/Editable;

    move-result-object v5

    invoke-static {v5}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    invoke-static {v5, p1}, Lcom/sma/smartv3/network/RequestBodyKt;->getVerificationCodeCheckBody(Ljava/lang/String;Ljava/lang/String;)Ljava/util/HashMap;

    move-result-object p1

    new-instance v5, Lcom/sma/smartv3/ui/login/EmailBindActivity$changeEmail$2;

    invoke-direct {v5, p0}, Lcom/sma/smartv3/ui/login/EmailBindActivity$changeEmail$2;-><init>(Lcom/sma/smartv3/ui/login/EmailBindActivity;)V

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

    new-instance v7, Lcom/sma/smartv3/ui/login/EmailBindActivity$changeEmail$$inlined$post$default$3;

    invoke-direct {v7, v4, v5, v6}, Lcom/sma/smartv3/ui/login/EmailBindActivity$changeEmail$$inlined$post$default$3;-><init>(Landroid/app/Activity;Lcom/android/mltcode/paycertificationapi/O1XIiIO;Lcom/android/mltcode/paycertificationapi/uq;)V

    invoke-static {v2}, Lcom/androidnetworking/AndroidNetworking;->post(Ljava/lang/String;)Lcom/androidnetworking/common/ANRequest$PostRequestBuilder;

    move-result-object v4

    invoke-virtual {v4, p1}, Lcom/androidnetworking/common/ANRequest$PostRequestBuilder;->addBodyParameter(Ljava/util/Map;)Lcom/androidnetworking/common/ANRequest$PostRequestBuilder;

    move-result-object p1

    invoke-virtual {p1, v2}, Lcom/androidnetworking/common/ANRequest$PostRequestBuilder;->setTag(Ljava/lang/Object;)Lcom/androidnetworking/common/ANRequest$PostRequestBuilder;

    move-result-object p1

    sget-object v2, Lcom/androidnetworking/common/Priority;->HIGH:Lcom/androidnetworking/common/Priority;

    invoke-virtual {p1, v2}, Lcom/androidnetworking/common/ANRequest$PostRequestBuilder;->setPriority(Lcom/androidnetworking/common/Priority;)Lcom/androidnetworking/common/ANRequest$PostRequestBuilder;

    move-result-object p1

    invoke-virtual {p1}, Lcom/androidnetworking/common/ANRequest$PostRequestBuilder;->build()Lcom/androidnetworking/common/ANRequest;

    move-result-object p1

    new-array v1, v1, [Ljava/lang/reflect/Type;

    const-class v2, Ljava/lang/String;

    aput-object v2, v1, v0

    invoke-static {v3, v1}, Lcom/google/gson/reflect/TypeToken;->getParameterized(Ljava/lang/reflect/Type;[Ljava/lang/reflect/Type;)Lcom/google/gson/reflect/TypeToken;

    move-result-object v0

    new-instance v1, Lcom/sma/smartv3/ui/login/EmailBindActivity$changeEmail$$inlined$post$default$4;

    invoke-direct {v1, v7}, Lcom/sma/smartv3/ui/login/EmailBindActivity$changeEmail$$inlined$post$default$4;-><init>(Lcom/android/mltcode/paycertificationapi/O1XIiIO;)V

    invoke-virtual {p1, v0, v1}, Lcom/androidnetworking/common/ANRequest;->getAsParsed(Lcom/google/gson/reflect/TypeToken;Lcom/androidnetworking/interfaces/ParsedRequestListener;)V

    return-void
.end method

.method private static final email_delegate$lambda$0(Lcom/sma/smartv3/ui/login/EmailBindActivity;)Lcom/google/android/material/textfield/TextInputEditText;
    .locals 1

    const v0, 0x7f0a0358

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Lcom/google/android/material/textfield/TextInputEditText;

    return-object p0
.end method

.method private final getBottomBtn()Landroid/widget/Button;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/login/EmailBindActivity;->bottomBtn$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/Button;

    return-object v0
.end method

.method private final getBottomErrorLogin()Landroid/widget/Button;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/login/EmailBindActivity;->bottomErrorLogin$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/Button;

    return-object v0
.end method

.method private final getBtGetVerificationCode()Landroid/widget/Button;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/login/EmailBindActivity;->btGetVerificationCode$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/Button;

    return-object v0
.end method

.method private final getEmail()Lcom/google/android/material/textfield/TextInputEditText;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/login/EmailBindActivity;->email$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/material/textfield/TextInputEditText;

    return-object v0
.end method

.method private final getLlCheckCode()Landroid/widget/LinearLayout;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/login/EmailBindActivity;->llCheckCode$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    return-object v0
.end method

.method private final getLlInputEmail()Landroid/widget/LinearLayout;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/login/EmailBindActivity;->llInputEmail$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    return-object v0
.end method

.method private final getMAppUser()Lcom/sma/smartv3/model/AppUser;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/login/EmailBindActivity;->mAppUser$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/sma/smartv3/model/AppUser;

    return-object v0
.end method

.method private final getRv()Landroid/widget/LinearLayout;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/login/EmailBindActivity;->rv$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    return-object v0
.end method

.method private final getTvCodeError()Lcom/sma/smartv3/view/text/PFMedium;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/login/EmailBindActivity;->tvCodeError$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/sma/smartv3/view/text/PFMedium;

    return-object v0
.end method

.method private final getTvDescription()Lcom/sma/smartv3/view/text/PFMedium;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/login/EmailBindActivity;->tvDescription$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/sma/smartv3/view/text/PFMedium;

    return-object v0
.end method

.method private final getTvTitle()Lcom/sma/smartv3/view/text/PFMedium;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/login/EmailBindActivity;->tvTitle$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/sma/smartv3/view/text/PFMedium;

    return-object v0
.end method

.method private final getVerificationCode()Lcom/google/android/material/textfield/TextInputEditText;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/sma/smartv3/ui/login/EmailBindActivity;->verificationCode$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/material/textfield/TextInputEditText;

    return-object v0
.end method

.method public static synthetic iIiiO(Lcom/sma/smartv3/ui/login/EmailBindActivity;)V
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/login/EmailBindActivity;->initView$lambda$0(Lcom/sma/smartv3/ui/login/EmailBindActivity;)V

    return-void
.end method

.method private static final initView$lambda$0(Lcom/sma/smartv3/ui/login/EmailBindActivity;)V
    .locals 2

    invoke-direct {p0}, Lcom/sma/smartv3/ui/login/EmailBindActivity;->getEmail()Lcom/google/android/material/textfield/TextInputEditText;

    move-result-object v0

    const-string v1, "<get-email>(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, v0}, Lcom/sma/smartv3/ui/login/EmailBindActivity;->getVerificationCode(Landroid/view/View;)V

    return-void
.end method

.method private static final initView$lambda$1(Lcom/sma/smartv3/ui/login/EmailBindActivity;Landroid/widget/TextView;ILandroid/view/KeyEvent;)Z
    .locals 0

    const/4 p1, 0x6

    if-ne p2, p1, :cond_0

    invoke-direct {p0}, Lcom/sma/smartv3/ui/login/EmailBindActivity;->getEmail()Lcom/google/android/material/textfield/TextInputEditText;

    move-result-object p1

    const-string p2, "<get-email>(...)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1}, Lcom/sma/smartv3/ui/login/EmailBindActivity;->getVerificationCode(Landroid/view/View;)V

    :cond_0
    const/4 p0, 0x0

    return p0
.end method

.method private static final initView$lambda$2(Lcom/sma/smartv3/ui/login/EmailBindActivity;Landroid/widget/TextView;ILandroid/view/KeyEvent;)Z
    .locals 0

    const/4 p1, 0x6

    if-ne p2, p1, :cond_0

    invoke-direct {p0}, Lcom/sma/smartv3/ui/login/EmailBindActivity;->getVerificationCode()Lcom/google/android/material/textfield/TextInputEditText;

    move-result-object p1

    invoke-virtual {p1}, Landroidx/appcompat/widget/AppCompatEditText;->getText()Landroid/text/Editable;

    move-result-object p1

    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Lcom/sma/smartv3/ui/login/EmailBindActivity;->changeEmail(Ljava/lang/String;)V

    :cond_0
    const/4 p0, 0x0

    return p0
.end method

.method private static final llCheckCode_delegate$lambda$0(Lcom/sma/smartv3/ui/login/EmailBindActivity;)Landroid/widget/LinearLayout;
    .locals 1

    const v0, 0x7f0a06b8

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/LinearLayout;

    return-object p0
.end method

.method private static final llInputEmail_delegate$lambda$0(Lcom/sma/smartv3/ui/login/EmailBindActivity;)Landroid/widget/LinearLayout;
    .locals 1

    const v0, 0x7f0a06bd

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/LinearLayout;

    return-object p0
.end method

.method private static final mAppUser_delegate$lambda$0()Lcom/sma/smartv3/model/AppUser;
    .locals 31

    sget-object v0, Lcom/android/mltcode/paycertificationapi/a01;->OXO1:Lcom/android/mltcode/paycertificationapi/a01;

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/a01;->IiI10X()Lcom/blankj/utilcode/util/SPUtils;

    move-result-object v0

    new-instance v1, Lcom/sma/smartv3/model/AppUser;

    const v29, 0x7ffffff

    const/16 v30, 0x0

    const/4 v2, 0x0

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

    invoke-direct/range {v1 .. v30}, Lcom/sma/smartv3/model/AppUser;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IIFFLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;FFIILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/sma/smartv3/model/ThirdPlatform;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v2, Lcom/google/gson/Gson;

    invoke-direct {v2}, Lcom/google/gson/Gson;-><init>()V

    const-class v3, Lcom/sma/smartv3/model/AppUser;

    invoke-virtual {v3}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0, v4}, Lcom/blankj/utilcode/util/SPUtils;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0, v3}, Lcom/google/gson/Gson;->fromJson(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    move-object v1, v0

    :goto_0
    check-cast v1, Lcom/sma/smartv3/model/AppUser;

    return-object v1
.end method

.method private static final rv_delegate$lambda$0(Lcom/sma/smartv3/ui/login/EmailBindActivity;)Landroid/widget/LinearLayout;
    .locals 1

    const v0, 0x7f0a09c1

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/LinearLayout;

    return-object p0
.end method

.method private static final tvCodeError_delegate$lambda$0(Lcom/sma/smartv3/ui/login/EmailBindActivity;)Lcom/sma/smartv3/view/text/PFMedium;
    .locals 1

    const v0, 0x7f0a0bff

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Lcom/sma/smartv3/view/text/PFMedium;

    return-object p0
.end method

.method private static final tvDescription_delegate$lambda$0(Lcom/sma/smartv3/ui/login/EmailBindActivity;)Lcom/sma/smartv3/view/text/PFMedium;
    .locals 1

    const v0, 0x7f0a0c04

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Lcom/sma/smartv3/view/text/PFMedium;

    return-object p0
.end method

.method private static final tvTitle_delegate$lambda$0(Lcom/sma/smartv3/ui/login/EmailBindActivity;)Lcom/sma/smartv3/view/text/PFMedium;
    .locals 1

    const v0, 0x7f0a0c17

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Lcom/sma/smartv3/view/text/PFMedium;

    return-object p0
.end method

.method private static final verificationCode_delegate$lambda$0(Lcom/sma/smartv3/ui/login/EmailBindActivity;)Lcom/google/android/material/textfield/TextInputEditText;
    .locals 1

    const v0, 0x7f0a18ea

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Lcom/google/android/material/textfield/TextInputEditText;

    return-object p0
.end method


# virtual methods
.method public final backClick(Landroid/view/View;)V
    .locals 3
    .param p1    # Landroid/view/View;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "view"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseActivity;->getMArg1()I

    move-result p1

    const/4 v0, 0x2

    if-eq p1, v0, :cond_2

    const/4 v0, 0x3

    const/4 v1, 0x1

    const-string v2, "IS_SKIP_SET_EMAIL"

    if-eq p1, v0, :cond_0

    sget-object p1, Lcom/android/mltcode/paycertificationapi/a01;->OXO1:Lcom/android/mltcode/paycertificationapi/a01;

    invoke-virtual {p1}, Lcom/android/mltcode/paycertificationapi/a01;->IiI10X()Lcom/blankj/utilcode/util/SPUtils;

    move-result-object p1

    invoke-virtual {p1, v2, v1}, Lcom/blankj/utilcode/util/SPUtils;->put(Ljava/lang/String;Z)V

    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    return-void

    :cond_0
    iget p1, p0, Lcom/sma/smartv3/ui/login/EmailBindActivity;->nowPage:I

    if-lez p1, :cond_1

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/login/EmailBindActivity;->onHandleBackPressed()V

    return-void

    :cond_1
    sget-object p1, Lcom/android/mltcode/paycertificationapi/a01;->OXO1:Lcom/android/mltcode/paycertificationapi/a01;

    invoke-virtual {p1}, Lcom/android/mltcode/paycertificationapi/a01;->IiI10X()Lcom/blankj/utilcode/util/SPUtils;

    move-result-object p1

    invoke-virtual {p1, v2, v1}, Lcom/blankj/utilcode/util/SPUtils;->put(Ljava/lang/String;Z)V

    new-instance p1, Landroid/content/Intent;

    const-class v0, Lcom/sma/smartv3/ui/main/MainActivity;

    invoke-direct {p1, p0, v0}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    invoke-virtual {p0, p1}, Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V

    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    return-void

    :cond_2
    iget p1, p0, Lcom/sma/smartv3/ui/login/EmailBindActivity;->nowPage:I

    if-lez p1, :cond_3

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/login/EmailBindActivity;->onHandleBackPressed()V

    return-void

    :cond_3
    const p1, 0x7f140d1a

    invoke-static {p1}, Lcom/blankj/utilcode/util/ToastUtils;->showShort(I)V

    return-void
.end method

.method public final getVerificationCode(Landroid/view/View;)V
    .locals 9
    .param p1    # Landroid/view/View;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "view"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Lcom/sma/smartv3/ui/login/EmailBindActivity;->getEmail()Lcom/google/android/material/textfield/TextInputEditText;

    move-result-object p1

    invoke-virtual {p1}, Landroidx/appcompat/widget/AppCompatEditText;->getText()Landroid/text/Editable;

    move-result-object p1

    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lcom/blankj/utilcode/util/RegexUtils;->isEmail(Ljava/lang/CharSequence;)Z

    move-result p1

    if-nez p1, :cond_0

    const p1, 0x7f1404d2

    .line 3
    invoke-static {p1}, Lcom/blankj/utilcode/util/ToastUtils;->showShort(I)V

    return-void

    .line 4
    :cond_0
    iget p1, p0, Lcom/sma/smartv3/ui/login/EmailBindActivity;->nowPage:I

    if-nez p1, :cond_1

    add-int/lit8 p1, p1, 0x1

    .line 5
    iput p1, p0, Lcom/sma/smartv3/ui/login/EmailBindActivity;->nowPage:I

    .line 6
    :cond_1
    invoke-direct {p0}, Lcom/sma/smartv3/ui/login/EmailBindActivity;->getLlInputEmail()Landroid/widget/LinearLayout;

    move-result-object p1

    const/16 v0, 0x8

    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

    .line 7
    invoke-direct {p0}, Lcom/sma/smartv3/ui/login/EmailBindActivity;->getLlCheckCode()Landroid/widget/LinearLayout;

    move-result-object p1

    const/4 v1, 0x0

    invoke-virtual {p1, v1}, Landroid/view/View;->setVisibility(I)V

    .line 8
    invoke-direct {p0}, Lcom/sma/smartv3/ui/login/EmailBindActivity;->getTvCodeError()Lcom/sma/smartv3/view/text/PFMedium;

    move-result-object p1

    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

    .line 9
    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseActivity;->getMArg1()I

    move-result p1

    const/4 v0, 0x3

    if-eq p1, v0, :cond_2

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseActivity;->getMArg1()I

    move-result p1

    const/4 v0, 0x2

    if-ne p1, v0, :cond_3

    .line 10
    :cond_2
    invoke-direct {p0}, Lcom/sma/smartv3/ui/login/EmailBindActivity;->getBottomErrorLogin()Landroid/widget/Button;

    move-result-object p1

    invoke-virtual {p1, v1}, Landroid/view/View;->setVisibility(I)V

    .line 11
    :cond_3
    sget-object v2, Lcom/sma/smartv3/network/RequestCommonMethod;->INSTANCE:Lcom/sma/smartv3/network/RequestCommonMethod;

    .line 12
    invoke-direct {p0}, Lcom/sma/smartv3/ui/login/EmailBindActivity;->getRv()Landroid/widget/LinearLayout;

    move-result-object v4

    .line 13
    invoke-direct {p0}, Lcom/sma/smartv3/ui/login/EmailBindActivity;->getEmail()Lcom/google/android/material/textfield/TextInputEditText;

    move-result-object p1

    invoke-virtual {p1}, Landroidx/appcompat/widget/AppCompatEditText;->getText()Landroid/text/Editable;

    move-result-object p1

    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    .line 14
    invoke-direct {p0}, Lcom/sma/smartv3/ui/login/EmailBindActivity;->getBtGetVerificationCode()Landroid/widget/Button;

    move-result-object v6

    const-string p1, "<get-btGetVerificationCode>(...)"

    invoke-static {v6, p1}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    .line 15
    iget v7, p0, Lcom/sma/smartv3/ui/login/EmailBindActivity;->verificationType:I

    .line 16
    new-instance v8, Lcom/sma/smartv3/ui/login/EmailBindActivity$getVerificationCode$1;

    invoke-direct {v8, p0}, Lcom/sma/smartv3/ui/login/EmailBindActivity$getVerificationCode$1;-><init>(Lcom/sma/smartv3/ui/login/EmailBindActivity;)V

    move-object v3, p0

    .line 17
    invoke-virtual/range {v2 .. v8}, Lcom/sma/smartv3/network/RequestCommonMethod;->requestVerificationCode(Landroid/app/Activity;Landroid/view/View;Ljava/lang/String;Landroid/widget/TextView;ILcom/android/mltcode/paycertificationapi/O1XIiIO;)V

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
    .locals 6

    invoke-direct {p0}, Lcom/sma/smartv3/ui/login/EmailBindActivity;->getBottomErrorLogin()Landroid/widget/Button;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/login/EmailBindActivity;->getMAppUser()Lcom/sma/smartv3/model/AppUser;

    move-result-object v0

    invoke-virtual {v0}, Lcom/sma/smartv3/model/AppUser;->getEmail()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v0

    const/4 v2, 0x2

    const/4 v3, 0x0

    if-nez v0, :cond_0

    iput v2, p0, Lcom/sma/smartv3/ui/login/EmailBindActivity;->verificationType:I

    iput-boolean v3, p0, Lcom/sma/smartv3/ui/login/EmailBindActivity;->isExistsEmail:Z

    invoke-direct {p0}, Lcom/sma/smartv3/ui/login/EmailBindActivity;->getTvTitle()Lcom/sma/smartv3/view/text/PFMedium;

    move-result-object v0

    const v1, 0x7f140207

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/login/EmailBindActivity;->getTvDescription()Lcom/sma/smartv3/view/text/PFMedium;

    move-result-object v0

    const v1, 0x7f140208

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    goto/16 :goto_0

    :cond_0
    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseActivity;->getMArg1()I

    move-result v0

    const v4, 0x7f1411bb

    const/4 v5, 0x1

    if-ne v0, v5, :cond_1

    iget v0, p0, Lcom/sma/smartv3/ui/login/EmailBindActivity;->nowPage:I

    add-int/2addr v0, v5

    iput v0, p0, Lcom/sma/smartv3/ui/login/EmailBindActivity;->nowPage:I

    iput v2, p0, Lcom/sma/smartv3/ui/login/EmailBindActivity;->verificationType:I

    iput-boolean v3, p0, Lcom/sma/smartv3/ui/login/EmailBindActivity;->isExistsEmail:Z

    invoke-direct {p0}, Lcom/sma/smartv3/ui/login/EmailBindActivity;->getTvTitle()Lcom/sma/smartv3/view/text/PFMedium;

    move-result-object v0

    const v2, 0x7f141469

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(I)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/login/EmailBindActivity;->getTvDescription()Lcom/sma/smartv3/view/text/PFMedium;

    move-result-object v0

    invoke-virtual {v0, v4}, Landroid/widget/TextView;->setText(I)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/login/EmailBindActivity;->getLlInputEmail()Landroid/widget/LinearLayout;

    move-result-object v0

    invoke-virtual {v0, v3}, Landroid/view/View;->setVisibility(I)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/login/EmailBindActivity;->getBottomBtn()Landroid/widget/Button;

    move-result-object v0

    invoke-virtual {v0, v3}, Landroid/view/View;->setVisibility(I)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/login/EmailBindActivity;->getLlCheckCode()Landroid/widget/LinearLayout;

    move-result-object v0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    goto :goto_0

    :cond_1
    iput v5, p0, Lcom/sma/smartv3/ui/login/EmailBindActivity;->verificationType:I

    const/4 v0, -0x1

    iput v0, p0, Lcom/sma/smartv3/ui/login/EmailBindActivity;->nowPage:I

    iput-boolean v5, p0, Lcom/sma/smartv3/ui/login/EmailBindActivity;->isExistsEmail:Z

    invoke-direct {p0}, Lcom/sma/smartv3/ui/login/EmailBindActivity;->getTvTitle()Lcom/sma/smartv3/view/text/PFMedium;

    move-result-object v0

    const v2, 0x7f1411ba

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(I)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/login/EmailBindActivity;->getTvDescription()Lcom/sma/smartv3/view/text/PFMedium;

    move-result-object v0

    invoke-virtual {v0, v4}, Landroid/widget/TextView;->setText(I)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/login/EmailBindActivity;->getEmail()Lcom/google/android/material/textfield/TextInputEditText;

    move-result-object v0

    invoke-direct {p0}, Lcom/sma/smartv3/ui/login/EmailBindActivity;->getMAppUser()Lcom/sma/smartv3/model/AppUser;

    move-result-object v2

    invoke-virtual {v2}, Lcom/sma/smartv3/model/AppUser;->getEmail()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/login/EmailBindActivity;->getBottomBtn()Landroid/widget/Button;

    move-result-object v0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    const v0, 0x7f141498

    invoke-virtual {p0, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    new-array v1, v3, [Ljava/lang/Object;

    invoke-static {v0, v1}, Lcom/blankj/utilcode/util/ToastUtils;->showShort(Ljava/lang/String;[Ljava/lang/Object;)V

    new-instance v0, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    new-instance v1, Lcom/android/mltcode/paycertificationapi/O11X;

    invoke-direct {v1, p0}, Lcom/android/mltcode/paycertificationapi/O11X;-><init>(Lcom/sma/smartv3/ui/login/EmailBindActivity;)V

    const-wide/16 v4, 0x7d0

    invoke-virtual {v0, v1, v4, v5}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    :goto_0
    invoke-direct {p0}, Lcom/sma/smartv3/ui/login/EmailBindActivity;->getBottomBtn()Landroid/widget/Button;

    move-result-object v0

    invoke-virtual {v0, v3}, Landroid/view/View;->setEnabled(Z)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/login/EmailBindActivity;->getEmail()Lcom/google/android/material/textfield/TextInputEditText;

    move-result-object v0

    new-instance v1, Lcom/sma/smartv3/ui/login/EmailBindActivity$XIi00iiXO;

    invoke-direct {v1, p0}, Lcom/sma/smartv3/ui/login/EmailBindActivity$XIi00iiXO;-><init>(Lcom/sma/smartv3/ui/login/EmailBindActivity;)V

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->addTextChangedListener(Landroid/text/TextWatcher;)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/login/EmailBindActivity;->getVerificationCode()Lcom/google/android/material/textfield/TextInputEditText;

    move-result-object v0

    new-instance v1, Lcom/sma/smartv3/ui/login/EmailBindActivity$iO;

    invoke-direct {v1, p0}, Lcom/sma/smartv3/ui/login/EmailBindActivity$iO;-><init>(Lcom/sma/smartv3/ui/login/EmailBindActivity;)V

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->addTextChangedListener(Landroid/text/TextWatcher;)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/login/EmailBindActivity;->getEmail()Lcom/google/android/material/textfield/TextInputEditText;

    move-result-object v0

    new-instance v1, Lcom/android/mltcode/paycertificationapi/O0X000O0i;

    invoke-direct {v1, p0}, Lcom/android/mltcode/paycertificationapi/O0X000O0i;-><init>(Lcom/sma/smartv3/ui/login/EmailBindActivity;)V

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setOnEditorActionListener(Landroid/widget/TextView$OnEditorActionListener;)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/login/EmailBindActivity;->getVerificationCode()Lcom/google/android/material/textfield/TextInputEditText;

    move-result-object v0

    new-instance v1, Lcom/android/mltcode/paycertificationapi/Ii11OOIO;

    invoke-direct {v1, p0}, Lcom/android/mltcode/paycertificationapi/Ii11OOIO;-><init>(Lcom/sma/smartv3/ui/login/EmailBindActivity;)V

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setOnEditorActionListener(Landroid/widget/TextView$OnEditorActionListener;)V

    return-void
.end method

.method public layoutId()I
    .locals 1

    const v0, 0x7f0d0099

    return v0
.end method

.method public onHandleBackPressed()V
    .locals 2

    iget v0, p0, Lcom/sma/smartv3/ui/login/EmailBindActivity;->nowPage:I

    if-lez v0, :cond_0

    add-int/lit8 v0, v0, -0x1

    iput v0, p0, Lcom/sma/smartv3/ui/login/EmailBindActivity;->nowPage:I

    invoke-direct {p0}, Lcom/sma/smartv3/ui/login/EmailBindActivity;->getLlInputEmail()Landroid/widget/LinearLayout;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/login/EmailBindActivity;->getBottomBtn()Landroid/widget/Button;

    move-result-object v0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/login/EmailBindActivity;->getLlCheckCode()Landroid/widget/LinearLayout;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    return-void

    :cond_0
    invoke-direct {p0}, Lcom/sma/smartv3/ui/login/EmailBindActivity;->getRv()Landroid/widget/LinearLayout;

    move-result-object v0

    const-string v1, "<get-rv>(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, v0}, Lcom/sma/smartv3/ui/login/EmailBindActivity;->backClick(Landroid/view/View;)V

    return-void
.end method

.method public final onLogOut(Landroid/view/View;)V
    .locals 1
    .param p1    # Landroid/view/View;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "view"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p1, Landroid/content/Intent;

    const-class v0, Lcom/sma/smartv3/ui/login/ServerSelectActivity;

    invoke-direct {p1, p0, v0}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    invoke-virtual {p0, p1}, Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V

    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    return-void
.end method
