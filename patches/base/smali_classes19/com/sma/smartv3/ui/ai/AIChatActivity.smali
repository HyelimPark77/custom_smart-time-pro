.class public Lcom/sma/smartv3/ui/ai/AIChatActivity;
.super Lcom/sma/smartv3/ui/ai/BaseAIActivity;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/sma/smartv3/ui/ai/AIChatActivity$OXO1;
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nAIChatActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AIChatActivity.kt\ncom/sma/smartv3/ui/ai/AIChatActivity\n+ 2 Activity.kt\ncom/bestmafen/androidbase/extension/ActivityKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,992:1\n69#2,3:993\n72#2,5:997\n1#3:996\n1869#4,2:1002\n*S KotlinDebug\n*F\n+ 1 AIChatActivity.kt\ncom/sma/smartv3/ui/ai/AIChatActivity\n*L\n829#1:993,3\n829#1:997,5\n829#1:996\n769#1:1002,2\n*E\n"
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nAIChatActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AIChatActivity.kt\ncom/sma/smartv3/ui/ai/AIChatActivity\n+ 2 Activity.kt\ncom/bestmafen/androidbase/extension/ActivityKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,992:1\n69#2,3:993\n72#2,5:997\n1#3:996\n1869#4,2:1002\n*S KotlinDebug\n*F\n+ 1 AIChatActivity.kt\ncom/sma/smartv3/ui/ai/AIChatActivity\n*L\n829#1:993,3\n829#1:997,5\n829#1:996\n769#1:1002,2\n*E\n"
    }
.end annotation


# instance fields
.field private final abhTitleOtherRight$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final abhTitleRight$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final btnAudio$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final btnChatSend$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private downY:F

.field private inputMethod:Z

.field private isRecording:Z

.field private final ivChatVoice$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private lastScrollTime:J

.field private longPressStartTime:J

.field private longPressThreshold:J

.field private mAdapter:Lcom/bestmafen/androidbase/adapter/recyclerview/MultiItemTypeAdapter;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/bestmafen/androidbase/adapter/recyclerview/MultiItemTypeAdapter<",
            "Lcom/sma/smartv3/db/entity/AIRecords;",
            ">;"
        }
    .end annotation
.end field

.field private mAllDeleteTipPopup:Lcom/android/mltcode/paycertificationapi/go0;
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation
.end field

.field private mAudioRecord:Landroid/media/AudioRecord;
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation
.end field

.field private mBufferSize:I

.field private final mChatContent$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final mHandler:Landroid/os/Handler;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public mList:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/sma/smartv3/db/entity/AIRecords;",
            ">;"
        }
    .end annotation
.end field

.field private mPopupWindow:Landroid/widget/PopupWindow;
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation
.end field

.field private mRecordingPopup:Lcom/android/mltcode/paycertificationapi/uf3;
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation
.end field

.field private final mRecyclerView$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private mRecyclerViewAutoRefresh:Z

.field private mTipContent:Ljava/lang/String;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private received:Lcom/sma/smartv3/db/entity/AIRecords;
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation
.end field

.field private recordingIsClear:Z

.field private showChatTime:J

