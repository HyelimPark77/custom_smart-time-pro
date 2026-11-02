.class public final Lcom/sma/smartv3/ui/device/ThirdPartyVoiceAssistantActivity;
.super Lcom/bestmafen/androidbase/base/BaseActivity;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nThirdPartyVoiceAssistantActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ThirdPartyVoiceAssistantActivity.kt\ncom/sma/smartv3/ui/device/ThirdPartyVoiceAssistantActivity\n+ 2 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n*L\n1#1,207:1\n19#2:208\n15#2:209\n*S KotlinDebug\n*F\n+ 1 ThirdPartyVoiceAssistantActivity.kt\ncom/sma/smartv3/ui/device/ThirdPartyVoiceAssistantActivity\n*L\n84#1:208\n84#1:209\n*E\n"
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nThirdPartyVoiceAssistantActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ThirdPartyVoiceAssistantActivity.kt\ncom/sma/smartv3/ui/device/ThirdPartyVoiceAssistantActivity\n+ 2 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n*L\n1#1,207:1\n19#2:208\n15#2:209\n*S KotlinDebug\n*F\n+ 1 ThirdPartyVoiceAssistantActivity.kt\ncom/sma/smartv3/ui/device/ThirdPartyVoiceAssistantActivity\n*L\n84#1:208\n84#1:209\n*E\n"
    }
.end annotation


# instance fields
.field private final abhTitleCenter$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final abhTitleOtherRight$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final abhTitleRight$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final chatMsg:Lcom/sma/smartv3/db/entity/ChatVoiceAssistantMessage;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final chatSendBt$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final chatWithQWManager:Lcom/sma/smartv3/util/ChatWithQWManager;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final etContent$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private isSending:Z

.field private final mAdapter$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private mDeletePopup:Lcom/android/mltcode/paycertificationapi/go0;
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation
.end field

.field private mListPop:Lcom/android/mltcode/paycertificationapi/mp;
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation
.end field

.field private mPayTipPopup:Lcom/android/mltcode/paycertificationapi/go0;
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation
.end field

.field private final mRecyclerView$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private mRecyclerViewAutoRefresh:Z

