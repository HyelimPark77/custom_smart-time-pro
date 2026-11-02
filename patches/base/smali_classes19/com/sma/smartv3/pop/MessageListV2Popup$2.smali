.class public final Lcom/sma/smartv3/pop/MessageListV2Popup$2;
.super Lcom/bestmafen/androidbase/adapter/recyclerview/CommonAdapter;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/sma/smartv3/pop/MessageListV2Popup;-><init>(Landroid/app/Activity;ILjava/util/List;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/bestmafen/androidbase/adapter/recyclerview/CommonAdapter<",
        "Ljava/lang/String;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lcom/sma/smartv3/pop/MessageListV2Popup;


# direct methods
.method public constructor <init>(Landroid/app/Activity;Ljava/util/List;Lcom/sma/smartv3/pop/MessageListV2Popup;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/app/Activity;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Lcom/sma/smartv3/pop/MessageListV2Popup;",
            ")V"
        }
    .end annotation

    iput-object p3, p0, Lcom/sma/smartv3/pop/MessageListV2Popup$2;->this$0:Lcom/sma/smartv3/pop/MessageListV2Popup;

    const p3, 0x7f0d1032

    invoke-direct {p0, p1, p3, p2}, Lcom/bestmafen/androidbase/adapter/recyclerview/CommonAdapter;-><init>(Landroid/content/Context;ILjava/util/List;)V

    return-void
.end method

.method public static synthetic OXO1(Lcom/sma/smartv3/pop/MessageListV2Popup;ILjava/lang/String;Landroid/view/View;)V
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lcom/sma/smartv3/pop/MessageListV2Popup$2;->convert$lambda$0(Lcom/sma/smartv3/pop/MessageListV2Popup;ILjava/lang/String;Landroid/view/View;)V

    return-void
.end method

.method private static final convert$lambda$0(Lcom/sma/smartv3/pop/MessageListV2Popup;ILjava/lang/String;Landroid/view/View;)V
    .locals 0

    invoke-virtual {p0}, Lcom/sma/smartv3/pop/MessageListV2Popup;->OII()Lcom/sma/smartv3/pop/MessageListV2Popup$OXO1;

    move-result-object p3

    if-eqz p3, :cond_0

    invoke-interface {p3, p1, p2}, Lcom/sma/smartv3/pop/MessageListV2Popup$OXO1;->OXO1(ILjava/lang/String;)V

    :cond_0
    invoke-virtual {p0}, Landroid/widget/PopupWindow;->dismiss()V

    return-void
.end method


# virtual methods
.method public bridge synthetic convert(Lcom/bestmafen/androidbase/adapter/recyclerview/base/ViewHolder;Ljava/lang/Object;I)V
    .locals 0

    .line 1
    check-cast p2, Ljava/lang/String;

    invoke-virtual {p0, p1, p2, p3}, Lcom/sma/smartv3/pop/MessageListV2Popup$2;->convert(Lcom/bestmafen/androidbase/adapter/recyclerview/base/ViewHolder;Ljava/lang/String;I)V

    return-void
.end method

.method public convert(Lcom/bestmafen/androidbase/adapter/recyclerview/base/ViewHolder;Ljava/lang/String;I)V
    .locals 2

    const-string v0, "holder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "item"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const v0, 0x7f0a095a

    .line 2
    invoke-virtual {p1, v0, p2}, Lcom/bestmafen/androidbase/adapter/recyclerview/base/ViewHolder;->setText(ILjava/lang/String;)Lcom/bestmafen/androidbase/adapter/recyclerview/base/ViewHolder;

    .line 3
    iget-object p1, p1, Landroidx/recyclerview/widget/RecyclerView$ViewHolder;->itemView:Landroid/view/View;

    iget-object v0, p0, Lcom/sma/smartv3/pop/MessageListV2Popup$2;->this$0:Lcom/sma/smartv3/pop/MessageListV2Popup;

    new-instance v1, Lcom/android/mltcode/paycertificationapi/do0;

    invoke-direct {v1, v0, p3, p2}, Lcom/android/mltcode/paycertificationapi/do0;-><init>(Lcom/sma/smartv3/pop/MessageListV2Popup;ILjava/lang/String;)V

    invoke-virtual {p1, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method
