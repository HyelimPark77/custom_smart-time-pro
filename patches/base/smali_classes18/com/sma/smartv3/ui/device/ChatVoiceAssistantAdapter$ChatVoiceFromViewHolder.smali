.class public final Lcom/sma/smartv3/ui/device/ChatVoiceAssistantAdapter$ChatVoiceFromViewHolder;
.super Landroidx/recyclerview/widget/RecyclerView$ViewHolder;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/sma/smartv3/ui/device/ChatVoiceAssistantAdapter;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "ChatVoiceFromViewHolder"
.end annotation


# instance fields
.field private final binding:Lcom/sma/smartv3/databinding/ItemVoiceChatSendBinding;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field final synthetic this$0:Lcom/sma/smartv3/ui/device/ChatVoiceAssistantAdapter;


# direct methods
.method public constructor <init>(Lcom/sma/smartv3/ui/device/ChatVoiceAssistantAdapter;Lcom/sma/smartv3/databinding/ItemVoiceChatSendBinding;)V
    .locals 1
    .param p1    # Lcom/sma/smartv3/ui/device/ChatVoiceAssistantAdapter;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/sma/smartv3/databinding/ItemVoiceChatSendBinding;",
            ")V"
        }
    .end annotation

    const-string v0, "binding"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/sma/smartv3/ui/device/ChatVoiceAssistantAdapter$ChatVoiceFromViewHolder;->this$0:Lcom/sma/smartv3/ui/device/ChatVoiceAssistantAdapter;

    invoke-virtual {p2}, Lcom/sma/smartv3/databinding/ItemVoiceChatSendBinding;->getRoot()Landroid/widget/LinearLayout;

    move-result-object p1

    invoke-direct {p0, p1}, Landroidx/recyclerview/widget/RecyclerView$ViewHolder;-><init>(Landroid/view/View;)V

    iput-object p2, p0, Lcom/sma/smartv3/ui/device/ChatVoiceAssistantAdapter$ChatVoiceFromViewHolder;->binding:Lcom/sma/smartv3/databinding/ItemVoiceChatSendBinding;

    return-void
.end method


# virtual methods
.method public final bind(Lcom/sma/smartv3/db/entity/ChatVoiceAssistantMessage;)V
    .locals 2
    .param p1    # Lcom/sma/smartv3/db/entity/ChatVoiceAssistantMessage;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "chatMsg"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/ChatVoiceAssistantAdapter$ChatVoiceFromViewHolder;->binding:Lcom/sma/smartv3/databinding/ItemVoiceChatSendBinding;

    iget-object v0, v0, Lcom/sma/smartv3/databinding/ItemVoiceChatSendBinding;->tvSendContent:Landroid/widget/TextView;

    invoke-virtual {p1}, Lcom/sma/smartv3/db/entity/ChatVoiceAssistantMessage;->getData()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object p1, p0, Lcom/sma/smartv3/ui/device/ChatVoiceAssistantAdapter$ChatVoiceFromViewHolder;->binding:Lcom/sma/smartv3/databinding/ItemVoiceChatSendBinding;

    iget-object p1, p1, Lcom/sma/smartv3/databinding/ItemVoiceChatSendBinding;->ivSendPicture:Lcom/sma/smartv3/view/ImageViewRound;

    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    const v1, 0x7f0813c4

    invoke-static {v0, v1}, Lcom/android/mltcode/paycertificationapi/gk4;->XOO0ii0(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroidx/appcompat/widget/AppCompatImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    sget-object v0, Lcom/android/mltcode/paycertificationapi/sz0;->OXO1:Lcom/android/mltcode/paycertificationapi/sz0;

    invoke-static {v0}, Lcom/android/mltcode/paycertificationapi/uz0;->OIi0(Lcom/android/mltcode/paycertificationapi/sz0;)Ljava/io/File;

    move-result-object v1

    invoke-virtual {v1}, Ljava/io/File;->exists()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-static {v0}, Lcom/android/mltcode/paycertificationapi/uz0;->OIi0(Lcom/android/mltcode/paycertificationapi/sz0;)Ljava/io/File;

    move-result-object v0

    invoke-static {v0}, Landroid/net/Uri;->fromFile(Ljava/io/File;)Landroid/net/Uri;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroidx/appcompat/widget/AppCompatImageView;->setImageURI(Landroid/net/Uri;)V

    :cond_0
    return-void
.end method