.field private mTitle:Ljava/lang/String;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final viewKeyboardHeight$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final viewModel$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 10

    invoke-direct {p0}, Lcom/bestmafen/androidbase/base/BaseActivity;-><init>()V

    new-instance v0, Lcom/android/mltcode/paycertificationapi/yq5;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/yq5;-><init>(Lcom/sma/smartv3/ui/device/ThirdPartyVoiceAssistantActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/ThirdPartyVoiceAssistantActivity;->mRecyclerView$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/cr5;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/cr5;-><init>(Lcom/sma/smartv3/ui/device/ThirdPartyVoiceAssistantActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/ThirdPartyVoiceAssistantActivity;->etContent$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/dr5;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/dr5;-><init>(Lcom/sma/smartv3/ui/device/ThirdPartyVoiceAssistantActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/ThirdPartyVoiceAssistantActivity;->abhTitleRight$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/er5;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/er5;-><init>(Lcom/sma/smartv3/ui/device/ThirdPartyVoiceAssistantActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/ThirdPartyVoiceAssistantActivity;->abhTitleOtherRight$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/fr5;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/fr5;-><init>(Lcom/sma/smartv3/ui/device/ThirdPartyVoiceAssistantActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/ThirdPartyVoiceAssistantActivity;->chatSendBt$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/gr5;

    invoke-direct {v0}, Lcom/android/mltcode/paycertificationapi/gr5;-><init>()V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/ThirdPartyVoiceAssistantActivity;->mAdapter$delegate:Lkotlin/Lazy;

    sget-object v0, Lcom/android/mltcode/paycertificationapi/q62;->OXO1:Lcom/android/mltcode/paycertificationapi/q62;

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/q62;->XI()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/ThirdPartyVoiceAssistantActivity;->mTitle:Ljava/lang/String;

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/sma/smartv3/ui/device/ThirdPartyVoiceAssistantActivity;->mRecyclerViewAutoRefresh:Z

    new-instance v0, Lcom/android/mltcode/paycertificationapi/hr5;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/hr5;-><init>(Lcom/sma/smartv3/ui/device/ThirdPartyVoiceAssistantActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/ThirdPartyVoiceAssistantActivity;->abhTitleCenter$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/ir5;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/ir5;-><init>(Lcom/sma/smartv3/ui/device/ThirdPartyVoiceAssistantActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/ThirdPartyVoiceAssistantActivity;->viewKeyboardHeight$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/jr5;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/jr5;-><init>(Lcom/sma/smartv3/ui/device/ThirdPartyVoiceAssistantActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/ThirdPartyVoiceAssistantActivity;->viewModel$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/sma/smartv3/util/ChatWithQWManager;

    invoke-direct {v0}, Lcom/sma/smartv3/util/ChatWithQWManager;-><init>()V

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/ThirdPartyVoiceAssistantActivity;->chatWithQWManager:Lcom/sma/smartv3/util/ChatWithQWManager;

    new-instance v1, Lcom/sma/smartv3/db/entity/ChatVoiceAssistantMessage;

    const/16 v8, 0x3f

    const/4 v9, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-direct/range {v1 .. v9}, Lcom/sma/smartv3/db/entity/ChatVoiceAssistantMessage;-><init>(ILjava/lang/String;Lcom/sma/smartv3/dto/FunctionType;Lcom/sma/smartv3/dto/ChatAiMode;ILcom/sma/smartv3/dto/ChatShowType;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object v1, p0, Lcom/sma/smartv3/ui/device/ThirdPartyVoiceAssistantActivity;->chatMsg:Lcom/sma/smartv3/db/entity/ChatVoiceAssistantMessage;

    return-void
.end method

.method public static synthetic I0iXXO(Lcom/sma/smartv3/ui/device/ThirdPartyVoiceAssistantActivity;Landroid/view/View;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/sma/smartv3/ui/device/ThirdPartyVoiceAssistantActivity;->initView$lambda$0(Lcom/sma/smartv3/ui/device/ThirdPartyVoiceAssistantActivity;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic I1XOi1(Lcom/sma/smartv3/ui/device/ThirdPartyVoiceAssistantActivity;)Landroid/widget/TextView;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/device/ThirdPartyVoiceAssistantActivity;->abhTitleCenter_delegate$lambda$0(Lcom/sma/smartv3/ui/device/ThirdPartyVoiceAssistantActivity;)Landroid/widget/TextView;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic IIX1OXO(Lcom/sma/smartv3/ui/device/ThirdPartyVoiceAssistantActivity;)Landroid/widget/ImageView;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/device/ThirdPartyVoiceAssistantActivity;->abhTitleRight_delegate$lambda$0(Lcom/sma/smartv3/ui/device/ThirdPartyVoiceAssistantActivity;)Landroid/widget/ImageView;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic O10IXXX0X(Lcom/sma/smartv3/ui/device/ThirdPartyVoiceAssistantActivity;Landroid/view/View;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/sma/smartv3/ui/device/ThirdPartyVoiceAssistantActivity;->initListener$lambda$0(Lcom/sma/smartv3/ui/device/ThirdPartyVoiceAssistantActivity;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic OIX0iXi(Lcom/sma/smartv3/ui/device/ThirdPartyVoiceAssistantActivity;)Lcom/sma/smartv3/ui/device/ChatVoiceViewModel;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/device/ThirdPartyVoiceAssistantActivity;->viewModel_delegate$lambda$0(Lcom/sma/smartv3/ui/device/ThirdPartyVoiceAssistantActivity;)Lcom/sma/smartv3/ui/device/ChatVoiceViewModel;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic OiIIX101O()Lcom/sma/smartv3/ui/device/ChatVoiceAssistantAdapter;
    .locals 1

    invoke-static {}, Lcom/sma/smartv3/ui/device/ThirdPartyVoiceAssistantActivity;->mAdapter_delegate$lambda$0()Lcom/sma/smartv3/ui/device/ChatVoiceAssistantAdapter;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic X0O(Lcom/sma/smartv3/ui/device/ThirdPartyVoiceAssistantActivity;)Landroid/view/View;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/device/ThirdPartyVoiceAssistantActivity;->viewKeyboardHeight_delegate$lambda$0(Lcom/sma/smartv3/ui/device/ThirdPartyVoiceAssistantActivity;)Landroid/view/View;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic X1ii(Lcom/sma/smartv3/ui/device/ThirdPartyVoiceAssistantActivity;)Landroidx/recyclerview/widget/RecyclerView;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/device/ThirdPartyVoiceAssistantActivity;->mRecyclerView_delegate$lambda$0(Lcom/sma/smartv3/ui/device/ThirdPartyVoiceAssistantActivity;)Landroidx/recyclerview/widget/RecyclerView;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic XX0(Lcom/sma/smartv3/ui/device/ThirdPartyVoiceAssistantActivity;)Landroid/widget/EditText;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/device/ThirdPartyVoiceAssistantActivity;->etContent_delegate$lambda$0(Lcom/sma/smartv3/ui/device/ThirdPartyVoiceAssistantActivity;)Landroid/widget/EditText;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic XXI(Lcom/sma/smartv3/ui/device/ThirdPartyVoiceAssistantActivity;)Landroid/widget/ImageView;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/device/ThirdPartyVoiceAssistantActivity;->abhTitleOtherRight_delegate$lambda$0(Lcom/sma/smartv3/ui/device/ThirdPartyVoiceAssistantActivity;)Landroid/widget/ImageView;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic XiOIO(Lcom/sma/smartv3/ui/device/ThirdPartyVoiceAssistantActivity;)Z
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/device/ThirdPartyVoiceAssistantActivity;->onTitleRightClick$lambda$0$0(Lcom/sma/smartv3/ui/device/ThirdPartyVoiceAssistantActivity;)Z

    move-result p0

    return p0
.end method

.method public static synthetic XiOIii1(Lcom/sma/smartv3/ui/device/ThirdPartyVoiceAssistantActivity;)Landroid/widget/Button;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/device/ThirdPartyVoiceAssistantActivity;->chatSendBt_delegate$lambda$0(Lcom/sma/smartv3/ui/device/ThirdPartyVoiceAssistantActivity;)Landroid/widget/Button;

    move-result-object p0

    return-object p0
.end method

.method private static final abhTitleCenter_delegate$lambda$0(Lcom/sma/smartv3/ui/device/ThirdPartyVoiceAssistantActivity;)Landroid/widget/TextView;
    .locals 1

    const v0, 0x7f0a0023

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/TextView;

    return-object p0
.end method

.method private static final abhTitleOtherRight_delegate$lambda$0(Lcom/sma/smartv3/ui/device/ThirdPartyVoiceAssistantActivity;)Landroid/widget/ImageView;
    .locals 1

    const v0, 0x7f0a0025

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/ImageView;

    return-object p0
.end method

.method private static final abhTitleRight_delegate$lambda$0(Lcom/sma/smartv3/ui/device/ThirdPartyVoiceAssistantActivity;)Landroid/widget/ImageView;
    .locals 1

    const v0, 0x7f0a0026

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/ImageView;

    return-object p0
.end method

.method public static final synthetic access$getChatMsg$p(Lcom/sma/smartv3/ui/device/ThirdPartyVoiceAssistantActivity;)Lcom/sma/smartv3/db/entity/ChatVoiceAssistantMessage;
    .locals 0

    iget-object p0, p0, Lcom/sma/smartv3/ui/device/ThirdPartyVoiceAssistantActivity;->chatMsg:Lcom/sma/smartv3/db/entity/ChatVoiceAssistantMessage;

    return-object p0
.end method

.method public static final synthetic access$getMAdapter(Lcom/sma/smartv3/ui/device/ThirdPartyVoiceAssistantActivity;)Lcom/sma/smartv3/ui/device/ChatVoiceAssistantAdapter;
    .locals 0

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/ThirdPartyVoiceAssistantActivity;->getMAdapter()Lcom/sma/smartv3/ui/device/ChatVoiceAssistantAdapter;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$getMRecyclerView(Lcom/sma/smartv3/ui/device/ThirdPartyVoiceAssistantActivity;)Landroidx/recyclerview/widget/RecyclerView;
    .locals 0

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/ThirdPartyVoiceAssistantActivity;->getMRecyclerView()Landroidx/recyclerview/widget/RecyclerView;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$scrollList(Lcom/sma/smartv3/ui/device/ThirdPartyVoiceAssistantActivity;)V
    .locals 0

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/ThirdPartyVoiceAssistantActivity;->scrollList()V

    return-void
.end method

.method public static final synthetic access$setSending$p(Lcom/sma/smartv3/ui/device/ThirdPartyVoiceAssistantActivity;Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/sma/smartv3/ui/device/ThirdPartyVoiceAssistantActivity;->isSending:Z

    return-void
.end method

.method private final addSendTextToAdapter(Ljava/lang/String;)V
    .locals 9

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/ThirdPartyVoiceAssistantActivity;->chatMsg:Lcom/sma/smartv3/db/entity/ChatVoiceAssistantMessage;

    sget-object v1, Lcom/sma/smartv3/dto/ChatEndType;->Ended:Lcom/sma/smartv3/dto/ChatEndType;

    invoke-virtual {v1}, Lcom/sma/smartv3/dto/ChatEndType;->getFlag()I

    move-result v5

    const/16 v7, 0x2d

    const/4 v8, 0x0

    const/4 v1, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v6, 0x0

    move-object v2, p1

    invoke-static/range {v0 .. v8}, Lcom/sma/smartv3/db/entity/ChatVoiceAssistantMessage;->copy$default(Lcom/sma/smartv3/db/entity/ChatVoiceAssistantMessage;ILjava/lang/String;Lcom/sma/smartv3/dto/FunctionType;Lcom/sma/smartv3/dto/ChatAiMode;ILcom/sma/smartv3/dto/ChatShowType;ILjava/lang/Object;)Lcom/sma/smartv3/db/entity/ChatVoiceAssistantMessage;

    move-result-object p1

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/ThirdPartyVoiceAssistantActivity;->getMAdapter()Lcom/sma/smartv3/ui/device/ChatVoiceAssistantAdapter;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/sma/smartv3/ui/device/ChatVoiceAssistantAdapter;->add(Lcom/sma/smartv3/db/entity/ChatVoiceAssistantMessage;)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/device/ThirdPartyVoiceAssistantActivity;->getViewModel()Lcom/sma/smartv3/ui/device/ChatVoiceViewModel;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/sma/smartv3/ui/device/ChatVoiceViewModel;->addChatVoice(Lcom/sma/smartv3/db/entity/ChatVoiceAssistantMessage;)Lkotlinx/coroutines/XiOIO;

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/ThirdPartyVoiceAssistantActivity;->getMAdapter()Lcom/sma/smartv3/ui/device/ChatVoiceAssistantAdapter;

    move-result-object p1

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/ThirdPartyVoiceAssistantActivity;->chatMsg:Lcom/sma/smartv3/db/entity/ChatVoiceAssistantMessage;

    sget-object v1, Lcom/sma/smartv3/dto/ChatEndType;->Sending:Lcom/sma/smartv3/dto/ChatEndType;

    invoke-virtual {v1}, Lcom/sma/smartv3/dto/ChatEndType;->getFlag()I

    move-result v5

    sget-object v6, Lcom/sma/smartv3/dto/ChatShowType;->TO:Lcom/sma/smartv3/dto/ChatShowType;

    const/16 v7, 0xd

    const/4 v1, 0x0

    const-string v2, "\u8bf7\u7a0d\u7b49..."

    invoke-static/range {v0 .. v8}, Lcom/sma/smartv3/db/entity/ChatVoiceAssistantMessage;->copy$default(Lcom/sma/smartv3/db/entity/ChatVoiceAssistantMessage;ILjava/lang/String;Lcom/sma/smartv3/dto/FunctionType;Lcom/sma/smartv3/dto/ChatAiMode;ILcom/sma/smartv3/dto/ChatShowType;ILjava/lang/Object;)Lcom/sma/smartv3/db/entity/ChatVoiceAssistantMessage;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/sma/smartv3/ui/device/ChatVoiceAssistantAdapter;->add(Lcom/sma/smartv3/db/entity/ChatVoiceAssistantMessage;)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/ThirdPartyVoiceAssistantActivity;->scrollList()V

    return-void
.end method

.method private static final chatSendBt_delegate$lambda$0(Lcom/sma/smartv3/ui/device/ThirdPartyVoiceAssistantActivity;)Landroid/widget/Button;
    .locals 1

    const v0, 0x7f0a01c2

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/Button;

    return-object p0
.end method

.method private final collectSendState()V
    .locals 13

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/device/ThirdPartyVoiceAssistantActivity;->getViewModel()Lcom/sma/smartv3/ui/device/ChatVoiceViewModel;

    move-result-object v0

    invoke-virtual {v0}, Lcom/sma/smartv3/ui/device/ChatVoiceViewModel;->getChatListResultFlow()Lcom/android/mltcode/paycertificationapi/k85;

    move-result-object v2

    new-instance v4, Lcom/sma/smartv3/ui/device/ThirdPartyVoiceAssistantActivity$collectSendState$1;

    const/4 v0, 0x0

    invoke-direct {v4, p0, v0}, Lcom/sma/smartv3/ui/device/ThirdPartyVoiceAssistantActivity$collectSendState$1;-><init>(Lcom/sma/smartv3/ui/device/ThirdPartyVoiceAssistantActivity;Lkotlin/coroutines/Continuation;)V

    const/4 v5, 0x2

    const/4 v6, 0x0

    const/4 v3, 0x0

    move-object v1, p0

    invoke-static/range {v1 .. v6}, Lcom/sma/smartv3/util/ActivityUtilKt;->XIi00iiXO(Landroidx/lifecycle/LifecycleOwner;Lcom/android/mltcode/paycertificationapi/ii0iIIX0;Landroidx/lifecycle/Lifecycle$State;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)V

    move-object v7, v1

    iget-object v1, v7, Lcom/sma/smartv3/ui/device/ThirdPartyVoiceAssistantActivity;->chatWithQWManager:Lcom/sma/smartv3/util/ChatWithQWManager;

    invoke-virtual {v1}, Lcom/sma/smartv3/util/ChatWithQWManager;->I0IIOi()Lcom/android/mltcode/paycertificationapi/k85;

    move-result-object v8

    new-instance v10, Lcom/sma/smartv3/ui/device/ThirdPartyVoiceAssistantActivity$collectSendState$2;

    invoke-direct {v10, p0, v0}, Lcom/sma/smartv3/ui/device/ThirdPartyVoiceAssistantActivity$collectSendState$2;-><init>(Lcom/sma/smartv3/ui/device/ThirdPartyVoiceAssistantActivity;Lkotlin/coroutines/Continuation;)V

    const/4 v11, 0x2

    const/4 v12, 0x0

    const/4 v9, 0x0

    invoke-static/range {v7 .. v12}, Lcom/sma/smartv3/util/ActivityUtilKt;->XIi00iiXO(Landroidx/lifecycle/LifecycleOwner;Lcom/android/mltcode/paycertificationapi/ii0iIIX0;Landroidx/lifecycle/Lifecycle$State;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)V

    iget-object v1, v7, Lcom/sma/smartv3/ui/device/ThirdPartyVoiceAssistantActivity;->chatWithQWManager:Lcom/sma/smartv3/util/ChatWithQWManager;

    invoke-virtual {v1}, Lcom/sma/smartv3/util/ChatWithQWManager;->XOO0ii0()Lcom/android/mltcode/paycertificationapi/ii0iIIX0;

    move-result-object v8

    new-instance v10, Lcom/sma/smartv3/ui/device/ThirdPartyVoiceAssistantActivity$collectSendState$3;

    invoke-direct {v10, p0, v0}, Lcom/sma/smartv3/ui/device/ThirdPartyVoiceAssistantActivity$collectSendState$3;-><init>(Lcom/sma/smartv3/ui/device/ThirdPartyVoiceAssistantActivity;Lkotlin/coroutines/Continuation;)V

    invoke-static/range {v7 .. v12}, Lcom/sma/smartv3/util/ActivityUtilKt;->XIi00iiXO(Landroidx/lifecycle/LifecycleOwner;Lcom/android/mltcode/paycertificationapi/ii0iIIX0;Landroidx/lifecycle/Lifecycle$State;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)V

    return-void
.end method

.method private static final etContent_delegate$lambda$0(Lcom/sma/smartv3/ui/device/ThirdPartyVoiceAssistantActivity;)Landroid/widget/EditText;
    .locals 1

    const v0, 0x7f0a0370

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/EditText;

    return-object p0
.end method

.method private final getAbhTitleCenter()Landroid/widget/TextView;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/ThirdPartyVoiceAssistantActivity;->abhTitleCenter$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    return-object v0
.end method

.method private final getAbhTitleOtherRight()Landroid/widget/ImageView;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/ThirdPartyVoiceAssistantActivity;->abhTitleOtherRight$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    return-object v0
.end method

.method private final getAbhTitleRight()Landroid/widget/ImageView;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/ThirdPartyVoiceAssistantActivity;->abhTitleRight$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    return-object v0
.end method

.method private final getChatSendBt()Landroid/widget/Button;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/ThirdPartyVoiceAssistantActivity;->chatSendBt$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/Button;

    return-object v0
.end method

.method private final getEtContent()Landroid/widget/EditText;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/ThirdPartyVoiceAssistantActivity;->etContent$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/EditText;

    return-object v0
.end method

.method private final getMAdapter()Lcom/sma/smartv3/ui/device/ChatVoiceAssistantAdapter;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/ThirdPartyVoiceAssistantActivity;->mAdapter$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/sma/smartv3/ui/device/ChatVoiceAssistantAdapter;

    return-object v0
.end method

.method private final getMRecyclerView()Landroidx/recyclerview/widget/RecyclerView;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/ThirdPartyVoiceAssistantActivity;->mRecyclerView$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroidx/recyclerview/widget/RecyclerView;

    return-object v0
.end method

.method private final getViewKeyboardHeight()Landroid/view/View;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/ThirdPartyVoiceAssistantActivity;->viewKeyboardHeight$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    return-object v0
.end method

.method public static synthetic iIiiO(Lcom/sma/smartv3/ui/device/ThirdPartyVoiceAssistantActivity;Landroid/view/View;Landroid/view/MotionEvent;)Z
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/sma/smartv3/ui/device/ThirdPartyVoiceAssistantActivity;->touchListener$lambda$0(Lcom/sma/smartv3/ui/device/ThirdPartyVoiceAssistantActivity;Landroid/view/View;Landroid/view/MotionEvent;)Z

    move-result p0

    return p0
.end method

.method private static final initListener$lambda$0(Lcom/sma/smartv3/ui/device/ThirdPartyVoiceAssistantActivity;Landroid/view/View;)V
    .locals 0

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/ThirdPartyVoiceAssistantActivity;->getEtContent()Landroid/widget/EditText;

    move-result-object p1

    invoke-virtual {p1}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    if-nez p1, :cond_1

    :cond_0
    const-string p1, ""

    :cond_1
    invoke-direct {p0, p1}, Lcom/sma/smartv3/ui/device/ThirdPartyVoiceAssistantActivity;->sendMessage(Ljava/lang/String;)V

    return-void
.end method

.method private static final initView$lambda$0(Lcom/sma/smartv3/ui/device/ThirdPartyVoiceAssistantActivity;Landroid/view/View;)V
    .locals 1

    new-instance p1, Landroid/content/Intent;

    const-class v0, Lcom/sma/smartv3/ui/ai/SearchOnlineActivity;

    invoke-direct {p1, p0, v0}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    invoke-virtual {p0, p1}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    return-void
.end method

.method private static final mAdapter_delegate$lambda$0()Lcom/sma/smartv3/ui/device/ChatVoiceAssistantAdapter;
    .locals 1

    new-instance v0, Lcom/sma/smartv3/ui/device/ChatVoiceAssistantAdapter;

    invoke-direct {v0}, Lcom/sma/smartv3/ui/device/ChatVoiceAssistantAdapter;-><init>()V

    return-object v0
.end method

.method private static final mRecyclerView_delegate$lambda$0(Lcom/sma/smartv3/ui/device/ThirdPartyVoiceAssistantActivity;)Landroidx/recyclerview/widget/RecyclerView;
    .locals 1

    const v0, 0x7f0a0ba9

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroidx/recyclerview/widget/RecyclerView;

    return-object p0
.end method

.method private static final onTitleRightClick$lambda$0$0(Lcom/sma/smartv3/ui/device/ThirdPartyVoiceAssistantActivity;)Z
    .locals 1

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/device/ThirdPartyVoiceAssistantActivity;->getViewModel()Lcom/sma/smartv3/ui/device/ChatVoiceViewModel;

    move-result-object v0

    invoke-virtual {v0}, Lcom/sma/smartv3/ui/device/ChatVoiceViewModel;->deleteAllChatByFunctionType()Lkotlinx/coroutines/XiOIO;

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/ThirdPartyVoiceAssistantActivity;->getMAdapter()Lcom/sma/smartv3/ui/device/ChatVoiceAssistantAdapter;

    move-result-object p0

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {p0, v0}, Lcom/sma/smartv3/ui/device/ChatVoiceAssistantAdapter;->setData(Ljava/util/List;)V

    const/4 p0, 0x1

    return p0
.end method

.method private final scrollList()V
    .locals 2

    iget-boolean v0, p0, Lcom/sma/smartv3/ui/device/ThirdPartyVoiceAssistantActivity;->mRecyclerViewAutoRefresh:Z

    if-eqz v0, :cond_1

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/ThirdPartyVoiceAssistantActivity;->getMRecyclerView()Landroidx/recyclerview/widget/RecyclerView;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView;->getItemAnimator()Landroidx/recyclerview/widget/RecyclerView$ItemAnimator;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView$ItemAnimator;->endAnimations()V

    :cond_0
    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/ThirdPartyVoiceAssistantActivity;->getMRecyclerView()Landroidx/recyclerview/widget/RecyclerView;

    move-result-object v0

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/ThirdPartyVoiceAssistantActivity;->getMAdapter()Lcom/sma/smartv3/ui/device/ChatVoiceAssistantAdapter;

    move-result-object v1

    invoke-virtual {v1}, Lcom/sma/smartv3/ui/device/ChatVoiceAssistantAdapter;->getItemCount()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    invoke-virtual {v0, v1}, Landroidx/recyclerview/widget/RecyclerView;->smoothScrollToPosition(I)V

    :cond_1
    return-void
.end method

.method private final sendMessage(Ljava/lang/String;)V
    .locals 2

    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lcom/sma/smartv3/ui/device/ThirdPartyVoiceAssistantActivity;->chatWithQWManager:Lcom/sma/smartv3/util/ChatWithQWManager;

    invoke-virtual {v0}, Lcom/sma/smartv3/util/ChatWithQWManager;->I0IIOi()Lcom/android/mltcode/paycertificationapi/k85;

    move-result-object v0

    invoke-interface {v0}, Lcom/android/mltcode/paycertificationapi/k85;->getValue()Ljava/lang/Object;

    move-result-object v0

    sget-object v1, Lcom/android/mltcode/paycertificationapi/Iii1I$iO;->OXO1:Lcom/android/mltcode/paycertificationapi/Iii1I$iO;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    return-void

    :cond_1
    invoke-static {p0}, Lcom/blankj/utilcode/util/KeyboardUtils;->hideSoftInput(Landroid/app/Activity;)V

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/sma/smartv3/ui/device/ThirdPartyVoiceAssistantActivity;->mRecyclerViewAutoRefresh:Z

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/ThirdPartyVoiceAssistantActivity;->getEtContent()Landroid/widget/EditText;

    move-result-object v0

    const-string v1, ""

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    invoke-direct {p0, p1}, Lcom/sma/smartv3/ui/device/ThirdPartyVoiceAssistantActivity;->addSendTextToAdapter(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/ThirdPartyVoiceAssistantActivity;->chatWithQWManager:Lcom/sma/smartv3/util/ChatWithQWManager;

    invoke-virtual {v0, p1}, Lcom/sma/smartv3/util/ChatWithQWManager;->OIi0(Ljava/lang/String;)V

    return-void
.end method

.method private static final touchListener$lambda$0(Lcom/sma/smartv3/ui/device/ThirdPartyVoiceAssistantActivity;Landroid/view/View;Landroid/view/MotionEvent;)Z
    .locals 1

    invoke-virtual {p2}, Landroid/view/MotionEvent;->getAction()I

    move-result p1

    const/4 p2, 0x2

    const/4 v0, 0x0

    if-ne p1, p2, :cond_0

    iput-boolean v0, p0, Lcom/sma/smartv3/ui/device/ThirdPartyVoiceAssistantActivity;->mRecyclerViewAutoRefresh:Z

    :cond_0
    return v0
.end method

.method private static final viewKeyboardHeight_delegate$lambda$0(Lcom/sma/smartv3/ui/device/ThirdPartyVoiceAssistantActivity;)Landroid/view/View;
    .locals 1

    const v0, 0x7f0a18fb

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    return-object p0
.end method

.method private static final viewModel_delegate$lambda$0(Lcom/sma/smartv3/ui/device/ThirdPartyVoiceAssistantActivity;)Lcom/sma/smartv3/ui/device/ChatVoiceViewModel;
    .locals 1

    new-instance v0, Landroidx/lifecycle/ViewModelProvider;

    invoke-direct {v0, p0}, Landroidx/lifecycle/ViewModelProvider;-><init>(Landroidx/lifecycle/ViewModelStoreOwner;)V

    const-class p0, Lcom/sma/smartv3/ui/device/ChatVoiceViewModel;

    invoke-virtual {v0, p0}, Landroidx/lifecycle/ViewModelProvider;->get(Ljava/lang/Class;)Landroidx/lifecycle/ViewModel;

    move-result-object p0

    check-cast p0, Lcom/sma/smartv3/ui/device/ChatVoiceViewModel;

    return-object p0
.end method


# virtual methods
.method public final getChatWithQWManager()Lcom/sma/smartv3/util/ChatWithQWManager;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/ThirdPartyVoiceAssistantActivity;->chatWithQWManager:Lcom/sma/smartv3/util/ChatWithQWManager;

    return-object v0
.end method

.method public final getMRecyclerViewAutoRefresh()Z
    .locals 1

    iget-boolean v0, p0, Lcom/sma/smartv3/ui/device/ThirdPartyVoiceAssistantActivity;->mRecyclerViewAutoRefresh:Z

    return v0
.end method

.method public final getViewModel()Lcom/sma/smartv3/ui/device/ChatVoiceViewModel;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/ThirdPartyVoiceAssistantActivity;->viewModel$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/sma/smartv3/ui/device/ChatVoiceViewModel;

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

.method public final initListener()V
    .locals 2

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/ThirdPartyVoiceAssistantActivity;->getChatSendBt()Landroid/widget/Button;

    move-result-object v0

    new-instance v1, Lcom/android/mltcode/paycertificationapi/br5;

    invoke-direct {v1, p0}, Lcom/android/mltcode/paycertificationapi/br5;-><init>(Lcom/sma/smartv3/ui/device/ThirdPartyVoiceAssistantActivity;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/ThirdPartyVoiceAssistantActivity;->getChatSendBt()Landroid/widget/Button;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/view/View;->setEnabled(Z)V

    return-void
.end method

.method public initView()V
    .locals 34

    move-object/from16 v0, p0

    invoke-direct {v0}, Lcom/sma/smartv3/ui/device/ThirdPartyVoiceAssistantActivity;->getAbhTitleCenter()Landroid/widget/TextView;

    move-result-object v1

    iget-object v2, v0, Lcom/sma/smartv3/ui/device/ThirdPartyVoiceAssistantActivity;->mTitle:Ljava/lang/String;

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    invoke-direct {v0}, Lcom/sma/smartv3/ui/device/ThirdPartyVoiceAssistantActivity;->getAbhTitleRight()Landroid/widget/ImageView;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Landroid/widget/ImageView;->setVisibility(I)V

    invoke-direct {v0}, Lcom/sma/smartv3/ui/device/ThirdPartyVoiceAssistantActivity;->getAbhTitleOtherRight()Landroid/widget/ImageView;

    move-result-object v1

    const/16 v3, 0x8

    invoke-virtual {v1, v3}, Landroid/widget/ImageView;->setVisibility(I)V

    invoke-direct {v0}, Lcom/sma/smartv3/ui/device/ThirdPartyVoiceAssistantActivity;->getAbhTitleRight()Landroid/widget/ImageView;

    move-result-object v1

    const v3, 0x7f08062f

    invoke-virtual {v1, v3}, Landroid/widget/ImageView;->setImageResource(I)V

    invoke-direct {v0}, Lcom/sma/smartv3/ui/device/ThirdPartyVoiceAssistantActivity;->getAbhTitleOtherRight()Landroid/widget/ImageView;

    move-result-object v1

    const v3, 0x7f080633

    invoke-virtual {v1, v3}, Landroid/widget/ImageView;->setImageResource(I)V

    invoke-direct {v0}, Lcom/sma/smartv3/ui/device/ThirdPartyVoiceAssistantActivity;->getAbhTitleOtherRight()Landroid/widget/ImageView;

    move-result-object v1

    new-instance v3, Lcom/android/mltcode/paycertificationapi/ar5;

    invoke-direct {v3, v0}, Lcom/android/mltcode/paycertificationapi/ar5;-><init>(Lcom/sma/smartv3/ui/device/ThirdPartyVoiceAssistantActivity;)V

    invoke-virtual {v1, v3}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    invoke-direct {v0}, Lcom/sma/smartv3/ui/device/ThirdPartyVoiceAssistantActivity;->getAbhTitleRight()Landroid/widget/ImageView;

    move-result-object v1

    const v3, 0x7f06074b

    invoke-static {v0, v3}, Lcom/android/mltcode/paycertificationapi/gk4;->O00(Landroid/content/Context;I)Landroid/content/res/ColorStateList;

    move-result-object v3

    invoke-virtual {v1, v3}, Landroid/widget/ImageView;->setImageTintList(Landroid/content/res/ColorStateList;)V

    sget-object v1, Lcom/sma/smartv3/dto/OXO1;->I0iXXO:Lcom/sma/smartv3/dto/OXO1$OXO1;

    invoke-virtual {v1}, Lcom/sma/smartv3/dto/OXO1$OXO1;->IiI10X()Z

    move-result v3

    if-nez v3, :cond_0

    invoke-direct {v0}, Lcom/sma/smartv3/ui/device/ThirdPartyVoiceAssistantActivity;->getChatSendBt()Landroid/widget/Button;

    move-result-object v1

    invoke-virtual {v1, v2}, Landroid/view/View;->setEnabled(Z)V

    const-string v1, "\u8bf7\u5148\u6fc0\u6d3b\u4f7f\u7528"

    new-array v2, v2, [Ljava/lang/Object;

    invoke-static {v1, v2}, Lcom/blankj/utilcode/util/ToastUtils;->showLong(Ljava/lang/String;[Ljava/lang/Object;)V

    return-void

    :cond_0
    sget-object v3, Lcom/android/mltcode/paycertificationapi/a01;->OXO1:Lcom/android/mltcode/paycertificationapi/a01;

    invoke-virtual {v3}, Lcom/android/mltcode/paycertificationapi/a01;->IiI10X()Lcom/blankj/utilcode/util/SPUtils;

    move-result-object v3

    new-instance v4, Lcom/sma/smartv3/model/AppUser;

    const v32, 0x7ffffff

    const/16 v33, 0x0

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

    const/16 v30, 0x0

    const/16 v31, 0x0

    invoke-direct/range {v4 .. v33}, Lcom/sma/smartv3/model/AppUser;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IIFFLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;FFIILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/sma/smartv3/model/ThirdPlatform;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v5, Lcom/google/gson/Gson;

    invoke-direct {v5}, Lcom/google/gson/Gson;-><init>()V

    const-class v6, Lcom/sma/smartv3/model/AppUser;

    invoke-virtual {v6}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v3, v7}, Lcom/blankj/utilcode/util/SPUtils;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v5, v3, v6}, Lcom/google/gson/Gson;->fromJson(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v3

    if-nez v3, :cond_1

    goto :goto_0

    :cond_1
    move-object v4, v3

    :goto_0
    check-cast v4, Lcom/sma/smartv3/model/AppUser;

    invoke-virtual {v4}, Lcom/sma/smartv3/model/AppUser;->getDbUrl()Ljava/lang/String;

    move-result-object v3

    if-eqz v3, :cond_3

    invoke-interface {v3}, Ljava/lang/CharSequence;->length()I

    move-result v3

    if-nez v3, :cond_2

    goto :goto_1

    :cond_2
    move v3, v2

    goto :goto_2

    :cond_3
    :goto_1
    const/4 v3, 0x1

    :goto_2
    if-eqz v3, :cond_4

    invoke-direct {v0}, Lcom/sma/smartv3/ui/device/ThirdPartyVoiceAssistantActivity;->getChatSendBt()Landroid/widget/Button;

    move-result-object v1

    invoke-virtual {v1, v2}, Landroid/view/View;->setEnabled(Z)V

    const-string v1, "\u8bf7\u5148\u767b\u5f55\u4f7f\u7528"

    new-array v2, v2, [Ljava/lang/Object;

    invoke-static {v1, v2}, Lcom/blankj/utilcode/util/ToastUtils;->showLong(Ljava/lang/String;[Ljava/lang/Object;)V

    return-void

    :cond_4
    sget-object v2, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    invoke-virtual {v1}, Lcom/sma/smartv3/dto/OXO1$OXO1;->XIi00iiXO()Lcom/sma/smartv3/dto/OXO1;

    move-result-object v1

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "DeviceInfo:"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v1}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    invoke-virtual {v0}, Lcom/sma/smartv3/ui/device/ThirdPartyVoiceAssistantActivity;->initListener()V

    invoke-virtual {v0}, Lcom/sma/smartv3/ui/device/ThirdPartyVoiceAssistantActivity;->touchListener()V

    invoke-direct {v0}, Lcom/sma/smartv3/ui/device/ThirdPartyVoiceAssistantActivity;->getMRecyclerView()Landroidx/recyclerview/widget/RecyclerView;

    move-result-object v1

    invoke-direct {v0}, Lcom/sma/smartv3/ui/device/ThirdPartyVoiceAssistantActivity;->getMAdapter()Lcom/sma/smartv3/ui/device/ChatVoiceAssistantAdapter;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(Landroidx/recyclerview/widget/RecyclerView$Adapter;)V

    invoke-direct {v0}, Lcom/sma/smartv3/ui/device/ThirdPartyVoiceAssistantActivity;->collectSendState()V

    return-void
.end method

.method public layoutId()I
    .locals 1

    const v0, 0x7f0d012c

    return v0
.end method

.method public onDestroy()V
    .locals 1

    invoke-super {p0}, Lcom/bestmafen/androidbase/base/BaseActivity;->onDestroy()V

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/ThirdPartyVoiceAssistantActivity;->mListPop:Lcom/android/mltcode/paycertificationapi/mp;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/widget/PopupWindow;->dismiss()V

    :cond_0
    iget-object v0, p0, Lcom/sma/smartv3/ui/device/ThirdPartyVoiceAssistantActivity;->chatWithQWManager:Lcom/sma/smartv3/util/ChatWithQWManager;

    invoke-virtual {v0}, Lcom/sma/smartv3/util/ChatWithQWManager;->IO()V

    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v0

    invoke-static {v0}, Lcom/blankj/utilcode/util/KeyboardUtils;->unregisterSoftInputChangedListener(Landroid/view/Window;)V

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
    .locals 3
    .param p1    # Landroid/view/View;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "view"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, Lcom/sma/smartv3/ui/device/ThirdPartyVoiceAssistantActivity;->mDeletePopup:Lcom/android/mltcode/paycertificationapi/go0;

    if-nez p1, :cond_0

    new-instance p1, Lcom/android/mltcode/paycertificationapi/go0;

    const/4 v0, 0x0

    const/4 v1, 0x2

    const/4 v2, 0x0

    invoke-direct {p1, p0, v0, v1, v2}, Lcom/android/mltcode/paycertificationapi/go0;-><init>(Landroid/app/Activity;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const v0, 0x7f1403e4

    invoke-virtual {p1, v0}, Lcom/android/mltcode/paycertificationapi/go0;->O1O(I)V

    const v0, 0x7f14027f

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {p1, v0, v2, v1, v2}, Lcom/android/mltcode/paycertificationapi/go0;->X11iII1O1(Lcom/android/mltcode/paycertificationapi/go0;Ljava/lang/Integer;Lkotlin/jvm/functions/Function0;ILjava/lang/Object;)V

    new-instance v0, Lcom/android/mltcode/paycertificationapi/kr5;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/kr5;-><init>(Lcom/sma/smartv3/ui/device/ThirdPartyVoiceAssistantActivity;)V

    const v1, 0x7f1403db

    invoke-virtual {p1, v1, v0}, Lcom/android/mltcode/paycertificationapi/go0;->X1IX(ILkotlin/jvm/functions/Function0;)V

    iput-object p1, p0, Lcom/sma/smartv3/ui/device/ThirdPartyVoiceAssistantActivity;->mDeletePopup:Lcom/android/mltcode/paycertificationapi/go0;

    :cond_0
    iget-object p1, p0, Lcom/sma/smartv3/ui/device/ThirdPartyVoiceAssistantActivity;->mDeletePopup:Lcom/android/mltcode/paycertificationapi/go0;

    if-eqz p1, :cond_1

    invoke-virtual {p1}, Lcom/android/mltcode/paycertificationapi/OIXIOIO;->IIX1OXO()V

    :cond_1
    return-void
.end method

.method public final setMRecyclerViewAutoRefresh(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/sma/smartv3/ui/device/ThirdPartyVoiceAssistantActivity;->mRecyclerViewAutoRefresh:Z

    return-void
.end method

.method public final touchListener()V
    .locals 2
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "ClickableViewAccessibility"
        }
    .end annotation

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/ThirdPartyVoiceAssistantActivity;->getMRecyclerView()Landroidx/recyclerview/widget/RecyclerView;

    move-result-object v0

    new-instance v1, Lcom/android/mltcode/paycertificationapi/zq5;

    invoke-direct {v1, p0}, Lcom/android/mltcode/paycertificationapi/zq5;-><init>(Lcom/sma/smartv3/ui/device/ThirdPartyVoiceAssistantActivity;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V

    return-void
.end method
