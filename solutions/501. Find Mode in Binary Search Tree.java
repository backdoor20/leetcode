                number=a;
                max=map.get(a);
            }
        }
        int count=0;
        for(Integer a:map.keySet()){
            if(map.get(a)==max){
                count++;
            }
        }
        int[] arr=new int[count];
        count=0;
        for(Integer a:map.keySet()){
            if(map.get(a)==max){
                arr[count++]=a;
            }
        }
        return arr;
    }
    
    public void findFrequency(TreeNode root,Map<Integer,Integer> map){
        if(root==null)
            return;
        findFrequency(root.left,map);
        map.put(root.val,map.getOrDefault(root.val,0)+1);
        findFrequency(root.right,map);
    }
}