.field private final tvOpenAiDeduction$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final viewKeyboardHeight$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 3

    invoke-direct {p0}, Lcom/sma/smartv3/ui/ai/BaseAIActivity;-><init>()V

    new-instance v0, Lcom/android/mltcode/paycertificationapi/XXiIiX10;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/XXiIiX10;-><init>(Lcom/sma/smartv3/ui/ai/AIChatActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/ai/AIChatActivity;->abhTitleRight$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/X00Xi1X;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/X00Xi1X;-><init>(Lcom/sma/smartv3/ui/ai/AIChatActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/ai/AIChatActivity;->abhTitleOtherRight$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/X1;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/X1;-><init>(Lcom/sma/smartv3/ui/ai/AIChatActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/ai/AIChatActivity;->mRecyclerView$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/IXOIIIO;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/IXOIIIO;-><init>(Lcom/sma/smartv3/ui/ai/AIChatActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/ai/AIChatActivity;->mChatContent$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/IO0II0i;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/IO0II0i;-><init>(Lcom/sma/smartv3/ui/ai/AIChatActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/ai/AIChatActivity;->btnAudio$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/Ii0i;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/Ii0i;-><init>(Lcom/sma/smartv3/ui/ai/AIChatActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/ai/AIChatActivity;->ivChatVoice$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/IXI;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/IXI;-><init>(Lcom/sma/smartv3/ui/ai/AIChatActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/ai/AIChatActivity;->btnChatSend$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/Ii1iii0;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/Ii1iii0;-><init>(Lcom/sma/smartv3/ui/ai/AIChatActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/ai/AIChatActivity;->tvOpenAiDeduction$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/iiiO;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/iiiO;-><init>(Lcom/sma/smartv3/ui/ai/AIChatActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/ai/AIChatActivity;->viewKeyboardHeight$delegate:Lkotlin/Lazy;

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/sma/smartv3/ui/ai/AIChatActivity;->inputMethod:Z

    const-wide/16 v1, 0x12c

    iput-wide v1, p0, Lcom/sma/smartv3/ui/ai/AIChatActivity;->longPressThreshold:J

    iput-boolean v0, p0, Lcom/sma/smartv3/ui/ai/AIChatActivity;->mRecyclerViewAutoRefresh:Z

    new-instance v0, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    iput-object v0, p0, Lcom/sma/smartv3/ui/ai/AIChatActivity;->mHandler:Landroid/os/Handler;

    const-string v0, ""

    iput-object v0, p0, Lcom/sma/smartv3/ui/ai/AIChatActivity;->mTipContent:Ljava/lang/String;

    return-void
.end method

.method public static synthetic I1(Lcom/sma/smartv3/ui/ai/AIChatActivity;)Z
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/ai/AIChatActivity;->showDeleteTipPopup$lambda$0$1(Lcom/sma/smartv3/ui/ai/AIChatActivity;)Z

    move-result p0

    return p0
.end method

.method public static synthetic I1XOi1(Lcom/sma/smartv3/ui/ai/AIChatActivity;)Lcom/sma/smartv3/view/text/PFMedium;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/ai/AIChatActivity;->tvOpenAiDeduction_delegate$lambda$0(Lcom/sma/smartv3/ui/ai/AIChatActivity;)Lcom/sma/smartv3/view/text/PFMedium;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic II1Xi0(Lcom/sma/smartv3/ui/ai/AIChatActivity;)Landroid/widget/ImageView;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/ai/AIChatActivity;->ivChatVoice_delegate$lambda$0(Lcom/sma/smartv3/ui/ai/AIChatActivity;)Landroid/widget/ImageView;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic IIX1OXO(Lcom/sma/smartv3/ui/ai/AIChatActivity;Landroid/view/View;Landroid/view/MotionEvent;)Z
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/sma/smartv3/ui/ai/AIChatActivity;->touchListener$lambda$0(Lcom/sma/smartv3/ui/ai/AIChatActivity;Landroid/view/View;Landroid/view/MotionEvent;)Z

    move-result p0

    return p0
.end method

.method public static synthetic IXXOO(Lcom/sma/smartv3/ui/ai/AIChatActivity;)Landroid/view/View;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/ai/AIChatActivity;->viewKeyboardHeight_delegate$lambda$0(Lcom/sma/smartv3/ui/ai/AIChatActivity;)Landroid/view/View;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic O1O(Lcom/sma/smartv3/ui/ai/AIChatActivity;)V
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/ai/AIChatActivity;->startRecording$lambda$0$0(Lcom/sma/smartv3/ui/ai/AIChatActivity;)V

    return-void
.end method

.method public static synthetic OII(Lcom/sma/smartv3/ui/ai/AIChatActivity;)Landroid/widget/EditText;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/ai/AIChatActivity;->mChatContent_delegate$lambda$0(Lcom/sma/smartv3/ui/ai/AIChatActivity;)Landroid/widget/EditText;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic OX(Lcom/sma/smartv3/ui/ai/AIChatActivity;)Landroid/widget/Button;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/ai/AIChatActivity;->btnAudio_delegate$lambda$0(Lcom/sma/smartv3/ui/ai/AIChatActivity;)Landroid/widget/Button;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic OiIIX101O(Lcom/sma/smartv3/ui/ai/AIChatActivity;)Landroid/widget/Button;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/ai/AIChatActivity;->btnChatSend_delegate$lambda$0(Lcom/sma/smartv3/ui/ai/AIChatActivity;)Landroid/widget/Button;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic X01IiOiIi(Lcom/sma/smartv3/ui/ai/AIChatActivity;)Landroid/widget/ImageView;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/ai/AIChatActivity;->abhTitleRight_delegate$lambda$0(Lcom/sma/smartv3/ui/ai/AIChatActivity;)Landroid/widget/ImageView;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic X0O(Lkotlin/jvm/internal/Ref$IntRef;Lcom/sma/smartv3/ui/ai/AIChatActivity;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/sma/smartv3/ui/ai/AIChatActivity;->processingEditTextKeyboard$lambda$0(Lkotlin/jvm/internal/Ref$IntRef;Lcom/sma/smartv3/ui/ai/AIChatActivity;)V

    return-void
.end method

.method public static synthetic XX0(Lcom/bestmafen/androidbase/extension/PermissionStatus;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/ai/AIChatActivity;->permission$lambda$0(Lcom/bestmafen/androidbase/extension/PermissionStatus;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic XXIIO1i11(Lcom/sma/smartv3/ui/ai/AIChatActivity;)Landroidx/recyclerview/widget/RecyclerView;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/ai/AIChatActivity;->mRecyclerView_delegate$lambda$0(Lcom/sma/smartv3/ui/ai/AIChatActivity;)Landroidx/recyclerview/widget/RecyclerView;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic XiOIO(Lcom/sma/smartv3/ui/ai/AIChatActivity;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/ai/AIChatActivity;->startRecording$lambda$0(Lcom/sma/smartv3/ui/ai/AIChatActivity;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic XiOIii1(Lcom/sma/smartv3/ui/ai/AIChatActivity;Landroid/view/View;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/sma/smartv3/ui/ai/AIChatActivity;->onTitleRightClick$lambda$0(Lcom/sma/smartv3/ui/ai/AIChatActivity;Landroid/view/View;)V

    return-void
.end method

.method private static final abhTitleOtherRight_delegate$lambda$0(Lcom/sma/smartv3/ui/ai/AIChatActivity;)Landroid/widget/ImageView;
    .locals 1

    const v0, 0x7f0a0025

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/ImageView;

    return-object p0
.end method

.method private static final abhTitleRight_delegate$lambda$0(Lcom/sma/smartv3/ui/ai/AIChatActivity;)Landroid/widget/ImageView;
    .locals 1

    const v0, 0x7f0a0026

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/ImageView;

    return-object p0
.end method

.method public static final synthetic access$addQuestion(Lcom/sma/smartv3/ui/ai/AIChatActivity;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/sma/smartv3/ui/ai/AIChatActivity;->addQuestion(Ljava/lang/String;)V

    return-void
.end method

.method public static final synthetic access$getMAdapter$p(Lcom/sma/smartv3/ui/ai/AIChatActivity;)Lcom/bestmafen/androidbase/adapter/recyclerview/MultiItemTypeAdapter;
    .locals 0

    iget-object p0, p0, Lcom/sma/smartv3/ui/ai/AIChatActivity;->mAdapter:Lcom/bestmafen/androidbase/adapter/recyclerview/MultiItemTypeAdapter;

    return-object p0
.end method

.method public static final synthetic access$getMRecyclerView(Lcom/sma/smartv3/ui/ai/AIChatActivity;)Landroidx/recyclerview/widget/RecyclerView;
    .locals 0

    invoke-direct {p0}, Lcom/sma/smartv3/ui/ai/AIChatActivity;->getMRecyclerView()Landroidx/recyclerview/widget/RecyclerView;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$getViewKeyboardHeight(Lcom/sma/smartv3/ui/ai/AIChatActivity;)Landroid/view/View;
    .locals 0

    invoke-direct {p0}, Lcom/sma/smartv3/ui/ai/AIChatActivity;->getViewKeyboardHeight()Landroid/view/View;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$scrollView(Lcom/sma/smartv3/ui/ai/AIChatActivity;)V
    .locals 0

    invoke-direct {p0}, Lcom/sma/smartv3/ui/ai/AIChatActivity;->scrollView()V

    return-void
.end method

.method public static final synthetic access$setRecording$p(Lcom/sma/smartv3/ui/ai/AIChatActivity;Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/sma/smartv3/ui/ai/AIChatActivity;->isRecording:Z

    return-void
.end method

.method public static synthetic addMoveQuestions$default(Lcom/sma/smartv3/ui/ai/AIChatActivity;Ljava/lang/String;ILjava/lang/Object;)V
    .locals 0

    if-nez p3, :cond_1

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    const-string p1, ""

    :cond_0
    invoke-virtual {p0, p1}, Lcom/sma/smartv3/ui/ai/AIChatActivity;->addMoveQuestions(Ljava/lang/String;)V

    return-void

    :cond_1
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    const-string p1, "Super calls with default arguments not supported in this target, function: addMoveQuestions"

    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method private final addQuestion(Ljava/lang/String;)V
    .locals 24

    move-object/from16 v0, p0

    new-instance v1, Lcom/sma/smartv3/db/entity/AIRecords;

    invoke-virtual {v0}, Lcom/sma/smartv3/ui/ai/BaseAIActivity;->getMAIFunction()Lcom/sma/smartv3/model/AIFunction;

    move-result-object v2

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    invoke-virtual {v2}, Lcom/sma/smartv3/model/AIFunction;->getType()Lcom/sma/smartv3/model/AIFunctionType;

    move-result-object v2

    invoke-virtual {v2}, Lcom/sma/smartv3/model/AIFunctionType;->getType()I

    move-result v6

    const v20, 0x1ffc7

    const/16 v21, 0x0

    const/4 v2, 0x0

    const-wide/16 v3, 0x0

    const/4 v5, 0x0

    const/4 v7, 0x1

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

    move-object/from16 v8, p1

    invoke-direct/range {v1 .. v21}, Lcom/sma/smartv3/db/entity/AIRecords;-><init>(IJLjava/lang/String;IILjava/lang/String;Ljava/lang/String;IIILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {v0}, Lcom/sma/smartv3/ui/ai/AIChatActivity;->getMList()Ljava/util/List;

    move-result-object v2

    invoke-interface {v2, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    invoke-virtual {v0, v1}, Lcom/sma/smartv3/ui/ai/BaseAIActivity;->addSendRecord(Lcom/sma/smartv3/db/entity/AIRecords;)V

    new-instance v3, Lcom/sma/smartv3/db/entity/AIRecords;

    invoke-virtual {v0}, Lcom/sma/smartv3/ui/ai/BaseAIActivity;->getMAIFunction()Lcom/sma/smartv3/model/AIFunction;

    move-result-object v1

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    invoke-virtual {v1}, Lcom/sma/smartv3/model/AIFunction;->getType()Lcom/sma/smartv3/model/AIFunctionType;

    move-result-object v1

    invoke-virtual {v1}, Lcom/sma/smartv3/model/AIFunctionType;->getType()I

    move-result v8

    const v22, 0x1ff47

    const/16 v23, 0x0

    const/4 v4, 0x0

    const-wide/16 v5, 0x0

    const/4 v7, 0x0

    const/4 v9, 0x2

    const-string v10, ""

    const/4 v11, 0x0

    const/4 v12, 0x1

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/16 v18, 0x0

    const/16 v20, 0x0

    invoke-direct/range {v3 .. v23}, Lcom/sma/smartv3/db/entity/AIRecords;-><init>(IJLjava/lang/String;IILjava/lang/String;Ljava/lang/String;IIILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object v3, v0, Lcom/sma/smartv3/ui/ai/AIChatActivity;->received:Lcom/sma/smartv3/db/entity/AIRecords;

    invoke-virtual {v0}, Lcom/sma/smartv3/ui/ai/AIChatActivity;->getMList()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    invoke-virtual {v0, v3}, Lcom/sma/smartv3/ui/ai/BaseAIActivity;->addReceivedRecord(Lcom/sma/smartv3/db/entity/AIRecords;)Lcom/sma/smartv3/db/entity/AIRecords;

    iget-object v1, v0, Lcom/sma/smartv3/ui/ai/AIChatActivity;->mAdapter:Lcom/bestmafen/androidbase/adapter/recyclerview/MultiItemTypeAdapter;

    if-nez v1, :cond_0

    const-string v1, "mAdapter"

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    const/4 v1, 0x0

    :cond_0
    invoke-virtual {v1}, Landroidx/recyclerview/widget/RecyclerView$Adapter;->notifyDataSetChanged()V

    invoke-direct {v0}, Lcom/sma/smartv3/ui/ai/AIChatActivity;->scrollView()V

    invoke-virtual/range {p0 .. p1}, Lcom/sma/smartv3/ui/ai/AIChatActivity;->sendCurrent(Ljava/lang/String;)V

    return-void
.end method

.method public static synthetic addWelcomeQuestions$default(Lcom/sma/smartv3/ui/ai/AIChatActivity;Ljava/lang/String;ILjava/lang/Object;)V
    .locals 0

    if-nez p3, :cond_1

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    const-string p1, ""

    :cond_0
    invoke-virtual {p0, p1}, Lcom/sma/smartv3/ui/ai/AIChatActivity;->addWelcomeQuestions(Ljava/lang/String;)V

    return-void

    :cond_1
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    const-string p1, "Super calls with default arguments not supported in this target, function: addWelcomeQuestions"

    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method private static final btnAudio_delegate$lambda$0(Lcom/sma/smartv3/ui/ai/AIChatActivity;)Landroid/widget/Button;
    .locals 1

    const v0, 0x7f0a01c1

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/Button;

    return-object p0
.end method

.method private static final btnChatSend_delegate$lambda$0(Lcom/sma/smartv3/ui/ai/AIChatActivity;)Landroid/widget/Button;
    .locals 1

    const v0, 0x7f0a01c2

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/Button;

    return-object p0
.end method

.method private final getAbhTitleOtherRight()Landroid/widget/ImageView;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/ai/AIChatActivity;->abhTitleOtherRight$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    return-object v0
.end method

.method private final getAbhTitleRight()Landroid/widget/ImageView;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/ai/AIChatActivity;->abhTitleRight$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    return-object v0
.end method

.method private final getBtnAudio()Landroid/widget/Button;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/ai/AIChatActivity;->btnAudio$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/Button;

    return-object v0
.end method

.method private final getBtnChatSend()Landroid/widget/Button;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/ai/AIChatActivity;->btnChatSend$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/Button;

    return-object v0
.end method

.method private final getIvChatVoice()Landroid/widget/ImageView;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/ai/AIChatActivity;->ivChatVoice$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    return-object v0
.end method

.method private final getMChatContent()Landroid/widget/EditText;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/ai/AIChatActivity;->mChatContent$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/EditText;

    return-object v0
.end method

.method private final getMRecyclerView()Landroidx/recyclerview/widget/RecyclerView;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/ai/AIChatActivity;->mRecyclerView$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroidx/recyclerview/widget/RecyclerView;

    return-object v0
.end method

.method private final getTvOpenAiDeduction()Lcom/sma/smartv3/view/text/PFMedium;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/ai/AIChatActivity;->tvOpenAiDeduction$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/sma/smartv3/view/text/PFMedium;

    return-object v0
.end method

.method private final getViewKeyboardHeight()Landroid/view/View;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/ai/AIChatActivity;->viewKeyboardHeight$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    return-object v0
.end method

.method public static synthetic i010I(Lcom/sma/smartv3/ui/ai/AIChatActivity;)Landroid/widget/ImageView;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/ai/AIChatActivity;->abhTitleOtherRight_delegate$lambda$0(Lcom/sma/smartv3/ui/ai/AIChatActivity;)Landroid/widget/ImageView;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic iI(Lcom/sma/smartv3/ui/ai/AIChatActivity;Landroid/view/View;Landroid/view/MotionEvent;)Z
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/sma/smartv3/ui/ai/AIChatActivity;->touchListener$lambda$1(Lcom/sma/smartv3/ui/ai/AIChatActivity;Landroid/view/View;Landroid/view/MotionEvent;)Z

    move-result p0

    return p0
.end method

.method public static synthetic iIiiO(Lcom/sma/smartv3/ui/ai/AIChatActivity;)V
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/ai/AIChatActivity;->longClickDown$lambda$0(Lcom/sma/smartv3/ui/ai/AIChatActivity;)V

    return-void
.end method

.method public static synthetic iOO1ii1(Lcom/sma/smartv3/ui/ai/AIChatActivity;Landroid/view/View;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/sma/smartv3/ui/ai/AIChatActivity;->onTitleRightClick$lambda$1(Lcom/sma/smartv3/ui/ai/AIChatActivity;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic iOOX010X()Z
    .locals 1

    invoke-static {}, Lcom/sma/smartv3/ui/ai/AIChatActivity;->showDeleteTipPopup$lambda$0$0()Z

    move-result v0

    return v0
.end method

.method public static synthetic iX(Lcom/sma/smartv3/ui/ai/AIChatActivity;Lkotlin/jvm/internal/Ref$IntRef;I)V
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/sma/smartv3/ui/ai/AIChatActivity;->processingEditTextKeyboard$lambda$1(Lcom/sma/smartv3/ui/ai/AIChatActivity;Lkotlin/jvm/internal/Ref$IntRef;I)V

    return-void
.end method

.method public static synthetic iX1O1(Lcom/sma/smartv3/ui/ai/AIChatActivity;Landroid/view/View;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/sma/smartv3/ui/ai/AIChatActivity;->onTitleRightClick$lambda$2(Lcom/sma/smartv3/ui/ai/AIChatActivity;Landroid/view/View;)V

    return-void
.end method

.method private final initAdapter()V
    .locals 4

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/ai/AIChatActivity;->getMList()Ljava/util/List;

    move-result-object v0

    new-instance v1, Lcom/sma/smartv3/ui/ai/AIChatActivity$initAdapter$1;

    invoke-direct {v1, p0, v0}, Lcom/sma/smartv3/ui/ai/AIChatActivity$initAdapter$1;-><init>(Lcom/sma/smartv3/ui/ai/AIChatActivity;Ljava/util/List;)V

    iput-object v1, p0, Lcom/sma/smartv3/ui/ai/AIChatActivity;->mAdapter:Lcom/bestmafen/androidbase/adapter/recyclerview/MultiItemTypeAdapter;

    invoke-direct {p0}, Lcom/sma/smartv3/ui/ai/AIChatActivity;->getMRecyclerView()Landroidx/recyclerview/widget/RecyclerView;

    move-result-object v0

    new-instance v1, Landroidx/recyclerview/widget/LinearLayoutManager;

    const/4 v2, 0x1

    const/4 v3, 0x0

    invoke-direct {v1, p0, v2, v3}, Landroidx/recyclerview/widget/LinearLayoutManager;-><init>(Landroid/content/Context;IZ)V

    invoke-virtual {v0, v1}, Landroidx/recyclerview/widget/RecyclerView;->setLayoutManager(Landroidx/recyclerview/widget/RecyclerView$LayoutManager;)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/ai/AIChatActivity;->getMRecyclerView()Landroidx/recyclerview/widget/RecyclerView;

    move-result-object v0

    iget-object v1, p0, Lcom/sma/smartv3/ui/ai/AIChatActivity;->mAdapter:Lcom/bestmafen/androidbase/adapter/recyclerview/MultiItemTypeAdapter;

    if-nez v1, :cond_0

    const-string v1, "mAdapter"

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    const/4 v1, 0x0

    :cond_0
    invoke-virtual {v0, v1}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(Landroidx/recyclerview/widget/RecyclerView$Adapter;)V

    return-void
.end method

.method private final initialRecorder()V
    .locals 7

    const/16 v0, 0x10

    const/4 v1, 0x2

    const/16 v2, 0x3e80

    invoke-static {v2, v0, v1}, Landroid/media/AudioRecord;->getMinBufferSize(III)I

    move-result v0

    iput v0, p0, Lcom/sma/smartv3/ui/ai/AIChatActivity;->mBufferSize:I

    new-instance v1, Landroid/media/AudioRecord;

    const/4 v5, 0x2

    iget v6, p0, Lcom/sma/smartv3/ui/ai/AIChatActivity;->mBufferSize:I

    const/4 v2, 0x1

    const/16 v3, 0x3e80

    const/16 v4, 0x10

    invoke-direct/range {v1 .. v6}, Landroid/media/AudioRecord;-><init>(IIIII)V

    iput-object v1, p0, Lcom/sma/smartv3/ui/ai/AIChatActivity;->mAudioRecord:Landroid/media/AudioRecord;

    return-void
.end method

.method private static final ivChatVoice_delegate$lambda$0(Lcom/sma/smartv3/ui/ai/AIChatActivity;)Landroid/widget/ImageView;
    .locals 1

    const v0, 0x7f0a0621

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/ImageView;

    return-object p0
.end method

.method private static final longClickDown$lambda$0(Lcom/sma/smartv3/ui/ai/AIChatActivity;)V
    .locals 4

    iget-boolean v0, p0, Lcom/sma/smartv3/ui/ai/AIChatActivity;->isRecording:Z

    if-nez v0, :cond_1

    iget-wide v0, p0, Lcom/sma/smartv3/ui/ai/AIChatActivity;->longPressStartTime:J

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-eqz v0, :cond_1

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iget-wide v2, p0, Lcom/sma/smartv3/ui/ai/AIChatActivity;->longPressStartTime:J

    sub-long/2addr v0, v2

    iget-wide v2, p0, Lcom/sma/smartv3/ui/ai/AIChatActivity;->longPressThreshold:J

    cmp-long v0, v0, v2

    if-lez v0, :cond_1

    const-string v0, "MICROPHONE"

    filled-new-array {v0}, [Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/blankj/utilcode/util/PermissionUtils;->isGranted([Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-direct {p0}, Lcom/sma/smartv3/ui/ai/AIChatActivity;->startRecording()V

    return-void

    :cond_0
    invoke-virtual {p0}, Lcom/sma/smartv3/ui/ai/AIChatActivity;->permission()V

    :cond_1
    return-void
.end method

.method private static final mChatContent_delegate$lambda$0(Lcom/sma/smartv3/ui/ai/AIChatActivity;)Landroid/widget/EditText;
    .locals 1

    const v0, 0x7f0a0370

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/EditText;

    return-object p0
.end method

.method private static final mRecyclerView_delegate$lambda$0(Lcom/sma/smartv3/ui/ai/AIChatActivity;)Landroidx/recyclerview/widget/RecyclerView;
    .locals 1

    const v0, 0x7f0a0996

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroidx/recyclerview/widget/RecyclerView;

    return-object p0
.end method

.method private static final onTitleRightClick$lambda$0(Lcom/sma/smartv3/ui/ai/AIChatActivity;Landroid/view/View;)V
    .locals 0

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/ai/BaseAIActivity;->onSetModel()V

    iget-object p0, p0, Lcom/sma/smartv3/ui/ai/AIChatActivity;->mPopupWindow:Landroid/widget/PopupWindow;

    if-eqz p0, :cond_0

    invoke-virtual {p0}, Landroid/widget/PopupWindow;->dismiss()V

    :cond_0
    return-void
.end method

.method private static final onTitleRightClick$lambda$1(Lcom/sma/smartv3/ui/ai/AIChatActivity;Landroid/view/View;)V
    .locals 0

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/ai/AIChatActivity;->showDeleteTipPopup()V

    iget-object p0, p0, Lcom/sma/smartv3/ui/ai/AIChatActivity;->mPopupWindow:Landroid/widget/PopupWindow;

    if-eqz p0, :cond_0

    invoke-virtual {p0}, Landroid/widget/PopupWindow;->dismiss()V

    :cond_0
    return-void
.end method

.method private static final onTitleRightClick$lambda$2(Lcom/sma/smartv3/ui/ai/AIChatActivity;Landroid/view/View;)V
    .locals 1

    new-instance p1, Landroid/content/Intent;

    const-class v0, Lcom/sma/smartv3/ui/ai/SearchOnlineActivity;

    invoke-direct {p1, p0, v0}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    invoke-virtual {p0, p1}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    iget-object p0, p0, Lcom/sma/smartv3/ui/ai/AIChatActivity;->mPopupWindow:Landroid/widget/PopupWindow;

    if-eqz p0, :cond_0

    invoke-virtual {p0}, Landroid/widget/PopupWindow;->dismiss()V

    :cond_0
    return-void
.end method

.method private static final permission$lambda$0(Lcom/bestmafen/androidbase/extension/PermissionStatus;)Lkotlin/Unit;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, Lcom/bestmafen/androidbase/extension/PermissionStatus;->GRANTED:Lcom/bestmafen/androidbase/extension/PermissionStatus;

    sget-object p0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p0
.end method

.method private final processingEditTextKeyboard()V
    .locals 3

    new-instance v0, Lkotlin/jvm/internal/Ref$IntRef;

    invoke-direct {v0}, Lkotlin/jvm/internal/Ref$IntRef;-><init>()V

    const/4 v1, -0x1

    iput v1, v0, Lkotlin/jvm/internal/Ref$IntRef;->element:I

    invoke-direct {p0}, Lcom/sma/smartv3/ui/ai/AIChatActivity;->getMRecyclerView()Landroidx/recyclerview/widget/RecyclerView;

    move-result-object v1

    new-instance v2, Lcom/android/mltcode/paycertificationapi/i0X000X0O;

    invoke-direct {v2, v0, p0}, Lcom/android/mltcode/paycertificationapi/i0X000X0O;-><init>(Lkotlin/jvm/internal/Ref$IntRef;Lcom/sma/smartv3/ui/ai/AIChatActivity;)V

    invoke-virtual {v1, v2}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v1

    new-instance v2, Lcom/android/mltcode/paycertificationapi/Ii0X0X;

    invoke-direct {v2, p0, v0}, Lcom/android/mltcode/paycertificationapi/Ii0X0X;-><init>(Lcom/sma/smartv3/ui/ai/AIChatActivity;Lkotlin/jvm/internal/Ref$IntRef;)V

    invoke-static {v1, v2}, Lcom/blankj/utilcode/util/KeyboardUtils;->registerSoftInputChangedListener(Landroid/view/Window;Lcom/blankj/utilcode/util/KeyboardUtils$OnSoftInputChangedListener;)V

    return-void
.end method

.method private static final processingEditTextKeyboard$lambda$0(Lkotlin/jvm/internal/Ref$IntRef;Lcom/sma/smartv3/ui/ai/AIChatActivity;)V
    .locals 0

    invoke-direct {p1}, Lcom/sma/smartv3/ui/ai/AIChatActivity;->getMRecyclerView()Landroidx/recyclerview/widget/RecyclerView;

    move-result-object p1

    invoke-virtual {p1}, Landroid/view/View;->getHeight()I

    move-result p1

    iput p1, p0, Lkotlin/jvm/internal/Ref$IntRef;->element:I

    return-void
.end method

.method private static final processingEditTextKeyboard$lambda$1(Lcom/sma/smartv3/ui/ai/AIChatActivity;Lkotlin/jvm/internal/Ref$IntRef;I)V
    .locals 6

    invoke-static {p0}, Landroidx/lifecycle/LifecycleOwnerKt;->getLifecycleScope(Landroidx/lifecycle/LifecycleOwner;)Landroidx/lifecycle/LifecycleCoroutineScope;

    move-result-object v0

    new-instance v3, Lcom/sma/smartv3/ui/ai/AIChatActivity$processingEditTextKeyboard$2$1;

    const/4 v1, 0x0

    invoke-direct {v3, p0, p2, p1, v1}, Lcom/sma/smartv3/ui/ai/AIChatActivity$processingEditTextKeyboard$2$1;-><init>(Lcom/sma/smartv3/ui/ai/AIChatActivity;ILkotlin/jvm/internal/Ref$IntRef;Lkotlin/coroutines/Continuation;)V

    const/4 v4, 0x3

    const/4 v5, 0x0

    const/4 v2, 0x0

    invoke-static/range {v0 .. v5}, Lcom/android/mltcode/paycertificationapi/I100X1;->O00(Lcom/android/mltcode/paycertificationapi/i00OIXiO;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/XiOIO;

    return-void
.end method

.method private final scrollView()V
    .locals 3

    invoke-direct {p0}, Lcom/sma/smartv3/ui/ai/AIChatActivity;->getMRecyclerView()Landroidx/recyclerview/widget/RecyclerView;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView;->getItemAnimator()Landroidx/recyclerview/widget/RecyclerView$ItemAnimator;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView$ItemAnimator;->endAnimations()V

    :cond_0
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/sma/smartv3/ui/ai/AIChatActivity;->lastScrollTime:J

    iget-boolean v0, p0, Lcom/sma/smartv3/ui/ai/AIChatActivity;->mRecyclerViewAutoRefresh:Z

    if-eqz v0, :cond_1

    invoke-direct {p0}, Lcom/sma/smartv3/ui/ai/AIChatActivity;->getMRecyclerView()Landroidx/recyclerview/widget/RecyclerView;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView;->getLayoutManager()Landroidx/recyclerview/widget/RecyclerView$LayoutManager;

    move-result-object v0

    const-string v1, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->X1ii(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Landroidx/recyclerview/widget/LinearLayoutManager;

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/ai/AIChatActivity;->getMList()Ljava/util/List;

    move-result-object v1

    invoke-static {v1}, Lkotlin/collections/CollectionsKt__CollectionsKt;->X11iII1O1(Ljava/util/List;)I

    move-result v1

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroidx/recyclerview/widget/LinearLayoutManager;->scrollToPositionWithOffset(II)V

    :cond_1
    return-void
.end method

.method private final setTitle(Ljava/lang/String;)V
    .locals 4

    invoke-virtual {p1}, Ljava/lang/String;->hashCode()I

    move-result v0

    const v1, 0x7f1400ec

    const-string v2, "getString(...)"

    const v3, 0x7f0a0023

    sparse-switch v0, :sswitch_data_0

    goto/16 :goto_0

    :sswitch_0
    const-string v0, "sparkAIService"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    goto/16 :goto_0

    :cond_0
    invoke-virtual {p0, v3}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    if-eqz p1, :cond_1

    const v0, 0x7f1400d9

    invoke-virtual {p0, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :cond_1
    const p1, 0x7f1400f5

    invoke-virtual {p0, p1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1, v2}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1}, Lcom/sma/smartv3/ui/ai/AIChatActivity;->addWelcomeQuestions(Ljava/lang/String;)V

    return-void

    :sswitch_1
    const-string v0, "baiduAIService"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    goto :goto_0

    :cond_2
    invoke-virtual {p0, v3}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    if-eqz p1, :cond_3

    const v0, 0x7f14150d

    invoke-virtual {p0, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :cond_3
    const p1, 0x7f1400e7

    invoke-virtual {p0, p1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1, v2}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1}, Lcom/sma/smartv3/ui/ai/AIChatActivity;->addWelcomeQuestions(Ljava/lang/String;)V

    return-void

    :sswitch_2
    const-string v0, "deepseekAIService"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_4

    goto :goto_0

    :cond_4
    invoke-virtual {p0, v3}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    if-eqz p1, :cond_5

    const v0, 0x7f1410ab

    invoke-virtual {p0, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :cond_5
    invoke-virtual {p0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1, v2}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1}, Lcom/sma/smartv3/ui/ai/AIChatActivity;->addWelcomeQuestions(Ljava/lang/String;)V

    return-void

    :sswitch_3
    const-string v0, "openAIService"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_8

    :goto_0
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result v0

    if-lez v0, :cond_7

    invoke-virtual {p0, v3}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    if-eqz v0, :cond_6

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :cond_6
    const p1, 0x7f1400eb

    invoke-virtual {p0, p1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1, v2}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1}, Lcom/sma/smartv3/ui/ai/AIChatActivity;->addWelcomeQuestions(Ljava/lang/String;)V

    :cond_7
    return-void

    :cond_8
    invoke-virtual {p0, v3}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    if-eqz p1, :cond_9

    const v0, 0x7f1402ae

    invoke-virtual {p0, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :cond_9
    invoke-virtual {p0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1, v2}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1}, Lcom/sma/smartv3/ui/ai/AIChatActivity;->addWelcomeQuestions(Ljava/lang/String;)V

    return-void

    :sswitch_data_0
    .sparse-switch
        -0x639c599d -> :sswitch_3
        -0x158e4b77 -> :sswitch_2
        -0x149da64e -> :sswitch_1
        0x40e04f30 -> :sswitch_0
    .end sparse-switch
.end method

.method private static final showDeleteTipPopup$lambda$0$0()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method private static final showDeleteTipPopup$lambda$0$1(Lcom/sma/smartv3/ui/ai/AIChatActivity;)Z
    .locals 4

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/ai/AIChatActivity;->getMList()Ljava/util/List;

    move-result-object v0

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    check-cast v0, Ljava/lang/Iterable;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/sma/smartv3/db/entity/AIRecords;

    invoke-virtual {v2, v1}, Lcom/sma/smartv3/db/entity/AIRecords;->setMIsDelete(I)V

    const/4 v3, 0x0

    invoke-virtual {v2, v3}, Lcom/sma/smartv3/db/entity/AIRecords;->setMIsSync(I)V

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Lcom/sma/smartv3/ui/ai/BaseAIActivity;->getMRecordsDao()Lcom/sma/smartv3/db/dao/AIRecordsDao;

    move-result-object v0

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/ai/AIChatActivity;->getMList()Ljava/util/List;

    move-result-object v2

    invoke-interface {v0, v2}, Lcom/sma/smartv3/db/dao/AIRecordsDao;->update(Ljava/util/List;)I

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/ai/AIChatActivity;->getMList()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->clear()V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/ai/AIChatActivity;->addListWelcome()V

    iget-object p0, p0, Lcom/sma/smartv3/ui/ai/AIChatActivity;->mAdapter:Lcom/bestmafen/androidbase/adapter/recyclerview/MultiItemTypeAdapter;

    const/4 v0, 0x0

    if-nez p0, :cond_1

    const-string p0, "mAdapter"

    invoke-static {p0}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object p0, v0

    :cond_1
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$Adapter;->notifyDataSetChanged()V

    const p0, 0x7f1402dd

    invoke-static {p0}, Lcom/blankj/utilcode/util/ToastUtils;->showLong(I)V

    const-string p0, "AI_Answer_stop_player"

    const/4 v2, 0x2

    invoke-static {p0, v0, v2, v0}, Lcom/android/mltcode/paycertificationapi/I01XX0;->XIi00iiXO(Ljava/lang/String;Ljava/lang/Object;ILjava/lang/Object;)V

    return v1
.end method

.method private final startRecording()V
    .locals 10

    sget-object v0, Lcom/android/mltcode/paycertificationapi/q62;->OXO1:Lcom/android/mltcode/paycertificationapi/q62;

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/q62;->OIXOOi()Z

    move-result v0

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    iget-boolean v0, p0, Lcom/sma/smartv3/ui/ai/AIChatActivity;->isRecording:Z

    if-nez v0, :cond_1

    iput-boolean v1, p0, Lcom/sma/smartv3/ui/ai/AIChatActivity;->isRecording:Z

    sget-object v0, Lcom/sma/smartv3/biz/voice/RecordingManager;->Companion:Lcom/sma/smartv3/biz/voice/RecordingManager$Companion;

    invoke-virtual {v0}, Lcom/sma/smartv3/biz/voice/RecordingManager$Companion;->getInstance()Lcom/sma/smartv3/biz/voice/RecordingManager;

    move-result-object v1

    invoke-virtual {v1}, Lcom/sma/smartv3/biz/voice/RecordingManager;->startRecord()V

    invoke-virtual {v0}, Lcom/sma/smartv3/biz/voice/RecordingManager$Companion;->getInstance()Lcom/sma/smartv3/biz/voice/RecordingManager;

    move-result-object v0

    new-instance v1, Lcom/sma/smartv3/ui/ai/AIChatActivity$O00;

    invoke-direct {v1, p0}, Lcom/sma/smartv3/ui/ai/AIChatActivity$O00;-><init>(Lcom/sma/smartv3/ui/ai/AIChatActivity;)V

    invoke-virtual {v0, v1}, Lcom/sma/smartv3/biz/voice/RecordingManager;->setRecordingCallback(Lcom/sma/smartv3/biz/voice/RecordingManager$OnRecordingCallback;)V

    return-void

    :cond_0
    iget-boolean v0, p0, Lcom/sma/smartv3/ui/ai/AIChatActivity;->isRecording:Z

    if-nez v0, :cond_1

    iput-boolean v1, p0, Lcom/sma/smartv3/ui/ai/AIChatActivity;->isRecording:Z

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/ai/AIChatActivity;->showRecordingPopup()V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/ai/AIChatActivity;->initialRecorder()V

    new-instance v7, Lcom/android/mltcode/paycertificationapi/iOiXi11II;

    invoke-direct {v7, p0}, Lcom/android/mltcode/paycertificationapi/iOiXi11II;-><init>(Lcom/sma/smartv3/ui/ai/AIChatActivity;)V

    const/16 v8, 0x1e

    const/4 v9, 0x0

    const/4 v2, 0x1

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-static/range {v2 .. v9}, Lkotlin/concurrent/ThreadsKt;->iO(ZZLjava/lang/ClassLoader;Ljava/lang/String;ILkotlin/jvm/functions/Function0;ILjava/lang/Object;)Ljava/lang/Thread;

    :cond_1
    return-void
.end method

.method private static final startRecording$lambda$0(Lcom/sma/smartv3/ui/ai/AIChatActivity;)Lkotlin/Unit;
    .locals 6

    const/4 v0, 0x0

    :try_start_0
    iget-object v1, p0, Lcom/sma/smartv3/ui/ai/AIChatActivity;->mAudioRecord:Landroid/media/AudioRecord;

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Landroid/media/AudioRecord;->startRecording()V

    goto :goto_0

    :catchall_0
    move-exception v1

    goto/16 :goto_6

    :catch_0
    move-exception v1

    goto :goto_4

    :cond_0
    :goto_0
    new-instance v1, Ljava/io/FileOutputStream;

    sget-object v2, Lcom/android/mltcode/paycertificationapi/sz0;->OXO1:Lcom/android/mltcode/paycertificationapi/sz0;

    invoke-static {v2}, Lcom/android/mltcode/paycertificationapi/uz0;->X11I(Lcom/android/mltcode/paycertificationapi/sz0;)Ljava/io/File;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :try_start_1
    iget v0, p0, Lcom/sma/smartv3/ui/ai/AIChatActivity;->mBufferSize:I

    new-array v2, v0, [B

    :goto_1
    iget-boolean v3, p0, Lcom/sma/smartv3/ui/ai/AIChatActivity;->isRecording:Z

    if-eqz v3, :cond_2

    iget-object v3, p0, Lcom/sma/smartv3/ui/ai/AIChatActivity;->mAudioRecord:Landroid/media/AudioRecord;

    if-eqz v3, :cond_1

    const/4 v4, 0x0

    invoke-virtual {v3, v2, v4, v0}, Landroid/media/AudioRecord;->read([BII)I

    goto :goto_2

    :catchall_1
    move-exception v0

    move-object v5, v1

    move-object v1, v0

    move-object v0, v5

    goto :goto_6

    :catch_1
    move-exception v0

    move-object v5, v1

    move-object v1, v0

    move-object v0, v5

    goto :goto_4

    :cond_1
    :goto_2
    invoke-virtual {v1, v2}, Ljava/io/FileOutputStream;->write([B)V

    invoke-virtual {v1}, Ljava/io/OutputStream;->flush()V

    goto :goto_1

    :cond_2
    iget-object v0, p0, Lcom/sma/smartv3/ui/ai/AIChatActivity;->mAudioRecord:Landroid/media/AudioRecord;

    if-eqz v0, :cond_3

    invoke-virtual {v0}, Landroid/media/AudioRecord;->stop()V

    :cond_3
    iget-object v0, p0, Lcom/sma/smartv3/ui/ai/AIChatActivity;->mAudioRecord:Landroid/media/AudioRecord;

    if-eqz v0, :cond_4

    invoke-virtual {v0}, Landroid/media/AudioRecord;->release()V

    :cond_4
    invoke-virtual {v1}, Ljava/io/OutputStream;->flush()V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    invoke-virtual {v1}, Ljava/io/FileOutputStream;->close()V

    new-instance v0, Lcom/android/mltcode/paycertificationapi/OO;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/OO;-><init>(Lcom/sma/smartv3/ui/ai/AIChatActivity;)V

    invoke-virtual {p0, v0}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    iget-boolean v0, p0, Lcom/sma/smartv3/ui/ai/AIChatActivity;->recordingIsClear:Z

    if-nez v0, :cond_7

    :goto_3
    invoke-virtual {p0}, Lcom/sma/smartv3/ui/ai/AIChatActivity;->recognition()V

    goto :goto_5

    :goto_4
    :try_start_2
    invoke-virtual {v1}, Ljava/lang/Throwable;->printStackTrace()V

    if-eqz v0, :cond_5

    invoke-virtual {v0}, Ljava/io/FileOutputStream;->close()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :cond_5
    if-eqz v0, :cond_6

    invoke-virtual {v0}, Ljava/io/FileOutputStream;->close()V

    :cond_6
    new-instance v0, Lcom/android/mltcode/paycertificationapi/OO;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/OO;-><init>(Lcom/sma/smartv3/ui/ai/AIChatActivity;)V

    invoke-virtual {p0, v0}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    iget-boolean v0, p0, Lcom/sma/smartv3/ui/ai/AIChatActivity;->recordingIsClear:Z

    if-nez v0, :cond_7

    goto :goto_3

    :cond_7
    :goto_5
    sget-object p0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p0

    :goto_6
    if-eqz v0, :cond_8

    invoke-virtual {v0}, Ljava/io/FileOutputStream;->close()V

    :cond_8
    new-instance v0, Lcom/android/mltcode/paycertificationapi/OO;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/OO;-><init>(Lcom/sma/smartv3/ui/ai/AIChatActivity;)V

    invoke-virtual {p0, v0}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    iget-boolean v0, p0, Lcom/sma/smartv3/ui/ai/AIChatActivity;->recordingIsClear:Z

    if-nez v0, :cond_9

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/ai/AIChatActivity;->recognition()V

    :cond_9
    throw v1
.end method

.method private static final startRecording$lambda$0$0(Lcom/sma/smartv3/ui/ai/AIChatActivity;)V
    .locals 0

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/ai/AIChatActivity;->disRecordingPopup()V

    return-void
.end method

.method private final stopRecording()V
    .locals 1

    iget-boolean v0, p0, Lcom/sma/smartv3/ui/ai/AIChatActivity;->isRecording:Z

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/sma/smartv3/ui/ai/AIChatActivity;->isRecording:Z

    :cond_0
    return-void
.end method

.method private static final touchListener$lambda$0(Lcom/sma/smartv3/ui/ai/AIChatActivity;Landroid/view/View;Landroid/view/MotionEvent;)Z
    .locals 3

    invoke-virtual {p2}, Landroid/view/MotionEvent;->getAction()I

    move-result p1

    const/4 v0, 0x1

    if-eqz p1, :cond_6

    if-eq p1, v0, :cond_3

    const/4 v1, 0x2

    const/4 v2, 0x0

    if-eq p1, v1, :cond_0

    return v2

    :cond_0
    iget p1, p0, Lcom/sma/smartv3/ui/ai/AIChatActivity;->downY:F

    invoke-virtual {p2}, Landroid/view/MotionEvent;->getY()F

    move-result p2

    sub-float/2addr p1, p2

    const/high16 p2, 0x42c80000    # 100.0f

    cmpl-float p1, p1, p2

    if-lez p1, :cond_1

    move v2, v0

    :cond_1
    iput-boolean v2, p0, Lcom/sma/smartv3/ui/ai/AIChatActivity;->recordingIsClear:Z

    iget-object p0, p0, Lcom/sma/smartv3/ui/ai/AIChatActivity;->mRecordingPopup:Lcom/android/mltcode/paycertificationapi/uf3;

    if-eqz p0, :cond_2

    invoke-virtual {p0, v2}, Lcom/android/mltcode/paycertificationapi/uf3;->OX(Z)V

    :cond_2
    return v0

    :cond_3
    iget-object p1, p0, Lcom/sma/smartv3/ui/ai/AIChatActivity;->mHandler:Landroid/os/Handler;

    const/4 p2, 0x0

    invoke-virtual {p1, p2}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    sget-object p1, Lcom/android/mltcode/paycertificationapi/q62;->OXO1:Lcom/android/mltcode/paycertificationapi/q62;

    invoke-virtual {p1}, Lcom/android/mltcode/paycertificationapi/q62;->OIXOOi()Z

    move-result p1

    if-eqz p1, :cond_4

    sget-object p1, Lcom/sma/smartv3/biz/voice/RecordingManager;->Companion:Lcom/sma/smartv3/biz/voice/RecordingManager$Companion;

    invoke-virtual {p1}, Lcom/sma/smartv3/biz/voice/RecordingManager$Companion;->getInstance()Lcom/sma/smartv3/biz/voice/RecordingManager;

    move-result-object p1

    invoke-virtual {p1}, Lcom/sma/smartv3/biz/voice/RecordingManager;->stopRecording()V

    goto :goto_0

    :cond_4
    iget-boolean p1, p0, Lcom/sma/smartv3/ui/ai/AIChatActivity;->isRecording:Z

    if-eqz p1, :cond_5

    invoke-direct {p0}, Lcom/sma/smartv3/ui/ai/AIChatActivity;->stopRecording()V

    :cond_5
    :goto_0
    const-wide/16 p1, 0x0

    iput-wide p1, p0, Lcom/sma/smartv3/ui/ai/AIChatActivity;->longPressStartTime:J

    return v0

    :cond_6
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getY()F

    move-result p1

    iput p1, p0, Lcom/sma/smartv3/ui/ai/AIChatActivity;->downY:F

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide p1

    iput-wide p1, p0, Lcom/sma/smartv3/ui/ai/AIChatActivity;->longPressStartTime:J

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/ai/AIChatActivity;->longClickDown()V

    return v0
.end method

.method private static final touchListener$lambda$1(Lcom/sma/smartv3/ui/ai/AIChatActivity;Landroid/view/View;Landroid/view/MotionEvent;)Z
    .locals 1

    invoke-virtual {p2}, Landroid/view/MotionEvent;->getAction()I

    move-result p1

    const/4 p2, 0x2

    const/4 v0, 0x0

    if-ne p1, p2, :cond_0

    iput-boolean v0, p0, Lcom/sma/smartv3/ui/ai/AIChatActivity;->mRecyclerViewAutoRefresh:Z

    :cond_0
    return v0
.end method

.method private static final tvOpenAiDeduction_delegate$lambda$0(Lcom/sma/smartv3/ui/ai/AIChatActivity;)Lcom/sma/smartv3/view/text/PFMedium;
    .locals 1

    const v0, 0x7f0a00a8

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Lcom/sma/smartv3/view/text/PFMedium;

    return-object p0
.end method

.method private static final viewKeyboardHeight_delegate$lambda$0(Lcom/sma/smartv3/ui/ai/AIChatActivity;)Landroid/view/View;
    .locals 1

    const v0, 0x7f0a18fb

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final addListWelcome()V
    .locals 5

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/ai/BaseAIActivity;->getMAIFunction()Lcom/sma/smartv3/model/AIFunction;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/sma/smartv3/model/AIFunction;->getType()Lcom/sma/smartv3/model/AIFunctionType;

    move-result-object v0

    goto :goto_0

    :cond_0
    move-object v0, v1

    :goto_0
    if-nez v0, :cond_1

    const/4 v0, -0x1

    goto :goto_1

    :cond_1
    sget-object v2, Lcom/sma/smartv3/ui/ai/AIChatActivity$OXO1;->OXO1:[I

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    aget v0, v2, v0

    :goto_1
    const/4 v2, 0x1

    const-string v3, "getString(...)"

    if-eq v0, v2, :cond_4

    const/4 v4, 0x2

    if-eq v0, v4, :cond_3

    sget-object v0, Lcom/android/mltcode/paycertificationapi/q62;->OXO1:Lcom/android/mltcode/paycertificationapi/q62;

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/q62;->XIi10()Ljava/lang/String;

    move-result-object v4

    invoke-interface {v4}, Ljava/lang/CharSequence;->length()I

    move-result v4

    if-lez v4, :cond_2

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/q62;->XIi10()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/sma/smartv3/ui/ai/AIChatActivity;->setTitle(Ljava/lang/String;)V

    goto :goto_2

    :cond_2
    sget-object v0, Lcom/sma/smartv3/biz/AIManager;->OXO1:Lcom/sma/smartv3/biz/AIManager;

    const/4 v4, 0x0

    invoke-static {v0, v4, v2, v1}, Lcom/sma/smartv3/biz/AIManager;->O10IXXX0X(Lcom/sma/smartv3/biz/AIManager;IILjava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/sma/smartv3/ui/ai/AIChatActivity;->setTitle(Ljava/lang/String;)V

    :goto_2
    const v0, 0x7f1400e8

    invoke-virtual {p0, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v3}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, v0}, Lcom/sma/smartv3/ui/ai/AIChatActivity;->addMoveQuestions(Ljava/lang/String;)V

    const v0, 0x7f1400e9

    invoke-virtual {p0, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v3}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, v0}, Lcom/sma/smartv3/ui/ai/AIChatActivity;->addMoveQuestions(Ljava/lang/String;)V

    const v0, 0x7f1400ea

    invoke-virtual {p0, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v3}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, v0}, Lcom/sma/smartv3/ui/ai/AIChatActivity;->addMoveQuestions(Ljava/lang/String;)V

    return-void

    :cond_3
    const v0, 0x7f1400f1

    invoke-virtual {p0, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v3}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, v0}, Lcom/sma/smartv3/ui/ai/AIChatActivity;->addWelcomeQuestions(Ljava/lang/String;)V

    const v0, 0x7f1400f2

    invoke-virtual {p0, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v3}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, v0}, Lcom/sma/smartv3/ui/ai/AIChatActivity;->addMoveQuestions(Ljava/lang/String;)V

    const v0, 0x7f1400f3

    invoke-virtual {p0, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v3}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, v0}, Lcom/sma/smartv3/ui/ai/AIChatActivity;->addMoveQuestions(Ljava/lang/String;)V

    const v0, 0x7f1400f4

    invoke-virtual {p0, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v3}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, v0}, Lcom/sma/smartv3/ui/ai/AIChatActivity;->addMoveQuestions(Ljava/lang/String;)V

    return-void

    :cond_4
    const v0, 0x7f1400ed

    invoke-virtual {p0, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v3}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, v0}, Lcom/sma/smartv3/ui/ai/AIChatActivity;->addWelcomeQuestions(Ljava/lang/String;)V

    const v0, 0x7f1400ee

    invoke-virtual {p0, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v3}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, v0}, Lcom/sma/smartv3/ui/ai/AIChatActivity;->addMoveQuestions(Ljava/lang/String;)V

    const v0, 0x7f1400ef

    invoke-virtual {p0, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v3}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, v0}, Lcom/sma/smartv3/ui/ai/AIChatActivity;->addMoveQuestions(Ljava/lang/String;)V

    const v0, 0x7f1400f0

    invoke-virtual {p0, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v3}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, v0}, Lcom/sma/smartv3/ui/ai/AIChatActivity;->addMoveQuestions(Ljava/lang/String;)V

    return-void
.end method

.method public final addMoveQuestions(Ljava/lang/String;)V
    .locals 22
    .param p1    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "content"

    move-object/from16 v8, p1

    invoke-static {v8, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/sma/smartv3/db/entity/AIRecords;

    invoke-virtual/range {p0 .. p0}, Lcom/sma/smartv3/ui/ai/BaseAIActivity;->getMAIFunction()Lcom/sma/smartv3/model/AIFunction;

    move-result-object v0

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    invoke-virtual {v0}, Lcom/sma/smartv3/model/AIFunction;->getType()Lcom/sma/smartv3/model/AIFunctionType;

    move-result-object v0

    invoke-virtual {v0}, Lcom/sma/smartv3/model/AIFunctionType;->getType()I

    move-result v6

    invoke-interface {v8}, Ljava/lang/CharSequence;->length()I

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x4

    :goto_0
    move v7, v0

    goto :goto_1

    :cond_0
    const/4 v0, 0x5

    goto :goto_0

    :goto_1
    const v20, 0x1ff47

    const/16 v21, 0x0

    const/4 v2, 0x0

    const-wide/16 v3, 0x0

    const/4 v5, 0x0

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

    invoke-direct/range {v1 .. v21}, Lcom/sma/smartv3/db/entity/AIRecords;-><init>(IJLjava/lang/String;IILjava/lang/String;Ljava/lang/String;IIILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual/range {p0 .. p0}, Lcom/sma/smartv3/ui/ai/AIChatActivity;->getMList()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public final addWelcomeQuestions(Ljava/lang/String;)V
    .locals 22
    .param p1    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "content"

    move-object/from16 v8, p1

    invoke-static {v8, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/sma/smartv3/db/entity/AIRecords;

    invoke-virtual/range {p0 .. p0}, Lcom/sma/smartv3/ui/ai/BaseAIActivity;->getMAIFunction()Lcom/sma/smartv3/model/AIFunction;

    move-result-object v0

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    invoke-virtual {v0}, Lcom/sma/smartv3/model/AIFunction;->getType()Lcom/sma/smartv3/model/AIFunctionType;

    move-result-object v0

    invoke-virtual {v0}, Lcom/sma/smartv3/model/AIFunctionType;->getType()I

    move-result v6

    const v20, 0x1ff47

    const/16 v21, 0x0

    const/4 v2, 0x0

    const-wide/16 v3, 0x0

    const/4 v5, 0x0

    const/4 v7, 0x2

    const/4 v9, 0x0

    const/4 v10, 0x1

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    invoke-direct/range {v1 .. v21}, Lcom/sma/smartv3/db/entity/AIRecords;-><init>(IJLjava/lang/String;IILjava/lang/String;Ljava/lang/String;IIILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual/range {p0 .. p0}, Lcom/sma/smartv3/ui/ai/AIChatActivity;->getMList()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    const/4 v0, 0x0

    const/4 v1, 0x1

    move-object/from16 v2, p0

    invoke-static {v2, v0, v1, v0}, Lcom/sma/smartv3/ui/ai/AIChatActivity;->addMoveQuestions$default(Lcom/sma/smartv3/ui/ai/AIChatActivity;Ljava/lang/String;ILjava/lang/Object;)V

    return-void
.end method

.method public changeAiModel()V
    .locals 0

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/ai/AIChatActivity;->showOpenAiDeduction()V

    return-void
.end method

.method public final disRecordingPopup()V
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/ai/AIChatActivity;->mRecordingPopup:Lcom/android/mltcode/paycertificationapi/uf3;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/widget/PopupWindow;->dismiss()V

    :cond_0
    return-void
.end method

.method public final getDownY()F
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/ui/ai/AIChatActivity;->downY:F

    return v0
.end method

.method public final getInputMethod()Z
    .locals 1

    iget-boolean v0, p0, Lcom/sma/smartv3/ui/ai/AIChatActivity;->inputMethod:Z

    return v0
.end method

.method public final getLastScrollTime()J
    .locals 2

    iget-wide v0, p0, Lcom/sma/smartv3/ui/ai/AIChatActivity;->lastScrollTime:J

    return-wide v0
.end method

.method public final getMBufferSize()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/ui/ai/AIChatActivity;->mBufferSize:I

    return v0
.end method

.method public final getMHandler()Landroid/os/Handler;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/ui/ai/AIChatActivity;->mHandler:Landroid/os/Handler;

    return-object v0
.end method

.method public final getMList()Ljava/util/List;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/sma/smartv3/db/entity/AIRecords;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/ui/ai/AIChatActivity;->mList:Ljava/util/List;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "mList"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    const/4 v0, 0x0

    return-object v0
.end method

.method public final getMPopupWindow()Landroid/widget/PopupWindow;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/ui/ai/AIChatActivity;->mPopupWindow:Landroid/widget/PopupWindow;

    return-object v0
.end method

.method public final getMRecyclerViewAutoRefresh()Z
    .locals 1

    iget-boolean v0, p0, Lcom/sma/smartv3/ui/ai/AIChatActivity;->mRecyclerViewAutoRefresh:Z

    return v0
.end method

.method public final getMTipContent()Ljava/lang/String;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/ui/ai/AIChatActivity;->mTipContent:Ljava/lang/String;

    return-object v0
.end method

.method public final getReceived()Lcom/sma/smartv3/db/entity/AIRecords;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/ui/ai/AIChatActivity;->received:Lcom/sma/smartv3/db/entity/AIRecords;

    return-object v0
.end method

.method public final getRecordingIsClear()Z
    .locals 1

    iget-boolean v0, p0, Lcom/sma/smartv3/ui/ai/AIChatActivity;->recordingIsClear:Z

    return v0
.end method

.method public final getShowChatTime()J
    .locals 2

    iget-wide v0, p0, Lcom/sma/smartv3/ui/ai/AIChatActivity;->showChatTime:J

    return-wide v0
.end method

.method public final initList()Ljava/util/List;
    .locals 2
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/sma/smartv3/db/entity/AIRecords;",
            ">;"
        }
    .end annotation

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/ai/BaseAIActivity;->getMRecordsDao()Lcom/sma/smartv3/db/dao/AIRecordsDao;

    move-result-object v0

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/ai/BaseAIActivity;->getMAIFunction()Lcom/sma/smartv3/model/AIFunction;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Lcom/sma/smartv3/model/AIFunction;->getType()Lcom/sma/smartv3/model/AIFunctionType;

    move-result-object v1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    invoke-virtual {v1}, Lcom/sma/smartv3/model/AIFunctionType;->getType()I

    move-result v1

    invoke-interface {v0, v1}, Lcom/sma/smartv3/db/dao/AIRecordsDao;->getListASC(I)Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/util/Collection;

    invoke-static {v0}, Lkotlin/collections/CollectionsKt___CollectionsKt;->OO0Oi10(Ljava/util/Collection;)Ljava/util/List;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/sma/smartv3/ui/ai/AIChatActivity;->setMList(Ljava/util/List;)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/ai/AIChatActivity;->addListWelcome()V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/ai/AIChatActivity;->getMList()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public initView()V
    .locals 4

    invoke-super {p0}, Lcom/sma/smartv3/ui/ai/BaseAIActivity;->initView()V

    sget-object v0, Lcom/sma/smartv3/biz/AIManager;->OXO1:Lcom/sma/smartv3/biz/AIManager;

    invoke-virtual {v0}, Lcom/sma/smartv3/biz/AIManager;->iI()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-direct {p0}, Lcom/sma/smartv3/ui/ai/AIChatActivity;->getAbhTitleOtherRight()Landroid/widget/ImageView;

    move-result-object v0

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    goto :goto_0

    :cond_0
    invoke-direct {p0}, Lcom/sma/smartv3/ui/ai/AIChatActivity;->getAbhTitleOtherRight()Landroid/widget/ImageView;

    move-result-object v0

    const/16 v2, 0x8

    invoke-virtual {v0, v2}, Landroid/widget/ImageView;->setVisibility(I)V

    :goto_0
    invoke-direct {p0}, Lcom/sma/smartv3/ui/ai/AIChatActivity;->getAbhTitleOtherRight()Landroid/widget/ImageView;

    move-result-object v0

    const v2, 0x7f080636

    invoke-virtual {v0, v2}, Landroid/widget/ImageView;->setImageResource(I)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/ai/AIChatActivity;->getAbhTitleOtherRight()Landroid/widget/ImageView;

    move-result-object v0

    const v2, 0x7f06074b

    invoke-static {p0, v2}, Lcom/android/mltcode/paycertificationapi/gk4;->O00(Landroid/content/Context;I)Landroid/content/res/ColorStateList;

    move-result-object v3

    invoke-virtual {v0, v3}, Landroid/widget/ImageView;->setImageTintList(Landroid/content/res/ColorStateList;)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/ai/AIChatActivity;->getAbhTitleRight()Landroid/widget/ImageView;

    move-result-object v0

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    sget-object v0, Lcom/android/mltcode/paycertificationapi/q62;->OXO1:Lcom/android/mltcode/paycertificationapi/q62;

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/q62;->I0O()Z

    move-result v1

    if-nez v1, :cond_2

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/q62;->i0Ii001()Z

    move-result v0

    if-eqz v0, :cond_1

    goto :goto_1

    :cond_1
    invoke-direct {p0}, Lcom/sma/smartv3/ui/ai/AIChatActivity;->getAbhTitleRight()Landroid/widget/ImageView;

    move-result-object v0

    const v1, 0x7f08062f

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    goto :goto_2

    :cond_2
    :goto_1
    invoke-direct {p0}, Lcom/sma/smartv3/ui/ai/AIChatActivity;->getAbhTitleRight()Landroid/widget/ImageView;

    move-result-object v0

    const v1, 0x7f080630

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    :goto_2
    invoke-direct {p0}, Lcom/sma/smartv3/ui/ai/AIChatActivity;->getAbhTitleRight()Landroid/widget/ImageView;

    move-result-object v0

    invoke-static {p0, v2}, Lcom/android/mltcode/paycertificationapi/gk4;->O00(Landroid/content/Context;I)Landroid/content/res/ColorStateList;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageTintList(Landroid/content/res/ColorStateList;)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/ai/AIChatActivity;->processingEditTextKeyboard()V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/ai/AIChatActivity;->permission()V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/ai/AIChatActivity;->initList()Ljava/util/List;

    invoke-direct {p0}, Lcom/sma/smartv3/ui/ai/AIChatActivity;->initAdapter()V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/ai/AIChatActivity;->scrollView()V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/ai/AIChatActivity;->touchListener()V

    return-void
.end method

.method public final isShowTime(Landroid/widget/TextView;J)V
    .locals 4
    .param p1    # Landroid/widget/TextView;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "tvTime"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iget-wide v0, p0, Lcom/sma/smartv3/ui/ai/AIChatActivity;->showChatTime:J

    const-wide/16 v2, 0x0

    cmp-long v2, v0, v2

    if-eqz v2, :cond_1

    sub-long v0, p2, v0

    const-wide/32 v2, 0x493e0

    cmp-long v0, v0, v2

    if-lez v0, :cond_0

    goto :goto_0

    :cond_0
    const/16 p2, 0x8

    goto :goto_1

    :cond_1
    :goto_0
    iput-wide p2, p0, Lcom/sma/smartv3/ui/ai/AIChatActivity;->showChatTime:J

    invoke-static {}, Lcom/android/mltcode/paycertificationapi/O0X11OiO;->iI()Ljava/text/SimpleDateFormat;

    move-result-object v0

    invoke-static {p2, p3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p2

    invoke-virtual {v0, p2}, Ljava/text/Format;->format(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    const/4 p2, 0x0

    :goto_1
    invoke-virtual {p1, p2}, Landroid/view/View;->setVisibility(I)V

    return-void
.end method

.method public layoutId()I
    .locals 1

    const v0, 0x7f0d0025

    return v0
.end method

.method public final longClickDown()V
    .locals 6

    iget-object v0, p0, Lcom/sma/smartv3/ui/ai/AIChatActivity;->mHandler:Landroid/os/Handler;

    new-instance v1, Lcom/android/mltcode/paycertificationapi/XOX0O0;

    invoke-direct {v1, p0}, Lcom/android/mltcode/paycertificationapi/XOX0O0;-><init>(Lcom/sma/smartv3/ui/ai/AIChatActivity;)V

    iget-wide v2, p0, Lcom/sma/smartv3/ui/ai/AIChatActivity;->longPressThreshold:J

    const-wide/16 v4, 0x64

    add-long/2addr v2, v4

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    return-void
.end method

.method public onDestroy()V
    .locals 3

    invoke-super {p0}, Lcom/sma/smartv3/ui/ai/BaseAIActivity;->onDestroy()V

    sget-object v0, Lcom/android/mltcode/paycertificationapi/q62;->OXO1:Lcom/android/mltcode/paycertificationapi/q62;

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/q62;->OIXOOi()Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object v0, Lcom/sma/smartv3/biz/voice/VoiceManager;->INSTANCE:Lcom/sma/smartv3/biz/voice/VoiceManager;

    invoke-virtual {v0}, Lcom/sma/smartv3/biz/voice/VoiceManager;->setRecordingCallback()V

    :cond_0
    const-string v0, "STOP_VOICE"

    const/4 v1, 0x2

    const/4 v2, 0x0

    invoke-static {v0, v2, v1, v2}, Lcom/android/mltcode/paycertificationapi/I01XX0;->XIi00iiXO(Ljava/lang/String;Ljava/lang/Object;ILjava/lang/Object;)V

    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v0

    invoke-static {v0}, Lcom/blankj/utilcode/util/KeyboardUtils;->unregisterSoftInputChangedListener(Landroid/view/Window;)V

    return-void
.end method

.method public final onSend(Landroid/view/View;)V
    .locals 1
    .param p1    # Landroid/view/View;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "view"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p1, Lcom/android/mltcode/paycertificationapi/q62;->OXO1:Lcom/android/mltcode/paycertificationapi/q62;

    invoke-virtual {p1}, Lcom/android/mltcode/paycertificationapi/q62;->IiX1ii()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p1}, Lcom/android/mltcode/paycertificationapi/q62;->OIXOOi()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p1}, Lcom/android/mltcode/paycertificationapi/q62;->iIiiO()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Lcom/android/mltcode/paycertificationapi/q62;->XOX()Z

    move-result p1

    if-nez p1, :cond_0

    const p1, 0x7f140ff5

    invoke-static {p1}, Lcom/blankj/utilcode/util/ToastUtils;->showLong(I)V

    new-instance p1, Landroid/content/Intent;

    const-class v0, Lcom/sma/smartv3/ui/me/AiKeySetActivity;

    invoke-direct {p1, p0, v0}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    invoke-virtual {p0, p1}, Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V

    return-void

    :cond_0
    invoke-direct {p0}, Lcom/sma/smartv3/ui/ai/AIChatActivity;->getMChatContent()Landroid/widget/EditText;

    move-result-object p1

    invoke-virtual {p1}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object p1

    if-eqz p1, :cond_1

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    if-nez p1, :cond_2

    :cond_1
    const-string p1, ""

    :cond_2
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result v0

    if-nez v0, :cond_3

    const p1, 0x7f1404f5

    invoke-virtual {p0, p1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p1

    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/Object;

    invoke-static {p1, v0}, Lcom/blankj/utilcode/util/ToastUtils;->showLong(Ljava/lang/String;[Ljava/lang/Object;)V

    return-void

    :cond_3
    invoke-static {p0}, Lcom/blankj/utilcode/util/KeyboardUtils;->hideSoftInput(Landroid/app/Activity;)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/ai/AIChatActivity;->getMChatContent()Landroid/widget/EditText;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v0

    invoke-interface {v0}, Landroid/text/Editable;->clear()V

    invoke-direct {p0, p1}, Lcom/sma/smartv3/ui/ai/AIChatActivity;->addQuestion(Ljava/lang/String;)V

    return-void
.end method

.method public final onSwitchInputMethod(Landroid/view/View;)V
    .locals 3
    .param p1    # Landroid/view/View;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "view"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iget-boolean p1, p0, Lcom/sma/smartv3/ui/ai/AIChatActivity;->inputMethod:Z

    xor-int/lit8 p1, p1, 0x1

    iput-boolean p1, p0, Lcom/sma/smartv3/ui/ai/AIChatActivity;->inputMethod:Z

    invoke-direct {p0}, Lcom/sma/smartv3/ui/ai/AIChatActivity;->getIvChatVoice()Landroid/widget/ImageView;

    move-result-object p1

    iget-boolean v0, p0, Lcom/sma/smartv3/ui/ai/AIChatActivity;->inputMethod:Z

    const/4 v1, 0x0

    const/16 v2, 0x8

    if-eqz v0, :cond_0

    invoke-direct {p0}, Lcom/sma/smartv3/ui/ai/AIChatActivity;->getMChatContent()Landroid/widget/EditText;

    move-result-object v0

    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/ai/AIChatActivity;->getBtnChatSend()Landroid/widget/Button;

    move-result-object v0

    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/ai/AIChatActivity;->getBtnAudio()Landroid/widget/Button;

    move-result-object v0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    const v0, 0x7f08125a

    goto :goto_0

    :cond_0
    invoke-direct {p0}, Lcom/sma/smartv3/ui/ai/AIChatActivity;->getMChatContent()Landroid/widget/EditText;

    move-result-object v0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/ai/AIChatActivity;->getBtnChatSend()Landroid/widget/Button;

    move-result-object v0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/ai/AIChatActivity;->getBtnAudio()Landroid/widget/Button;

    move-result-object v0

    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    const v0, 0x7f081258

    :goto_0
    invoke-virtual {p1, v0}, Landroid/widget/ImageView;->setImageResource(I)V

    return-void
.end method

.method public final onTitleRightClick(Landroid/view/View;)V
    .locals 7
    .param p1    # Landroid/view/View;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "MissingInflatedId"
        }
    .end annotation

    const-string v0, "view"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/android/mltcode/paycertificationapi/q62;->OXO1:Lcom/android/mltcode/paycertificationapi/q62;

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/q62;->I0O()Z

    move-result v1

    if-nez v1, :cond_1

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/q62;->i0Ii001()Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Lcom/sma/smartv3/ui/ai/AIChatActivity;->showDeleteTipPopup()V

    return-void

    :cond_1
    :goto_0
    const-string v1, "layout_inflater"

    invoke-virtual {p0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    const-string v2, "null cannot be cast to non-null type android.view.LayoutInflater"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->X1ii(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v1, Landroid/view/LayoutInflater;

    const v2, 0x7f0d104a

    const/4 v3, 0x0

    invoke-virtual {v1, v2, v3}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v1

    const-string v2, "inflate(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v2, p0, Lcom/sma/smartv3/ui/ai/AIChatActivity;->mPopupWindow:Landroid/widget/PopupWindow;

    if-nez v2, :cond_2

    new-instance v2, Landroid/widget/PopupWindow;

    const/4 v3, -0x2

    invoke-direct {v2, v1, v3, v3}, Landroid/widget/PopupWindow;-><init>(Landroid/view/View;II)V

    iput-object v2, p0, Lcom/sma/smartv3/ui/ai/AIChatActivity;->mPopupWindow:Landroid/widget/PopupWindow;

    goto :goto_1

    :cond_2
    if-eqz v2, :cond_3

    invoke-virtual {v2}, Landroid/widget/PopupWindow;->dismiss()V

    :cond_3
    :goto_1
    iget-object v2, p0, Lcom/sma/smartv3/ui/ai/AIChatActivity;->mPopupWindow:Landroid/widget/PopupWindow;

    const/4 v3, 0x1

    if-eqz v2, :cond_4

    invoke-virtual {v2, v3}, Landroid/widget/PopupWindow;->setFocusable(Z)V

    :cond_4
    const/4 v2, 0x2

    new-array v2, v2, [I

    invoke-virtual {p1, v2}, Landroid/view/View;->getLocationOnScreen([I)V

    const/4 v4, 0x0

    aget v5, v2, v4

    invoke-virtual {p1}, Landroid/view/View;->getWidth()I

    move-result v6

    sub-int v6, v5, v6

    add-int/2addr v5, v6

    const/high16 v6, 0x41a00000    # 20.0f

    invoke-static {p0, v6}, Lcom/android/mltcode/paycertificationapi/OXI1i1;->XIi00iiXO(Landroid/content/Context;F)I

    move-result v6

    add-int/2addr v5, v6

    aget v2, v2, v3

    invoke-virtual {p1}, Landroid/view/View;->getHeight()I

    move-result v3

    add-int/2addr v2, v3

    iget-object v3, p0, Lcom/sma/smartv3/ui/ai/AIChatActivity;->mPopupWindow:Landroid/widget/PopupWindow;

    if-eqz v3, :cond_5

    invoke-virtual {v3, p1, v4, v5, v2}, Landroid/widget/PopupWindow;->showAtLocation(Landroid/view/View;III)V

    :cond_5
    const p1, 0x7f0a095f

    invoke-virtual {v1, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    new-instance v2, Lcom/android/mltcode/paycertificationapi/X00XIX1;

    invoke-direct {v2, p0}, Lcom/android/mltcode/paycertificationapi/X00XIX1;-><init>(Lcom/sma/smartv3/ui/ai/AIChatActivity;)V

    invoke-virtual {p1, v2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    const v2, 0x7f0a095c

    invoke-virtual {v1, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    new-instance v3, Lcom/android/mltcode/paycertificationapi/i11I;

    invoke-direct {v3, p0}, Lcom/android/mltcode/paycertificationapi/i11I;-><init>(Lcom/sma/smartv3/ui/ai/AIChatActivity;)V

    invoke-virtual {v2, v3}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/q62;->I0O()Z

    move-result v2

    if-eqz v2, :cond_6

    invoke-virtual {p1, v4}, Landroid/view/View;->setVisibility(I)V

    goto :goto_2

    :cond_6
    const/16 v2, 0x8

    invoke-virtual {p1, v2}, Landroid/view/View;->setVisibility(I)V

    :goto_2
    const p1, 0x7f0a095e

    invoke-virtual {v1, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/LinearLayout;

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/q62;->i0Ii001()Z

    move-result v0

    if-eqz v0, :cond_7

    invoke-virtual {p1, v4}, Landroid/view/View;->setVisibility(I)V

    :cond_7
    new-instance v0, Lcom/android/mltcode/paycertificationapi/XO0X10iO;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/XO0X10iO;-><init>(Lcom/sma/smartv3/ui/ai/AIChatActivity;)V

    invoke-virtual {p1, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method

.method public final onTitleRightOtherClick(Landroid/view/View;)V
    .locals 3
    .param p1    # Landroid/view/View;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "view"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/ai/BaseAIActivity;->isPlayResult()Z

    move-result p1

    xor-int/lit8 p1, p1, 0x1

    invoke-virtual {p0, p1}, Lcom/sma/smartv3/ui/ai/BaseAIActivity;->setPlayResult(Z)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/ai/AIChatActivity;->getAbhTitleOtherRight()Landroid/widget/ImageView;

    move-result-object p1

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/ai/BaseAIActivity;->isPlayResult()Z

    move-result v0

    if-eqz v0, :cond_0

    const v0, 0x7f080636

    goto :goto_0

    :cond_0
    const-string v0, "AI_Answer_stop_player"

    const/4 v1, 0x2

    const/4 v2, 0x0

    invoke-static {v0, v2, v1, v2}, Lcom/android/mltcode/paycertificationapi/I01XX0;->XIi00iiXO(Ljava/lang/String;Ljava/lang/Object;ILjava/lang/Object;)V

    const v0, 0x7f080635

    :goto_0
    invoke-virtual {p1, v0}, Landroid/widget/ImageView;->setImageResource(I)V

    return-void
.end method

.method public final permission()V
    .locals 4

    const-string v0, "MICROPHONE"

    filled-new-array {v0}, [Ljava/lang/String;

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

    new-instance v2, Lcom/android/mltcode/paycertificationapi/iXiiiO;

    invoke-direct {v2}, Lcom/android/mltcode/paycertificationapi/iXiiiO;-><init>()V

    invoke-static {v0, v1, v3, v2}, Lcom/android/mltcode/paycertificationapi/ds1;->XIi00iiXO(Lcom/blankj/utilcode/util/PermissionUtils;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V

    return-void
.end method

.method public final questionAssistant(Ljava/lang/String;)V
    .locals 11
    .param p1    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "content"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/sma/smartv3/ui/ai/AIChatActivity;->mTipContent:Ljava/lang/String;

    const v0, 0x7f1400e0

    filled-new-array {p1}, [Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {p0, v0, v1}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    const-string v0, "getString(...)"

    invoke-static {v4, v0}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v2, Lcom/sma/smartv3/model/AIQuestion;

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/ai/BaseAIActivity;->getMAIFunction()Lcom/sma/smartv3/model/AIFunction;

    move-result-object v0

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    invoke-virtual {v0}, Lcom/sma/smartv3/model/AIFunction;->getType()Lcom/sma/smartv3/model/AIFunctionType;

    move-result-object v3

    const/16 v9, 0x3c

    const/4 v10, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    invoke-direct/range {v2 .. v10}, Lcom/sma/smartv3/model/AIQuestion;-><init>(Lcom/sma/smartv3/model/AIFunctionType;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/String;ZZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v7, Lcom/sma/smartv3/ui/ai/AIChatActivity$XIi00iiXO;

    invoke-direct {v7, p0, p1}, Lcom/sma/smartv3/ui/ai/AIChatActivity$XIi00iiXO;-><init>(Lcom/sma/smartv3/ui/ai/AIChatActivity;Ljava/lang/String;)V

    const/4 v9, 0x0

    const/4 v10, 0x0

    move-object v5, p0

    move-object v6, v2

    invoke-virtual/range {v5 .. v10}, Lcom/sma/smartv3/ui/ai/BaseAIActivity;->send(Lcom/sma/smartv3/model/AIQuestion;Lcom/sma/smartv3/ui/ai/BaseAIActivity$OXO1;ZZZ)V

    return-void
.end method

.method public final recognition()V
    .locals 3

    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/sma/smartv3/ui/ai/BaseAIActivity;->showLoading(Z)V

    :try_start_0
    new-instance v1, Ljava/io/FileInputStream;

    sget-object v2, Lcom/android/mltcode/paycertificationapi/sz0;->OXO1:Lcom/android/mltcode/paycertificationapi/sz0;

    invoke-static {v2}, Lcom/android/mltcode/paycertificationapi/uz0;->X11I(Lcom/android/mltcode/paycertificationapi/sz0;)Ljava/io/File;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V

    new-instance v2, Lcom/baidu/ai/speech/realtime/full/connection/Runner;

    invoke-direct {v2, v1, v0}, Lcom/baidu/ai/speech/realtime/full/connection/Runner;-><init>(Ljava/io/InputStream;I)V

    new-instance v0, Lcom/sma/smartv3/ui/ai/AIChatActivity$iO;

    invoke-direct {v0, p0}, Lcom/sma/smartv3/ui/ai/AIChatActivity$iO;-><init>(Lcom/sma/smartv3/ui/ai/AIChatActivity;)V

    invoke-virtual {v2, v0}, Lcom/baidu/ai/speech/realtime/full/connection/Runner;->run(Lcom/baidu/ai/speech/realtime/full/download/SimpleDownloader;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    invoke-virtual {p0}, Lcom/sma/smartv3/ui/ai/BaseAIActivity;->dismissLoading()V

    return-void
.end method

.method public final sendCurrent(Ljava/lang/String;)V
    .locals 10
    .param p1    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "content"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/sma/smartv3/ui/ai/AIChatActivity;->mRecyclerViewAutoRefresh:Z

    invoke-direct {p0}, Lcom/sma/smartv3/ui/ai/AIChatActivity;->scrollView()V

    new-instance v1, Lcom/sma/smartv3/model/AIQuestion;

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/ai/BaseAIActivity;->getMAIFunction()Lcom/sma/smartv3/model/AIFunction;

    move-result-object v0

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    invoke-virtual {v0}, Lcom/sma/smartv3/model/AIFunction;->getType()Lcom/sma/smartv3/model/AIFunctionType;

    move-result-object v2

    const/16 v8, 0x3c

    const/4 v9, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    move-object v3, p1

    invoke-direct/range {v1 .. v9}, Lcom/sma/smartv3/model/AIQuestion;-><init>(Lcom/sma/smartv3/model/AIFunctionType;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/String;ZZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v3, Lcom/sma/smartv3/ui/ai/AIChatActivity$XO0O10;

    invoke-direct {v3, p0}, Lcom/sma/smartv3/ui/ai/AIChatActivity$XO0O10;-><init>(Lcom/sma/smartv3/ui/ai/AIChatActivity;)V

    const/16 v7, 0x1c

    const/4 v8, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object v2, v1

    move-object v1, p0

    invoke-static/range {v1 .. v8}, Lcom/sma/smartv3/ui/ai/BaseAIActivity;->send$default(Lcom/sma/smartv3/ui/ai/BaseAIActivity;Lcom/sma/smartv3/model/AIQuestion;Lcom/sma/smartv3/ui/ai/BaseAIActivity$OXO1;ZZZILjava/lang/Object;)V

    return-void
.end method

.method public final setDownY(F)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/ui/ai/AIChatActivity;->downY:F

    return-void
.end method

.method public final setInputMethod(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/sma/smartv3/ui/ai/AIChatActivity;->inputMethod:Z

    return-void
.end method

.method public final setLastScrollTime(J)V
    .locals 0

    iput-wide p1, p0, Lcom/sma/smartv3/ui/ai/AIChatActivity;->lastScrollTime:J

    return-void
.end method

.method public final setMBufferSize(I)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/ui/ai/AIChatActivity;->mBufferSize:I

    return-void
.end method

.method public final setMList(Ljava/util/List;)V
    .locals 1
    .param p1    # Ljava/util/List;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/sma/smartv3/db/entity/AIRecords;",
            ">;)V"
        }
    .end annotation

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/sma/smartv3/ui/ai/AIChatActivity;->mList:Ljava/util/List;

    return-void
.end method

.method public final setMPopupWindow(Landroid/widget/PopupWindow;)V
    .locals 0
    .param p1    # Landroid/widget/PopupWindow;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param

    iput-object p1, p0, Lcom/sma/smartv3/ui/ai/AIChatActivity;->mPopupWindow:Landroid/widget/PopupWindow;

    return-void
.end method

.method public final setMRecyclerViewAutoRefresh(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/sma/smartv3/ui/ai/AIChatActivity;->mRecyclerViewAutoRefresh:Z

    return-void
.end method

.method public final setMTipContent(Ljava/lang/String;)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/sma/smartv3/ui/ai/AIChatActivity;->mTipContent:Ljava/lang/String;

    return-void
.end method

.method public final setReceived(Lcom/sma/smartv3/db/entity/AIRecords;)V
    .locals 0
    .param p1    # Lcom/sma/smartv3/db/entity/AIRecords;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param

    iput-object p1, p0, Lcom/sma/smartv3/ui/ai/AIChatActivity;->received:Lcom/sma/smartv3/db/entity/AIRecords;

    return-void
.end method

.method public final setRecordingIsClear(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/sma/smartv3/ui/ai/AIChatActivity;->recordingIsClear:Z

    return-void
.end method

.method public final setShowChatTime(J)V
    .locals 0

    iput-wide p1, p0, Lcom/sma/smartv3/ui/ai/AIChatActivity;->showChatTime:J

    return-void
.end method

.method public final share(Ljava/lang/String;)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "content"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, Lcom/blankj/utilcode/util/IntentUtils;->getShareTextIntent(Ljava/lang/String;)Landroid/content/Intent;

    move-result-object p1

    invoke-virtual {p0, p1}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    return-void
.end method

.method public showAIDeductionPoints()V
    .locals 0

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/ai/AIChatActivity;->showOpenAiDeduction()V

    return-void
.end method

.method public final showDeleteTipPopup()V
    .locals 4

    iget-object v0, p0, Lcom/sma/smartv3/ui/ai/AIChatActivity;->mAllDeleteTipPopup:Lcom/android/mltcode/paycertificationapi/go0;

    if-nez v0, :cond_0

    new-instance v0, Lcom/android/mltcode/paycertificationapi/go0;

    const/4 v1, 0x2

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-direct {v0, p0, v3, v1, v2}, Lcom/android/mltcode/paycertificationapi/go0;-><init>(Landroid/app/Activity;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const v1, 0x7f141348

    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/go0;->O1O(I)V

    const v1, 0x7f1402d2

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/go0;->iX(Ljava/lang/Integer;)V

    const/4 v1, 0x1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/go0;->IXXOO(Ljava/lang/Integer;)V

    const v1, 0x7f14027f

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    new-instance v2, Lcom/android/mltcode/paycertificationapi/XX1Oi;

    invoke-direct {v2}, Lcom/android/mltcode/paycertificationapi/XX1Oi;-><init>()V

    invoke-virtual {v0, v1, v2}, Lcom/android/mltcode/paycertificationapi/go0;->iX1O1(Ljava/lang/Integer;Lkotlin/jvm/functions/Function0;)V

    new-instance v1, Lcom/android/mltcode/paycertificationapi/OX110i;

    invoke-direct {v1, p0}, Lcom/android/mltcode/paycertificationapi/OX110i;-><init>(Lcom/sma/smartv3/ui/ai/AIChatActivity;)V

    const v2, 0x7f14034b

    invoke-virtual {v0, v2, v1}, Lcom/android/mltcode/paycertificationapi/go0;->X1IX(ILkotlin/jvm/functions/Function0;)V

    iput-object v0, p0, Lcom/sma/smartv3/ui/ai/AIChatActivity;->mAllDeleteTipPopup:Lcom/android/mltcode/paycertificationapi/go0;

    :cond_0
    iget-object v0, p0, Lcom/sma/smartv3/ui/ai/AIChatActivity;->mAllDeleteTipPopup:Lcom/android/mltcode/paycertificationapi/go0;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/OIXIOIO;->IIX1OXO()V

    :cond_1
    return-void
.end method

.method public final showOpenAiDeduction()V
    .locals 4

    sget-object v0, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/ai/BaseAIActivity;->getOpenAIDeductionPoints()I

    move-result v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "AIChatActivity showOpenAiDeduction openAIDeductionPoints = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/ai/AIChatActivity;->getTvOpenAiDeduction()Lcom/sma/smartv3/view/text/PFMedium;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    return-void
.end method

.method public final showRecordingPopup()V
    .locals 4

    iget-object v0, p0, Lcom/sma/smartv3/ui/ai/AIChatActivity;->mRecordingPopup:Lcom/android/mltcode/paycertificationapi/uf3;

    if-nez v0, :cond_0

    new-instance v0, Lcom/android/mltcode/paycertificationapi/uf3;

    const/4 v1, 0x2

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-direct {v0, p0, v3, v1, v2}, Lcom/android/mltcode/paycertificationapi/uf3;-><init>(Landroid/app/Activity;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    iget-boolean v1, p0, Lcom/sma/smartv3/ui/ai/AIChatActivity;->recordingIsClear:Z

    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/uf3;->OX(Z)V

    iput-object v0, p0, Lcom/sma/smartv3/ui/ai/AIChatActivity;->mRecordingPopup:Lcom/android/mltcode/paycertificationapi/uf3;

    :cond_0
    iget-object v0, p0, Lcom/sma/smartv3/ui/ai/AIChatActivity;->mRecordingPopup:Lcom/android/mltcode/paycertificationapi/uf3;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/OIXIOIO;->IIX1OXO()V

    :cond_1
    return-void
.end method

.method public final switchAIServe(Ljava/lang/Object;)V
    .locals 1
    .param p1    # Ljava/lang/Object;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation runtime Lcom/android/mltcode/paycertificationapi/sf5;
        tag = "CHANGE_AI_MODEL"
    .end annotation

    const-string v0, "data"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/ai/BaseAIActivity;->getMAIFunction()Lcom/sma/smartv3/model/AIFunction;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Lcom/sma/smartv3/model/AIFunction;->getType()Lcom/sma/smartv3/model/AIFunctionType;

    move-result-object p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    sget-object v0, Lcom/sma/smartv3/model/AIFunctionType;->AI:Lcom/sma/smartv3/model/AIFunctionType;

    if-ne p1, v0, :cond_1

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/ai/AIChatActivity;->initView()V

    :cond_1
    return-void
.end method

.method public final touchListener()V
    .locals 2
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "ClickableViewAccessibility"
        }
    .end annotation

    invoke-direct {p0}, Lcom/sma/smartv3/ui/ai/AIChatActivity;->getBtnAudio()Landroid/widget/Button;

    move-result-object v0

    new-instance v1, Lcom/android/mltcode/paycertificationapi/X11I;

    invoke-direct {v1, p0}, Lcom/android/mltcode/paycertificationapi/X11I;-><init>(Lcom/sma/smartv3/ui/ai/AIChatActivity;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/ai/AIChatActivity;->getMRecyclerView()Landroidx/recyclerview/widget/RecyclerView;

    move-result-object v0

    new-instance v1, Lcom/android/mltcode/paycertificationapi/X100O;

    invoke-direct {v1, p0}, Lcom/android/mltcode/paycertificationapi/X100O;-><init>(Lcom/sma/smartv3/ui/ai/AIChatActivity;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V

    return-void
.end method
