.class public final Lcom/sma/smartv3/ui/device/ChatVoiceAssistantAdapter$ChatVoiceToViewHolder;
.super Landroidx/recyclerview/widget/RecyclerView$ViewHolder;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/sma/smartv3/ui/device/ChatVoiceAssistantAdapter;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "ChatVoiceToViewHolder"
.end annotation


# instance fields
.field private final binding:Lcom/sma/smartv3/databinding/ItemVoiceChatReceiveBinding;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field final synthetic this$0:Lcom/sma/smartv3/ui/device/ChatVoiceAssistantAdapter;


# direct methods
.method public constructor <init>(Lcom/sma/smartv3/ui/device/ChatVoiceAssistantAdapter;Lcom/sma/smartv3/databinding/ItemVoiceChatReceiveBinding;)V
    .locals 1
    .param p1    # Lcom/sma/smartv3/ui/device/ChatVoiceAssistantAdapter;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/sma/smartv3/databinding/ItemVoiceChatReceiveBinding;",
            ")V"
        }
    .end annotation

    const-string v0, "binding"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/sma/smartv3/ui/device/ChatVoiceAssistantAdapter$ChatVoiceToViewHolder;->this$0:Lcom/sma/smartv3/ui/device/ChatVoiceAssistantAdapter;

    invoke-virtual {p2}, Lcom/sma/smartv3/databinding/ItemVoiceChatReceiveBinding;->getRoot()Landroid/widget/LinearLayout;

    move-result-object p1

    invoke-direct {p0, p1}, Landroidx/recyclerview/widget/RecyclerView$ViewHolder;-><init>(Landroid/view/View;)V

    iput-object p2, p0, Lcom/sma/smartv3/ui/device/ChatVoiceAssistantAdapter$ChatVoiceToViewHolder;->binding:Lcom/sma/smartv3/databinding/ItemVoiceChatReceiveBinding;

    return-void
.end method


# virtual methods
.method public final bind(Lcom/sma/smartv3/db/entity/ChatVoiceAssistantMessage;)V
    .locals 3
    .param p1    # Lcom/sma/smartv3/db/entity/ChatVoiceAssistantMessage;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "chatMsg"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/sma/smartv3/db/entity/ChatVoiceAssistantMessage;->getData()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    const v0, 0x7f1414b7

    invoke-static {v0}, Lcom/sma/smartv3/util/UtilsKt;->XXO(I)Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Lcom/sma/smartv3/db/entity/ChatVoiceAssistantMessage;->getData()Ljava/lang/String;

    move-result-object v0

    :goto_0
    iget-object v1, p0, Lcom/sma/smartv3/ui/device/ChatVoiceAssistantAdapter$ChatVoiceToViewHolder;->binding:Lcom/sma/smartv3/databinding/ItemVoiceChatReceiveBinding;

    iget-object v1, v1, Lcom/sma/smartv3/databinding/ItemVoiceChatReceiveBinding;->tvReceiveContent:Landroid/widget/TextView;

    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    invoke-virtual {v1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    const v2, 0x7f0607a5

    invoke-static {v0, v2}, Lcom/android/mltcode/paycertificationapi/gk4;->iO(Landroid/content/Context;I)I

    move-result v0

    invoke-static {v0}, Landroid/content/res/ColorStateList;->valueOf(I)Landroid/content/res/ColorStateList;

    move-result-object v0

    invoke-virtual {v1, v0}, Landroid/view/View;->setBackgroundTintList(Landroid/content/res/ColorStateList;)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/ChatVoiceAssistantAdapter$ChatVoiceToViewHolder;->binding:Lcom/sma/smartv3/databinding/ItemVoiceChatReceiveBinding;

    iget-object v0, v0, Lcom/sma/smartv3/databinding/ItemVoiceChatReceiveBinding;->tvReceiveNick:Landroid/widget/TextView;

    invoke-virtual {p1}, Lcom/sma/smartv3/db/entity/ChatVoiceAssistantMessage;->getAiMode()Lcom/sma/smartv3/dto/ChatAiMode;

    move-result-object p1

    invoke-virtual {p1}, Lcom/sma/smartv3/dto/ChatAiMode;->getModelName()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method
