.class final synthetic Lcom/sma/smartv3/ui/translate/TranslateMultiDeviceAdapter$onCreateViewHolder$binding$1;
.super Lkotlin/jvm/internal/FunctionReferenceImpl;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/sma/smartv3/ui/translate/TranslateMultiDeviceAdapter;->onCreateViewHolder(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$ViewHolder;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1019
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/FunctionReferenceImpl;",
        "Lkotlin/jvm/functions/Function3<",
        "Landroid/view/LayoutInflater;",
        "Landroid/view/ViewGroup;",
        "Ljava/lang/Boolean;",
        "Lcom/sma/smartv3/databinding/ItemAuraBinauralLeftBinding;",
        ">;"
    }
.end annotation


# static fields
.field public static final INSTANCE:Lcom/sma/smartv3/ui/translate/TranslateMultiDeviceAdapter$onCreateViewHolder$binding$1;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/sma/smartv3/ui/translate/TranslateMultiDeviceAdapter$onCreateViewHolder$binding$1;

    invoke-direct {v0}, Lcom/sma/smartv3/ui/translate/TranslateMultiDeviceAdapter$onCreateViewHolder$binding$1;-><init>()V

    sput-object v0, Lcom/sma/smartv3/ui/translate/TranslateMultiDeviceAdapter$onCreateViewHolder$binding$1;->INSTANCE:Lcom/sma/smartv3/ui/translate/TranslateMultiDeviceAdapter$onCreateViewHolder$binding$1;

    return-void
.end method

.method public constructor <init>()V
    .locals 6

    const-string v4, "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/sma/smartv3/databinding/ItemAuraBinauralLeftBinding;"

    const/4 v5, 0x0

    const/4 v1, 0x3

    const-class v2, Lcom/sma/smartv3/databinding/ItemAuraBinauralLeftBinding;

    const-string v3, "inflate"

    move-object v0, p0

    invoke-direct/range {v0 .. v5}, Lkotlin/jvm/internal/FunctionReferenceImpl;-><init>(ILjava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    return-void
.end method


# virtual methods
.method public final invoke(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/sma/smartv3/databinding/ItemAuraBinauralLeftBinding;
    .locals 1

    const-string v0, "p0"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-static {p1, p2, p3}, Lcom/sma/smartv3/databinding/ItemAuraBinauralLeftBinding;->inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/sma/smartv3/databinding/ItemAuraBinauralLeftBinding;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Landroid/view/LayoutInflater;

    check-cast p2, Landroid/view/ViewGroup;

    check-cast p3, Ljava/lang/Boolean;

    invoke-virtual {p3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p3

    invoke-virtual {p0, p1, p2, p3}, Lcom/sma/smartv3/ui/translate/TranslateMultiDeviceAdapter$onCreateViewHolder$binding$1;->invoke(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/sma/smartv3/databinding/ItemAuraBinauralLeftBinding;

    move-result-object p1

    return-object p1
.end method
