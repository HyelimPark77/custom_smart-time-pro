.class public final Lcom/sma/smartv3/pop/MessageListV2Popup;
.super Lcom/android/mltcode/paycertificationapi/I0OIO1i;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/sma/smartv3/pop/MessageListV2Popup$OXO1;
    }
.end annotation


# instance fields
.field public final I0IIOi:Landroidx/recyclerview/widget/RecyclerView;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public final IO:Lcom/bestmafen/androidbase/adapter/recyclerview/CommonAdapter;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/bestmafen/androidbase/adapter/recyclerview/CommonAdapter<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field public OIX0iXi:Lcom/sma/smartv3/pop/MessageListV2Popup$OXO1;
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation
.end field

.field public final OIi0:Landroid/widget/TextView;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/app/Activity;ILjava/util/List;)V
    .locals 3
    .param p1    # Landroid/app/Activity;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p3    # Ljava/util/List;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/app/Activity;",
            "I",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    const-string v0, "activity"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "mData"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0, p1}, Lcom/android/mltcode/paycertificationapi/I0OIO1i;-><init>(Landroid/app/Activity;)V

    .line 2
    invoke-virtual {p0}, Lcom/android/mltcode/paycertificationapi/OIXIOIO;->XO0O10()Landroid/app/Activity;

    move-result-object v0

    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    invoke-virtual {p0}, Lcom/android/mltcode/paycertificationapi/OIXIOIO;->IiI10X()Landroid/widget/FrameLayout;

    move-result-object v1

    invoke-virtual {v0, p2, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    .line 3
    invoke-virtual {p0}, Lcom/android/mltcode/paycertificationapi/OIXIOIO;->IiI10X()Landroid/widget/FrameLayout;

    move-result-object p2

    const v0, 0x7f0a06ae

    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p2

    const-string v0, "findViewById(...)"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p2, Landroidx/recyclerview/widget/RecyclerView;

    iput-object p2, p0, Lcom/sma/smartv3/pop/MessageListV2Popup;->I0IIOi:Landroidx/recyclerview/widget/RecyclerView;

    .line 4
    invoke-virtual {p0}, Lcom/android/mltcode/paycertificationapi/OIXIOIO;->IiI10X()Landroid/widget/FrameLayout;

    move-result-object v1

    const v2, 0x7f0a001c

    invoke-virtual {v1, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v1, Landroid/widget/TextView;

    iput-object v1, p0, Lcom/sma/smartv3/pop/MessageListV2Popup;->OIi0:Landroid/widget/TextView;

    .line 5
    new-instance v0, Lcom/android/mltcode/paycertificationapi/co0;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/co0;-><init>(Lcom/sma/smartv3/pop/MessageListV2Popup;)V

    invoke-virtual {v1, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 6
    new-instance v0, Landroidx/recyclerview/widget/LinearLayoutManager;

    invoke-virtual {p0}, Lcom/android/mltcode/paycertificationapi/OIXIOIO;->XO0O10()Landroid/app/Activity;

    move-result-object v1

    invoke-direct {v0, v1}, Landroidx/recyclerview/widget/LinearLayoutManager;-><init>(Landroid/content/Context;)V

    invoke-virtual {p2, v0}, Landroidx/recyclerview/widget/RecyclerView;->setLayoutManager(Landroidx/recyclerview/widget/RecyclerView$LayoutManager;)V

    .line 7
    new-instance v0, Lcom/sma/smartv3/pop/MessageListV2Popup$2;

    invoke-direct {v0, p1, p3, p0}, Lcom/sma/smartv3/pop/MessageListV2Popup$2;-><init>(Landroid/app/Activity;Ljava/util/List;Lcom/sma/smartv3/pop/MessageListV2Popup;)V

    iput-object v0, p0, Lcom/sma/smartv3/pop/MessageListV2Popup;->IO:Lcom/bestmafen/androidbase/adapter/recyclerview/CommonAdapter;

    .line 8
    invoke-virtual {p2, v0}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(Landroidx/recyclerview/widget/RecyclerView$Adapter;)V

    return-void
.end method

.method public synthetic constructor <init>(Landroid/app/Activity;ILjava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p4, p4, 0x2

    if-eqz p4, :cond_0

    const p2, 0x7f0d1037

    .line 9
    :cond_0
    invoke-direct {p0, p1, p2, p3}, Lcom/sma/smartv3/pop/MessageListV2Popup;-><init>(Landroid/app/Activity;ILjava/util/List;)V

    return-void
.end method

.method public static synthetic OiIIX101O(Lcom/sma/smartv3/pop/MessageListV2Popup;Landroid/view/View;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/sma/smartv3/pop/MessageListV2Popup;->XiOIii1(Lcom/sma/smartv3/pop/MessageListV2Popup;Landroid/view/View;)V

    return-void
.end method

.method public static final XiOIii1(Lcom/sma/smartv3/pop/MessageListV2Popup;Landroid/view/View;)V
    .locals 0

    invoke-virtual {p0}, Landroid/widget/PopupWindow;->dismiss()V

    return-void
.end method


# virtual methods
.method public final OII()Lcom/sma/smartv3/pop/MessageListV2Popup$OXO1;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/pop/MessageListV2Popup;->OIX0iXi:Lcom/sma/smartv3/pop/MessageListV2Popup$OXO1;

    return-object v0
.end method

.method public final OX(Lcom/sma/smartv3/pop/MessageListV2Popup$OXO1;)V
    .locals 0
    .param p1    # Lcom/sma/smartv3/pop/MessageListV2Popup$OXO1;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param

    iput-object p1, p0, Lcom/sma/smartv3/pop/MessageListV2Popup;->OIX0iXi:Lcom/sma/smartv3/pop/MessageListV2Popup$OXO1;

    return-void
.end method
